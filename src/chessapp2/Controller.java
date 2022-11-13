/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ryoro
 */
public class Controller implements ActionListener{
    
    public View view;
    public Model model;
    
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.addActionListener(this); // Add Actionlistener (the instance of this class) to View.
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // Obtain the text displayed on the component.
        switch (command) {
            case "Log in":
                // Login button
                String username = this.view.unInput.getText(); // Obtain username.
                String password = this.view.pwInput.getText(); // Obtain password.
                this.model.checkName(username, password); // Pass above variables to model. Go to the checkName() of Model.java for step 6.
                break;
                
            case "Quit":
                // Quit button
                this.model.quitGame(); // Record user's current score.
                break;
            default:
                break;
        }
    }

}
