

import java.awt.EventQueue; //to manage and process events in an asynchronous, non-blocking way
import javax.swing.JFrame; //used to create a window.
import javax.swing.JPanel; //a container that can store a group of components
import javax.swing.border.EmptyBorder; //A class which provides an empty, transparent border which takes up space but does no drawing.
import javax.swing.JButton; //the JButton class is used to create a labeled button
import javax.swing.JLabel; //It is used to display a single line of read only text.
import javax.swing.JTextField; //JTextField class is a text component that allows the editing of a single line text.
import java.awt.Font; //There are four styles for displaying fonts in Java: plain, bold, italic, and bold italic.
import javax.swing.JRadioButton; //to create a radio button
import javax.swing.JCheckBox;// A check box is a graphical component that can be in either an "on" ( true ) or "off" ( false ) state
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	JLabel lblInfo;  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { //run is the method name and uses void as the return type, which does not have any arguments
				try {
					MyFirstFrame frame = new MyFirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();   // It prints several lines in the output console
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstFrame() {
		setTitle("Demo Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 424, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOK = new JButton("OK");
btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textName.getText();
				int age=Integer.parseInt(textAge.getText());
				if(age>=18)
					lblInfo.setText(n + "You are Eligible to Vote");
				else
					lblInfo.setText(n + " You are not Eligible to Vote");
			}
		});

		btnOK.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOK.setBounds(93, 246, 85, 21);
		contentPane.add(btnOK);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
				lblInfo.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(278, 246, 85, 21);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(36, 27, 111, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(36, 58, 85, 21);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.BOLD, 13));
		textName.setBounds(182, 28, 175, 19);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.BOLD, 13));
		textAge.setBounds(182, 58, 175, 19);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		lblInfo = new JLabel(""); // 
		lblInfo.setBounds(93, 277, 297, 38);
		contentPane.add(lblInfo);
		
		JLabel lblgender = new JLabel("Gender");
		lblgender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblgender.setBounds(36, 103, 68, 21);
		contentPane.add(lblgender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(36, 126, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(36, 149, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(47, 206, 123, 21);
		contentPane.add(chckbxNewCheckBox);
	}
}
 
