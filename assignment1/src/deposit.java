import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class deposit {

	private JFrame frmdeposit;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposit window = new deposit();
					window.frmdeposit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public deposit() {
		initialize();
	}

	private void initialize() {
		frmdeposit = new JFrame();
		frmdeposit.getContentPane().setBackground(SystemColor.activeCaption);
		frmdeposit.setTitle("DEPOSIT");
		frmdeposit.setBounds(100, 100, 735, 319);
		frmdeposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		frmdeposit.getContentPane().setLayout(null);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(12, 13, 50, 50);
		frmdeposit.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(97, 13, 50, 50);
		frmdeposit.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(178, 13, 50, 50);
		frmdeposit.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(12, 76, 50, 50);
		frmdeposit.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(97, 76, 50, 50);
		frmdeposit.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(178, 76, 50, 50);
		frmdeposit.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn7.getText();
				textField.setText(EnterNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(12, 139, 50, 50);
		frmdeposit.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(97, 139, 50, 50);
		frmdeposit.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(178, 139, 50, 50);
		frmdeposit.getContentPane().add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(12, 202, 50, 50);
		frmdeposit.getContentPane().add(btn0);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c =e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_DELETE))) {
				Toolkit.getDefaultToolkit().beep();
					e.consume();			
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 32));
		textField.setBounds(311, 88, 306, 38);
		frmdeposit.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(256, 3, 452, 76);
		frmdeposit.getContentPane().add(lblNewLabel);

		JButton button = new JButton("CLEAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(97, 202, 131, 50);
		frmdeposit.getContentPane().add(button);

		JButton button_1 = new JButton("CONFIRM");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
double pin = Integer.parseInt(textField.getText());
				if (pin<=5000) {
					double x = operations.main2(pin);
					deposit_result.function(x);
					//System.out.println(x);
					textField.setText(null);
					deposit_result.main(null);
					frmdeposit.setVisible(false);
				}
				else {
					textField.setText(null);
					JOptionPane.showMessageDialog(null, "Sorry,\r\n Maximum deposit $ 5000.", "ERROR", JOptionPane.ERROR_MESSAGE);

					
				}
				
					
			}
		});
		button_1.setForeground(new Color(0, 128, 0));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(405, 142, 131, 50);
		frmdeposit.getContentPane().add(button_1);

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select_tran.main(null);
				frmdeposit.setVisible(false);
			}
		});
		btnCancel.setForeground(new Color(220, 20, 60));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(502, 214, 189, 38);
		frmdeposit.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Maximum deposit $ 5000.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(311, 45, 256, 30);
		frmdeposit.getContentPane().add(lblNewLabel_1);
	}
}
