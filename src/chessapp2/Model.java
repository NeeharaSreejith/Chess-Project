/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;

/**
 *
 * @author ryoro
 */
public class Model {
    
    public Database db;
    public Data data;
    public int answer = 0;
    public String username; // To store the user name for later use.
    
    public Model() {
        this.db = new Database();
       // this.db.dbsetup();
    }
}
