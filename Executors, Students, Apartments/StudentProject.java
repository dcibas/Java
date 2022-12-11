package maventest;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentProject extends JPanel {
	
	private JTable table;
	
	StudentService studentService = new StudentService();
	
	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	public StudentProject() {
		
		JButton btnNewButton = new JButton("Scan Student List");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Student> allStudents = studentService.readSudentsList(session);
				for(Student student : allStudents) {
					System.out.println(student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
				}
			}
		});
		
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 37, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -28, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -466, SpringLayout.EAST, this);
		setLayout(springLayout);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update Student");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 25, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -318, SpringLayout.EAST, this);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			//	studentService.updateStudentById(session, 4L, null);
					
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Student");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 22, SpringLayout.EAST, btnNewButton_1);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add Student");
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -20, SpringLayout.WEST, btnNewButton_3);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 473, SpringLayout.WEST, this);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton_4);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, 545, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_4, -30, SpringLayout.EAST, this);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Student Data");
		lblNewLabel.setForeground(Color.BLUE);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_4, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 21, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 373, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -275, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 37, SpringLayout.WEST, this);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		add(lblNewLabel);
		
		table = new JTable();
		springLayout.putConstraint(SpringLayout.NORTH, table, 21, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, table, -38, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.WEST, table, 330, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, table, -30, SpringLayout.EAST, this);
		add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, table);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, btnNewButton);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 17, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, btnNewButton);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Surname");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 20, SpringLayout.SOUTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, btnNewButton);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Course");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 22, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, btnNewButton);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, -2, SpringLayout.NORTH, table);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 3, SpringLayout.NORTH, lblNewLabel_2);
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 3, SpringLayout.NORTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 22, SpringLayout.EAST, lblNewLabel_3);
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, lblNewLabel_4);
		textField_3.setColumns(10);
		add(textField_3);

	}
}
