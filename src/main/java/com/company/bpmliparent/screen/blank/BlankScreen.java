package com.company.bpmliparent.screen.blank;

import com.company.bpmliparent.entity.Landlord;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.TabSheet;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("BlankScreen")
@UiDescriptor("blank-screen.xml")
@PrimaryEditorScreen(Landlord.class)
@EditedEntityContainer("landlordDc")
public class BlankScreen extends StandardEditor<Landlord> {
    @Autowired
    private TabSheet customTabSheet;

    @Subscribe("next")
    public void onNext(Action.ActionPerformedEvent event) {

    }




}