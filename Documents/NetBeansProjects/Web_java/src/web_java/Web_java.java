/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_java;
import Web_java.sujets_forum;
import services.gestion_forum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import web_java.*;
import util.MyConnection;  
import java.util.SimpleTimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date; 


/**
 *
 * @author DELL
 */
public class Web_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyConnection myConnection = MyConnection.getInstance();

        // Get the database connection
        Connection connection = myConnection.getCnx();
        
        
        
    
    
    forum f1=new forum(1,"11/2/2021",3,5,"Aziz");
    forum f2=new forum(2,"11/3/2021",6,7,"Jasser");
    forum f3=new forum(3,"14/2/2021",8,9,"Amine");
    forum f4=new forum(4,"12/2/2021",10,11,"Samara");
    forum f6=new forum(7,"12/2/2022",12,1,"Mayssa,Kenza,Samara");
    gestion_forum gf= new gestion_forum();
    //gf.modifierForum(f5, 2);
    //gf.supprimerForum(6);
     
    //gf.supprimerForum(1);
    gf.modifierForum(f1,6);
   // gf.modifierForum(f6,2 );
  // gf.rechercherForumParId(1);

// TODO code application logic here
    
    
    
    };
   
    
    
    
    
   
        }
            


    

