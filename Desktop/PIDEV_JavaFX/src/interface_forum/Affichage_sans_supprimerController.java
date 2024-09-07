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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import services.gestion_forum;
import web_java.forum;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class Affichage_sans_supprimerController implements Initializable {

    public Stage STAGE;
    public Scene SCENE;
    public Parent root;
    

    
    @FXML
    private ListView<forum> list_view_affichage_sans_supprimer;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
            gestion_forum gf = new gestion_forum();
            forum f=new forum();
    ObservableList<forum> forum = FXCollections.observableArrayList(gf.afficherForum());
        list_view_affichage_sans_supprimer.setItems(forum);
        // TODO
    }
    
    @FXML
    void retour_admin(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("acceuil_admin.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Affichage_sans_supprimerController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    
    
}
