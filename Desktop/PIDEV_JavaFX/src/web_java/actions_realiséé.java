/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_java;

/**
 *
 * @author DELL
 */
public class actions_realiséé {
    long action_realisee;
    long id_user;
    String type_actions;
    int rate_score;

    public actions_realiséé(long action_realisee, long id_user, String type_actions, int rate_score) {
        this.action_realisee = action_realisee;
        this.id_user = id_user;
        this.type_actions = type_actions;
        this.rate_score = rate_score;
    }

    public actions_realiséé(long id_user, String type_actions, int rate_score) {
        this.id_user = id_user;
        this.type_actions = type_actions;
        this.rate_score = rate_score;
    }

    public actions_realiséé() {
    }

    public long getAction_realisee() {
        return action_realisee;
    }

    public void setAction_realisee(long action_realisee) {
        this.action_realisee = action_realisee;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getType_actions() {
        return type_actions;
    }

    public void setType_actions(String type_actions) {
        this.type_actions = type_actions;
    }

    public int getRate_score() {
        return rate_score;
    }

    public void setRate_score(int rate_score) {
        this.rate_score = rate_score;
    }
    
    
    
}
