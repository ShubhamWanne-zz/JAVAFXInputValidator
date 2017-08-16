/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.validator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author shubham
 */
public class Welcome_pageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXButton signup;
    
    @FXML
    private AnchorPane root;
    
    @FXML
    private JFXDrawer drawer;
    
    @FXML
    private JFXButton close;

    
    public AnchorPane pane;
    public boolean is_signup_is_clicked = false;
    
    
    
    @FXML
    void onSignUp(ActionEvent event) {
        if(!is_signup_is_clicked){
            signup.setText("Register");
            is_signup_is_clicked = true;
            close.setVisible(true);
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            drawer.setSidePane(pane);
            
            drawer.open();
            
        } catch (IOException ex) {
            Logger.getLogger(Welcome_pageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @FXML
    void closeTheDrawer(ActionEvent event) {
            is_signup_is_clicked = false;
            signup.setText("Sign up");
            close.setVisible(false);
            drawer.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("root = "+root);
    }    
    
}
