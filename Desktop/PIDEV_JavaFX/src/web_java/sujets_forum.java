/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_java;
import java.util.Date;

/**
 *
 * @author DELL
 */
 public class sujets_forum {
    private long id_sujet_forum;
    private Date date_creations;
    private String sujet;
    private String theme;
    private String descriptif_sujet;

    public sujets_forum(long id_sujet_forum) {
        this.id_sujet_forum = id_sujet_forum;
    }

    public sujets_forum() {
    }
    

    public sujets_forum(long id_sujet_forum, Date date_creations) {
        this.id_sujet_forum = id_sujet_forum;
        this.date_creations = date_creations;
    }
    
    
    

    public sujets_forum(long id_sujet_forum, Date date_creations, String sujet, String theme, String descriptif_sujet) {
        this.id_sujet_forum = id_sujet_forum;
        this.date_creations = date_creations;
        this.sujet = sujet;
        this.theme = theme;
        this.descriptif_sujet = descriptif_sujet;
    }

    public long getId_sujet_forum() {
        return id_sujet_forum;
    }

    public void setId_sujet_forum(long id_sujet_forum) {
        this.id_sujet_forum = id_sujet_forum;
    }

    public Date getDate_creations() {
        return date_creations;
    }

    public void setDate_creations(Date date_creations) {
        this.date_creations = date_creations;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescriptif_sujet() {
        return descriptif_sujet;
    }

    public void setDescriptif_sujet(String descriptif_sujet) {
        this.descriptif_sujet = descriptif_sujet;
    }
    
    

    

    

    
    
    
}

