package com.company.bpmliparent.screen.landlord;

import io.jmix.ui.screen.*;
import com.company.bpmliparent.entity.Landlord;

@UiController("Landlord.browse")
@UiDescriptor("landlord-browse.xml")
@LookupComponent("landlordsTable")
public class LandlordBrowse extends StandardLookup<Landlord> {
}