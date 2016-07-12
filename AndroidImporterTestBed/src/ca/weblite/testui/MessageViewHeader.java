package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageViewHeader extends Container  {
    public MessageViewHeader(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_chip = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_subject = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_contactbadge = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_iconcontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_answered = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_forwarded = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_from = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_tolabel = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_to = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_cclabel = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_cc = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_date = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_statusiconstrip = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.CheckBox gui_flagged = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui_cryptostatusicon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_cryptostatusdotsbg = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptostatuscombined2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptostatuscombined1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptostatussingle = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_additionalheadersview = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__5 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("MessageViewHeader");
        addComponent(gui_);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui_.addComponent(gui_chip);
        gui_.addComponent(gui__1);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui__1.addComponent(gui_subject);
        gui__1.addComponent(gui__2);
        gui__2.setUIID("Container3Android");
        gui__2.setName("_2");
        gui__2.addComponent(gui__3);
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui__3.addComponent(gui_contactbadge);
        gui__3.addComponent(gui_iconcontainer);
        gui_iconcontainer.setUIID("Container3Android");
        gui_iconcontainer.setName("iconcontainer");
        gui_iconcontainer.addComponent(gui_answered);
        gui_iconcontainer.addComponent(gui_forwarded);
        gui_answered.setUIID("Container505Android");
        gui_answered.setName("answered");
        gui_forwarded.setUIID("Container506Android");
        gui_forwarded.setName("forwarded");
        gui_contactbadge.setUIID("Label10Android");
        gui_contactbadge.setName("contactbadge");
        gui_iconcontainer.setUIID("Container3Android");
        gui_iconcontainer.setName("iconcontainer");
        gui__2.addComponent(gui__4);
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui__4.addComponent(gui_from);
        gui__4.addComponent(gui_tolabel);
        gui__4.addComponent(gui_to);
        gui__4.addComponent(gui_cclabel);
        gui__4.addComponent(gui_cc);
        gui__4.addComponent(gui_date);
        gui__4.addComponent(gui_statusiconstrip);
        gui_statusiconstrip.setUIID("Container3Android");
        gui_statusiconstrip.setName("statusiconstrip");
        gui_statusiconstrip.addComponent(gui_flagged);
        gui_statusiconstrip.addComponent(gui_cryptostatusicon);
        gui_cryptostatusicon.setUIID("Container3Android");
        gui_cryptostatusicon.setName("cryptostatusicon");
        gui_cryptostatusicon.addComponent(gui_cryptostatusdotsbg);
        gui_cryptostatusicon.addComponent(gui_cryptostatuscombined2);
        gui_cryptostatusicon.addComponent(gui_cryptostatuscombined1);
        gui_cryptostatusicon.addComponent(gui_cryptostatussingle);
        gui_cryptostatusdotsbg.setUIID("Label10Android");
        gui_cryptostatusdotsbg.setName("cryptostatusdotsbg");
        gui_cryptostatuscombined2.setUIID("Label10Android");
        gui_cryptostatuscombined2.setName("cryptostatuscombined2");
        gui_cryptostatuscombined1.setUIID("Label10Android");
        gui_cryptostatuscombined1.setName("cryptostatuscombined1");
        gui_cryptostatussingle.setUIID("Label10Android");
        gui_cryptostatussingle.setName("cryptostatussingle");
        gui_flagged.setUIID("CheckBox12Android");
        gui_flagged.setName("flagged");
        gui_cryptostatusicon.setUIID("Container3Android");
        gui_cryptostatusicon.setName("cryptostatusicon");
        gui_from.setText("general_no_sender");
        gui_from.setUIID("Label509Android");
        gui_from.setName("from");
        gui_tolabel.setText("message_to_label");
        gui_tolabel.setUIID("AndroidLabel510");
        gui_tolabel.setName("tolabel");
        gui_to.setUIID("SpanLabel511Android");
        gui_to.setName("to");
        gui_cclabel.setText("message_view_cc_label");
        gui_cclabel.setUIID("AndroidLabel510");
        gui_cclabel.setName("cclabel");
        gui_cc.setUIID("SpanLabel511Android");
        gui_cc.setName("cc");
        gui_date.setUIID("Label514Android");
        gui_date.setName("date");
        gui_statusiconstrip.setUIID("Container3Android");
        gui_statusiconstrip.setName("statusiconstrip");
        gui__3.setUIID("Container3Android");
        gui__3.setName("_3");
        gui__4.setUIID("Container3Android");
        gui__4.setName("_4");
        gui__1.addComponent(gui_additionalheadersview);
        gui_subject.setUIID("SpanLabel37Android");
        gui_subject.setName("subject");
        gui__2.setUIID("Container3Android");
        gui__2.setName("_2");
        gui_additionalheadersview.setUIID("SpanLabel37Android");
        gui_additionalheadersview.setName("additionalheadersview");
        gui_chip.setUIID("Container3Android");
        gui_chip.setName("chip");
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        addComponent(gui__5);
        gui_.setUIID("Container3Android");
        gui_.setName("");
        gui__5.setUIID("Container3Android");
        gui__5.setName("_5");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}