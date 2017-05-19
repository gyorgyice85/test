

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JLabel lblHtml;
	private JLabel text;
	
	
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
		myEastGridPanel.add(new Button("Cool, Duplo"));
		myEastGridPanel.add(new Button("Singen und Klatschen"));
		myEastGridPanel.add(new Button("Billige Kopie"));
		myEastGridPanel.add(new Button("Cool, Lego!"));
		myEastGridPanel.add(new Button("Wannabe-Tesla"));
		myEastGridPanel.add(new Button("Ein wahre Ingenieurwissenschaft"));
		myEastGridPanel.setForeground(Color.green);
		myEastGridPanel.setBackground(Color.gray);
		myEastGridPanel.setLayout(new GridLayout(4,2));
		
	}

	private void initializeWestGridLayout(){
		myWestGridPanel = new JPanel();
		pibButton = new JButton("Praktische Informatik");
		pibButton.setForeground(Color.green);
		pibButton.setBackground(Color.gray);
		pibButton.addActionListener(this);
		myWestGridPanel.add(pibButton);
		kiButton = new JButton("Kommunikationsinformatik");
		kiButton.setForeground(Color.green);
		kiButton.setBackground(Color.gray);
		kiButton.addActionListener(this);
		myWestGridPanel.add(kiButton);
		myWestGridPanel.add(new Button("Kommunikationsinformatik"));
		myWestGridPanel.add(new Button("Bauingenieurwesen"));
		myWestGridPanel.add(new Button("Architektur"));
		myWestGridPanel.add(new Button("Sozialwesen"));
		myWestGridPanel.add(new Button("Elektrotechnik"));
		myWestGridPanel.setForeground(Color.green);
		myWestGridPanel.setBackground(Color.gray);
		myWestGridPanel.setLayout(new GridLayout(4, 2));
		
	}
	public static void main (String[] args){
		new AllTogether();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == pibButton){
				pibButton.setForeground(Color.red);
				
			}
			if(e.getSource() == kiButton){
				kiButton.setForeground(Color.red);
				//kiButton.setEnabled(false); 
			}
		
	}
	
	private class CloseListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	
}