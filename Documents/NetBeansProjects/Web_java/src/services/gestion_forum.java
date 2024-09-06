/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import web_java.forum;
import web_java.actions_realiséé;
import web_java.reclamation;


import util.MyConnection;   


 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import util.MyConnection;

/**
 *
 * @author DELL
 */
public class gestion_forum {
        MyConnection Mycnx = MyConnection.getInstance();
        Connection cnx = Mycnx.getCnx();

    public gestion_forum() {
    }
        
        
    
    //Add 1
    public void ajouterForum(forum f){
        //1
        String req = "INSERT INTO forum (`id_forum`, `date_creation_forum`, `id_sujet_forum`, `id_user_admin`, `liste_participants`) " +
             "VALUES ('" + f.getId_forum() + "', '" + f.getDate_creation_forum() + "', '" + f.getId_sujet_forum() + "', '" + f.getId_user_admin() + "', '" + f.getListe_participants() + "')";
                                                              
        
        
        try {
            //2 : Statement
            Statement st = cnx.createStatement();
            //3 exec
            st.executeUpdate(req);
            System.out.println("Forum ajouter avec succées!");
            
        } catch (SQLException ex) {
            Logger.getLogger(forum.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }
    
    //Add 2
    
        
    
    
    //Fetch
    public List<forum> afficherForum(){
        List<forum> ListForum = new ArrayList<>();
         //1
         String req = "SELECT * FROM forum";
        try {
            //2
            Statement st = cnx.createStatement();
            //3
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                forum f = new forum();
                f.setId_forum((rs.getInt("id_forum")));
                f.setDate_creation_forum(rs.getString("date_creation_forum"));
          
                ListForum.add(f);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(forum.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return ListForum;
    }
    /*public void modifier_forum(forum f, sujets_forum s) {
        try {
            String req ="UPDATE `forum` SET `id_forum`='[value-1]',`date_creation_forum`='[value-2]',`id_sujet_forum`='[value-3]',`id_user_admin`='[value-4]',`liste_participants`='[value-5]' WHERE 1";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, f.getId_forum());
            ps.setInt(2, p.getId());
            ps.executeUpdate();
            System.out.println("Forum mod");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }}
    */
      public void modifierForum(forum f, long nouveauIdAdmin) {
    long forumAModifier = f.getId_forum();

    if (forumAModifier != 0) {
        f.setId_user_admin(nouveauIdAdmin);

        // Mettez à jour le forum dans la base de données
        String req = "UPDATE `forum` SET `id_user_admin` = ? WHERE `id_forum` = ?";

        try {
            // Créez un objet PreparedStatement pour éviter les injections SQL
            PreparedStatement ps = cnx.prepareStatement(req);

            // Remplacez les paramètres de la requête par les valeurs actuelles
            ps.setLong(1, nouveauIdAdmin);
            ps.setLong(2, forumAModifier);

            // Exécutez la requête
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Forum modifié avec succès !");
            } else {
                System.out.println("Aucun forum trouvé avec cet ID.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(forum.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("Forum non trouvé.");
    }
}
  
        
        

   

    public void supprimerForum(long idForum) {
        if (idForum != 0) {
            // Requête SQL pour supprimer le forum
            String req ="DELETE FROM forum WHERE id_forum = ?";

            try {
                // Créez un objet PreparedStatement pour éviter les injections SQL
                PreparedStatement ps = cnx.prepareStatement(req);

                // Remplacez le paramètre de la requête par l'ID du forum
                ps.setLong(1,idForum);

                // Exécutez la requête de suppression
                int rowsDeleted = ps.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("Forum supprimé avec succès !");
                } else {
                    System.out.println("Aucun forum trouvé avec cet ID.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(forum.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("ID du forum invalide.");
        }


    }
    
    public forum rechercherForumParId(long idForum) {
    // Créez un objet forum pour stocker les données du forum trouvé
    forum forumTrouve = null;
    

    // Requête SQL pour rechercher le forum par ID
    String req = "SELECT * FROM forum WHERE id_forum = ?";

    try {
        // Créez un objet PreparedStatement pour éviter les injections SQL
        PreparedStatement ps = cnx.prepareStatement(req);

        // Remplacez le paramètre de la requête par l'ID du forum
        ps.setLong(1, idForum);

        // Exécutez la requête de recherche
        ResultSet rs = ps.executeQuery();

        // Vérifiez s'il y a un résultat
        if (rs.next()) {
            // Créez un nouvel objet forum avec les données du résultat de la requête
            forumTrouve = new forum();
            forumTrouve.setId_forum(rs.getLong("id_forum"));
            forumTrouve.setDate_creation_forum(rs.getString("date_creation_forum"));
            // Vous pouvez ajouter d'autres attributs ici si nécessaire
        }
        else {System.out.println("Forum non touvé");}

        rs.close();
    } catch (SQLException ex) {
        Logger.getLogger(forum.class.getName()).log(Level.SEVERE, null, ex);
    }

    return forumTrouve; // Renvoie le forum trouvé ou null s'il n'existe pas
}

}
 

