package Services;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import Entities.Author;
import Entities.Book;
import Entities.BookWorm;
import Entities.Rent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Library {

	private JFrame frame;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library window = new Library();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Library() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Library info");
		frame.setBounds(100, 100, 979, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JButton btn1 = new JButton("Authors List");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
					Session session = sessionFactory.openSession();
					AuthorService authorService = new AuthorService();
					DefaultTableModel model = (DefaultTableModel) table.getModel();

					List<Author> authors = authorService.getAuthorsList(session);
					Object rowData[] = new Object[14];
					for(Author author : authors) {
				     // JOptionPane.showMessageDialog(null, author.getId() + " " + author.getName() + " " + author.getSurname() + " " + author.getDateOfBirth());
						rowData[0] = author.getId();
						rowData[1] = author.getName();
						rowData[2] = author.getSurname();
						rowData[3] = author.getDateOfBirth();
						model.addRow(rowData);
					}
					
				     // for(Author author : authors) {
				     //      System.out.println("Author " + author.getName() + " " + author.getSurname() + " has written books ");
				     // for(Book book : author.getBooks()) {
				     //      System.out.println(book.getName());
				     //	     rowData[1] = author.getName();
				     //	     rowData[2] = author.getSurname();
				     //      rowData[12] = book.getName();
				     //      model.addRow(rowData);

				     //   }
				     //  }
				     // }

				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
				
				}
				
			}
		});
		
		JButton btn2 = new JButton("Books List");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				BookService bookService = new BookService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				List<Book> books = bookService.getBookList(session);
				Object rowData[] = new Object[7];
				
				for(Book book : books) {
					// JOptionPane.showMessageDialog(null, book.getId() + " " + book.getName() + " " + book.getGenre() + " " + book.getReleaseDate() + " " + book.getIsbn());
					rowData[0] = book.getId();
					rowData[1] = book.getName();
					rowData[4] = book.getGenre();
					rowData[5] = book.getReleaseDate();
					rowData[6] = book.getIsbn();
					model.addRow(rowData);
				  }
				
				}
				catch(Exception e1) {
					
				JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
					
			    }
			}
		});
		
		JButton btn3 = new JButton("Book Worms List");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				BookWormService bookWormService = new BookWormService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				List<BookWorm> bookWorms = bookWormService.getBookWormsList(session);
				Object rowData[] = new Object[10];

				for(BookWorm bookworm : bookWorms) {
					
			     // JOptionPane.showMessageDialog(null, bookworm.getId() + " " + bookworm.getPersonalCode() + " " + bookworm.getName() + " " + bookworm.getSurname() + " " + bookworm.getAge());
					
					rowData[0] = bookworm.getId();
					rowData[1] = bookworm.getName();
					rowData[2] = bookworm.getSurname();
					rowData[7] = bookworm.getAge();
					rowData[8] = bookworm.getPersonalCode();
					model.addRow(rowData);
				     }
				}
				
				catch(Exception e1) {
					
				JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
				
			      }
			}
		});
		
		JButton btn4 = new JButton("Rents List");
		btn4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				RentService rentService = new RentService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				List<Rent> rents = rentService.getRentsList(session);
				Object rowData[] = new Object[14];

				for(Rent rent : rents) {
			     // JOptionPane.showMessageDialog(null, rent.getId() + " " + rent.getStartDate() + " " + rent.getEndDate() + " " + rent.getNotes() + " " + rent.getBook() + " " + rent.getBookWorm());
					rowData[0] = rent.getId();
					rowData[9] = rent.getStartDate();
					rowData[10] = rent.getEndDate();
					rowData[11] = rent.getNotes();
					rowData[12] = rent.getBook();
					rowData[13] = rent.getBookWorm();
					model.addRow(rowData);

					}
				}
				
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Error " + e1.getMessage());
					
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btn5 = new JButton("Clear");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 table.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Surname", "Date", "Genre", "Release Date", "ISBN", "Age", "Personal Code", "Start Date", "End Date", "Notes", "Book ID", "Bookworm ID"}) {
			    		public boolean isCellEditable(int row, int column) {
			    	 return false;
			     }}
			    		 );
			}
		});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btn5))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
									.addGap(17))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
										.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
									.addGap(18)))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 741, GroupLayout.PREFERRED_SIZE)))
					.addGap(24))
		);

		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(btn5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, 0, 0, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Surname", "Date", "Genre", "Release Date", "ISBN", "Age", "Personal Code", "Start Date", "End Date", "Notes", "Book ID", "Bookworm ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, Long.class, Object.class, Object.class, String.class, Integer.class, String.class, Object.class, Object.class, String.class, Long.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
	}
}
