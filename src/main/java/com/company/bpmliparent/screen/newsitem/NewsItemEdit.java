package com.company.bpmliparent.screen.newsitem;

import io.jmix.core.Resources;
import io.jmix.email.EmailInfo;
import io.jmix.email.EmailInfoBuilder;
import io.jmix.email.Emailer;
import io.jmix.ui.Dialogs;
import io.jmix.ui.action.DialogAction;
import io.jmix.ui.component.Component;
import io.jmix.ui.model.DataContext;
import io.jmix.ui.screen.*;
import com.company.bpmliparent.entity.NewsItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import java.io.IOException;

@UiController("NewsItem.edit")
@UiDescriptor("news-item-edit.xml")
@EditedEntityContainer("newsItemDc")
public class NewsItemEdit extends StandardEditor<NewsItem> {
    @Autowired
    private Emailer emailer;

    @Autowired
    private Resources resources;

    private boolean justCreated;

    private static final Logger log = LoggerFactory.getLogger(NewsItemEdit.class);

    @Inject
    protected Dialogs dialogs;

    @Subscribe
    public void onInitEvent(InitEntityEvent<NewsItem> event){
        justCreated = true;
    }

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPostCommit(DataContext.PostCommitEvent event){
        if (justCreated) {
            dialogs.createOptionDialog()
                    .withCaption("Email")
                    .withMessage("Send the news item by Mail")
                    .withActions(
                            new DialogAction(DialogAction.Type.YES){
                                @Override
                                public void actionPerform(Component component) {
                                    try {
                                        sendByEmail();
                                    }catch (IOException e){
                                        log.error("Error Sending Email", e);
                                    }
                                }
                            }
                    )
                    .show();
        }
    }

    private void sendByEmail() throws IOException {
        NewsItem newsItem = getEditedEntity();
        EmailInfo emailInfo = EmailInfoBuilder.create()
                .setAddresses("karorimesh@gmail.com")
                .setSubject(newsItem.getCaption())
                .setBody(newsItem.getContent())
                .build();
        emailer.sendEmailAsync(emailInfo);
    }
}