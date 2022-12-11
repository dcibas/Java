package Services;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.lang3.time.DateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import Entities.Author;
import Entities.Book;
import Entities.BookWorm;
import Entities.Rent;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class LibraryCRUD {

	private JFrame frmLibraryCrud;
	private JTable table;
	private JTextField ID;
	private JTextField Personalcode;
	private JTextField Name;
	private JTextField Surname;
	private JTextField Age;
	private JTextField Dateofbirth;
	private JTextField Genre;
	private JTextField ISBN;
	private JTextField BookID;
	private JTextField ReaderID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryCRUD window = new LibraryCRUD();
					window.frmLibraryCrud.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryCRUD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryCrud = new JFrame();
		frmLibraryCrud.setTitle("Library CRUD");
		frmLibraryCrud.setBounds(100, 100, 847, 608);
		frmLibraryCrud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryCrud.setResizable(false);
		
		JButton Createbookworm = new JButton("Create Bookworm");
		Createbookworm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Createbookworm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				BookWormService bookwormService = new BookWormService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				BookWorm creatbookworm = new BookWorm(Long.valueOf(ID.getText()), Personalcode.getText(), Name.getText(), Surname.getText(), Integer.valueOf(Age.getText()));

				bookwormService.createBookWorm(session, creatbookworm);
				
				Object rowData[] = new Object[10];
				 rowData[0] = ID.getText();
				 rowData[1] = Personalcode.getText();
				 rowData[2] = Name.getText();
				 rowData[3] = Surname.getText();
				 rowData[4] = Age.getText();
				 model.addRow(rowData);
				
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		ID = new JTextField();
		ID.setColumns(10);
		
		JLabel IDLabel = new JLabel("ID");
		IDLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel PersonalcodeLabel = new JLabel("Personal code");
		PersonalcodeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		Personalcode = new JTextField();
		Personalcode.setColumns(10);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		Name = new JTextField();
		Name.setColumns(10);
		
		Surname = new JTextField();
		Surname.setColumns(10);
		
		JLabel SurnameLabel = new JLabel("Surname");
		SurnameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel AgeLabel = new JLabel("Age");
		AgeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		Age = new JTextField();
		Age.setColumns(10);
		
		JButton Createauthor = new JButton("Create Author");
		Createauthor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Createauthor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				AuthorService authorService = new AuthorService();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    Date date = null;
				try {
					date = new SimpleDateFormat("yyyy-MM-dd").parse(Dateofbirth.getText());
				} catch (ParseException e1) {
					e1.printStackTrace();
				}  
			    
				Author createauthor = new Author(Long.valueOf(ID.getText()), Name.getText(), Surname.getText(), date);

				authorService.createAuthor(session, createauthor);
				
				Object rowData[] = new Object[10];
				 rowData[0] = ID.getText();
				 rowData[2] = Name.getText();
				 rowData[3] = Surname.getText();
				 rowData[5] = Dateofbirth.getText();
				 model.addRow(rowData);
				
			}
		});
		
		JLabel DateofbirthLabel = new JLabel("Date of birth");
		DateofbirthLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		Dateofbirth = new JTextField();
		Dateofbirth.setColumns(10);
		
		JButton Clear = new JButton("Clear");
		Clear.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 table.setModel(new DefaultTableModel(null,new String[]{"ID", "Personal code", "Name", "Surname", "Age", "Date of birth"}) {
				    		public boolean isCellEditable(int row, int column) {
				    	 return false;
				     }}
				    		 );
				}
			}
		);
		
		Genre = new JTextField();
		Genre.setColumns(10);
		
		JLabel GenreLabel = new JLabel("Genre");
		GenreLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		ISBN = new JTextField();
		ISBN.setColumns(10);
		
		JLabel ISBNLabel = new JLabel("ISBN");
		ISBNLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JButton Createbook = new JButton("Create Book");
		Createbook.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Createbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				LocalDate localDate = LocalDate.of(2016, 8, 19);                       
			    Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
				Book book = new Book(Long.valueOf(ID.getText()), Name.getText(), Genre.getText(), date, ISBN.getText());
				BookService bookService = new BookService();
				book = bookService.createBook(session, book);
				
				Object rowData[] = new Object[10];
				 rowData[0] = ID.getText();
				 rowData[2] = Name.getText();
				 rowData[6] = Genre.getText();
				 rowData[7] = ISBN.getText();				 
				 rowData[8] = book.getAuthors().get(0).getId();
				 rowData[9] = book.getId();
				 
				 model.addRow(rowData);
				
			}
		});
		
		JButton Createrent = new JButton("Create Rent");
		Createrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Createrent.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		BookID = new JTextField();
		BookID.setColumns(10);
		
		JLabel BookIDLabel = new JLabel("Book ID");
		BookIDLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		ReaderID = new JTextField();
		ReaderID.setColumns(10);
		
		JLabel ReaderIDLabel = new JLabel("Reader ID");
		ReaderIDLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		GroupLayout groupLayout = new GroupLayout(frmLibraryCrud.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(ISBN)
						.addComponent(Dateofbirth)
						.addComponent(IDLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(ID)
						.addComponent(NameLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(AgeLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(Age)
						.addComponent(Surname)
						.addComponent(Name)
						.addComponent(Personalcode)
						.addComponent(PersonalcodeLabel, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(DateofbirthLabel)
						.addComponent(SurnameLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(Genre)
						.addComponent(GenreLabel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addComponent(ISBNLabel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addComponent(BookIDLabel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addComponent(ReaderIDLabel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addComponent(BookID)
						.addComponent(ReaderID))
					.addGap(70)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Createauthor, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Createbookworm)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Createbook)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Createrent)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Clear)
							.addGap(29))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(IDLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(PersonalcodeLabel)
							.addGap(10)
							.addComponent(Personalcode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(NameLabel)
							.addGap(10)
							.addComponent(Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(SurnameLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Surname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(AgeLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(DateofbirthLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Dateofbirth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(GenreLabel)
							.addGap(8)
							.addComponent(Genre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(16)
							.addComponent(ISBNLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(BookIDLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BookID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ReaderIDLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ReaderID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(Createauthor)
								.addComponent(Clear)
								.addComponent(Createbookworm)
								.addComponent(Createbook)
								.addComponent(Createrent))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Personal code", "Name", "Surname", "Age", "Date of birth", "Genre", "ISBN", "Author ID", "Book ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, String.class, String.class, String.class, Long.class, Object.class, String.class, String.class, Long.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		frmLibraryCrud.getContentPane().setLayout(groupLayout);
	}
	
public void createBookWorm(Session session, BookWorm creatbookworm) {
		
		session.beginTransaction();
		session.save(creatbookworm);
		session.flush();
		session.getTransaction().commit();	
		
		
	}

public void createAuthor(Session session, Author createauthor) {
	
	session.beginTransaction();
	session.save(createauthor);
	session.flush();
	session.getTransaction().commit();	
	
	
	}

public Book createBook(Session session, Book createbook) {
	
	AuthorService authorService = new AuthorService();
   
    List<Author> authors = authorService.getAuthorsList(session);
    
    createbook.setAuthors(new ArrayList<Author>(Arrays.asList(authors.get(0))));
    
   // author.setBooks(new ArrayList<Book>(Arrays.asList(books.get(0))));
    
    session.beginTransaction();
	session.save(createbook);
	session.flush();
	session.getTransaction().commit();
	
	return createbook;
    
  }

public void createRentAgreement(Session session) {
	
	session.beginTransaction();
	BookService bookService = new BookService();
	BookWormService bookwormService = new BookWormService();
	Date now = new Date();
	Date endDate = DateUtils.addMonths(now, 1);
	
	Scanner sc = new Scanner(System.in);
	
	Rent rent = new Rent();
	List<Book> books = bookService.getBookList(session);
	for(Book book : books) {
		System.out.println(book.getId() + " " + book.getName() + " " + book.getGenre() + " " + book.getReleaseDate() + " " + book.getIsbn());
	}
	System.out.println("Which book does this user want to rent? (Book ID)");
	Long bookID = sc.nextLong();
	List<BookWorm> bookWorms = bookwormService.getBookWormsList(session);

	for(BookWorm bookworm : bookWorms) {
		System.out.println(bookworm.getId() + " " + bookworm.getPersonalCode() + " " + bookworm.getName() + " " + bookworm.getSurname() + " " + bookworm.getAge());
	}
	System.out.println("For which reader do you want to make an agreement? (Reader ID)");
	Long bookwormID = sc.nextLong();
	
	rent.setBook(bookService.getBookID(session, bookID));
	rent.setBookWorm(bookwormService.getBookWormID(session, bookwormID));
	rent.setStartDate(now);
	rent.setEndDate(endDate);
	
	
	session.save(rent);
	session.getTransaction().commit();
	
	}
}
