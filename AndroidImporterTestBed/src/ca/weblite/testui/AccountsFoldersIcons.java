package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountsFoldersIcons extends Container  {
    public AccountsFoldersIcons(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_flaggedmessagecountwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_flaggedmessagecounticon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_flaggedmessagecount = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_newmessagecountwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_newmessagecounticon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_newmessagecount = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container158Android");
        setName("AccountsFoldersIcons");
        addComponent(gui_flaggedmessagecountwrapper);
        gui_flaggedmessagecountwrapper.setUIID("Container158Android");
        gui_flaggedmessagecountwrapper.setName("flaggedmessagecountwrapper");
        gui_flaggedmessagecountwrapper.addComponent(gui_flaggedmessagecounticon);
        gui_flaggedmessagecountwrapper.addComponent(gui_flaggedmessagecount);
        gui_flaggedmessagecounticon.setUIID("Container3Android");
        gui_flaggedmessagecounticon.setName("flaggedmessagecounticon");
        gui_flaggedmessagecount.setUIID("Label10Android");
        gui_flaggedmessagecount.setName("flaggedmessagecount");
        addComponent(gui_newmessagecountwrapper);
        gui_newmessagecountwrapper.setUIID("Container158Android");
        gui_newmessagecountwrapper.setName("newmessagecountwrapper");
        gui_newmessagecountwrapper.addComponent(gui_newmessagecounticon);
        gui_newmessagecountwrapper.addComponent(gui_newmessagecount);
        gui_newmessagecounticon.setUIID("Container3Android");
        gui_newmessagecounticon.setName("newmessagecounticon");
        gui_newmessagecount.setUIID("Label10Android");
        gui_newmessagecount.setName("newmessagecount");
        gui_flaggedmessagecountwrapper.setUIID("Container158Android");
        gui_flaggedmessagecountwrapper.setName("flaggedmessagecountwrapper");
        gui_newmessagecountwrapper.setUIID("Container158Android");
        gui_newmessagecountwrapper.setName("newmessagecountwrapper");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}