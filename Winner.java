package connect;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
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

public class Winner extends JFrame {

	private JPanel contentPane;
	private colorWheel Cos;
	private String p1;
	private String p2;

	public Winner(String won, String lost) {

		p1 = won;
		p2 = lost;

		setTitle("Loser Buys!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 850, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel winner = new JLabel("Winner!");
		winner.setForeground(new Color(0, 0, 128));
		winner.setOpaque(true);
		winner.setBackground(new Color(255, 182, 193));
		winner.setFont(new Font("Herculanum", Font.BOLD, 120));
		winner.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(winner, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(255, 182, 193));
		contentPane.add(panel, BorderLayout.CENTER);

		JLabel space = new JLabel(" ");
		space.setBackground(new Color(255, 182, 193));
		space.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		panel.add(space);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 182, 193));
		panel.add(panel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 182, 193));
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JTextField WinnerTag = new JTextField(won);
		WinnerTag.setForeground(new Color(165, 42, 42));
		WinnerTag.setBorder(new LineBorder(new Color(255, 182, 193)));
		WinnerTag.setBackground(new Color(255, 255, 224));
		WinnerTag.setFont(new Font("Herculanum", Font.BOLD, 43));
		WinnerTag.setHorizontalAlignment(SwingConstants.CENTER);
		WinnerTag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameBoard pho = new GameBoard(p1, p2);
				Random dev = new Random();

				if (p1 != null) {
					try {
						Cos = new colorWheel(p1);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					int koenigsegg = dev.nextInt(9);
					switch (koenigsegg) {
					
					case 0:
						winner.setBackground(Color.ORANGE);
						space.setBackground(Color.ORANGE);
						panel.setBackground(Color.ORANGE);
						panel_1.setBackground(Color.ORANGE);
						WinnerTag.setBackground(Color.ORANGE);
						panel_2.setBackground(Color.ORANGE);
						WinnerTag.setForeground(Color.MAGENTA);
							break;
						
					case 1:
						winner.setBackground(Color.CYAN);
						space.setBackground(Color.CYAN);
						panel.setBackground(Color.CYAN);
						panel_1.setBackground(Color.CYAN);
						WinnerTag.setBackground(Color.CYAN);
						panel_2.setBackground(Color.CYAN);
						WinnerTag.setForeground(Color.MAGENTA);
							break;
						
					case 2:
						winner.setBackground(Color.GREEN);
						space.setBackground(Color.GREEN);
						panel.setBackground(Color.GREEN);
						panel_1.setBackground(Color.GREEN);
						WinnerTag.setBackground(Color.GREEN);
						panel_2.setBackground(Color.GREEN);
						WinnerTag.setForeground(Color.MAGENTA);
							break;
						
					case 3:
						winner.setBackground(Color.PINK);
						space.setBackground(Color.PINK);
						panel.setBackground(Color.PINK);
						panel_1.setBackground(Color.PINK);
						WinnerTag.setBackground(Color.PINK);
						panel_2.setBackground(Color.PINK);
						WinnerTag.setForeground(Color.RED);
							break;
						
					case 4:
						winner.setBackground(Color.darkGray);
						space.setBackground(Color.darkGray);
						panel.setBackground(Color.darkGray);
						panel_1.setBackground(Color.darkGray);
						WinnerTag.setBackground(Color.darkGray);
						panel_2.setBackground(Color.darkGray);
						WinnerTag.setBackground(Color.CYAN);
							break;
					case 5:
						winner.setBackground(Color.black);
						space.setBackground(Color.black);
						panel.setBackground(Color.black);
						panel_1.setBackground(Color.black);
						WinnerTag.setBackground(Color.black);
						panel_2.setBackground(Color.black);
						WinnerTag.setForeground(Color.PINK);
							break;
					case 6:
						winner.setBackground(Color.white);
						space.setBackground(Color.white);
						panel.setBackground(Color.white);
						panel_1.setBackground(Color.white);
						WinnerTag.setBackground(Color.white);
						panel_2.setBackground(Color.white);
						WinnerTag.setForeground(Color.BLACK);
							break;
					case 7:
						winner.setBackground(Color.red);
						space.setBackground(Color.red);
						panel.setBackground(Color.red);
						panel_1.setBackground(Color.red);
						WinnerTag.setBackground(Color.red);
						panel_2.setBackground(Color.red);
						WinnerTag.setForeground(Color.YELLOW);
							break;
					case 8:
						winner.setBackground(Color.MAGENTA);
						space.setBackground(Color.MAGENTA);
						panel.setBackground(Color.MAGENTA);
						panel_1.setBackground(Color.MAGENTA);
						WinnerTag.setBackground(Color.MAGENTA);
						panel_2.setBackground(Color.MAGENTA);
						WinnerTag.setForeground(Color.CYAN);
							break;
					case 9:
						winner.setBackground(Color.BLUE);
						winner.setForeground(Color.CYAN);
						space.setBackground(Color.BLUE);
						panel.setBackground(Color.BLUE);
						panel_1.setBackground(Color.BLUE);
						WinnerTag.setBackground(Color.BLUE);
						panel_2.setBackground(Color.BLUE);
						WinnerTag.setForeground(Color.BLUE);
							break;
					}

				} else if (p1 != null) {
					int koenigsegg = dev.nextInt(9);
					switch (koenigsegg) {

					case 0:
						winner.setBackground(Color.ORANGE);
						space.setBackground(Color.ORANGE);
						panel.setBackground(Color.ORANGE);
						panel_1.setBackground(Color.ORANGE);
						WinnerTag.setBackground(Color.ORANGE);
						panel_2.setBackground(Color.ORANGE);
						WinnerTag.setForeground(Color.MAGENTA);
							break;
						
					case 1:
						winner.setBackground(Color.CYAN);
						space.setBackground(Color.CYAN);
						panel.setBackground(Color.CYAN);
						panel_1.setBackground(Color.CYAN);
						WinnerTag.setBackground(Color.CYAN);
						panel_2.setBackground(Color.CYAN);
						WinnerTag.setForeground(Color.MAGENTA);
							break;
						
					case 2:
						winner.setBackground(Color.GREEN);
						space.setBackground(Color.GREEN);
						panel.setBackground(Color.GREEN);
						panel_1.setBackground(Color.GREEN);
						WinnerTag.setBackground(Color.GREEN);
						panel_2.setBackground(Color.GREEN);
						WinnerTag.setForeground(Color.MAGENTA);
							break;
						
					case 3:
						winner.setBackground(Color.PINK);
						space.setBackground(Color.PINK);
						panel.setBackground(Color.PINK);
						panel_1.setBackground(Color.PINK);
						WinnerTag.setBackground(Color.PINK);
						panel_2.setBackground(Color.PINK);
						WinnerTag.setForeground(Color.RED);
							break;
						
					case 4:
						winner.setBackground(Color.darkGray);
						space.setBackground(Color.darkGray);
						panel.setBackground(Color.darkGray);
						panel_1.setBackground(Color.darkGray);
						WinnerTag.setBackground(Color.darkGray);
						panel_2.setBackground(Color.darkGray);
						WinnerTag.setBackground(Color.CYAN);
							break;
					case 5:
						winner.setBackground(Color.black);
						space.setBackground(Color.black);
						panel.setBackground(Color.black);
						panel_1.setBackground(Color.black);
						WinnerTag.setBackground(Color.black);
						panel_2.setBackground(Color.black);
						WinnerTag.setForeground(Color.PINK);
							break;
					case 6:
						winner.setBackground(Color.white);
						space.setBackground(Color.white);
						panel.setBackground(Color.white);
						panel_1.setBackground(Color.white);
						WinnerTag.setBackground(Color.white);
						panel_2.setBackground(Color.white);
						WinnerTag.setForeground(Color.BLACK);
							break;
					case 7:
						winner.setBackground(Color.red);
						space.setBackground(Color.red);
						panel.setBackground(Color.red);
						panel_1.setBackground(Color.red);
						WinnerTag.setBackground(Color.red);
						panel_2.setBackground(Color.red);
						WinnerTag.setForeground(Color.YELLOW);
							break;
					case 8:
						winner.setBackground(Color.MAGENTA);
						space.setBackground(Color.MAGENTA);
						panel.setBackground(Color.MAGENTA);
						panel_1.setBackground(Color.MAGENTA);
						WinnerTag.setBackground(Color.MAGENTA);
						panel_2.setBackground(Color.MAGENTA);
						WinnerTag.setForeground(Color.CYAN);
							break;
					case 9:
						winner.setBackground(Color.BLUE);
						winner.setForeground(Color.CYAN);
						space.setBackground(Color.BLUE);
						panel.setBackground(Color.BLUE);
						panel_1.setBackground(Color.BLUE);
						WinnerTag.setBackground(Color.BLUE);
						panel_2.setBackground(Color.BLUE);
						WinnerTag.setForeground(Color.BLUE);
							break;
					}
				}
			}

		});
		panel_2.add(WinnerTag);

		JButton newGame = new JButton("   New Game   ");
		newGame.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		newGame.setOpaque(true);
		newGame.setBackground(new Color(128, 0, 0));
		newGame.setForeground(new Color(0, 0, 128));
		newGame.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Welcome4 Goku = new Welcome4();
				Goku.setLocationRelativeTo(null);
				Goku.setVisible(true);
				setVisible(false);
			}
		});
		newGame.setFont(new Font("Herculanum", Font.BOLD, 40));
		panel_1.add(newGame);

		JButton Restart = new JButton("   Restart   ");
		Restart.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		Restart.setOpaque(true);
		Restart.setForeground(new Color(0, 0, 128));
		Restart.setBackground(new Color(128, 0, 0));
		Restart.setFont(new Font("Herculanum", Font.BOLD, 40));
		Restart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				GameBoard pho = new GameBoard(p1, p2);
				pho.setLocationRelativeTo(null);
				pho.setVisible(true);
				setVisible(false);
			}
		});

		JLabel spacer = new JLabel(" ");
		panel_1.add(spacer);
		panel_1.add(Restart);
	}

}