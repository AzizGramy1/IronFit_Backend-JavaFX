/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_forum;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.MyConnection;
import services.gestion_forum;
import web_java.forum;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class Modifier_forumController implements Initializable {

    
        @FXML
        private TextField tf_id_forum;
        @FXML
        private TextField tf_nouveau_admin;
        
        private gestion_forum gf;
        
        @FXML
        private Button modifier_forum_button;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gf =new gestion_forum();
        modifier_forum_button.setOnAction(this::modifier_forum_clicked);
        
        
    }    
    @FXML
public void modifier_forum_clicked(ActionEvent event) {
    try {
        int forumId = Integer.parseInt(tf_id_forum.getText());
        int idAdmin = Integer.parseInt(tf_nouveau_admin.getText());

        // Créez une instance de forum et définissez l'ID du forum
        forum forum_1 = new forum();
        forum_1.setId_forum(forumId);

        // Appelez la méthode de gestion pour modifier le forum
        gf.modifierForum(forum_1, idAdmin);

        System.out.println("L'admin du forum a été modifié avec succès");
    } catch (NumberFormatException e) {
        // Gérez l'erreur ici si la saisie n'est pas un nombre valide
        System.out.println("Erreur lors de la modification");
    }
}

        
        
        
        
}

