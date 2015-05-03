import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class testfourcard extends JFrame {
	//Create a Refresh botton
	private JButton jbtRefresh = new JButton("Refresh");
	
	//Create four labels 
	private JLabel jlb1;
	private JLabel jlb2;
	private JLabel jlb3;
	private JLabel jlb4;
	
	//Create four image icons
	private ImageIcon card1;
	private ImageIcon card2; 
	private ImageIcon card3;
	private ImageIcon card4;
	
	//Create a deck
	private int[] deck = new int[52];
	
	
	public testfourcard() {
		//Invoke methods to initialize and shuffle the deck
		initialize();
		shuffle();
		
		JPanel panel = new JPanel(); // Use the panel to group buttons
		panel.add(jbtRefresh);//Add the Refresh button to panel
	
		JPanel panel2 = new JPanel();// Use the panel to group cards

		//Create four labels with the icons of the four cards*/
		jlb1 = new JLabel(card1);
		jlb2 = new JLabel(card2);
		jlb3 = new JLabel(card3);
		jlb4 = new JLabel(card4);
		
		//set panel2 GridLayout
		panel2.setLayout(new GridLayout(1,4,5,5));
		
		//Add four labels to panel2
		panel2.add(jlb1);
		panel2.add(jlb2);
		panel2.add(jlb3);
		panel2.add(jlb4);

		this.add(panel2, BorderLayout.CENTER); // Add cards to center
		this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame 
		
		//Register listener
		jbtRefresh.addActionListener(new RefreshListener());
	}
    
	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new testfourcard();//Create a trame
		frame.setTitle("test"); //Set the frame title
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close upon exit
		frame.setSize(400, 200);//Set the frame size
		frame.setVisible(true);//Display the frame
	}
   
	class RefreshListener implements ActionListener { // Inner class
		@Override
		public void actionPerformed(ActionEvent e) {
			//Invoke methods to shuffle the deck
			shuffle();
			
			//Set the 4 cards icons to the 4 labels
			jlb1.setIcon(card1);
			jlb2.setIcon(card2);
			jlb3.setIcon(card3);
			jlb4.setIcon(card4);
		}
	}
    
	public void initialize() {
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = (i+1);
	}
		
	public void shuffle() {
    
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index]; 
			deck[index] = temp;
		}

		//Assign the card ImageIcon
		card1 = new ImageIcon("card/"+deck[0]+".png");
		card2 = new ImageIcon("card/"+deck[1]+".png");
		card3 = new ImageIcon("card/"+deck[2]+".png");
		card4 = new ImageIcon("card/"+deck[3]+".png");
	}
}


