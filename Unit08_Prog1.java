/*
* Name: Amos Gichero
* Class: CIST 2371 Introduction to Java
* Quarter: Summer 2015
* Instructor: William Pegg
* Description: Solution to Unit 08 Program 1
* * Due: 07/31/2015

* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class Unit08_Prog1  extends JFrame {
		
		// Create radio buttons	
		private JRadioButton jrbRed = new JRadioButton("Red");
		private JRadioButton jrbYellow = new JRadioButton("Yellow");
		private JRadioButton jrbWhite = new JRadioButton("White");
		private JRadioButton jrbGray = new JRadioButton("Gray");
		private JRadioButton jrbGreen = new JRadioButton("Green");
		
		// Create text area
		
		
		// Create Buttons
		private JButton jbtClear = new JButton("CLEAR");
		private JButton jbtQuit = new JButton("QUIT");
		
		

		
	
public static void main(String[] args) {
		
		JFrame frame = new Unit08_Prog1();
		frame.setTitle("Unit08_Prog1");
		frame.setSize(500,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	


public Unit08_Prog1() {

       // Create a panel to hold radio buttons
       
       JPanel jpRadioButtons = new JPanel();
       jpRadioButtons.setLayout(new GridLayout(1, 5));
       jpRadioButtons.add(jrbRed);
       jpRadioButtons.add(jrbYellow);
       jpRadioButtons.add(jrbWhite);
       jpRadioButtons.add(jrbGray);
       jpRadioButtons.add(jrbGreen);
       jpRadioButtons.setBorder(new TitledBorder("Select Message Background"));
       add(jpRadioButtons, BorderLayout.NORTH);
       
       // Create a radio-button group to group five buttons
       
       ButtonGroup group = new ButtonGroup();
       group.add(jrbRed);
       group.add(jrbYellow);
       group.add(jrbWhite);
       group.add(jrbGray);
       group.add(jrbGreen);
       
       jrbWhite.setSelected(true);
       //jtaText.setBackground(Color.white);
       
       final JTextArea jtaText = new JTextArea("Welcome to Java", 5, 5); 
       jtaText.setLineWrap(true);
       jtaText.setWrapStyleWord(true);
       jtaText.setEditable(true);
       JScrollPane scrollPane = new JScrollPane(jtaText); 
       add(scrollPane, BorderLayout.CENTER);
       
        // Create a panel to hold buttons
       
       JPanel jpButtons = new JPanel();
       jpButtons.setLayout(new GridLayout(1, 2));
       jpButtons.add(jbtClear);
       jpButtons.add(jbtQuit);
       jbtClear.setToolTipText("Clear the text area to the default text");
       jbtQuit.setToolTipText("Quit the Program");
       add(jpButtons, BorderLayout.SOUTH);
       
       // Set mnemonic keys buttons
       
       jbtClear.setMnemonic('C');
       jbtQuit.setMnemonic('Q');     



// Register listeners for radio buttons

jrbRed.addActionListener(new ActionListener() { 
@Override
public void actionPerformed(ActionEvent e) {
      jtaText.setBackground(Color.red);
    }
});

jrbYellow.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
      jtaText.setBackground(Color.yellow);
    }
});

jrbWhite.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
      jtaText.setBackground(Color.white);
    }
});

jrbGray.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
      jtaText.setBackground(Color.gray);
    }
});

jrbGreen.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
      jtaText.setBackground(Color.green);
    }
});

// Register listeners for buttons

jbtClear.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
      jtaText.setText("Welcome to Java");
    }
});

jbtQuit.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
});

}

}


