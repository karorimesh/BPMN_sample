package com.company.bpmliparent.screen.newsitem;

import io.jmix.ui.screen.*;
import com.company.bpmliparent.entity.NewsItem;

@UiController("NewsItem.browse")
@UiDescriptor("news-item-browse.xml")
@LookupComponent("newsItemsTable")
public class NewsItemBrowse extends StandardLookup<NewsItem> {

}