//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lady4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	//private JTextField textField_1;
	private JPasswordField PasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lady4 frame = new lady4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public lady4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP !\\Pictures\\old lady78.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" login portal");
		lblNewLabel.setBounds(76, 59, 475, 75);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(242, 261, 229, 40);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(textField);
		textField.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(242, 386, 229, 40);
		PasswordField.setFont(new Font("Tahoma", Font.BOLD, 22));
		PasswordField.setColumns(10);
		contentPane.add(PasswordField);
		
		JLabel lblNewLabel_1 = new JLabel("USENAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(60, 265, 167, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setBounds(64, 394, 187, 20);
		contentPane.add(lblNewLabel_2);
	lady p=new lady  ();
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String un=textField.getText();
				@SuppressWarnings("deprecation")
				String pass=PasswordField.getText();
				if(un.equals("rohit@123") && pass.equals("rohit@12"))
				{
					//JOptionPane.showMessageDialog(null,"login is sucessful");
					p.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login or password");
				}
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(225, 498, 135, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\old lady78.jpg"));
		lblNewLabel_3.setBounds(-25, 0, 968, 639);
		contentPane.add(lblNewLabel_3);
	}
}
