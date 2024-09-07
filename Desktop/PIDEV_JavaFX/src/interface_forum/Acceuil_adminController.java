/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_forum;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import static javafx.scene.AccessibleAttribute.SCENE;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import services.gestion_forum;



/**
 * FXML Controller class
 *
 * @author DELL
 */
public class Acceuil_adminController implements Initializable {
    
    
    public Stage STAGE;
    public Scene SCENE;
    public Parent root;
    
    @FXML
    private Button ajouter_forum;

    @FXML
    private Button modifier_forum;

    @FXML
    private Button supprimer_forum;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        gestion_forum gf = new gestion_forum();
        
        
        
        
    }  
    
    @FXML
    void ajouter_forum(ActionEvent event) {
            try {
            
            root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_adminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
        

    }
        @FXML
    void supprimer_forum(ActionEvent event) {
            try {
            
            root = FXMLLoader.load(getClass().getResource("supprimer_forum_1.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_adminController.class.getName()).log(Level.SEVERE, null, ex);
        }}
            
    @FXML
    void modifier_forum(ActionEvent event) {}
    
    @FXML
    void voir_menu(ActionEvent event) {
        
        try {
            root = FXMLLoader.load(getClass().getResource("menu_affichage.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Acceuil_adminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
    
        
        
    
        }



        

    
    

    
    

