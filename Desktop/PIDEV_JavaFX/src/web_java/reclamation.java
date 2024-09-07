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
public class reclamation {
    private long id_reclamations;
    private long id_user;
    private Date date_reclamations;
    private String type_reclamation;
    private String sujet_reclamations;
    private long id_personne_reclamee=0;

    public reclamation(long id_reclamations, long id_user, Date date_reclamations, String type_reclamation, String sujet_reclamations) {
        this.id_reclamations = id_reclamations;
        this.id_user = id_user;
        this.date_reclamations = date_reclamations;
        this.type_reclamation = type_reclamation;
        this.sujet_reclamations = sujet_reclamations;
    }

    public reclamation(long id_user, Date date_reclamations, String type_reclamation, String sujet_reclamations) {
        this.id_user = id_user;
        this.date_reclamations = date_reclamations;
        this.type_reclamation = type_reclamation;
        this.sujet_reclamations = sujet_reclamations;
    }

    public long getId_reclamations() {
        return id_reclamations;
    }

    public void setId_reclamations(long id_reclamations) {
        this.id_reclamations = id_reclamations;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public Date getDate_reclamations() {
        return date_reclamations;
    }

    public void setDate_reclamations(Date date_reclamations) {
        this.date_reclamations = date_reclamations;
    }

    public String getType_reclamation() {
        return type_reclamation;
    }

    public void setType_reclamation(String type_reclamation) {
        this.type_reclamation = type_reclamation;
    }

    public String getSujet_reclamations() {
        return sujet_reclamations;
    }

    public void setSujet_reclamations(String sujet_reclamations) {
        this.sujet_reclamations = sujet_reclamations;
    }

    public long getId_personne_reclamee() {
        return id_personne_reclamee;
    }

    public void setId_personne_reclamee(long id_personne_reclamee) {
        this.id_personne_reclamee = id_personne_reclamee;
    }
    
    
    
}
