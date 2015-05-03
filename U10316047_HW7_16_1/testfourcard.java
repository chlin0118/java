import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class testfourcard extends JFrame {
	private JButton jbtRefresh = new JButton("FuckingRefresh");
	private CardPanel card =  new CardPanel();
    
	private JLabel jlb1;
	private JLabel jlb2;
	private JLabel jlb3;
	private JLabel jlb4;
	
	public testfourcard() {
		JPanel panel = new JPanel(); // Use the panel to group buttons
		panel.add(jbtRefresh);
	
		JPanel panel2 = new JPanel();
		//ImageIcon icon = new ImageIcon();
	
		jlb1.add(new JLabel(card.usIcon));
		jlb2.add(new JLabel(card.myIcon));
		jlb3.add(new JLabel(card.frIcon));
		jlb4.add(new JLabel(card.ukIcon));
		//panel2.setLayout(new GridLayout(1, 4,5,5));
		panel2.add(jlb1);
		panel2.add(jlb2);
		panel2.add(jlb3);
		panel2.add(jlb4);
	
		/*
		panel2.add(new JLabel(card.usIcon));
    	panel2.add(new JLabel(card.myIcon));
    	panel2.add(new JLabel(card.frIcon));
    	panel2.add(new JLabel(card.ukIcon));
		 */
		this.add(panel2, BorderLayout.CENTER); // Add canvas to center
		this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame 
     
		jbtRefresh.addActionListener(new RefreshListener());
	}
    
  /** Main method */
	public static void main(String[] args) {
		JFrame frame = new testfourcard();
		frame.setTitle("test");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
   
	class RefreshListener implements ActionListener { // Inner class
		@Override
		public void actionPerformed(ActionEvent e) {
			card.shuffle();
	   
		}
	}
    
	
	class CardPanel extends JPanel { // Inner class
	
		ImageIcon usIcon;
		ImageIcon myIcon;
		ImageIcon frIcon;
		ImageIcon ukIcon;
		int[] deck = new int[52];
        
		public CardPanel(){
			initialize();
			shuffle();
		/*
		setLayout(new GridLayout(1, 4,5,5));
		add(new JLabel(usIcon));
		add(new JLabel(myIcon));
		add(new JLabel(frIcon));
		add(new JLabel(ukIcon));
		*/
		}
		public void initialize() {
			// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
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
	
			usIcon = new ImageIcon("card/"+deck[0]+".png");
			myIcon = new ImageIcon("card/"+deck[1]+".png");
			frIcon = new ImageIcon("card/"+deck[2]+".png");
			ukIcon = new ImageIcon("card/"+deck[3]+".png");
		}
	}
}

