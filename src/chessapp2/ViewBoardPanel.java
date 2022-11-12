/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ryoro
 */
public class ViewBoardPanel {
    
    private ViewChess view = new ViewChess();
    private JPanel boardPanel = new JPanel();

    JPanel a1 = new JPanel(); JPanel b1 = new JPanel(); JPanel c1 = new JPanel(); JPanel d1 = new JPanel(); JPanel e1 = new JPanel(); JPanel f1 = new JPanel(); JPanel g1 = new JPanel(); JPanel h1 = new JPanel(); 
    JPanel a2 = new JPanel(); JPanel b2 = new JPanel(); JPanel c2 = new JPanel(); JPanel d2 = new JPanel(); JPanel e2 = new JPanel(); JPanel f2 = new JPanel(); JPanel g2 = new JPanel(); JPanel h2 = new JPanel(); 
    JPanel a3 = new JPanel(); JPanel b3 = new JPanel(); JPanel c3 = new JPanel(); JPanel d3 = new JPanel(); JPanel e3 = new JPanel(); JPanel f3 = new JPanel(); JPanel g3 = new JPanel(); JPanel h3 = new JPanel(); 
    JPanel a4 = new JPanel(); JPanel b4 = new JPanel(); JPanel c4 = new JPanel(); JPanel d4 = new JPanel(); JPanel e4 = new JPanel(); JPanel f4 = new JPanel(); JPanel g4 = new JPanel(); JPanel h4 = new JPanel(); 
    JPanel a5 = new JPanel(); JPanel b5 = new JPanel(); JPanel c5 = new JPanel(); JPanel d5 = new JPanel(); JPanel e5 = new JPanel(); JPanel f5 = new JPanel(); JPanel g5 = new JPanel(); JPanel h5 = new JPanel();  
    JPanel a6 = new JPanel(); JPanel b6 = new JPanel(); JPanel c6 = new JPanel(); JPanel d6 = new JPanel(); JPanel e6 = new JPanel(); JPanel f6 = new JPanel(); JPanel g6 = new JPanel(); JPanel h6 = new JPanel(); 
    JPanel a7 = new JPanel(); JPanel b7 = new JPanel(); JPanel c7 = new JPanel(); JPanel d7 = new JPanel(); JPanel e7 = new JPanel(); JPanel f7 = new JPanel(); JPanel g7 = new JPanel(); JPanel h7 = new JPanel(); 
    JPanel a8 = new JPanel(); JPanel b8 = new JPanel(); JPanel c8 = new JPanel(); JPanel d8 = new JPanel(); JPanel e8 = new JPanel(); JPanel f8 = new JPanel(); JPanel g8 = new JPanel(); JPanel h8 = new JPanel();  
   
    JPanel[] array8 = {a1,b1,c1,d1,e1,f1,g1,h1};
    JPanel[] array7 = {a2,b2,c2,d2,e2,f2,g2,h2};
    JPanel[] array6 = {a3,b3,c3,d3,e3,f3,g3,h3};
    JPanel[] array5 = {a4,b4,c4,d4,e4,f4,g4,h4};
    JPanel[] array4 = {a5,b5,c5,d5,e5,f5,g5,h5};
    JPanel[] array3 = {a6,b6,c6,d6,e6,f6,g6,h6};
    JPanel[] array2 = {a7,b7,c7,d7,e7,f7,g7,h7};
    JPanel[] array1 = {a8,b8,c8,d8,e8,f8,g8,h8};
    
    JPanel[][] boardArray = {array8, array7, array6, array5, array4, array3, array2, array1};
    
    public ViewBoardPanel()
    {
        
      
        //Jpanel arranged with grid layout manager in boardpanel
        boardPanel.setSize(600,600);
        boardPanel.setLocation(50,100);
        boardPanel.setLayout(new GridLayout(8,8));
        
        //Jpanel arranged with grid layout manager in boardpanel
        boardPanel.setSize(600,600);
        boardPanel.setLayout(new GridLayout(8,8));
        
        for(int y = 0; y < 8; y++ )
        {
            for (int x = 0; x < 8; x++ )
            { 
                JPanel square = boardArray[x][y];
                Color c = ((x+y)%2 == 0) ? Color.LIGHT_GRAY : Color.darkGray;
                square.setBackground(c);
                boardPanel.add(square);
               
            }
        }
        
        boardPanel.setLocation(450,50);
        view.add(boardPanel);
      
        view.getContentPane().removeAll();
        boardPanel.setVisible(true);
        view.add(boardPanel);
        view.revalidate();
        view.repaint();
    }
    
}
