
/*
* Name: Amos Gichero
* Class: CIST 2371 Introduction to Java
* Quarter: Summer 2015
* Instructor: William Pegg
* Description: Solution to Unit 07 Program 1
* Due: 07/28/2015

* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*/


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Unit07_Prog1 extends JFrame {
	
	    public Unit07_Prog1() {
		
// Create panel 1 and the buttons
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2,2));
		JButton jbtButton1 = new JButton("Button 1");
		JButton jbtButton2 = new JButton("Button 2");
		JButton jbtButton3 = new JButton("Button 3");
		p1.add(jbtButton1);
		p1.add(jbtButton2);
		p1.add(jbtButton3);
		p1.setBorder(new TitledBorder("Panel 1"));
		
// Create panel 2 and the buttons
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2,2));
		JButton jbtButton4 = new JButton("Button 4");
		JButton jbtButton5 = new JButton("Button 5");
		JButton jbtButton6 = new JButton("Button 6");
		p2.add(jbtButton4);
		p2.add(jbtButton5);
		p2.add(jbtButton6);
		p2.setBorder(new TitledBorder("Panel 2"));
		
// Add panels to frame
		
		setLayout(new GridLayout(2,1,1,1));
		add(p1);
		add(p2);
		
	}
	public static void main(String[] args) {
		JFrame frame = new Unit07_Prog1();
		frame.setTitle("Unit07_Prog1");
		frame.setSize(300,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}


