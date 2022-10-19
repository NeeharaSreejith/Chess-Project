/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author ryoro
 */
public class ViewChessBoard extends JFrame implements Observer{
    
    private JFrame chessFrame = new JFrame("chessboard");
    private JPanel chessPanel = new JPanel();
   // private JButton square = new JButton();
    //private JButton squareWhite = new JButton();

   
   public ViewChessBoard()
   {
       System.out.println("printing chessboard");
       
       chessFrame.setSize(800,800);
       
       chessFrame.setLocationRelativeTo(null);
       chessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       chessFrame.setLayout(new GridLayout(8,8));
       
       
       
       
       for(int i = 0; i < 64; i++)
       {
           
             
              chessFrame.add(new JButton().setBackground(Color.red)); 
              
           
           
       }
       
       chessFrame.setVisible(true);
       
       
       
       
       
   }

    @Override
    public void update(Observable o, Object arg) {
       
    }
    
}
