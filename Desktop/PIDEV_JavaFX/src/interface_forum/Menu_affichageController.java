
package interface_forum;
import com.sun.rowset.internal.Row;
import java.io.FileOutputStream;
import java.io.IOException;
import web_java.forum;
import services.gestion_forum;
import java.net.URL;
import java.util.List;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import services.gestion_forum;


/**
 * FXML Controller class
 *
 * @author DELL
 */
public class Menu_affichageController implements Initializable {

    
    @FXML
    private Button afficher_forum_list_view;

    @FXML
    private Button ajouter_forum_affichage;

    @FXML
    private ListView<forum> list_view_affichage;

    @FXML
    private Button supprimer_forum_affichage;
    
     @FXML
    private Button modifier_forum_affichage;
     
    
     
     

    
    public Stage STAGE;
    public Scene SCENE;
    public Parent root;
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
        gestion_forum gf = new gestion_forum();
    ObservableList<forum> forum = FXCollections.observableArrayList(gf.afficherForum());
        list_view_affichage.setItems(forum);
       
       
    }

    
        

    

    @FXML
    void ajouter_forum_listview(ActionEvent event) {
        
        try {
            
            root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Menu_affichageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    @FXML
    void supprimer_forum_listview(ActionEvent event) {
        gestion_forum gf=new gestion_forum();
        forum f=new forum();
        forum selectedPlanning = list_view_affichage.getSelectionModel().getSelectedItem();
        gf.supprimerForum(selectedPlanning.getId_forum());
        list_view_affichage.getItems().remove(selectedPlanning);
        
        
        
        

    }

    @FXML
    void modifier_forum_affichage_clicked(ActionEvent event){
        
            
        try {
            root = FXMLLoader.load(getClass().getResource("modifier_forum.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Menu_affichageController.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
    
     @FXML
    void retour_acceuil_admin(ActionEvent event) {
        
        try {
            root = FXMLLoader.load(getClass().getResource("acceuil_admin.fxml"));
            STAGE = (Stage)((Node)event.getSource()).getScene().getWindow();
            SCENE= new Scene(root);
            STAGE.setScene(SCENE);
            STAGE.show();
        } catch (IOException ex) {
            Logger.getLogger(Menu_affichageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    
    
    
   
        
            

    }
    
    
    
    
     
     
        


    
    
