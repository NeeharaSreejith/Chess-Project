/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;

import java.util.Observable;

/**
 *
 * @author ryoro
 */
public class Model extends Observable{
    
    public Database db;
    public Data data;
    public int answer = 0;
    public String username; // To store the user name for later use.
    
    public Model() {
        this.db = new Database();
        this.db.dbsetup();
    }
    
    public void checkName(String username, String password) {
        this.username = username; // Store username
        this.data = this.db.checkName(username, password); 
        
//        if (data.loginFlag) {
//            this.newQuestion();
//        }
        this.setChanged(); // Essential. To mark this observable instance has been modified.
        /**
         * Pass data to Observers. Here, the observer is view.
         * notifyObservers() would invoke update() of View automatically.
         * 
         * Go to update() of View.java for the next step.
         */
        this.notifyObservers(this.data); 
    }
    
    public void quitGame() {
        /**
         * Update data in the database. Go to quitGame() of Database.java for a fast -k.
         */
        this.db.quitGame(this.data.currentScore, this.username); 
        this.data.quitFlag = true; // Mark quitFlag as false.
        this.setChanged();
        this.notifyObservers(this.data);
    }
}
