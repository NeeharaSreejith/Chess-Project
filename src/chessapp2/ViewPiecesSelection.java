/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ryoro
 */
public class ViewPiecesSelection extends JFrame implements Observer{
    
    private JButton buttonK = new JButton("King");
    private JButton buttonQ = new JButton("Queen");
    private JButton buttonB = new JButton("Bishop");
    private JButton buttonN = new JButton("Knight");
    private JButton buttonR = new JButton("Rook");
    private JButton buttonP = new JButton("Pawn");
    
    public ViewPiecesSelection()
    {
        System.out.println("show pieces");
        
        JFrame selectionFrame = new JFrame("Pieces");
        selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectionFrame.setVisible(true);
        selectionFrame.setLocationRelativeTo(null); // Make the frame located at the absolute center of the screen.
        selectionFrame.setSize(500, 300);
        
        JPanel selectionPanel = new JPanel();
        
        
        selectionPanel.setSize(400,200);
        selectionPanel.setVisible(true);
        selectionPanel.setLocation(100,100);

        selectionFrame.add(selectionPanel);
        
        selectionPanel.add(buttonK);
        buttonK.setSize(50,50);
        buttonK.setLocation(150,700);
        
        selectionPanel.add(buttonQ);
        buttonQ.setSize(50,50);
        buttonQ.setLocation(150,500);
        
        selectionPanel.add(buttonB);
        buttonB.setSize(50,50);
        buttonB.setLocation(150,300);
        
        
        selectionPanel.add(buttonN);
        buttonN.setSize(50,50);
        buttonN.setLocation(350, 700);
        
 
        selectionPanel.add(buttonR);
        buttonR.setSize(50,50);
        buttonR.setLocation(350, 500);
        
        buttonP.setSize(50,50);
        buttonP.setLocation(350, 300);
        selectionPanel.add(buttonP);
       

        
        
    }
    
    public void addActionListener(ActionListener listener) {
        this.buttonK.addActionListener(listener);
        this.buttonQ.addActionListener(listener);
        this.buttonB.addActionListener(listener);
        this.buttonN.addActionListener(listener);
        this.buttonR.addActionListener(listener);
        this.buttonP.addActionListener(listener);
        
     
    }

    @Override
    public void update(Observable o, Object arg) {
        
        
    }
    
   
    
}
