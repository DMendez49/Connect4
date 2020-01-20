package connect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class GameBoard extends JFrame {

	private JPanel contentPane;
	private static int Empt;
	public String p1;
	public String p2;
	public static int[][] Moves = { { 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2 },
	{ 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2, 2, 2 } };
	private static boolean invalidColumnMove = false;
	private static boolean overlapCheck = false;
	private static boolean duplicateMove = false;
	static int p1Score = 0;
	static int p2Score = 0;
	static boolean p1win = false;
	static boolean p2win = false;

	/*
	 * * * * * * * Team Project - CS1410 * * * * * * * 
	 * * 											 *
	 * 					Spring 2019 			     * 
	 * 												 *
	 * 					David Mendez 				 *
	 * 				                				 *
	 * * * * * * * * * * * * * * * * * * * * * * * * *
	 */

	public GameBoard(String player1, String player2) {

		p1 = player1;
		p2 = player2;

		setTitle("Loser Buys.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 900, 950, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 5, 0, 0));

		JLabel Player1 = new JLabel("Player 1:");
		Player1.setForeground(new Color(128, 0, 0));
		Player1.setHorizontalAlignment(SwingConstants.CENTER);
		Player1.setFont(new Font("Herculanum", Font.BOLD, 20));
		panel.add(Player1);

		JLabel textArea = new JLabel();
		textArea.setText(p1);
		textArea.setBorder(new EmptyBorder(0, 0, 0, 0));
		textArea.setForeground(new Color(128, 0, 0));
		textArea.setFont(new Font("Herculanum", Font.BOLD, 20));
		panel.add(textArea);

		JLabel MainLabel = new JLabel("Connect 4");
		MainLabel.setForeground(new Color(0, 0, 128));
		MainLabel.setOpaque(true);
		MainLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		MainLabel.setBackground(new Color(255, 192, 203));
		MainLabel.setFont(new Font("Herculanum", Font.BOLD, 50));
		MainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(MainLabel);

		JLabel player2lbl = new JLabel("Player 2:");
		player2lbl.setForeground(new Color(0, 0, 139));
		player2lbl.setHorizontalAlignment(SwingConstants.CENTER);
		player2lbl.setFont(new Font("Herculanum", Font.BOLD, 20));
		panel.add(player2lbl);

		JLabel textArea2 = new JLabel();
		textArea2.setText(p2);
		textArea2.setForeground(new Color(0, 0, 139));
		textArea2.setBorder(new EmptyBorder(0, 0, 0, 0));
		textArea2.setFont(new Font("Herculanum", Font.BOLD, 20));
		panel.add(textArea2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_1, BorderLayout.CENTER);

		Empt = 0;

		JButton rowBall1 = new JButton("");
		rowBall1.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowBall1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 0) == true) {
					switch (Empt) {

					case 0:
						rowBall1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][0] = Empt;
						break;

					case 1:
						rowBall1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][0] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}

		});
		panel_1.setLayout(new GridLayout(0, 7, 0, 0));
		rowBall1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowBall1);

		JButton rowball2 = new JButton("");
		rowball2.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowball2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 1) == true) {
					switch (Empt) {

					case 0:
						rowball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][1] = Empt;
						break;

					case 1:
						rowball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][1] = Empt;
					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		rowball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowball2);

		Empt = 0;
		JButton rowBall3 = new JButton("");
		rowBall3.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowBall3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 2) == true) {
					switch (Empt) {

					case 0:
						rowBall3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][2] = Empt;
						break;

					case 1:
						rowBall3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][2] = Empt;
					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});

		rowBall3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowBall3);

		Empt = 0;
		JButton rowball4 = new JButton("");
		rowball4.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowball4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 3) == true) {
					switch (Empt) {

					case 0:
						rowball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][3] = Empt;
						break;

					case 1:
						rowball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][3] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		rowball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowball4);

		Empt = 0;
		JButton rowball5 = new JButton("");
		rowball5.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowball5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 4) == true) {
					switch (Empt) {

					case 0:
						rowball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][4] = Empt;
						break;

					case 1:
						rowball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][4] = Empt;
					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		rowball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowball5);

		JButton rowball6 = new JButton("");
		rowball6.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowball6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 5) == true) {
					switch (Empt) {

					case 0:
						rowball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][5] = Empt;
						break;

					case 1:
						rowball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][5] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		rowball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowball6);

		JButton rowball7 = new JButton("");
		rowball7.setBorder(new LineBorder(new Color(0, 0, 0)));
		rowball7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(0, 6) == true) {
					switch (Empt) {

					case 0:
						rowball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[0][6] = Empt;
						break;
					case 1:
						rowball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[0][6] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		rowball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(rowball7);

		JButton row2Ball1 = new JButton("");
		row2Ball1.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 0) == true) {
					switch (Empt) {
					case 0:
						row2Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][0] = Empt;
						break;

					case 1:
						row2Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][0] = Empt;
					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball1);

		JButton row2Ball2 = new JButton("");
		row2Ball2.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 1) == true) {
					switch (Empt) {

					case 0:
						row2Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][1] = Empt;
						break;

					case 1:
						row2Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][1] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball2);

		JButton row2Ball3 = new JButton("");
		row2Ball3.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 2) == true) {
					switch (Empt) {

					case 0:
						row2Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][2] = Empt;
						break;

					case 1:
						row2Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][2] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball3);

		JButton row2Ball4 = new JButton("");
		row2Ball4.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 3) == true) {
					switch (Empt) {

					case 0:
						row2Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][3] = Empt;
						break;

					case 1:
						row2Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][3] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball4);

		JButton row2Ball5 = new JButton("");
		row2Ball5.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 4) == true) {
					switch (Empt) {

					case 0:
						row2Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][4] = Empt;
						break;

					case 1:
						row2Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][4] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball5);

		JButton row2Ball6 = new JButton("");
		row2Ball6.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 5) == true) {
					switch (Empt) {

					case 0:
						row2Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][5] = Empt;
						break;

					case 1:
						row2Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][5] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball6);

		JButton row2Ball7 = new JButton("");
		row2Ball7.setBorder(new LineBorder(new Color(0, 0, 0)));
		row2Ball7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(1, 6) == true) {
					switch (Empt) {

					case 0:
						row2Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[1][6] = Empt;
						break;

					case 1:
						row2Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[1][6] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row2Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row2Ball7);

		JButton row3Ball1 = new JButton("");
		row3Ball1.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 0) == true) {
					switch (Empt) {

					case 0:
						row3Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][0] = Empt;
						break;

					case 1:
						row3Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][0] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball1);

		JButton row3Ball2 = new JButton("");
		row3Ball2.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 1) == true) {
					switch (Empt) {

					case 0:
						row3Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][1] = Empt;
						break;

					case 1:
						row3Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][1] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball2);

		JButton row3Ball3 = new JButton("");
		row3Ball3.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 2) == true) {
					switch (Empt) {

					case 0:
						row3Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][2] = Empt;
						break;

					case 1:
						row3Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][2] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball3);

		JButton row3Ball4 = new JButton("");
		row3Ball4.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 3) == true) {
					switch (Empt) {

					case 0:
						row3Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][3] = Empt;
						break;

					case 1:
						row3Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][3] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball4);

		JButton row3Ball5 = new JButton("");
		row3Ball5.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 4) == true) {
					switch (Empt) {

					case 0:
						row3Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][4] = Empt;
						break;

					case 1:
						row3Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][4] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball5);

		JButton row3Ball6 = new JButton("");
		row3Ball6.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 5) == true) {
					switch (Empt) {

					case 0:
						row3Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][5] = Empt;
						break;

					case 1:
						row3Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][5] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball6);

		JButton row3Ball7 = new JButton("");
		row3Ball7.setBorder(new LineBorder(new Color(0, 0, 0)));
		row3Ball7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(2, 6) == true) {
					switch (Empt) {

					case 0:
						row3Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[2][6] = Empt;
						break;

					case 1:
						row3Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[2][6] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row3Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row3Ball7);

		JButton row4Ball1 = new JButton("");
		row4Ball1.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 0) == true) {
					switch (Empt) {

					case 0:
						row4Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][0] = Empt;
						break;

					case 1:
						row4Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][0] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball1);

		JButton row4Ball2 = new JButton("");
		row4Ball2.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 1) == true) {
					switch (Empt) {

					case 0:
						row4Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][1] = Empt;
						break;

					case 1:
						row4Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][1] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball2);

		JButton row4Ball3 = new JButton("");
		row4Ball3.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 2) == true) {
					switch (Empt) {

					case 0:
						row4Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][2] = Empt;
						break;

					case 1:
						row4Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][2] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball3);

		JButton row4Ball4 = new JButton("");
		row4Ball4.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 3) == true) {
					switch (Empt) {

					case 0:
						row4Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][3] = Empt;
						break;

					case 1:
						row4Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][3] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball4);

		JButton row4Ball5 = new JButton("");
		row4Ball5.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 4) == true) {
					switch (Empt) {

					case 0:
						row4Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][4] = Empt;
						break;

					case 1:
						row4Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][4] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball5);

		JButton row4Ball6 = new JButton("");
		row4Ball6.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 5) == true) {
					switch (Empt) {

					case 0:
						row4Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][5] = Empt;
						break;

					case 1:
						row4Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][5] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball6);

		JButton row4Ball7 = new JButton("");
		row4Ball7.setBorder(new LineBorder(new Color(0, 0, 0)));
		row4Ball7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(3, 6) == true) {
					switch (Empt) {

					case 0:
						row4Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[3][6] = Empt;
						break;

					case 1:
						row4Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[3][6] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row4Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row4Ball7);

		JButton row5Ball1 = new JButton("");
		row5Ball1.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 0) == true) {
					switch (Empt) {

					case 0:
						row5Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][0] = Empt;
						break;

					case 1:
						row5Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][0] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball1);

		JButton row5Ball2 = new JButton("");
		row5Ball2.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 1) == true) {
					switch (Empt) {

					case 0:
						row5Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][1] = Empt;
						break;

					case 1:
						row5Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][1] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball2);

		JButton row5Ball3 = new JButton("");
		row5Ball3.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 2) == true) {
					switch (Empt) {

					case 0:
						row5Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][2] = Empt;
						break;

					case 1:
						row5Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][2] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball3);

		JButton row5Ball4 = new JButton("");
		row5Ball4.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 3) == true) {
					switch (Empt) {

					case 0:
						row5Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][3] = Empt;
						break;

					case 1:
						row5Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][3] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball4);

		JButton row5Ball5 = new JButton("");
		row5Ball5.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 4) == true) {
					switch (Empt) {

					case 0:
						row5Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][4] = Empt;
						break;

					case 1:
						row5Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][4] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball5);

		JButton row5Ball6 = new JButton("");
		row5Ball6.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 5) == true) {
					switch (Empt) {

					case 0:
						row5Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][5] = Empt;
						break;

					case 1:
						row5Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][5] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball6);

		JButton row5Ball7 = new JButton("");
		row5Ball7.setBorder(new LineBorder(new Color(0, 0, 0)));
		row5Ball7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(4, 6) == true) {
					switch (Empt) {

					case 0:
						row5Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[4][6] = Empt;
						break;

					case 1:
						row5Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[4][6] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row5Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row5Ball7);

		JButton row6Ball1 = new JButton("");
		row6Ball1.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 0) == true) {
					switch (Empt) {

					case 0:
						row6Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][0] = Empt;
						break;

					case 1:
						row6Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][0] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball1.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball1);

		JButton row6Ball2 = new JButton("");
		row6Ball2.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 1) == true) {
					switch (Empt) {

					case 0:
						row6Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][1] = Empt;
						break;

					case 1:
						row6Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][1] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball2.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball2);

		JButton row6Ball3 = new JButton("");
		row6Ball3.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 2) == true) {
					switch (Empt) {

					case 0:
						row6Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][2] = Empt;
						break;

					case 1:
						row6Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][2] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball3.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball3);

		JButton row6Ball4 = new JButton("");
		row6Ball4.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 3) == true) {
					switch (Empt) {

					case 0:
						row6Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][3] = Empt;
						break;

					case 1:
						row6Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][3] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball4.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball4);

		JButton row6Ball5 = new JButton("");
		row6Ball5.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 4) == true) {
					switch (Empt) {

					case 0:
						row6Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][4] = Empt;
						break;

					case 1:
						row6Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][4] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball5.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball5);

		JButton row6Ball6 = new JButton("");
		row6Ball6.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 5) == true) {
					switch (Empt) {

					case 0:
						row6Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][5] = Empt;
						break;

					case 1:
						row6Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][5] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball6.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball6);

		JButton row6Ball7 = new JButton("");
		row6Ball7.setBorder(new LineBorder(new Color(0, 0, 0)));
		row6Ball7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				turnIncrement();

				if (invalidMove(5, 6) == true) {
					switch (Empt) {

					case 0:
						row6Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player1.png")));
						Moves[5][6] = Empt;
						break;

					case 1:
						row6Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/player2.png")));
						Moves[5][6] = Empt;

					}
				}
				winscreenGUI(winTester());
				errorMessages();
			}
		});
		row6Ball7.setIcon(new ImageIcon(GameBoard.class.getResource("/connect/emptycell.png")));
		panel_1.add(row6Ball7);

		// here is the reset button's functionality. a new board is drawn, and the moves
		// array is emptied.
		JButton RSTBTN = new JButton("Reset ");
		RSTBTN.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		RSTBTN.setForeground(new Color(0, 0, 139));
		RSTBTN.setBackground(new Color(165, 42, 42));
		RSTBTN.setOpaque(true);
		RSTBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GameBoard pho = new GameBoard(p1, p2);
				pho.setLocationRelativeTo(null);
				pho.setVisible(true);
				setVisible(false);

				//reset move tracking table
				resetMoves();
				
				//reset player win variables
				p1win = false;
				p2win = false;
				p1Score = 0;
				p2Score = 0;
			}
		});
		RSTBTN.setFont(new Font("Herculanum", Font.BOLD, 30));
		contentPane.add(RSTBTN, BorderLayout.SOUTH);

	}

	// this method checks if the move made is valid. returns false for an invalid
	// move
	public boolean invalidMove(int row, int column) {

		boolean validMove = true;

		// check if the other player has already played this cell
		if ((!(Moves[row][column] == Empt)) && (!((Moves[row][column]) == 2))) {
			overlapCheck = true;
		}

		// check if this move is in the lowest position in the column, as it should be
		for (int i = row; i < 5; i++) {
			if (Moves[i + 1][column] == 2) {
				invalidColumnMove = true;
			}
		}

		// check if current player has already played this cell
		if (Moves[row][column] == Empt) {
			duplicateMove = true;
		}
		if (overlapCheck == true || invalidColumnMove == true || duplicateMove == true) {
			validMove = false;
		}

		return validMove;
	}

	// this method switches the player turn back and forth between 0 and 1
	public static void turnIncrement() {

		Empt++;
		if (Empt == 2) {
			Empt = 0;
		}

	}

	public static void errorMessages() {

		// this method will display error messages if an invalid move has been made.
		// the tester booleans reset after the message.

		if (invalidColumnMove == true || overlapCheck == true || duplicateMove == true) {

			// reset player turn when move is rejected
			Empt++;
			if (Empt == 2) {
				Empt = 0;
			}
		}

		if (invalidColumnMove == true) {

			JOptionPane.showMessageDialog(null, "Your move must be made on the lowest empty cell.", "Invalid Move",
					JOptionPane.ERROR_MESSAGE);
			invalidColumnMove = false;
			overlapCheck = false;
			duplicateMove = false;
		}

		if (overlapCheck == true) {
			JOptionPane.showMessageDialog(null, "The other player has already played this cell.", "Invalid Move",
					JOptionPane.ERROR_MESSAGE);
			overlapCheck = false;
			duplicateMove = false;
		}

		if (duplicateMove == true) {
			JOptionPane.showMessageDialog(null, "You have already played this cell.", "Invalid Move",
					JOptionPane.ERROR_MESSAGE);
			duplicateMove = false;
		}
	}

	//this method declares a winner when a win is detected
	public void winscreenGUI(int winner) {
		switch(winner) {
		case 0: //player 1 win
			resetMoves();
			Winner ramen = new Winner(p1, p2);
			setVisible(false);
			ramen.setLocationRelativeTo(null);
			ramen.setVisible(true);
			break;
		case 1: //player 2 win
			resetMoves();
			Winner noodles = new Winner(p2, p1);
			setVisible(false);
			noodles.setLocationRelativeTo(null);
			noodles.setVisible(true);
			break;
		case 2: //no winner
			
		}
	}

	//this method resets the player score variables used for win detection
	public static void resetPlayerScores() {
		p1Score = 0;
		p2Score = 0;
	}

	//this set of two methods protects the win detector from ignoring unusual wins.
	//specifically, it will not reset the score counter during a check
	//if someone has already won. there is a method of this style for each player.
	public static void p1ConditionalScoreReset() {
		if(p1Score < 4) {
			p1Score = 0;
		}
	}

	public static void p2ConditionalScoreReset() {
		if(p2Score < 4) {
			p2Score = 0;
		}
	}

	//this set of two methods protects the win detector from interfering with a win that
	//has already happened. put concisely, this will freeze the win detector once a win
	//is found.

	public static void p1ConditionalScoreIncrement() {
		if(p1win == false && p2win == false) {
			p1Score++;
		}
	}

	public static void p2ConditionalScoreIncrement() {
		if(p1win == false && p2win == false) {
			p2Score++;
		}
	}


	//this method sets the player win variables when the conditions have been met
	public static void setPlayerWinVar() {
		if(p1Score >= 4) {
			p1win = true;
			p2win = false;
		}
		if(p2Score >=4 ) {
			p2win = true;
			p1win = false;
		}
	}

	public static int winTester() {
		int winner = 2;
		resetPlayerScores();

		//check columns for win up/down

		for(int i = 0; i <= 6; i++) {
			for(int j = 0; j <= 5; j++) {
				if(Moves[j][i] == 0) {
					p1ConditionalScoreIncrement();
					p2ConditionalScoreReset();
				}
				if(Moves[j][i] == 1) {
					p2ConditionalScoreIncrement();
					p1ConditionalScoreReset();
				}
				setPlayerWinVar();
			}
			//at the end of the column, reset score counter
			resetPlayerScores();
		}

		//check rows for win across

		for(int j = 0; j <= 5; j++) {
			for(int i = 0; i <= 6; i++) {
				if(Moves[j][i] == 0) {
					p1ConditionalScoreIncrement();
					p2ConditionalScoreReset();
				}
				if(Moves[j][i] == 1) {
					p2ConditionalScoreIncrement();
					p1ConditionalScoreReset();
				}
				setPlayerWinVar();
			}
			//at the end of the row, reset score counter
			resetPlayerScores();
		}

		//check for a diagonal win - left to right, ascending

		// 1/6 ascending diagonal checks
		resetPlayerScores();
		int x = 0;
		for(int i = 3; i >= 0; i--) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 2/6 ascending diagonal check
		resetPlayerScores();
		x = 0;
		for(int i = 4; i >= 0; i--) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 3/6 ascending diagonal check
		resetPlayerScores();
		x = 0;
		for(int i = 5; i >= 0; i--) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 4/6 ascending diagonal check
		resetPlayerScores();
		x = 1;
		for(int i = 5; i >= 0; i--) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 5/6 ascending diagonal check
		resetPlayerScores();
		x = 2;
		for(int i = 5; i >= 1; i--) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 6/6 ascending diagonal check
		resetPlayerScores();
		x = 3;
		for(int i = 5; i >= 2; i--) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		//check for a diagonal win - left to right, descending

		// 1/6 descending diagonal check
		resetPlayerScores();
		x = 0;
		for(int i = 2; i <= 5; i++) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 2/6 descending diagonal check
		resetPlayerScores();
		x = 0;
		for(int i = 1; i <= 5; i++) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 3/6 descending diagonal check
		resetPlayerScores();
		x = 0;
		for(int i = 0; i <= 5; i++) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 4/6 descending diagonal check
		resetPlayerScores();
		x = 1;
		for(int i = 0; i <= 5; i++) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 5/6 descending diagonal check
		resetPlayerScores();
		x = 2;
		for(int i = 0; i <= 4; i++) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		// 6/6 descending diagonal check
		resetPlayerScores();
		x = 3;
		for(int i = 0; i <= 3; i++) {
			if(Moves[i][x] == 0) {
				p1ConditionalScoreIncrement();
				p2ConditionalScoreReset();
			}
			if(Moves[i][x] == 1) {
				p2ConditionalScoreIncrement();
				p1ConditionalScoreReset();
			}
			setPlayerWinVar();
			x++;
		}

		//set the value of the winner variable (what this method returns) to correspond to:
		//0 for player 1
		//1 for player 2
		//2 for no winner found

		if(p1win == true) {
			winner = 0;
		}
		if(p2win == true) {
			winner = 1;
		}

		return winner;
	}
	
	public static void resetMoves() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				Moves[i][j] = 2;
			}
		}
		p1win = false;
		p2win = false;
		p1Score = 0;
		p2Score = 0;
	}
	
}
