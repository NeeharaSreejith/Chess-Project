/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessapp2;
   
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Observable;
import javax.swing.JFrame;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Neehara Karthiatt Sreejith, 19076018
 */
public class ViewChess extends JFrame implements Observer{
    
    //size reference
    static Toolkit kit=Toolkit.getDefaultToolkit();
    static Dimension screenSize=kit.getScreenSize();

    static int screenWidth=screenSize.width;
    static int screenHeight=screenSize.height;
       
    static int frameWidth=screenWidth;
    static int frameHeight=screenHeight;         

        
    //creating new colors
    public static Color c1 = new Color(255,0,0,100);
    public static Color c2 = new Color(255,100,0,100); 
    
    //fonts used in labels
    public static Font titleFont = new Font(null, Font.BOLD,30);
    public static Font nameFont = new Font(null, Font.ITALIC,20);
   
    
    //instantiating panels
    private JPanel loginPanel = new JPanel();
    private JPanel registrationPanel = new JPanel();
    private JPanel selectPiecePanel = new JPanel();
  
    
    //components in login and registration panel
    private JLabel uName = new JLabel("Username: ");
    private JLabel pWord = new JLabel("Password: ");
    
    private JLabel usName = new JLabel("Username: ");
    private JLabel psWord = new JLabel("Password: ");
    
    public JTextField unInput = new JTextField(10);
    public JTextField pwInput = new JTextField(10);
    
    public JTextField usInput = new JTextField(10);
    public JTextField psInput = new JTextField(10);
    
    private JLabel inputInstr = new JLabel("maximum 10 characters or numbers");
    private JLabel wrongName = new JLabel("Wrong username or passwork!");
    
    //components in registration page
    private JLabel regTitle = new JLabel("REGISTRATION");
    private JButton signUpButton = new JButton("Sign up");
    
    //components of login panel
    private JLabel logTitle = new JLabel("LOGIN");
    private JButton loginButton = new JButton("Log in");
    
    //comonent of selectPiece panel
    //displaying the options of choosing chess pieces
    private JButton buttonK = new JButton("\u2654");
    private JButton buttonQ = new JButton("\u2655");
    private JButton buttonR = new JButton("\u2656");
    private JButton buttonB = new JButton("\u2657");
    private JButton buttonN = new JButton("\u2658");
    private JButton buttonP = new JButton("\u2659");
    
    private JButton nextButton = new JButton("next");
    
    private JLabel yourPiece = new JLabel("choose your piece");
    
    //identify if game started
    private boolean started = false;
    
    public ViewChess()
    {
        //frame settings
        this.setSize(frameWidth, frameHeight);
        this.setTitle("Learn Chess");
        this.setLocation(0,0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //font and size of labels in register panel
        this.regTitle.setFont(titleFont);
        this.usName.setFont(nameFont);
        this.psWord.setFont(nameFont);
        
        //adding components to registration panel
        this.registrationPanel.setLayout(null);
        
        this.regTitle.setBounds(250, 100, 500, 50);
        this.registrationPanel.add(regTitle);
        
        this.usName.setBounds(230, 250, 110, 25);
        this.registrationPanel.add(usName);
        
        this.psWord.setBounds(230, 200, 100, 25);
        this.registrationPanel.add(psWord); 
        
        this.usInput.setBounds(350, 200, 200, 25);
        this.registrationPanel.add(usInput); 
        
        this.psInput.setBounds(350, 250, 200, 25);
        this.registrationPanel.add(psInput);
        
        this.signUpButton.setBounds(310, 300, 100, 30);
        this.registrationPanel.add(signUpButton);
        
        //font and size of labels in login panel
        this.logTitle.setFont(titleFont);
        this.uName.setFont(nameFont);
        this.pWord.setFont(nameFont);
        
        //adding components to login panel
        this.loginPanel.setLayout(null);
        this.logTitle.setBounds(350, 100, 500, 50);
        this.loginPanel.add(logTitle);
        
        this.uName.setBounds(300, 250, 110, 25);
        this.loginPanel.add(uName);
        
        this.pWord.setBounds(300, 200, 100, 25);
        this.loginPanel.add(pWord); 
        
        this.unInput.setBounds(410, 200, 200, 25);
        this.loginPanel.add(unInput); 
       
        this.pwInput.setBounds(410, 250, 200, 25);
        this.loginPanel.add(pwInput); 
        
        this.loginButton.setBounds(380, 300, 100, 30);
        this.loginPanel.add(loginButton);
        
        //giving background colors to panels
        this.loginPanel.setBackground(c2);
          
        //arranging panels in the frame
        this.setLayout(null);
        this.registrationPanel.setBounds(0, 0, frameWidth/2, frameHeight);
        this.add(this.registrationPanel);
        this.loginPanel.setBounds(frameWidth/2, 0, frameWidth/2, frameHeight);
        this.add(this.loginPanel);
        
  
     
          this.setVisible(true);
        
    }
    
    public void choosePiece()
    {
        selectPiecePanel.setLayout(null);
        
        yourPiece.setBounds(580,10, 600, 500);
        this.yourPiece.setFont(titleFont);
        selectPiecePanel.add(yourPiece);
        
        buttonK.setBounds(300, 300, 100, 80);
        selectPiecePanel.add(buttonK);
        
        buttonQ.setBounds(450, 300, 100, 80);
        selectPiecePanel.add(buttonQ);
        
        buttonR.setBounds(600, 300, 100, 80);
        selectPiecePanel.add(buttonR);
        
        buttonB.setBounds(750, 300, 100, 80);
        selectPiecePanel.add(buttonB);
        
        buttonN.setBounds(900, 300, 100, 80);
        selectPiecePanel.add(buttonN);
        
        buttonP.setBounds(1050, 300, 100, 80);
        selectPiecePanel.add(buttonP);
        
        //selectPiecePanel.setLocationRelativeTo(null);
        this.setLayout(null);
        
        //frame settings
        this.selectPiecePanel.setBounds(0, 0, frameWidth, frameHeight);
        this.add(selectPiecePanel);
      
        
        //removing former components in the frame
        this.getContentPane().removeAll();
        selectPiecePanel.setVisible(true);
        this.add(selectPiecePanel);
        this.revalidate();
        this.repaint();
    }
    
    public void chessBoard(JPanel chessBoardPanel)
    {
        
        this.add(chessBoardPanel);
        
        //removing former components in the frame
        this.getContentPane().removeAll();
        chessBoardPanel.setVisible(true);
        this.add(chessBoardPanel);
        this.revalidate();
        this.repaint();
    }

    @Override
    public void update(Observable o, Object arg) {
//        Data data = (Data) arg; // Obtain the instance of data.
//        if (!data.loginFlag) { // If loginFlage is false, then ask the user to input again.
//            this.unInput.setText("");
//            this.pwInput.setText("");
//            this.message.setText("Invalid username or password.");
//        } else if (!this.started) { // If the game has not started, then start the game.
//            this.startQuiz(); // Change the interface of the frame.
//            this.started = true;
//            this.setQuestion(data.num1, data.num2); // Show the question on the interface.
//            /**
//             * You need to define ActionEvent for the next and the quit buttons
//             * in the Controller.java. Back to Controller.java for Step 8.
//             *
//             * After you finish Step 9, complete last two conditions.
//             */
//        } else if (data.quitFlag) { // If user quits the game, display user's current score.
//            this.quitGame(data.currentScore);
//        } else { // Otherwise, update a new question for the user.
//            this.setQuestion(data.num1, data.num2);
//       }
    }
        
}
