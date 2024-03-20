
package Negocio;

import Vista.JFLogin;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Principal {
    public static void main(String[] args){
        JFLogin app = new JFLogin();
        app.setVisible(true);
        try{
            FlatMacLightLaf.setup();
        }catch(Exception e){
            System.err.print(e);
        }
    }
}
