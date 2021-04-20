import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;

public class tictactoe {

	private JFrame frame;
	String startgame;
	JTextField score1;
	JTextField score2;
	double countScore1=0;
	double countScore2=0;
	String initialStartGameValue;
	int[] b = {2,2,2,2,2,2,2,2,2};
	int tiechecker=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public tictactoe() {
		initialize();
	}
	
	public void initialiseStartGame()
	{
		JFrame f = new JFrame();
		startgame = JOptionPane.showInputDialog(f,"Choose X or O").toUpperCase();
		JOptionPane.showMessageDialog(frame, "All the best\nLet's Start!!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(startgame);
		checkStartGame();
	}
	
	public void checkStartGame() 
	{
		if(!startgame.equalsIgnoreCase("X") && !startgame.equalsIgnoreCase("O")) 
		{
			JFrame f1 = new JFrame();
			JOptionPane.showMessageDialog(f1, "Invalid Input","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);
			initialiseStartGame();
		}else 
		{
			initialStartGameValue = startgame;
			System.out.println(initialStartGameValue);
		}
	}
	
	public void changeStartGame() 
	{
		if(startgame.equalsIgnoreCase("X")) 
		{
			startgame = "O";
		}else if(startgame.equalsIgnoreCase("O")) 
		{
			startgame = "X";
		}
	}
	
	public void displayWinnerX() 
	{
		if(initialStartGameValue.equalsIgnoreCase("X")) {
		JOptionPane.showMessageDialog(frame,"Congratulation!! Player 1 wins","Tic Tac Toe- Game Result", JOptionPane.INFORMATION_MESSAGE);
		tiechecker = 0;
		countScore1++;
		score1.setText(Double.toString(countScore1));
		}else 
		{
			JOptionPane.showMessageDialog(frame,"Congratulation!! Player 2 wins","Tic Tac Toe- Game Result", JOptionPane.INFORMATION_MESSAGE);
			tiechecker = 0;
			countScore2++;
			score2.setText(Double.toString(countScore2));
		}
	}
	
    public void displayWinnerO() 
	{
    	if(initialStartGameValue.equalsIgnoreCase("O")) {
    		JOptionPane.showMessageDialog(frame,"Congratulation!! Player 1 wins","Tic Tac Toe- Game Result", JOptionPane.INFORMATION_MESSAGE);
    		tiechecker = 0;
    		countScore1++;
    		score1.setText(Double.toString(countScore1));
    		}else 
    		{
    			JOptionPane.showMessageDialog(frame,"Congratulation!! Player 2 wins","Tic Tac Toe- Game Result", JOptionPane.INFORMATION_MESSAGE);
    			tiechecker = 0;
    			countScore2++;
    			score2.setText(Double.toString(countScore2));
    		}
	}
    
    public void displayTie() 
    {
    	JOptionPane.showMessageDialog(frame, "It's a tie","Tic Tac Toe- Game Result", JOptionPane.INFORMATION_MESSAGE);
    	countScore1+=0.5;
    	countScore2+=0.5;
    	score1.setText(Double.toString(countScore1));
    	score2.setText(Double.toString(countScore2));
    	tiechecker = 0;
    }
		
	public void checkWinner() 
	{
        if(b[0]==1&&b[1]==1&&b[2]==1) 
		{
			displayWinnerX();
		}
        else if(b[3]==1&&b[4]==1&&b[5]==1) 
		{
			displayWinnerX();
		}
        else if(b[6]==1&&b[7]==1&&b[8]==1) 
		{
			displayWinnerX();
		}
        else if(b[0]==1&&b[3]==1&&b[6]==1) 
		{
			displayWinnerX();
		}
        else if(b[1]==1&&b[4]==1&&b[7]==1) 
		{
			displayWinnerX();
		}
        else if(b[2]==1&&b[5]==1&&b[8]==1) 
		{
			displayWinnerX();
		}
        else if(b[0]==1&&b[4]==1&&b[8]==1) 
		{
			displayWinnerX();
		}
        else if(b[2]==1&&b[4]==1&&b[6]==1) 
		{
			displayWinnerX();
		}
        else if(b[0]==0&&b[1]==0&&b[2]==0) 
		{ 
			displayWinnerO();
		}
        else if(b[3]==0&&b[4]==0&&b[5]==0) 
		{
			displayWinnerO();
		}
        else if(b[6]==0&&b[7]==0&&b[8]==0) 
		{
			displayWinnerO();
		}
        else if(b[0]==0&&b[3]==0&&b[6]==0) 
		{
			displayWinnerO();
		}
        else if(b[1]==0&&b[4]==0&&b[7]==0) 
		{
			displayWinnerO();
		}
        else if(b[2]==0&&b[5]==0&&b[8]==0) 
		{
			displayWinnerO();
		}
        else if(b[0]==0&&b[4]==0&&b[8]==0) 
		{
			displayWinnerO();
		}
        else if(b[2]==0&&b[4]==0&&b[6]==0) 
		{
			displayWinnerO();
		}else if(tiechecker==9) 
		{
			displayTie();
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		initialiseStartGame();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[0] = 1;
					tiechecker++;
					btn1.setForeground(Color.red);
					btn1.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[0] = 0;
					tiechecker++;
					btn1.setForeground(Color.yellow);
					btn1.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn2.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[1] = 1;
					tiechecker++;
					btn2.setForeground(Color.red);
					btn2.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[1] = 0;
					tiechecker++;
					btn2.setForeground(Color.yellow);
					btn2.setEnabled(false);
				}
				changeStartGame();
				checkWinner();
			}
		});
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn3.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[2] = 1;
					tiechecker++;
					btn3.setForeground(Color.red);
					btn3.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[2] = 0;
					tiechecker++;
					btn3.setForeground(Color.yellow);
					btn3.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		JLabel User1 = new JLabel();
		User1.setBackground(Color.GRAY);
		User1.setHorizontalAlignment(SwingConstants.CENTER);
		User1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel_4.add(User1);
		User1.setText("Player_1 ");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		JLabel User2 = new JLabel();
		User2.setBackground(Color.GRAY);
		User2.setHorizontalAlignment(SwingConstants.CENTER);
		User2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel_5.add(User2);
		User2.setText("Player_2");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn4.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[3] = 1;
					tiechecker++;
					btn4.setForeground(Color.red);
					btn4.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[3] = 0;
					tiechecker++;
					btn4.setForeground(Color.yellow);
					btn4.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn5.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[4] = 1;
					tiechecker++;
					btn5.setForeground(Color.red);
					btn5.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[4] = 0;
					tiechecker++;
					btn5.setForeground(Color.yellow);
					btn5.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn6.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[5] = 1;
					tiechecker++;
					btn6.setForeground(Color.red);
					btn6.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[5] = 0;
					tiechecker++;
					btn6.setForeground(Color.yellow);
					btn6.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		score1 = new JTextField();
		score1.setForeground(Color.ORANGE);
		score1.setHorizontalAlignment(SwingConstants.CENTER);
		score1.setFont(new Font("Times New Roman", Font.BOLD, 50));
		score1.setText("0");
		panel_10.add(score1,BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		score2 = new JTextField();
		score2.setForeground(Color.MAGENTA);
		score2.setHorizontalAlignment(SwingConstants.CENTER);
		score2.setFont(new Font("Times New Roman", Font.BOLD, 50));
		score2.setText("0");
		panel_11.add(score2,BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn7.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[6] = 1;
					tiechecker++;
					btn7.setForeground(Color.red);
					btn7.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[6] = 0;
					tiechecker++;
					btn7.setForeground(Color.yellow);
					btn7.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_9.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn8.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[7] = 1;
					tiechecker++;
					btn8.setForeground(Color.red);
					btn8.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[7] = 0;
					tiechecker++;
					btn8.setForeground(Color.yellow);
					btn8.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 55));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn9.setText(startgame);
				if(startgame.equalsIgnoreCase("X")) 
				{
					b[8] = 1;
					tiechecker++;
					btn9.setForeground(Color.red);
					btn9.setEnabled(false);
				}else if(startgame.equalsIgnoreCase("O"))
				{
					b[8] = 0;
					tiechecker++;
					btn9.setForeground(Color.yellow);
					btn9.setEnabled(false);
				}
				
				changeStartGame();
				checkWinner();
			}
		});
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnreset = new JButton("RESET");
		btnreset.setBackground(Color.ORANGE);
		btnreset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				for(int i=0;i<9;i++) 
				{
					b[i]=2;
				}
				
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
			}
		});
		panel_15.add(btnreset, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Do you really want to exit","Tic Tac Toe",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_OPTION) 
				{
					System.exit(0);
				}
			}
		});
		panel_14.add(btnExit);
	}

}
