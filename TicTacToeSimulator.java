package question12;

import java.awt.*;
import javax.swing.*;

import question9.DiceSimulator.ActionListener1;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeSimulator extends JFrame
{
	private JPanel calcualtePanel, greetPanel;
	private JRadioButton newGameButton, exitButton, gameOnButton;
	private ButtonGroup bg, bg1;
	private int[][] array = new int [3][3];
	private JTextField text, text2, text3;
	private static int i = 2, j = 0;
	private static boolean c = true , d = true;
	private static boolean b, a;
	private static boolean choosen1 = true, choosen2 = true,  choosen3 = true,
						   choosen4 = true, choosen5 = true,  choosen6 = true,
						   choosen7 = true, choosen8 = true,  choosen9 = true;
	
	private JRadioButton label11, label12, label13, 
				         label21, label22, label23, 
				         label31,label32, label33;
	
	private static int value = 1;
	
	// Window width 
    private final int WINDOW_WIDTH = 120;
    
    // Window height
    private final int WINDOW_HEIGHT = 200;
    private ImageIcon  o, x, x1, o1;
	
	public TicTacToeSimulator()
	{
		setTitle("Tic Tac Toe ");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x = new ImageIcon("X.png");
		o = new ImageIcon("O.png");
		
		x1 = new ImageIcon("e7.png");
		o1 = new ImageIcon("e7.png");
		

		calcualtePanel = new JPanel();
		calcualtePanel.setLayout(new GridLayout(5,3));
		
		text = new JTextField(10);
		text.setEditable(false);
		
		text2 = new JTextField(1);
		text2.setEditable(false);
		text3 = new JTextField(1);
		text3.setEditable(false);
		
		text.setText("First player(X)");
		text.setBorder(BorderFactory.createLineBorder(Color.orange, 5));
		text2.setText("Select a square");
		text2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
		text3.setText("Turn: ");
		text3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
		
		
		bg = new ButtonGroup();
		

		label11 = new JRadioButton();
		label12 = new JRadioButton();
		label13 = new JRadioButton();
		label21 = new JRadioButton();
		label22 = new JRadioButton();
		label23 = new JRadioButton();
		label31 = new JRadioButton();
		label32 = new JRadioButton();
		label33 = new JRadioButton();
		
		label11.setIcon(x1);
		label12.setIcon(o1);
		label13.setIcon(o1);
		label21.setIcon(x1);
		label22.setIcon(o1);
		label23.setIcon(x1);
		label31.setIcon(o1);
		label32.setIcon(x1);
		label33.setIcon(x1);
		
		bg1 = new ButtonGroup();
		bg1.add(label11);
		bg1.add(label12);
		bg1.add(label13);
		bg1.add(label21);
		bg1.add(label22);
		bg1.add(label23);
		bg1.add(label31);
		bg1.add(label32);
		bg1.add(label33);
		
		
		newGameButton = new JRadioButton("New Game");
		exitButton  = new JRadioButton("Exit Button");
		gameOnButton = new JRadioButton("How to Play?");
		newGameButton.setSelected(false);
		bg.add(newGameButton);
		bg.add(gameOnButton);
		bg.add(exitButton);
		
		newGameButton.addActionListener(new ActionListener1());	
		gameOnButton.addActionListener(new ActionListener1());	
		exitButton.addActionListener(new ActionListener1());
		label11.addActionListener(new ActionListener1());	
		label12.addActionListener(new ActionListener1());	
		label13.addActionListener(new ActionListener1());	
		label21.addActionListener(new ActionListener1());	
		label22.addActionListener(new ActionListener1());	
		label23.addActionListener(new ActionListener1());	
		label31.addActionListener(new ActionListener1());	
		label32.addActionListener(new ActionListener1());	
		label33.addActionListener(new ActionListener1());	
	

		calcualtePanel.add(text3);
		calcualtePanel.add(text);
		calcualtePanel.add(text2);
		calcualtePanel.add(label11);
		calcualtePanel.add(label12);
		calcualtePanel.add(label13);
		calcualtePanel.add(label21);
		calcualtePanel.add(label22);
		calcualtePanel.add(label23);
		calcualtePanel.add(label31);
		calcualtePanel.add(label32);
		calcualtePanel.add(label33);
		calcualtePanel.add(newGameButton);
		calcualtePanel.add(gameOnButton);
		calcualtePanel.add(exitButton);	
		
		add(calcualtePanel);
		
		
		
		pack();
		setVisible(true);
		
	}
	



	public  class ActionListener1 implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
		   if(c == true)
		   {	   
			  if(label11.isSelected() && (choosen1) && value == 1)  
			  {	  
				     array[0][0] = 1;
			         choosen1 = false;
			         i++;
			         j++;
			    	 label11.setIcon(x);
			         
			  }            
			  else if(label11.isSelected() && (choosen1) && value == 0)
			  {	 
				    array[0][0] = 2;
				    choosen1 = false;
			        i++;
			        j++;
			    	label11.setIcon(o);	
			   }
			    	   
			  else if(label12.isSelected() && (choosen2) && value == 1)
			  {    	
				    array[0][1] = 1;
			        choosen2 = false;
			        i++;
			        j++;
			        label12.setIcon(x);
			    } 
			    else if(label12.isSelected() && (choosen2) && value == 0)	
			    {		
			    	array[0][1]= 2;
			    	choosen2 = false;
				    i++;
				    j++;
			    	label12.setIcon(o);
			    } 
			    else if(label13.isSelected() && (choosen3) && value == 1)
			    {	 	
			    	array[0][2] = 1;
			    	choosen3 = false;
				    i++;
				    j++;
				    label13.setIcon(x);
			    }	
			    else if(label13.isSelected() && (choosen3) && value == 0)
			    {	
			    	array[0][2] = 2;
			    	choosen3 = false;
				    i++;
				    j++;
			    	label13.setIcon(o);
			    }		
			    else if(label21.isSelected() && (choosen4) && value == 1)
			    {	
			    	array[1][0] = 1;
			    	choosen4 = false;
				    i++;
				    j++;
				    label21.setIcon(x);
			    }	
			    else if(label21.isSelected() && (choosen4) && value == 0)
			    {	
			    	array[1][0] = 2;
			    	choosen4 = false;
				    i++;
				    j++;
				    label21.setIcon(o);
			    }	    
			    else if(label22.isSelected() && (choosen5) && value == 1)
			    {	
			    	array[1][1] = 1;
			    	choosen5 = false;
				    i++;
				    j++;
				    label22.setIcon(x);
			    }	
			    else if(label22.isSelected() && (choosen5) && value == 0)
			    {	
			    	array[1][1] = 2;
			    	choosen5 = false;
				    i++;
				    j++;
				   	label22.setIcon(o);
			    }	    
			    else if(label23.isSelected() && (choosen6) && value == 1)
			    {	
			    	array[1][2] = 1;
			    	choosen6 = false;
				    i++;
				    j++;
				    label23.setIcon(x);
			    }	
			    else if(label23.isSelected() && (choosen6) && value == 0)
			    {	
			    	array[1][2] = 2;
			    	choosen6 = false;
				    i++;
				    j++;
				    label23.setIcon(o);
			    }	   	
			    else if(label31.isSelected() && (choosen7) && value == 1)
			    {	
			    	array[2][0] = 1;
			    	choosen7 = false;
				    i++;
				    j++;
				    label31.setIcon(x);
			    }	
			    else if(label31.isSelected() && (choosen7) && value == 0)
			    {	
			    	array[2][0] = 2;
			    	choosen7 = false;
				    i++;
				    j++;
			    	label31.setIcon(o);
			    }		
			    else if(label32.isSelected() && (choosen8) && value == 1)
			    {	
			    	array[2][1] = 1;
			    	choosen8 = false;
				    i++;
				    j++;
				    label32.setIcon(x);
			    }	
			    else if(label32.isSelected() && (choosen8) && value == 0)
			    {	
			    	array[2][1] = 2;
			    	choosen8 = false;
				    i++;
				    j++;
				    label32.setIcon(o);
			    }	
			    else if(label33.isSelected() && (choosen9) && value == 1)
			    {	
			    	array[2][2] = 1;
			    	choosen9 = false;
				    i++;
				    j++;
				    label33.setIcon(x);
			    }	
			    else if(label33.isSelected() && (choosen9) && value == 0)
			    {	
			    	array[2][2] = 2;
			    	choosen9 = false;
				    i++;
				    j++;
				    label33.setIcon(o);
			    }
		    } 
	       
		  
		    if(exitButton.isSelected())
		    	System.exit(0);
		    
		    if(newGameButton.isSelected())
		    {
		    	c = true;
		    	bg.clearSelection();
				for(int i = 0; i < array.length; i++)
				{	
					for(int j = 0; j < array.length; j++)
						array[i][j] = 0;
				}	
				
				i = 2;
				j = 0;
				choosen1 = true; 
				choosen2 = true;  
				choosen3 = true;
			    choosen4 = true;
			    choosen5 = true;
			    choosen6 = true;
			    choosen7 = true;
			    choosen8 = true;
			    choosen9 = true;
			    
			    label11.setIcon(x1);
				label12.setIcon(o1);
				label13.setIcon(o1);
				label21.setIcon(x1);
				label22.setIcon(o1);
				label23.setIcon(x1);
				label31.setIcon(o1);
				label32.setIcon(x1);
				label33.setIcon(x1);
		     }	
		    if(gameOnButton.isSelected())
		    {	
		    	JOptionPane.showMessageDialog(null, 
		    			"Tic-tac-toe (also known as noughts and crosses or Xs and Os) "
		    			+ "\nis a paper-and-pencil game for two players, X and O, "
		    			+ "\nwho take turns marking the spaces in a 3×3 grid. "
		    			+ "\nThe player who succeeds in placing three of their marks"
		    			+ "\nin a horizontal, vertical, or diagonal row wins the game.");
		    }
		    
		    bg.clearSelection();
		    if(array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1)
		    {	
		    	 b = true;
		    }	 
		    else if(array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1)
		    {	
		    	 b = true;
		    
		    }	 
		    else if(array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1)
		    {	
		    	 b = true;
		    	
		    }	 
		    else if(array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1)
		    {	
		    	 b = true;
		    	
		    }	 	 
		    else if(array[0][1] == 1 && array[1][1] == 1 && array[2][1] == 1)
		    {	
		    	 b = true;
		    
		    }	  
	        else if(array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1)
		    {	
		    	 b = true;
		    	
		    }
		    else if(array[0][2] == 1 && array[1][1] == 1 && array[2][0] == 1)
		    {	
		    	 b = true;
		    	
		    }
		    else if(array[2][0] == 1 && array[1][1] == 1 && array[0][2] == 1)
		    {	
		    	 b = true;
		    
		    }
		    else if(array[0][2] == 1 && array[1][2] == 1 && array[2][2] == 1)
		    {	
		    	 b = true;
		    }
		    
		  
		    if(array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2)
		    {	
		    	 a = true;
		    	
		    }	 
		    else if(array[1][0] == 2 && array[1][1] == 2 && array[1][2] == 2)
		    {	
		    	 a = true;
		    	
		    }	 
		    else if(array[2][0] == 2 && array[2][1] == 2 && array[2][2] == 2)
		    {	
		    	 a = true;
		    	
		    }	 
		    else if(array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2)
		    {	
		    	 a = true;
		    	
		    }	 	 
		    else if(array[0][1] == 2 && array[1][1] == 2 && array[2][1] == 2)
		    {	
		    	 a = true;
		    	 
		    }	  
		    else if(array[0][0] == 2 && array[1][1] == 2 && array[2][2] == 2)
		    {	
		    	 a = true;
		    	
		    }
		    else if(array[0][2] == 2 && array[1][1] == 2 && array[2][0] == 2)
		    {	
		    	 a = true;
		   
		    }
		    else if(array[2][0] == 2 && array[1][1] == 2 && array[0][2] == 2)
		    {	
		    	 a = true;
		    	
		    } 
		    else if(array[0][2] == 2 && array[1][2] == 2 && array[2][2] == 2)
		    {	
		    	 a = true;
		    
		    }	
		  
		      
		   
		    if(a == true && b == true && j == 9)	
		    {	
		    	c = false;
		    	JOptionPane.showMessageDialog(null, "Tie\nClick New Game or Exit");	
		    }	
		    else if(a == false && b == false && j == 9)
		    {	
		    	c = false;
		    	JOptionPane.showMessageDialog(null, "Tie\nClick New Game or Exit");
		    }	
		    else if(a == true)
		    {	
		    	c = false;
		    	JOptionPane.showMessageDialog(null, "O Wins!\nClick New Game or Exit");
		    	a = false;
		    }	
		    else if(b == true)
		    {	
		    	c = false;
		    	JOptionPane.showMessageDialog(null, "X Wins!\nClick New Game or Exit");
		    	b = false;
		    }	
		  	    
		    if(i % 2 != 0 &&  c == true)
			 {	 
				 text.setText("Second player(O)");
				 value = 0;
			 }	 
		    else if(i % 2 == 0 && c == true)
			 {	 
				 text.setText("First player(X)");
				 value = 1;
			 }	   
	   }		
	}	
	public static void main(String[] args) 
	{
		new TicTacToeSimulator();
	}
  	
}