

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AllTogether extends JFrame implements ActionListener {
	private JFrame theFrame;
	private JPanel myEastGridPanel;
	private JPanel myWestGridPanel;
	private JButton mySouthButton;
	private JButton pibButton;
	private JButton kiButton;
	private JButton bgwButton;
	private JButton archButton;
	private JButton soziButton;
	private JButton elekButton;
	private JButton duploButton;
	private JButton siklaButton;
	private JButton bikoButton;
	private JButton coleButton;
	private JButton wateButton;
	private JButton trueButton;
	private JLabel lblHtml;
	private JLabel text;
	private int i = 0;	
	
	
	Border headerBorder = LineBorder.createBlackLineBorder();
	Border innerBorder = LineBorder.createGrayLineBorder();
	
	public AllTogether(){
		initializeEastGridLayout();
		initializeWestGridLayout();
		initializeSouthFlowLayout();
		
		theFrame = new JFrame();
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.getContentPane().add(BorderLayout.EAST, myEastGridPanel);
		theFrame.getContentPane().add(BorderLayout.WEST, myWestGridPanel);
		theFrame.getContentPane().add(BorderLayout.SOUTH,mySouthButton);
		theFrame.getContentPane().add(BorderLayout.NORTH, initializeNorthFlowLayout());
		theFrame.getContentPane().add(BorderLayout.CENTER, initializeCenterFlowLayout());
		theFrame.setVisible(true);
		theFrame.setSize(800, 800);
		theFrame.pack();
		
	}
	
	
	private JLabel initializeCenterFlowLayout() {
		text = new JLabel("<html>Klicke die Buttons der linken Seite,<br>"
							+ "um zu erfahren, was wirklich hinter den<br>"
							+ "Studienfaechern steckt!</html>");
		text.setForeground(Color.black);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setVerticalAlignment(JLabel.CENTER);
		text.setBorder(innerBorder);
		return text;
	}


	private JLabel initializeNorthFlowLayout() {
		lblHtml = new JLabel("Studiengangs-Mapping");
		lblHtml.setHorizontalAlignment(JLabel.CENTER);
		lblHtml.setVerticalAlignment(JLabel.CENTER);
		lblHtml.setFont(new Font("Serif", Font.BOLD, 18));
		return lblHtml;
		
	}


	private void initializeSouthFlowLayout() {
		mySouthButton = new JButton("Beenden");	
		mySouthButton.addActionListener(new CloseListener());
		mySouthButton.setLayout(new FlowLayout());
		
	}


	private void initializeEastGridLayout() {
		myEastGridPanel = new JPanel();
		duploButton = new JButton("Cool, Duplo");
		myEastGridPanel.add(duploButton);
		siklaButton = new JButton("Singen und Klatschen");
		myEastGridPanel.add(siklaButton);
		bikoButton = new JButton("Billige Kopie");
		myEastGridPanel.add(bikoButton);
		coleButton = new JButton("Cool, Lego");
		myEastGridPanel.add(coleButton);
		wateButton = new JButton ("Wannbe-Tesla");
		myEastGridPanel.add(wateButton);
		trueButton = new JButton("Eine wahre Ingenieurwissenschaft");
		myEastGridPanel.add(trueButton);
		myEastGridPanel.setLayout(new GridLayout(3,2));
		
	}

	private void initializeWestGridLayout(){
		myWestGridPanel = new JPanel();
		pibButton = new JButton("Praktische Informatik");
		pibButton.addActionListener(this);
		myWestGridPanel.add(pibButton);
		
		kiButton = new JButton("Kommunikationsinformatik");
		kiButton.addActionListener(this);
		myWestGridPanel.add(kiButton);
		
		bgwButton = new JButton("Bauingenieurwesen");
		bgwButton.addActionListener(this);
		myWestGridPanel.add(bgwButton);
		
		archButton = new JButton("Architektur");
		archButton.addActionListener(this);
		myWestGridPanel.add(archButton);
		
		soziButton = new JButton("Sozialwesen");
		soziButton.addActionListener(this);
		myWestGridPanel.add(soziButton);
		
		elekButton = new JButton ("Elektrotechnik");
		elekButton.addActionListener(this);
		myWestGridPanel.add(elekButton);
		
		myWestGridPanel.setLayout(new GridLayout(4, 2));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(i == 5){
				JFrame jframe = new JFrame();
				jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jframe.pack();
				jframe.setVisible(true);
				JOptionPane.showMessageDialog(jframe, "Bei dem Streit um die Wahrheit bleibt der Streit die einzige Wahrheit.");
			}
			
			if(e.getSource() == pibButton){
				pibButton.setForeground(Color.red);
				trueButton.setForeground(Color.red);
				i++;
			}
			if(e.getSource() == kiButton){
				kiButton.setForeground(Color.blue);
				bikoButton.setForeground(Color.blue);
				i++;
			}
			if(e.getSource() == archButton){
				archButton.setForeground(Color.green);
				duploButton.setForeground(Color.green);
				i++;
			}
			if(e.getSource() == soziButton){
				soziButton.setForeground(Color.magenta);
				siklaButton.setForeground(Color.magenta);
				i++;
			}
			if(e.getSource() == elekButton){
				elekButton.setForeground(Color.orange);
				wateButton.setForeground(Color.orange);
				i++;
			}
			if(e.getSource() == bgwButton){
				bgwButton.setForeground(Color.yellow);
				coleButton.setForeground(Color.yellow);
				i++;
			}
	}
	
	private class CloseListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	public static void main (String[] args){
		new AllTogether();
	}

	
	
}