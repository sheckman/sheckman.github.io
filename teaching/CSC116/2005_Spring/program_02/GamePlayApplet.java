
/**
  * This class Does all the formatting for the game play screen. 
  *
  * @author Carol Miller
  * @author Alex Balik
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GamePlayApplet extends JApplet implements ActionListener{

    private JPanel pnltop    = new JPanel();  //holds problem and answer 
    private JPanel pnlmiddle = new JPanel(); //holds message to player
    private JPanel pnlbottom = new JPanel(); //holds score and quit button 
  
    private JTextField txtProblem = new JTextField ("",10);
    private JLabel lblequals = new JLabel(" = ");
    private JTextField txtAnswer = new JTextField ("",5); 
    private JButton btnSubmit = new JButton("Check Answer");
 
    private JTextField txtMessage = new JTextField("",20);

    private JLabel lblScore = new JLabel ("Score: ");
    private JTextField txtScore = new JTextField ("0",5);
    private JButton btnQuit = new JButton ("Quit"); 
    private JButton btnNewGame = new JButton("New Game");
 	private GamePlayModel model;
    

    public void init(){
        model = new GamePlayModel();
        txtProblem.setText(model.newProblem());
		setSize(400,150);
		setLocation(100,100);   
        Container c = getContentPane();        
        c.setLayout(new GridLayout(3,1)); //formats frame for 3 rows, 1 column
	
        pnltop.setBackground(Color.yellow);
        pnlmiddle.setBackground(Color.yellow);
        pnlbottom.setBackground(Color.yellow);

        //add buttons and labels to respective panel
		txtProblem.setBackground(Color.cyan);
        pnltop.add(txtProblem);
        pnltop.add(lblequals);
        pnltop.add(txtAnswer);
        
        btnSubmit.addActionListener(this);
        btnSubmit.setBackground(Color.orange);
        pnltop.add(btnSubmit);


		txtMessage.setBackground(Color.cyan);
        pnlmiddle.add(txtMessage);

        pnlbottom.add(lblScore);
		txtScore.setBackground(Color.cyan);
        pnlbottom.add(txtScore);
       
        btnNewGame.addActionListener(this);
        btnNewGame.setBackground(Color.orange);
        pnlbottom.add(btnNewGame);
       
        btnQuit.addActionListener(this);
        btnQuit.setBackground(Color.orange);
        pnlbottom.add(btnQuit);

        //add panels to frame for desired appeareance
        c.add(pnltop);
        c.add(pnlmiddle);
        c.add(pnlbottom);

		txtProblem.setEditable(false);
		txtScore.setEditable(false);
		txtMessage.setEditable(false);

        setVisible(true);
    }//end of constructor

    //normally I would listen for the quit button,
    //but since it is an applet, it is turned off
    public void actionPerformed(ActionEvent event){
		if (event.getSource() == btnSubmit) {
	   		int guess = 0;
	   		
		 	try {
				guess = Integer.parseInt(txtAnswer.getText());
		 	}
		 
	    	//if user enters a non-number,
			//count as an incorrect guess
			catch(NumberFormatException e) {
		    	if (2 == model.guessAnswer(1000)) {
		    		txtMessage.setText("Incorrect, try again.");
		    }
		    
		    else {
		    	txtMessage.setText("Incorrect.");
				txtProblem.setText(model.newProblem());
		    }
		    
		    txtAnswer.setText("");
		    return;
			}
		 
			int result = model.guessAnswer(guess);
			//answered correctly
			if (1 == result) {
				txtMessage.setText("Correct!");
				txtProblem.setText(model.newProblem());
				txtScore.setText("" + model.getScore());
			}
			    
			//answered incorrectly on first try
			else if (2 == result) {
			    txtMessage.setText("Incorrect, try again.");
		   	}
			    
			//answered incorrectly on second try
			else {
				txtMessage.setText("Incorrect.");
				txtProblem.setText(model.newProblem());
				    
			} 
			
			txtAnswer.setText("");   
           
     	}
       
       	//if user clicked New Game
       	else if (event.getSource() == btnNewGame) {
       		model.newGame();
			txtProblem.setText(model.newProblem());
			txtAnswer.setText("");
			txtScore.setText("0");
			txtMessage.setText("");
		}   
	    
    }
 
}//end of GamePlayApplet definition


