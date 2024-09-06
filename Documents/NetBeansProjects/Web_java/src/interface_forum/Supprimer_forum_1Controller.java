/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_forum;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.MyConnection;
import services.gestion_forum;
import web_java.forum;
import javafx.scene.control.Button;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author DELL
 */
public class Supprimer_forum_1Controller implements Initializable {
    @FXML
    private TextField tf_id_supprimer_forum;

    private gestion_forum gf;
    
    @FXML
    private Button supp_forum;
    
    public Stage STAGE;
    public Scene SCENE;
    public Parent root;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gf = new gestion_forum();
        supp_forum.setOnAction(this::supprimer_forum_clicked);
    } 
    
    public void supprimer_forum_clicked(ActionEvent event){
        Long id_forum= Long.parseLong(tf_id_supprimer_forum.getText());
        
    
    try {
    
} catch (NumberFormatException e) {
    // Gérer l'erreur ici si la valeur de tf_id_forum n'est pas un nombre
}
    
    gf.supprimerForum(id_forum);
    }
    
    public void btn_back_clicked (ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("acceuil_admin.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Supprimer_forum_1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}}
