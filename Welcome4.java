package connect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/*
 * * * * * * * Team Project - CS1410 * * * * * * * 
 * * 											 *
 * 					Spring 2019 			     * 
 * 												 *
 * 					David Mendez 				 *
 * 				                				 *
 * * * * * * * * * * * * * * * * * * * * * * * * *
 */

public class Welcome4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private String player1 = "";
	private String player2 = "";
	private colorWheel trig;

	Object textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome4 frame = new Welcome4();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Welcome4() {
		
		setTitle("Loser Buys GET IT! GOT IT!! GOOD!!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel welcomelabel = new JLabel("Welcome to Connect 4");
		welcomelabel.setOpaque(true);
		welcomelabel.setBackground(new Color(255, 192, 203));
		welcomelabel.setBorder(new EmptyBorder(13, 13, 13, 13));
		welcomelabel.setFont(new Font("Herculanum", Font.BOLD, 35));
		welcomelabel.setForeground(new Color(0, 0, 139));
		welcomelabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(welcomelabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		panel.setForeground(new Color(128, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel spacer1 = new JLabel("");
		spacer1.setOpaque(true);
		spacer1.setBackground(new Color(255, 192, 203));
		panel.add(spacer1);

		JLabel spacer2 = new JLabel("");
		spacer2.setBackground(new Color(255, 192, 203));
		spacer2.setOpaque(true);
		panel.add(spacer2);

		JLabel spacer3 = new JLabel("");
		spacer3.setBackground(new Color(255, 192, 203));
		spacer3.setOpaque(true);
		panel.add(spacer3);

		JLabel pl1 = new JLabel("Player 1:");
		pl1.setForeground(new Color(128, 0, 0));
		pl1.setBackground(new Color(255, 192, 203));
		pl1.setOpaque(true);
		pl1.setFont(new Font("Herculanum", Font.BOLD, 25));
		pl1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pl1);

		textField1 = new JTextField();
		textField1.setBackground(new Color(230, 230, 250));
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setForeground(new Color(128, 0, 0));
		textField1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField1.setFont(new Font("Herculanum", Font.BOLD, 25));
		panel.add(textField1);
		textField1.setColumns(10);

		JLabel spacer6 = new JLabel("");
		spacer6.setBackground(new Color(255, 192, 203));
		spacer6.setOpaque(true);
		panel.add(spacer6);

		JLabel spacey = new JLabel("");
		spacey.setOpaque(true);
		spacey.setBackground(new Color(255, 192, 203));
		panel.add(spacey);

		JLabel spacey2 = new JLabel("");
		spacey2.setOpaque(true);
		spacey2.setBackground(new Color(255, 192, 203));
		panel.add(spacey2);

		JLabel spacey3 = new JLabel("");
		spacey3.setBackground(new Color(255, 192, 203));
		spacey3.setOpaque(true);
		panel.add(spacey3);

		JLabel pl2 = new JLabel("Player 2:");
		pl2.setForeground(new Color(0, 0, 139));
		pl2.setBackground(new Color(255, 192, 203));
		pl2.setOpaque(true);
		pl2.setFont(new Font("Herculanum", Font.BOLD, 25));
		pl2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pl2);

		textField2 = new JTextField("");
		textField2.setBackground(new Color(230, 230, 250));
		textField2.setForeground(new Color(0, 0, 139));
		textField2.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField2.setFont(new Font("Herculanum", Font.BOLD, 25));
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField2);

		JLabel spacer7 = new JLabel("");
		spacer7.setBackground(new Color(255, 192, 203));
		spacer7.setOpaque(true);
		panel.add(spacer7);

		JLabel spacer4 = new JLabel("");
		spacer4.setBackground(new Color(255, 192, 203));
		spacer4.setOpaque(true);
		spacer4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(spacer4);

		JLabel spacer5 = new JLabel("");
		spacer5.setBackground(new Color(255, 192, 203));
		spacer5.setOpaque(true);
		panel.add(spacer5);

		JLabel spacer8 = new JLabel("");
		spacer8.setBackground(new Color(255, 192, 203));
		spacer8.setOpaque(true);
		panel.add(spacer8);

		JLabel spaceX = new JLabel("");
		spaceX.setBackground(new Color(255, 192, 203));
		spaceX.setOpaque(true);
		panel.add(spaceX);

		JButton playC4 = new JButton("Play Connect 4");
		playC4.setOpaque(true);
		playC4.setBackground(new Color(128, 0, 0));
		playC4.setForeground(new Color(0, 0, 139));
		playC4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		playC4.setFont(new Font("Herculanum", Font.BOLD, 25));
		panel.add(playC4);

		JLabel spacer10 = new JLabel("");
		spacer10.setBackground(new Color(255, 192, 203));
		spacer10.setOpaque(true);
		panel.add(spacer10);

		JLabel spacer11 = new JLabel("");
		spacer11.setBackground(new Color(255, 192, 203));
		spacer11.setOpaque(true);
		panel.add(spacer11);

		JLabel spacer12 = new JLabel("");
		spacer12.setBackground(new Color(255, 192, 203));
		spacer12.setOpaque(true);
		panel.add(spacer12);

		JLabel spacer13 = new JLabel("");
		spacer13.setBackground(new Color(255, 192, 203));
		spacer13.setOpaque(true);
		panel.add(spacer13);

		textField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random Gucci = new Random();
				try {
					if (player1 != null && player2 != null) {

						trig = new colorWheel(player1);
						int trippie = Gucci.nextInt(9);
						switch (trippie) {

						case 0:
							
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.blue);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.RED);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.CYAN);
							welcomelabel.setForeground(Color.MAGENTA);
							pl1.setForeground(Color.red);
							pl2.setForeground(Color.blue);
							spacer1.setBackground(Color.CYAN);
							spacer2.setBackground(Color.CYAN);
							spacer3.setBackground(Color.CYAN);
							spacer4.setBackground(Color.CYAN);
							spacer5.setBackground(Color.CYAN);
							spacer6.setBackground(Color.CYAN);
							spacer7.setBackground(Color.CYAN);
							spacer8.setBackground(Color.CYAN);
							spacer10.setBackground(Color.CYAN);
							spacer11.setBackground(Color.CYAN);
							spacer12.setBackground(Color.CYAN);
							spacer13.setBackground(Color.CYAN);
							pl1.setBackground(Color.CYAN);
							pl2.setBackground(Color.CYAN);
							spacey.setBackground(Color.CYAN);
							spacey2.setBackground(Color.CYAN);
							spacey3.setBackground(Color.CYAN);
							spaceX.setBackground(Color.CYAN);
							panel.setBackground(Color.CYAN);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;

						case 1:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.blue);
							textField2.setForeground(Color.BLUE);
							textField1.setBackground(Color.RED);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.GREEN);
							welcomelabel.setForeground(Color.magenta);
							pl1.setForeground(Color.red);
							pl2.setForeground(Color.blue);
							spacer1.setBackground(Color.GREEN);
							spacer2.setBackground(Color.GREEN);
							spacer3.setBackground(Color.GREEN);
							spacer4.setBackground(Color.GREEN);
							spacer5.setBackground(Color.GREEN);
							spacer6.setBackground(Color.GREEN);
							spacer7.setBackground(Color.GREEN);
							spacer8.setBackground(Color.GREEN);
							spacer10.setBackground(Color.GREEN);
							spacer11.setBackground(Color.GREEN);
							spacer12.setBackground(Color.GREEN);
							spacer13.setBackground(Color.GREEN);
							pl1.setBackground(Color.GREEN);
							pl2.setBackground(Color.GREEN);
							spacey.setBackground(Color.GREEN);
							spacey2.setBackground(Color.GREEN);
							spacey3.setBackground(Color.GREEN);
							spaceX.setBackground(Color.GREEN);
							panel.setBackground(Color.GREEN);
							playC4.setBackground(Color.pink);
							playC4.setForeground(Color.magenta);
							break;

						case 2:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.blue);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.RED);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.ORANGE);
							welcomelabel.setForeground(Color.black);
							pl1.setForeground(Color.red);
							pl2.setForeground(Color.blue);
							spacer1.setBackground(Color.ORANGE);
							spacer2.setBackground(Color.ORANGE);
							spacer3.setBackground(Color.ORANGE);
							spacer4.setBackground(Color.ORANGE);
							spacer5.setBackground(Color.ORANGE);
							spacer6.setBackground(Color.ORANGE);
							spacer7.setBackground(Color.ORANGE);
							spacer8.setBackground(Color.ORANGE);
							spacer10.setBackground(Color.ORANGE);
							spacer11.setBackground(Color.ORANGE);
							spacer12.setBackground(Color.ORANGE);
							spacer13.setBackground(Color.ORANGE);
							pl1.setBackground(Color.ORANGE);
							pl2.setBackground(Color.ORANGE);
							spacey.setBackground(Color.ORANGE);
							spacey2.setBackground(Color.ORANGE);
							spacey3.setBackground(Color.ORANGE);
							spaceX.setBackground(Color.ORANGE);
							panel.setBackground(Color.ORANGE);
							playC4.setBackground(Color.black);
							playC4.setForeground(Color.ORANGE);
							break;

						case 3:
							textField1.setForeground(Color.red);
							textField2.setBackground(trig.getColor(1));
							textField2.setForeground(Color.blue);
							textField1.setBackground(trig.getColor(1));
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(trig.getColor(1));
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(trig.getColor(1));
							spacer2.setBackground(trig.getColor(1));
							spacer3.setBackground(trig.getColor(1));
							spacer4.setBackground(trig.getColor(1));
							spacer5.setBackground(trig.getColor(1));
							spacer6.setBackground(trig.getColor(1));
							spacer7.setBackground(trig.getColor(1));
							spacer8.setBackground(trig.getColor(1));
							spacer10.setBackground(trig.getColor(1));
							spacer11.setBackground(trig.getColor(1));
							spacer12.setBackground(trig.getColor(1));
							spacer13.setBackground(trig.getColor(1));
							pl1.setBackground(trig.getColor(1));
							pl2.setBackground(trig.getColor(1));
							spacey.setBackground(trig.getColor(1));
							spacey2.setBackground(trig.getColor(1));
							spacey3.setBackground(trig.getColor(1));
							spaceX.setBackground(trig.getColor(1));
							panel.setBackground(trig.getColor(1));
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;

						case 4:
							textField1.setForeground(Color.red);
							textField2.setBackground(trig.getColor(2));
							textField2.setForeground(Color.blue);
							textField1.setBackground(trig.getColor(2));
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(trig.getColor(2));
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(trig.getColor(2));
							spacer2.setBackground(trig.getColor(2));
							spacer3.setBackground(trig.getColor(2));
							spacer4.setBackground(trig.getColor(2));
							spacer5.setBackground(trig.getColor(2));
							spacer6.setBackground(trig.getColor(2));
							spacer7.setBackground(trig.getColor(2));
							spacer8.setBackground(trig.getColor(2));
							spacer10.setBackground(trig.getColor(2));
							spacer11.setBackground(trig.getColor(2));
							spacer12.setBackground(trig.getColor(2));
							spacer13.setBackground(trig.getColor(2));
							pl1.setBackground(trig.getColor(2));
							pl2.setBackground(trig.getColor(2));
							spacey.setBackground(trig.getColor(2));
							spacey2.setBackground(trig.getColor(2));
							spacey3.setBackground(trig.getColor(2));
							spaceX.setBackground(trig.getColor(2));
							panel.setBackground(trig.getColor(2));
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 5:
							textField1.setForeground(Color.red);
							textField2.setBackground(trig.getColor(2));
							textField2.setForeground(Color.yellow);
							textField1.setBackground(trig.getColor(2));
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.BLUE);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.YELLOW);
							spacer1.setBackground(Color.BLUE);
							spacer2.setBackground(Color.BLUE);
							spacer3.setBackground(Color.BLUE);
							spacer4.setBackground(Color.BLUE);
							spacer5.setBackground(Color.BLUE);
							spacer6.setBackground(Color.BLUE);
							spacer7.setBackground(Color.BLUE);
							spacer8.setBackground(Color.BLUE);
							spacer10.setBackground(Color.BLUE);
							spacer11.setBackground(Color.BLUE);
							spacer12.setBackground(Color.BLUE);
							spacer13.setBackground(Color.BLUE);
							pl1.setBackground(Color.BLUE);
							pl2.setBackground(Color.blue);
							spacey.setBackground(Color.BLUE);
							spacey2.setBackground(Color.BLUE);
							spacey3.setBackground(Color.BLUE);
							spaceX.setBackground(Color.BLUE);
							panel.setBackground(Color.BLUE);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 6:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.BLACK);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.BLUE);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.BLACK);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(Color.BLACK);
							spacer2.setBackground(Color.BLACK);
							spacer3.setBackground(Color.BLACK);
							spacer4.setBackground(Color.BLACK);
							spacer5.setBackground(Color.BLACK);
							spacer6.setBackground(Color.BLACK);
							spacer7.setBackground(Color.BLACK);
							spacer8.setBackground(Color.BLACK);
							spacer10.setBackground(Color.BLACK);
							spacer11.setBackground(Color.BLACK);
							spacer12.setBackground(Color.BLACK);
							spacer13.setBackground(Color.BLACK);
							pl1.setBackground(Color.BLACK);
							pl2.setBackground(Color.BLACK);
							spacey.setBackground(Color.BLACK);
							spacey2.setBackground(Color.BLACK);
							spacey3.setBackground(Color.BLACK);
							spaceX.setBackground(Color.BLACK);
							panel.setBackground(Color.BLACK);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 7:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.darkGray);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.BLUE);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.darkGray);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(Color.darkGray);
							spacer2.setBackground(Color.darkGray);
							spacer3.setBackground(Color.darkGray);
							spacer4.setBackground(Color.darkGray);
							spacer5.setBackground(Color.darkGray);
							spacer6.setBackground(Color.darkGray);
							spacer7.setBackground(Color.darkGray);
							spacer8.setBackground(Color.darkGray);
							spacer10.setBackground(Color.darkGray);
							spacer11.setBackground(Color.darkGray);
							spacer12.setBackground(Color.darkGray);
							spacer13.setBackground(Color.darkGray);
							pl1.setBackground(Color.darkGray);
							pl2.setBackground(Color.darkGray);
							spacey.setBackground(Color.darkGray);
							spacey2.setBackground(Color.darkGray);
							spacey3.setBackground(Color.darkGray);
							spaceX.setBackground(Color.darkGray);
							panel.setBackground(Color.darkGray);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 8:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.WHITE);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.BLUE);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.WHITE);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(Color.WHITE);
							spacer2.setBackground(Color.WHITE);
							spacer3.setBackground(Color.WHITE);
							spacer4.setBackground(Color.WHITE);
							spacer5.setBackground(Color.WHITE);
							spacer6.setBackground(Color.WHITE);
							spacer7.setBackground(Color.WHITE);
							spacer8.setBackground(Color.WHITE);
							spacer10.setBackground(Color.WHITE);
							spacer11.setBackground(Color.WHITE);
							spacer12.setBackground(Color.WHITE);
							spacer13.setBackground(Color.WHITE);
							pl1.setBackground(Color.WHITE);
							pl2.setBackground(Color.WHITE);
							spacey.setBackground(Color.WHITE);
							spacey2.setBackground(Color.WHITE);
							spacey3.setBackground(Color.WHITE);
							spaceX.setBackground(Color.WHITE);
							panel.setBackground(Color.WHITE);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						}
					} else if (player2 != null && player1 != null) {
						int trippie = Gucci.nextInt(9);
						switch (trippie) {

						case 0:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.blue);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.RED);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.CYAN);
							welcomelabel.setForeground(Color.MAGENTA);
							pl1.setForeground(Color.red);
							pl2.setForeground(Color.blue);
							spacer1.setBackground(Color.CYAN);
							spacer2.setBackground(Color.CYAN);
							spacer3.setBackground(Color.CYAN);
							spacer4.setBackground(Color.CYAN);
							spacer5.setBackground(Color.CYAN);
							spacer6.setBackground(Color.CYAN);
							spacer7.setBackground(Color.CYAN);
							spacer8.setBackground(Color.CYAN);
							spacer10.setBackground(Color.CYAN);
							spacer11.setBackground(Color.CYAN);
							spacer12.setBackground(Color.CYAN);
							spacer13.setBackground(Color.CYAN);
							pl1.setBackground(Color.CYAN);
							pl2.setBackground(Color.CYAN);
							spacey.setBackground(Color.CYAN);
							spacey2.setBackground(Color.CYAN);
							spacey3.setBackground(Color.CYAN);
							spaceX.setBackground(Color.CYAN);
							panel.setBackground(Color.CYAN);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;

						case 1:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.blue);
							textField2.setForeground(Color.BLUE);
							textField1.setBackground(Color.RED);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.GREEN);
							welcomelabel.setForeground(Color.magenta);
							pl1.setForeground(Color.red);
							pl2.setForeground(Color.blue);
							spacer1.setBackground(Color.GREEN);
							spacer2.setBackground(Color.GREEN);
							spacer3.setBackground(Color.GREEN);
							spacer4.setBackground(Color.GREEN);
							spacer5.setBackground(Color.GREEN);
							spacer6.setBackground(Color.GREEN);
							spacer7.setBackground(Color.GREEN);
							spacer8.setBackground(Color.GREEN);
							spacer10.setBackground(Color.GREEN);
							spacer11.setBackground(Color.GREEN);
							spacer12.setBackground(Color.GREEN);
							spacer13.setBackground(Color.GREEN);
							pl1.setBackground(Color.GREEN);
							pl2.setBackground(Color.GREEN);
							spacey.setBackground(Color.GREEN);
							spacey2.setBackground(Color.GREEN);
							spacey3.setBackground(Color.GREEN);
							spaceX.setBackground(Color.GREEN);
							panel.setBackground(Color.GREEN);
							playC4.setBackground(Color.pink);
							playC4.setForeground(Color.magenta);
							break;

						case 2:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.blue);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.RED);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.ORANGE);
							welcomelabel.setForeground(Color.black);
							pl1.setForeground(Color.red);
							pl2.setForeground(Color.blue);
							spacer1.setBackground(Color.ORANGE);
							spacer2.setBackground(Color.ORANGE);
							spacer3.setBackground(Color.ORANGE);
							spacer4.setBackground(Color.ORANGE);
							spacer5.setBackground(Color.ORANGE);
							spacer6.setBackground(Color.ORANGE);
							spacer7.setBackground(Color.ORANGE);
							spacer8.setBackground(Color.ORANGE);
							spacer10.setBackground(Color.ORANGE);
							spacer11.setBackground(Color.ORANGE);
							spacer12.setBackground(Color.ORANGE);
							spacer13.setBackground(Color.ORANGE);
							pl1.setBackground(Color.ORANGE);
							pl2.setBackground(Color.ORANGE);
							spacey.setBackground(Color.ORANGE);
							spacey2.setBackground(Color.ORANGE);
							spacey3.setBackground(Color.ORANGE);
							spaceX.setBackground(Color.ORANGE);
							panel.setBackground(Color.ORANGE);
							playC4.setBackground(Color.black);
							playC4.setForeground(Color.ORANGE);
							break;

						case 3:
							textField1.setForeground(Color.red);
							textField2.setBackground(trig.getColor(1));
							textField2.setForeground(Color.blue);
							textField1.setBackground(trig.getColor(1));
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(trig.getColor(1));
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(trig.getColor(1));
							spacer2.setBackground(trig.getColor(1));
							spacer3.setBackground(trig.getColor(1));
							spacer4.setBackground(trig.getColor(1));
							spacer5.setBackground(trig.getColor(1));
							spacer6.setBackground(trig.getColor(1));
							spacer7.setBackground(trig.getColor(1));
							spacer8.setBackground(trig.getColor(1));
							spacer10.setBackground(trig.getColor(1));
							spacer11.setBackground(trig.getColor(1));
							spacer12.setBackground(trig.getColor(1));
							spacer13.setBackground(trig.getColor(1));
							pl1.setBackground(trig.getColor(1));
							pl2.setBackground(trig.getColor(1));
							spacey.setBackground(trig.getColor(1));
							spacey2.setBackground(trig.getColor(1));
							spacey3.setBackground(trig.getColor(1));
							spaceX.setBackground(trig.getColor(1));
							panel.setBackground(trig.getColor(1));
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;

						case 4:
							textField1.setForeground(Color.red);
							textField2.setBackground(trig.getColor(2));
							textField2.setForeground(Color.blue);
							textField1.setBackground(trig.getColor(2));
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(trig.getColor(2));
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(trig.getColor(2));
							spacer2.setBackground(trig.getColor(2));
							spacer3.setBackground(trig.getColor(2));
							spacer4.setBackground(trig.getColor(2));
							spacer5.setBackground(trig.getColor(2));
							spacer6.setBackground(trig.getColor(2));
							spacer7.setBackground(trig.getColor(2));
							spacer8.setBackground(trig.getColor(2));
							spacer10.setBackground(trig.getColor(2));
							spacer11.setBackground(trig.getColor(2));
							spacer12.setBackground(trig.getColor(2));
							spacer13.setBackground(trig.getColor(2));
							pl1.setBackground(trig.getColor(2));
							pl2.setBackground(trig.getColor(2));
							spacey.setBackground(trig.getColor(2));
							spacey2.setBackground(trig.getColor(2));
							spacey3.setBackground(trig.getColor(2));
							spaceX.setBackground(trig.getColor(2));
							panel.setBackground(trig.getColor(2));
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 5:
							textField1.setForeground(Color.red);
							textField2.setBackground(trig.getColor(2));
							textField2.setForeground(Color.ORANGE);
							textField1.setBackground(trig.getColor(2));
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.BLUE);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.ORANGE);
							spacer1.setBackground(Color.BLUE);
							spacer2.setBackground(Color.BLUE);
							spacer3.setBackground(Color.BLUE);
							spacer4.setBackground(Color.BLUE);
							spacer5.setBackground(Color.BLUE);
							spacer6.setBackground(Color.BLUE);
							spacer7.setBackground(Color.BLUE);
							spacer8.setBackground(Color.BLUE);
							spacer10.setBackground(Color.BLUE);
							spacer11.setBackground(Color.BLUE);
							spacer12.setBackground(Color.BLUE);
							spacer13.setBackground(Color.BLUE);
							pl1.setBackground(Color.BLUE);
							pl2.setBackground(Color.ORANGE);
							spacey.setBackground(Color.BLUE);
							spacey2.setBackground(Color.BLUE);
							spacey3.setBackground(Color.BLUE);
							spaceX.setBackground(Color.BLUE);
							panel.setBackground(Color.BLUE);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 6:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.BLACK);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.BLUE);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.BLACK);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(Color.BLACK);
							spacer2.setBackground(Color.BLACK);
							spacer3.setBackground(Color.BLACK);
							spacer4.setBackground(Color.BLACK);
							spacer5.setBackground(Color.BLACK);
							spacer6.setBackground(Color.BLACK);
							spacer7.setBackground(Color.BLACK);
							spacer8.setBackground(Color.BLACK);
							spacer10.setBackground(Color.BLACK);
							spacer11.setBackground(Color.BLACK);
							spacer12.setBackground(Color.BLACK);
							spacer13.setBackground(Color.BLACK);
							pl1.setBackground(Color.BLACK);
							pl2.setBackground(Color.BLACK);
							spacey.setBackground(Color.BLACK);
							spacey2.setBackground(Color.BLACK);
							spacey3.setBackground(Color.BLACK);
							spaceX.setBackground(Color.BLACK);
							panel.setBackground(Color.BLACK);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						case 7:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.darkGray);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.BLUE);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.darkGray);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(Color.darkGray);
							spacer2.setBackground(Color.darkGray);
							spacer3.setBackground(Color.darkGray);
							spacer4.setBackground(Color.darkGray);
							spacer5.setBackground(Color.darkGray);
							spacer6.setBackground(Color.darkGray);
							spacer7.setBackground(Color.darkGray);
							spacer8.setBackground(Color.darkGray);
							spacer10.setBackground(Color.darkGray);
							spacer11.setBackground(Color.darkGray);
							spacer12.setBackground(Color.darkGray);
							spacer13.setBackground(Color.darkGray);
							pl1.setBackground(Color.darkGray);
							pl2.setBackground(Color.darkGray);
							spacey.setBackground(Color.darkGray);
							spacey2.setBackground(Color.darkGray);
							spacey3.setBackground(Color.darkGray);
							spaceX.setBackground(Color.darkGray);
							panel.setBackground(Color.darkGray);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;

						case 8:
							textField1.setForeground(Color.red);
							textField2.setBackground(Color.WHITE);
							textField2.setForeground(Color.blue);
							textField1.setBackground(Color.BLUE);
							textField1.setBackground(Color.LIGHT_GRAY);
							textField2.setBackground(Color.LIGHT_GRAY);
							welcomelabel.setBackground(Color.WHITE);
							welcomelabel.setForeground(Color.orange);
							pl1.setForeground(Color.RED);
							pl2.setForeground(Color.BLUE);
							spacer1.setBackground(Color.WHITE);
							spacer2.setBackground(Color.WHITE);
							spacer3.setBackground(Color.WHITE);
							spacer4.setBackground(Color.WHITE);
							spacer5.setBackground(Color.WHITE);
							spacer6.setBackground(Color.WHITE);
							spacer7.setBackground(Color.WHITE);
							spacer8.setBackground(Color.WHITE);
							spacer10.setBackground(Color.WHITE);
							spacer11.setBackground(Color.WHITE);
							spacer12.setBackground(Color.WHITE);
							spacer13.setBackground(Color.WHITE);
							pl1.setBackground(Color.WHITE);
							pl2.setBackground(Color.WHITE);
							spacey.setBackground(Color.WHITE);
							spacey2.setBackground(Color.WHITE);
							spacey3.setBackground(Color.WHITE);
							spaceX.setBackground(Color.WHITE);
							panel.setBackground(Color.WHITE);
							playC4.setBackground(Color.ORANGE);
							playC4.setForeground(Color.RED);
							break;
						}
						trig = new colorWheel(new File(player1), player2);

					} else {

						textField1.setText("enter Name");
						textField2.setText("enter Name");

					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
					textField1.setText("enter Name");
				}

			}
		});
		playC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player1 = textField1.getText();
				player2 = textField2.getText();

				GameBoard pho = new GameBoard(player1, player2);
				pho.setLocationRelativeTo(null);
				pho.setVisible(true);
				setVisible(false);
			}
		});

		textField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random Fendi = new Random();
				if (player2 != null) {
					int trippie = Fendi.nextInt(8);
					switch (trippie) {

					case 0:
						textField1.setForeground(Color.red);
						textField2.setBackground(Color.blue);
						textField2.setForeground(Color.blue);
						textField1.setBackground(Color.RED);
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.CYAN);
						welcomelabel.setForeground(Color.MAGENTA);
						pl1.setForeground(Color.red);
						pl2.setForeground(Color.blue);
						spacer1.setBackground(Color.CYAN);
						spacer2.setBackground(Color.CYAN);
						spacer3.setBackground(Color.CYAN);
						spacer4.setBackground(Color.CYAN);
						spacer5.setBackground(Color.CYAN);
						spacer6.setBackground(Color.CYAN);
						spacer7.setBackground(Color.CYAN);
						spacer8.setBackground(Color.CYAN);
						spacer10.setBackground(Color.CYAN);
						spacer11.setBackground(Color.CYAN);
						spacer12.setBackground(Color.CYAN);
						spacer13.setBackground(Color.CYAN);
						pl1.setBackground(Color.CYAN);
						pl2.setBackground(Color.CYAN);
						spacey.setBackground(Color.CYAN);
						spacey2.setBackground(Color.CYAN);
						spacey3.setBackground(Color.CYAN);
						spaceX.setBackground(Color.CYAN);
						panel.setBackground(Color.CYAN);
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;

					case 1:
						textField1.setForeground(Color.red);
						textField2.setBackground(Color.blue);
						textField2.setForeground(Color.BLUE);
						textField1.setBackground(Color.RED);
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.GREEN);
						welcomelabel.setForeground(Color.magenta);
						pl1.setForeground(Color.red);
						pl2.setForeground(Color.blue);
						spacer1.setBackground(Color.GREEN);
						spacer2.setBackground(Color.GREEN);
						spacer3.setBackground(Color.GREEN);
						spacer4.setBackground(Color.GREEN);
						spacer5.setBackground(Color.GREEN);
						spacer6.setBackground(Color.GREEN);
						spacer7.setBackground(Color.GREEN);
						spacer8.setBackground(Color.GREEN);
						spacer10.setBackground(Color.GREEN);
						spacer11.setBackground(Color.GREEN);
						spacer12.setBackground(Color.GREEN);
						spacer13.setBackground(Color.GREEN);
						pl1.setBackground(Color.GREEN);
						pl2.setBackground(Color.GREEN);
						spacey.setBackground(Color.GREEN);
						spacey2.setBackground(Color.GREEN);
						spacey3.setBackground(Color.GREEN);
						spaceX.setBackground(Color.GREEN);
						panel.setBackground(Color.GREEN);
						playC4.setBackground(Color.pink);
						playC4.setForeground(Color.magenta);
						break;

					case 2:
						textField1.setForeground(Color.red);
						textField2.setBackground(Color.blue);
						textField2.setForeground(Color.blue);
						textField1.setBackground(Color.RED);
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.ORANGE);
						welcomelabel.setForeground(Color.black);
						pl1.setForeground(Color.red);
						pl2.setForeground(Color.blue);
						spacer1.setBackground(Color.ORANGE);
						spacer2.setBackground(Color.ORANGE);
						spacer3.setBackground(Color.ORANGE);
						spacer4.setBackground(Color.ORANGE);
						spacer5.setBackground(Color.ORANGE);
						spacer6.setBackground(Color.ORANGE);
						spacer7.setBackground(Color.ORANGE);
						spacer8.setBackground(Color.ORANGE);
						spacer10.setBackground(Color.ORANGE);
						spacer11.setBackground(Color.ORANGE);
						spacer12.setBackground(Color.ORANGE);
						spacer13.setBackground(Color.ORANGE);
						pl1.setBackground(Color.ORANGE);
						pl2.setBackground(Color.ORANGE);
						spacey.setBackground(Color.ORANGE);
						spacey2.setBackground(Color.ORANGE);
						spacey3.setBackground(Color.ORANGE);
						spaceX.setBackground(Color.ORANGE);
						panel.setBackground(Color.ORANGE);
						playC4.setBackground(Color.black);
						playC4.setForeground(Color.ORANGE);
						break;

					case 3:
						textField1.setForeground(Color.red);
						textField2.setBackground(trig.getColor(1));
						textField2.setForeground(Color.blue);
						textField1.setBackground(trig.getColor(1));
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(trig.getColor(1));
						welcomelabel.setForeground(Color.orange);
						pl1.setForeground(Color.RED);
						pl2.setForeground(Color.BLUE);
						spacer1.setBackground(trig.getColor(1));
						spacer2.setBackground(trig.getColor(1));
						spacer3.setBackground(trig.getColor(1));
						spacer4.setBackground(trig.getColor(1));
						spacer5.setBackground(trig.getColor(1));
						spacer6.setBackground(trig.getColor(1));
						spacer7.setBackground(trig.getColor(1));
						spacer8.setBackground(trig.getColor(1));
						spacer10.setBackground(trig.getColor(1));
						spacer11.setBackground(trig.getColor(1));
						spacer12.setBackground(trig.getColor(1));
						spacer13.setBackground(trig.getColor(1));
						pl1.setBackground(trig.getColor(1));
						pl2.setBackground(trig.getColor(1));
						spacey.setBackground(trig.getColor(1));
						spacey2.setBackground(trig.getColor(1));
						spacey3.setBackground(trig.getColor(1));
						spaceX.setBackground(trig.getColor(1));
						panel.setBackground(trig.getColor(1));
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;

					case 4:
						textField1.setForeground(Color.red);
						textField2.setBackground(trig.getColor(2));
						textField2.setForeground(Color.blue);
						textField1.setBackground(trig.getColor(2));
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(trig.getColor(2));
						welcomelabel.setForeground(Color.orange);
						pl1.setForeground(Color.RED);
						pl2.setForeground(Color.BLUE);
						spacer1.setBackground(trig.getColor(2));
						spacer2.setBackground(trig.getColor(2));
						spacer3.setBackground(trig.getColor(2));
						spacer4.setBackground(trig.getColor(2));
						spacer5.setBackground(trig.getColor(2));
						spacer6.setBackground(trig.getColor(2));
						spacer7.setBackground(trig.getColor(2));
						spacer8.setBackground(trig.getColor(2));
						spacer10.setBackground(trig.getColor(2));
						spacer11.setBackground(trig.getColor(2));
						spacer12.setBackground(trig.getColor(2));
						spacer13.setBackground(trig.getColor(2));
						pl1.setBackground(trig.getColor(2));
						pl2.setBackground(trig.getColor(2));
						spacey.setBackground(trig.getColor(2));
						spacey2.setBackground(trig.getColor(2));
						spacey3.setBackground(trig.getColor(2));
						spaceX.setBackground(trig.getColor(2));
						panel.setBackground(trig.getColor(2));
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;
					case 5:
						textField1.setForeground(Color.red);
						textField2.setBackground(trig.getColor(2));
						textField2.setForeground(Color.yellow);
						textField1.setBackground(trig.getColor(2));
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.BLUE);
						welcomelabel.setForeground(Color.orange);
						pl1.setForeground(Color.RED);
						pl2.setForeground(Color.YELLOW);
						spacer1.setBackground(Color.BLUE);
						spacer2.setBackground(Color.BLUE);
						spacer3.setBackground(Color.BLUE);
						spacer4.setBackground(Color.BLUE);
						spacer5.setBackground(Color.BLUE);
						spacer6.setBackground(Color.BLUE);
						spacer7.setBackground(Color.BLUE);
						spacer8.setBackground(Color.BLUE);
						spacer10.setBackground(Color.BLUE);
						spacer11.setBackground(Color.BLUE);
						spacer12.setBackground(Color.BLUE);
						spacer13.setBackground(Color.BLUE);
						pl1.setBackground(Color.BLUE);
						pl2.setBackground(Color.blue);
						spacey.setBackground(Color.BLUE);
						spacey2.setBackground(Color.BLUE);
						spacey3.setBackground(Color.BLUE);
						spaceX.setBackground(Color.BLUE);
						panel.setBackground(Color.BLUE);
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;
					case 6:
						textField1.setForeground(Color.red);
						textField2.setBackground(Color.BLACK);
						textField2.setForeground(Color.blue);
						textField1.setBackground(Color.BLUE);
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.BLACK);
						welcomelabel.setForeground(Color.orange);
						pl1.setForeground(Color.RED);
						pl2.setForeground(Color.BLUE);
						spacer1.setBackground(Color.BLACK);
						spacer2.setBackground(Color.BLACK);
						spacer3.setBackground(Color.BLACK);
						spacer4.setBackground(Color.BLACK);
						spacer5.setBackground(Color.BLACK);
						spacer6.setBackground(Color.BLACK);
						spacer7.setBackground(Color.BLACK);
						spacer8.setBackground(Color.BLACK);
						spacer10.setBackground(Color.BLACK);
						spacer11.setBackground(Color.BLACK);
						spacer12.setBackground(Color.BLACK);
						spacer13.setBackground(Color.BLACK);
						pl1.setBackground(Color.BLACK);
						pl2.setBackground(Color.BLACK);
						spacey.setBackground(Color.BLACK);
						spacey2.setBackground(Color.BLACK);
						spacey3.setBackground(Color.BLACK);
						spaceX.setBackground(Color.BLACK);
						panel.setBackground(Color.BLACK);
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;

					case 7:
						textField1.setForeground(Color.red);
						textField2.setBackground(Color.darkGray);
						textField2.setForeground(Color.blue);
						textField1.setBackground(Color.BLUE);
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.darkGray);
						welcomelabel.setForeground(Color.orange);
						pl1.setForeground(Color.RED);
						pl2.setForeground(Color.BLUE);
						spacer1.setBackground(Color.darkGray);
						spacer2.setBackground(Color.darkGray);
						spacer3.setBackground(Color.darkGray);
						spacer4.setBackground(Color.darkGray);
						spacer5.setBackground(Color.darkGray);
						spacer6.setBackground(Color.darkGray);
						spacer7.setBackground(Color.darkGray);
						spacer8.setBackground(Color.darkGray);
						spacer10.setBackground(Color.darkGray);
						spacer11.setBackground(Color.darkGray);
						spacer12.setBackground(Color.darkGray);
						spacer13.setBackground(Color.darkGray);
						pl1.setBackground(Color.darkGray);
						pl2.setBackground(Color.darkGray);
						spacey.setBackground(Color.darkGray);
						spacey2.setBackground(Color.darkGray);
						spacey3.setBackground(Color.darkGray);
						spaceX.setBackground(Color.darkGray);
						panel.setBackground(Color.darkGray);
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;
					case 8:
						textField1.setForeground(Color.red);
						textField2.setBackground(Color.WHITE);
						textField2.setForeground(Color.blue);
						textField1.setBackground(Color.BLUE);
						textField1.setBackground(Color.LIGHT_GRAY);
						textField2.setBackground(Color.LIGHT_GRAY);
						welcomelabel.setBackground(Color.WHITE);
						welcomelabel.setForeground(Color.orange);
						pl1.setForeground(Color.RED);
						pl2.setForeground(Color.BLUE);
						spacer1.setBackground(Color.WHITE);
						spacer2.setBackground(Color.WHITE);
						spacer3.setBackground(Color.WHITE);
						spacer4.setBackground(Color.WHITE);
						spacer5.setBackground(Color.WHITE);
						spacer6.setBackground(Color.WHITE);
						spacer7.setBackground(Color.WHITE);
						spacer8.setBackground(Color.WHITE);
						spacer10.setBackground(Color.WHITE);
						spacer11.setBackground(Color.WHITE);
						spacer12.setBackground(Color.WHITE);
						spacer13.setBackground(Color.WHITE);
						pl1.setBackground(Color.WHITE);
						pl2.setBackground(Color.WHITE);
						spacey.setBackground(Color.WHITE);
						spacey2.setBackground(Color.WHITE);
						spacey3.setBackground(Color.WHITE);
						spaceX.setBackground(Color.WHITE);
						panel.setBackground(Color.WHITE);
						playC4.setBackground(Color.ORANGE);
						playC4.setForeground(Color.RED);
						break;
					}
				}
			}
		});
	}
}