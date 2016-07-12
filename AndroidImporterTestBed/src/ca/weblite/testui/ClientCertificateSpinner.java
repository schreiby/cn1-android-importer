package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class ClientCertificateSpinner extends Container  {
    public ClientCertificateSpinner(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Button gui_clientcertificatespinnerbutton = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_clientcertificatespinnerdelete = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setUIID("Container3Android");
        setName("ClientCertificateSpinner");
        addComponent(gui_clientcertificatespinnerbutton);
        addComponent(gui_clientcertificatespinnerdelete);
        gui_clientcertificatespinnerbutton.setText("client_certificate_spinner_empty");
        gui_clientcertificatespinnerbutton.setUIID("Button20Android");
        gui_clientcertificatespinnerbutton.setName("clientcertificatespinnerbutton");
        gui_clientcertificatespinnerdelete.setUIID("Button20Android");
        gui_clientcertificatespinnerdelete.setName("clientcertificatespinnerdelete");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}