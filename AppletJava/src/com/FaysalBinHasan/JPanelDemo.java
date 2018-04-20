package com.FaysalBinHasan;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPanelDemo extends JFrame implements ActionListener {
	JPanel emp_panel;
	JLabel el1, el2, el3;
	JTextField et1, et2;
	JPasswordField et3;

	JPanel dept_panel;
	JLabel dl1, dl2, dl3;
	JTextField dt1, dt2;
	JPasswordField dt3;
	JButton ebutton1, ebutton2;
	
	public JPanelDemo() {
		el1 = new JLabel("Enter id ");
		el2 = new JLabel("Enter name ");
		el3 = new JLabel("Enter password ");

		et1 = new JTextField(12);
		et2 = new JTextField(12);
		et3 = new JPasswordField(12);
		ebutton1 = new JButton("Send");
		ebutton2 = new JButton("reset");
		ebutton1.addActionListener(this);
		ebutton2.addActionListener(this);
		

		JLabel emp_label = new JLabel("Employee Information");
		emp_label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));

		emp_label.setForeground(Color.red);

		emp_panel = new JPanel(new GridLayout(5, 2));
		emp_panel.add(emp_label);
		emp_panel.add(new JLabel());

		emp_panel.add(el1);
		emp_panel.add(et1);
		emp_panel.add(el2);
		emp_panel.add(et2);
		emp_panel.add(el3);
		emp_panel.add(et3);
		emp_panel.add(ebutton1);
		
		emp_panel.add(ebutton2);
		
		emp_panel.setBackground(Color.CYAN);

		add(emp_panel, "North");

		dl1 = new JLabel("Enter id ");
		dl2 = new JLabel("Enter name ");
		dl3 = new JLabel("Enter password ");

		dt1 = new JTextField(12);
		dt2 = new JTextField(12);
		dt3 = new JPasswordField(12);

		JLabel dept_label = new JLabel("Department Information");
		dept_label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));

		dept_label.setForeground(Color.red);

		dept_panel = new JPanel(new GridLayout(4, 2));
		dept_panel.add(dept_label);
		dept_panel.add(new JLabel());

		dept_panel.add(dl1);
		dept_panel.add(dt1);
		dept_panel.add(dl2);
		dept_panel.add(dt2);
		dept_panel.add(dl3);
		dept_panel.add(dt3);

		dept_panel.setBackground(Color.CYAN);

		add(dept_panel, "South");

		setVisible(true);
		setSize(300, 350);
		setLocation(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JPanelDemo();
	}

	public void actionPerformed(ActionEvent e) {
		String s1, s2, s3;
		s1 = et1.getText();
		s2 = et2.getText();
		s3 = et3.getText();
		if (s1.isEmpty()) {

			JOptionPane.showMessageDialog(this, "id is empty");

		} else if (s2.isEmpty()) {

			JOptionPane.showMessageDialog(this, "name is empty");
		} else if (s3.isEmpty()) {

			JOptionPane.showMessageDialog(this, "password is empty");
		} else{
			new EmpInfo(s1, s2);
			//new DeptInfo(s1, s2);
			this.dispose();
		}
	}

}
