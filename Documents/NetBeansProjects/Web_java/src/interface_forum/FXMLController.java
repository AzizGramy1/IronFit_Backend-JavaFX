
package interface_forum;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
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
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class FXMLController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField tf_date_creation;
    @FXML
    private TextField tf_liste_participants;
    @FXML
    private TextField tf_admis;
    @FXML
    private TextField tf_sujet_forum;
    @FXML
    private TextField tf_id_forum;
    
    @FXML
    private Button ajouter_forum_button;
    
    private gestion_forum gf;
    
    public Stage STAGE;
    public Scene SCENE;
    public Parent root;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        gf = new gestion_forum();
        ajouter_forum_button.setOnAction(this::btn_ajouter_forum_clicked);
    }    

    @FXML
    private void btn_ajouter_forum_clicked(ActionEvent event) {
        
    Long id_forum= Long.parseLong(tf_id_forum.getText());
    String dateCreation = tf_date_creation.getText();
    String listeParticipants = tf_liste_participants.getText();
    Long admis=Long.parseLong(tf_admis.getText());
    Long sujetForum=Long.parseLong(tf_sujet_forum.getText());

// Vérifier si tf_id_forum.getText() est un nombre et le convertir en Long

try {
    
} catch (NumberFormatException e) {
    // Gérer l'erreur ici si la valeur de tf_id_forum n'est pas un nombre
}

// Créer une instance de la classe forum
   forum forum1 = new forum(id_forum, dateCreation, sujetForum, admis, listeParticipants);
   gf.ajouterForum(forum1);
   
   Notifications notifs= Notifications.create()
                .title("Gestionnaire forum")
                .text("Verifier votre affichage")
                .graphic(null)
                .hideAfter(Duration.seconds(5))
                .position(Pos.CENTER).onAction(new EventHandler<ActionEvent>(){
                    
                    
                    @Override
                    public void handle(ActionEvent event){
                        System.out.println("Clicked on notification");
                    
                    }
                    });
                notifs.show();
        
    }

    @FXML
    private void btn_back_forum_clicked(ActionEvent event) {
        
        try {
            root = FXMLLoader.load(getClass().getResource("menu_affichage.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    @FXML
    private void effacer_forum_clicked(ActionEvent event) {
        
        Notifications notifs= Notifications.create()
                .title("Gestionnaire forum")
                .text("Verifier votre affichage")
                .graphic(null)
                .hideAfter(Duration.seconds(5))
                .position(Pos.CENTER).onAction(new EventHandler<ActionEvent>(){
                    
                    
                    @Override
                    public void handle(ActionEvent event){
                        System.out.println("Clicked on notification");
                    
                    }
                    });
                notifs.show();
        
        
    }
    
    
}
