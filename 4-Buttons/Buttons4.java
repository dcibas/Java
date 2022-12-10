import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

public class Buttons4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		
	Buttons4 buttons4 = new Buttons4();
	buttons4.setSize(400, 400);
	buttons4.setVisible(true);
	 
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		JButton button = (JButton) event.getSource();
        Integer counts = Integer.valueOf(button.getText());
        counts++;
        button.setText(counts.toString());
		
	}
	
	public Buttons4() {
		
		super("4 Buttons");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button1 = new JButton("0");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button1.addActionListener(this);
		JButton button2 = new JButton("0");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button2.addActionListener(this);
		JButton button3 = new JButton("0");
		button3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button3.addActionListener(this);
		JButton button4 = new JButton("0");
		button4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button4.addActionListener(this);
			
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		setContentPane(panel);
		
	}


}