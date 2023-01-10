package maventest;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
// import java.util.Scanner;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentService {
	
	private JFrame StudentService;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTable table;
	
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentService window = new StudentService();
					window.StudentService.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentService() {
		initialize();
	}
	
	private void initialize() {
		
		StudentService = new JFrame();
		StudentService.setTitle("Student Data");
		StudentService.setBounds(100, 100, 959, 373);
		StudentService.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StudentService.setResizable(false);
		
		JLabel ProgramName = new JLabel("Student Data");
		ProgramName.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel Label1 = new JLabel("ID");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		JLabel Label2 = new JLabel("Name");
		Label2.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		JLabel Label3 = new JLabel("Surname");
		Label3.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		
		JLabel Label4 = new JLabel("Course");
		Label4.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		textField4 = new JTextField();
		textField4.setColumns(10);
	
	// Table = new JTable();
	
	JButton Button1 = new JButton("Read List");
	Button1.setFont(new Font("Tahoma", Font.BOLD, 9));
	
	Button1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent actionEvent) {	
				
			try {	
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				StudentService studentService = new StudentService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				// Student readstudent = new Student(Long.valueOf(textField1.getText()), textField2.getText(), textField3.getText(), Integer.valueOf(textField4.getText()));
			    
				// studentService.readSudentsList(session);
				
				List<Student> allStudents = studentService.readSudentsList(session);
				Object rowData[] = new Object[4];
				for(Student student : allStudents) {
					// JOptionPane.showMessageDialog(null, student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
					rowData[0] = student.getId();
					rowData[1] = student.getCourse();
					rowData[2] = student.getName();
					rowData[3] = student.getSurname();
					model.addRow(rowData);
				}
				
			     // Query query = session.createQuery("FROM Student");
				
			     // List<Student> list = query.list();
				
			     // List<Student> students = studentService.getStudentByCourse(session, Integer.valueOf(textField4.getText()));
				
			     //	for(Student student : students) {
			     // JOptionPane.showMessageDialog(null, student.getId() + " " + student.getName() + " " + student.getSurname() + " " + student.getCourse());
			     // }
				
			   }
			
			catch(Exception e1) {
				
				// JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
				
				JOptionPane.showMessageDialog(null, "Error! No list found");
			
			}
			
		}
		
	});
	

	JButton Button2 = new JButton("Create Student");
	Button2.setFont(new Font("Tahoma", Font.BOLD, 9));
	
	Button2.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent actionEvent) {	
			
			try
			   {
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				StudentService studentService = new StudentService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				Student createstudent = new Student(Long.valueOf(textField1.getText()), textField2.getText(), textField3.getText(), Integer.valueOf(textField4.getText()));
				studentService.createStudent(session, createstudent);
				
				JOptionPane.showMessageDialog(null, "Student Added Successfully!");
				Object rowData[] = new Object[20];
				// JOptionPane.showMessageDialog(null, createstudent.getId() + " " + createstudent.getName() + " " + createstudent.getSurname() + " " + createstudent.getCourse());
				rowData[0] = textField1.getText();
				rowData[1] = textField4.getText();
				rowData[2] = textField2.getText();
				rowData[3] = textField3.getText();
				model.addRow(rowData);
				
			   }

			catch(Exception e1) {
				
			     // JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
				
				JOptionPane.showMessageDialog(null, "Error! Please fill in full info");
		
			}
		}
		
	});
	
	JButton Button4 = new JButton("Delete Student");
	Button4.setFont(new Font("Tahoma", Font.BOLD, 9));
	
	Button4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {			
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				StudentService studentService = new StudentService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				Student deletestudent = new Student(Long.valueOf(textField1.getText()), textField2.getText(), textField3.getText(), Integer.valueOf(textField4.getText()));
				studentService.deleteStudent(session, deletestudent);
				int i = table.getSelectedRow();
				model.removeRow(i);
				
				JOptionPane.showMessageDialog(null, "Student Deleted Successfully!");
				
			     // OptionPane.showMessageDialog(null, deletestudent.getId() + " " + deletestudent.getName() + " " + deletestudent.getSurname() + " " + deletestudent.getCourse());

			   }
			
			catch(Exception e1) {
				
			     // JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
				
				JOptionPane.showMessageDialog(null, "Error! Please fill in full info");
				
			}
		
		}
	});
	
	JButton Button3 = new JButton("Update Student");
	Button3.setFont(new Font("Tahoma", Font.BOLD, 9));
	
	Button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				StudentService studentService = new StudentService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				Student updatedstudent = new Student(Long.valueOf(textField1.getText()), textField2.getText(), textField3.getText(), Integer.valueOf(textField4.getText()));
				studentService.updateStudent(session, updatedstudent);
				
				JOptionPane.showMessageDialog(null, "Student Updated Successfully!");
				int i = table.getSelectedRow();
				model.setValueAt(textField1.getText(), i, 0);
				model.setValueAt(textField4.getText(), i, 1);
				model.setValueAt(textField2.getText(), i, 2);
				model.setValueAt(textField3.getText(), i, 3);
			     // OptionPane.showMessageDialog(null, updatedstudent.getId() + " " + updatedstudent.getName() + " " + updatedstudent.getSurname() + " " + updatedstudent.getCourse());

			   }
			
			catch(Exception e1) {
				
			     // JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
				
				JOptionPane.showMessageDialog(null, "Error! Please fill in full info");
				
			}
			
		}
	});
	
	JScrollPane scrollPane = new JScrollPane();
	
	JButton Button5 = new JButton("Clear");
	Button5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		     table.setModel(new DefaultTableModel(null, new String[]{"ID", "Course", "Name", "Surname"}) {
		    		public boolean isCellEditable(int row, int column) {
		    	 return false;
		     }}
		    		 );

		 	 textField1.setText("");
		 	 textField4.setText("");
		 	 textField2.setText("");
		 	 textField3.setText("");
		 
		}
	});
	
	Button5.setFont(new Font("Tahoma", Font.BOLD, 9));

		
	GroupLayout groupLayout = new GroupLayout(StudentService.getContentPane());
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGap(18)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(ProgramName)
						.addGap(740)
						.addComponent(Button5))
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(Button3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(Button4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(Button1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(Button2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(Label1)
									.addComponent(Label2)
									.addComponent(Label3)
									.addComponent(Label4))
								.addGap(20)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField4, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))))
						.addGap(18)
						.addComponent(scrollPane)))
				.addContainerGap())
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGap(10)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(ProgramName)
					.addComponent(Button5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(36)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(3)
								.addComponent(Label1)
								.addGap(10)
								.addComponent(Label2)
								.addGap(10)
								.addComponent(Label3)
								.addGap(12)
								.addComponent(Label4))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(4)
								.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(4)
								.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(Button1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addComponent(Button2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(Button3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addComponent(Button4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(18)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(33, Short.MAX_VALUE))
	);
	
	table = new JTable();
	table.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			int i = table.getSelectedRow();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			textField1.setText(model.getValueAt(i, 0).toString());
			textField4.setText(model.getValueAt(i, 1).toString());
			textField2.setText(model.getValueAt(i, 2).toString());
			textField3.setText(model.getValueAt(i, 3).toString());
		}
	});

	table.getAutoCreateRowSorter();
	table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"ID", "Course", "Name", "Surname"
		}
	) {
		Class[] columnTypes = new Class[] {
			Long.class, Integer.class, String.class, String.class
		};
		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
		boolean[] columnEditables = new boolean[] {
			false, false, false, false
		};
		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}
	});

	scrollPane.setViewportView(table);
		
	StudentService.getContentPane().setLayout(groupLayout);
	
}
		
	public void createStudent(Session session, Student createstudent) {
		
	     // Student Tom = new Student("TomEdited", "Edisonas", 3);
		
	     // Scanner sc = new Scanner(System.in);
	     // Student newStudent = new Student();

	     // System.out.println("Please enter a name for the new Student:");
	     // newStudent.setName(sc.nextLine());
	     // System.out.println("Enter a surname for the new Student:");
	     // newStudent.setSurname(sc.nextLine());
	     // System.out.println("Which course is the student in, right now? (1-5)");
	     // newStudent.setCourse(sc.nextInt());
		
		session.beginTransaction();
	     // session.save(Tom);
		session.save(createstudent);
		session.flush();
		session.getTransaction().commit();
		
		
	}
	
	public List<Student> readSudentsList(Session session) {
		
		List<Student> students = session.createQuery("from Student").list();
		
		return students;
		
	}
	
	public Student getStudentById(Session session, Long id) {
		
		Query query = session.createQuery("from Student where id = :id");
		query.setLong("id", id);
		Student studentas = (Student)query.uniqueResult();
		return studentas;
		
	}
	
	
	
	public List<Student> getStudentByCourse(Session session, Integer Course) {

		Query query = session.createQuery("from Student where Course = :Course");
		query.setInteger("Course", Course);
		List<Student> studentas = query.list();	
		return studentas;
		
	}
	
	public void deleteStudent(Session session, Student deletestudent) {

	
	     // Student studentas = getStudentById(session, id);
		
		session.beginTransaction();
		session.delete(deletestudent);
		session.getTransaction().commit();
	
	     // return studentas;
		
	}
	
	public void updateStudent(Session session, Student updatedstudent) {

		
	     // Student studentas = getStudentById(session, id);

	     // Scanner sc = new Scanner(System.in);

	     // System.out.println("Please enter a name for the new Student:");
	     // studentas.setName(sc.nextLine());
	     // System.out.println("Enter a surname for the new Student:");
	     // studentas.setSurname(sc.nextLine());
	     // System.out.println("Which course is the student in, right now? (1-5)");
	     // studentas.setCourse(sc.nextInt());
		
		session.beginTransaction();
		session.update(updatedstudent);
		session.getTransaction().commit();
		
	     // return updatedstudent;
		
	}
}
