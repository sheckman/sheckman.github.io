import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokerGUI extends JFrame implements ActionListener {
	
	private JTextField txtCard1;
	private JTextField txtCard2;
	private JTextField txtCard3;
	private JTextField txtCard4;
	private JTextField txtCard5;
	private JTextField txtScore;
	
	private JButton btnCard1;
	private JButton btnCard2;
	private JButton btnCard3;
	private JButton btnCard4;
	private JButton btnCard5;
	private JButton btnQuit;
	private JButton btnAll;
	private JButton btnNone;
	private JButton btnScore;
	
	public PokerGUI() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(325,200);
		setLocation(100,100);
        	setTitle("Video Poker");
        	Container c = getContentPane();
        	txtCard1 = new JTextField("    ",4);
        	txtCard1.setFont(new Font("Times",Font.BOLD,24));
        	txtCard1.setHorizontalAlignment(JTextField.CENTER);
        	txtCard1.setEditable(false);
        	txtCard1.setBackground(Color.green.darker());
        	txtCard1.setText ("10  D"); //change to first card in hand 
        
		txtCard2 = new JTextField("    ",4);
		txtCard2.setFont(new Font("Times",Font.BOLD,20));
		txtCard2.setEditable(false);
		txtCard2.setHorizontalAlignment(JTextField.CENTER);
		txtCard2.setBackground(Color.green.darker());
		txtCard2.setText ("Jack D");//change this
		
		txtCard3 = new JTextField("   ",4);
		txtCard3.setFont(new Font("Times",Font.BOLD,20));
		txtCard3.setEditable(false);
		txtCard3.setHorizontalAlignment(JTextField.CENTER);
		txtCard3.setBackground(Color.green.darker());
                txtCard3.setText ("Queen D");// change this
		
		txtCard4 = new JTextField("    ",4);
		txtCard4.setFont(new Font("Times",Font.BOLD,20));
		txtCard4.setEditable(false);
		txtCard4.setHorizontalAlignment(JTextField.CENTER);
		txtCard4.setBackground(Color.green.darker());
		txtCard4.setText ("King D"); //change this
		
		txtCard5 = new JTextField("    ",4);
		txtCard5.setFont(new Font("Times",Font.BOLD,20));
		txtCard5.setEditable(false);
		txtCard5.setHorizontalAlignment(JTextField.CENTER);
		txtCard5.setBackground(Color.green.darker());
                txtCard5.setText ("Ace D");//change this
		
		txtScore = new JTextField("",15);
                txtScore.setText ("Royal Flush"); //change this: move to
                                                  //  actionPerformed...
		txtScore.setFont(new Font("Times",Font.BOLD,20));
		txtScore.setHorizontalAlignment(JTextField.CENTER);
		txtScore.setEditable(false);
		txtScore.setBackground(Color.white);
		
		btnCard1 = new JButton("Replace");
		btnCard2 = new JButton("Replace");
		btnCard3 = new JButton("Replace");
		btnCard4 = new JButton("Replace");
		btnCard5 = new JButton("Replace");
		
		btnCard1.setBackground(Color.red.darker());
		btnCard2.setBackground(Color.red.darker());
		btnCard3.setBackground(Color.red.darker());
		btnCard4.setBackground(Color.red.darker());
		btnCard5.setBackground(Color.red.darker());
		
		btnQuit = new JButton("Quit");
		btnAll = new JButton("Replace All");
		btnNone = new JButton("Replace None");
		btnQuit.setBackground(Color.blue);
		btnAll.setBackground(Color.blue);
		btnNone.setBackground(Color.blue);
		
		JPanel pnlCards = new JPanel();
		pnlCards.setLayout(new GridLayout(5,2));
		pnlCards.add(txtCard1);
		pnlCards.add(btnCard1);
		pnlCards.add(txtCard2);
		pnlCards.add(btnCard2);
		pnlCards.add(txtCard3);
		pnlCards.add(btnCard3);
		pnlCards.add(txtCard4);
		pnlCards.add(btnCard4);
		pnlCards.add(txtCard5);
		pnlCards.add(btnCard5);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setLayout(new GridLayout(3,1));
		pnlButtons.add(btnAll);
		pnlButtons.add(btnNone);
		pnlButtons.add(btnQuit);
	
		c.add(pnlCards,BorderLayout.WEST);
		c.add(pnlButtons,BorderLayout.CENTER);
		c.add(txtScore,BorderLayout.NORTH);
		
		btnScore = new JButton("Score Hand");
		btnScore.setFont(new Font("Times",Font.BOLD,18));
                c.add(btnScore,BorderLayout.SOUTH);
	
                btnQuit.addActionListener (this);	
		btnCard1.addActionListener (this); 
        	btnCard2.addActionListener (this); 
        	btnCard3.addActionListener (this); 
        	btnCard4.addActionListener (this); 
        	btnCard5.addActionListener (this); 
        	btnAll.addActionListener (this);
        	btnNone.addActionListener (this);
		btnScore.addActionListener(this);

		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
          if (e.getSource() == btnQuit){ 
               System.exit(1);
          }
	}
	
	public static void main(String[]args) {
		PokerGUI gui = new PokerGUI();
	}
}
