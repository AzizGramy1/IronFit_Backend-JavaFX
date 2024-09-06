
package services;

import Web_java.sujets_forum;
import java.sql.Connection;
import util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */

    public class gestion_sujet {
    MyConnection Mycnx = MyConnection.getInstance();
    Connection cnx = Mycnx.getCnx();

    public gestion_sujet() {
    }

    

    // Ajouter un sujet de forum
    public void ajouterSujetForum(sujets_forum sf){
        String req = "INSERT INTO sujets_forum (`id_sujet_forum`, `date_creations`, `sujet`, `theme`, `descriptif_sujet`) " +
             "VALUES ('" + sf.getId_sujet_forum() + "', '" + sf.getDate_creations() + "', '" + sf.getSujet() + "', '" + sf.getTheme() + "', '" + sf.getDescriptif_sujet() + "')";

        try {
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Sujet de forum ajouté avec succès!");

        } catch (SQLException ex) {
            Logger.getLogger(sujets_forum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Afficher les sujets de forum
    public List<sujets_forum> afficherSujetsForum(){
        List<sujets_forum> ListSujetsForum = new ArrayList<>();
        String req = "SELECT * FROM sujets_forum";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                sujets_forum sf = new sujets_forum();
                sf.setId_sujet_forum((rs.getInt("id_sujet_forum")));
                sf.setDate_creations(rs.getDate("date_creations"));
                sf.setSujet(rs.getString("sujet"));
                sf.setTheme(rs.getString("theme"));
                sf.setDescriptif_sujet(rs.getString("descriptif_sujet"));

                ListSujetsForum.add(sf);
            }

        } catch (SQLException ex) {
            Logger.getLogger(sujets_forum.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ListSujetsForum;
    }

    // Modifier un sujet de forum
    public void modifierSujetForum(sujets_forum sf, String nouveauSujet) {
        long sujetAModifier = sf.getId_sujet_forum();

        if (sujetAModifier != 0) {
            sf.setSujet(nouveauSujet);

            String req = "UPDATE `sujets_forum` SET `sujet` = ? WHERE `id_sujet_forum` = ?";

            try {
                PreparedStatement ps = cnx.prepareStatement(req);
                ps.setString(1, nouveauSujet);
                ps.setLong(2, sujetAModifier);

                ps.executeUpdate();
                System.out.println("Sujet de forum modifié avec succès!");

            } catch (SQLException ex) {
                Logger.getLogger(sujets_forum.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Sujet de forum non trouvé!");
        }
    }
}


