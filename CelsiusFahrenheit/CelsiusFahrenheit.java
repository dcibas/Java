import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CelsiusFahrenheit extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		
	CelsiusFahrenheit celsiusfahrenheit = new CelsiusFahrenheit();
	celsiusfahrenheit.setSize(600, 200);
	celsiusfahrenheit.setVisible(true);
	 
	}
	
	public CelsiusFahrenheit() {
		
		super("Celsius & Fahrenheit");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel("Celsius");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel label2 = new JLabel("Fahrenheit");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextField textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);

		JButton button1 = new JButton("Convert celsius to farenheit");
		JButton button2 = new JButton("Convert fahrenheit to celsius");
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				
				try {
					
					Double Celsius = Double.valueOf(textField1.getText());
					
					Double Farenheit = (Celsius * 1.8) + 32;
				
					textField2.setText(String.valueOf(Farenheit));
				}
				
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Invalid format");
					
				}			
				
			}
			
		});
		
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				
				try {
				
				Double Fahrenheit = Double.valueOf(textField2.getText());
				
				Double Celsius = (Fahrenheit - 32) /1.8;
			
				textField1.setText(String.valueOf(Celsius));
				
				}
				
				catch(NumberFormatException e) {
					
					JOptionPane.showMessageDialog(null, "Invalid format");
					
				}
				
			}
			
		});

		panel.add(label1);
		panel.add(label2);
		
		panel.add(textField1);
		panel.add(textField2);
		
		panel.add(button1);
		panel.add(button2);
		
		setContentPane(panel);
		
	}

}