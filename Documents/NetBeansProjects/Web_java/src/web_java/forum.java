/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_java;
import java.util.Date;
/**
 *
 * @author DELL
 */
   public class forum {
   private long id_forum;
   private String date_creation_forum;
   private long id_sujet_forum;
   private long id_user_admin;
   private String liste_participants;

    public forum(long id_forum, String date_creation_forum, long id_sujet_forum, long id_user_admin, String liste_participants) {
        this.id_forum = id_forum;
        this.date_creation_forum = date_creation_forum;
        this.id_sujet_forum = id_sujet_forum;
        this.id_user_admin = id_user_admin;
        this.liste_participants = liste_participants;
    }

    public forum(String date_creation_forum, long id_sujet_forum, long id_user_admin, String liste_participants) {
        this.date_creation_forum = date_creation_forum;
        this.id_sujet_forum = id_sujet_forum;
        this.id_user_admin = id_user_admin;
        this.liste_participants = liste_participants;
    }

    public forum() {
    }

    public long getId_forum() {
        return id_forum;
    }

    public void setId_forum(long id_forum) {
        this.id_forum = id_forum;
    }

    public String getDate_creation_forum() {
        return date_creation_forum;
    }

    public void setDate_creation_forum(String date_creation_forum) {
        this.date_creation_forum = date_creation_forum;
    }

    public long getId_sujet_forum() {
        return id_sujet_forum;
    }

    public void setId_sujet_forum(long id_sujet_forum) {
        this.id_sujet_forum = id_sujet_forum;
    }

    public long getId_user_admin() {
        return id_user_admin;
    }

    public void setId_user_admin(long id_user_admin) {
        this.id_user_admin = id_user_admin;
    }

    public String getListe_participants() {
        return liste_participants;
    }

    public void setListe_participants(String liste_participants) {
        this.liste_participants = liste_participants;
    }

    @Override
    public String toString() {
        return "forum{" + "date_creation_forum=" + date_creation_forum + ", id_sujet_forum=" + id_sujet_forum + ", id_user_admin=" + id_user_admin + ", liste_participants=" + liste_participants + '}';
    }
   
   
   
   

   
}


