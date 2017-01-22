
/*
* Name: Amos Gichero
* Class: CIST 2371 Introduction to Java
* Quarter: Summer 2015
* Instructor: William Pegg
* Description: Solution to Unit 07 Program 2
* * Due: 07/28/2015

* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class Unit07_Prog2  extends JFrame {
	
	    public Unit07_Prog2(){
		
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2,2));
		JButton jbtButton1 = new JButton("Button 1");
		JButton jbtButton2 = new JButton("Button 2");
		JButton jbtButton3 = new JButton("Button 3");
		p1.add(jbtButton1);
		p1.add(jbtButton2);
		p1.add(jbtButton3);
		p1.setBorder(new TitledBorder("Panel 1"));
		
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2,2));
		JButton jbtButton4 = new JButton("Button 4");
		JButton jbtButton5 = new JButton("Button 5");
		JButton jbtButton6 = new JButton("Button 6");
		p2.add(jbtButton4);
		p2.add(jbtButton5);
		p2.add(jbtButton6);
		p2.setBorder(new TitledBorder("Panel 2"));
		
		
		setLayout(new GridLayout(2,1,1,1));
		add(p1);
		add(p2);
		
		
		Button1 listener1 = new Button1();
		Button2 listener2 = new Button2();
		Button3 listener3 = new Button3();
		Button4 listener4 = new Button4();
		Button5 listener5 = new Button5();
		Button6 listener6 = new Button6();
		
	
		jbtButton1.addActionListener(listener1 );
		jbtButton2.addActionListener(listener2 );
		jbtButton3.addActionListener(listener3 );
		jbtButton4.addActionListener(listener4 );
		jbtButton5.addActionListener(listener5 );
		jbtButton6.addActionListener(listener6 );
		
	}
// main method
	public static void main(String[] args) {
		
		JFrame frame = new Unit07_Prog2();
		frame.setTitle("Unit07_Prog2");
		frame.setSize(300,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

// listener classes, and process events for the buttons 

class Button1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("The user pressed  Button 1");
		
	}
}

class Button2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("The user pressed  Button 2");
	}
}

class Button3 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("The user pressed  Button 3");
	}
}

class Button4 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("The user pressed  Button 4");
	}
}

class Button5 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("The user pressed  Button 5");
	}
}

class Button6 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("The user pressed  Button 6");
	}
}


