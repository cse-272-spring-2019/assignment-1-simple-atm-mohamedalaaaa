import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class withdrawal {

	private JFrame frmwithdraw;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					withdrawal window = new withdrawal();
					window.frmwithdraw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public withdrawal() {
		initialize();
	}

	private void initialize() {
		frmwithdraw = new JFrame();
		frmwithdraw.getContentPane().setBackground(SystemColor.activeCaption);
		frmwithdraw.setTitle("WITHDRAWAL");
		frmwithdraw.setBounds(100, 100, 718, 315);
		frmwithdraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		frmwithdraw.getContentPane().setLayout(null);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(12, 13, 50, 50);
		frmwithdraw.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(97, 13, 50, 50);
		frmwithdraw.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(178, 13, 50, 50);
		frmwithdraw.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(12, 76, 50, 50);
		frmwithdraw.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(97, 76, 50, 50);
		frmwithdraw.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(178, 76, 50, 50);
		frmwithdraw.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn7.getText();
				textField.setText(EnterNum);

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(12, 139, 50, 50);
		frmwithdraw.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(97, 139, 50, 50);
		frmwithdraw.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(178, 139, 50, 50);
		frmwithdraw.getContentPane().add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(12, 202, 50, 50);
		frmwithdraw.getContentPane().add(btn0);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE))) {
					Toolkit.getDefaultToolkit().beep();
					arg0.consume();
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 32));
		textField.setBounds(311, 92, 306, 41);
		frmwithdraw.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("ENTER THE AMOUNT YOU WANT TO WITHDRAW.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(240, 3, 452, 76);
		frmwithdraw.getContentPane().add(lblNewLabel);

		JButton btnclear = new JButton("CLEAR");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setForeground(Color.BLACK);
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnclear.setBounds(97, 202, 131, 50);
		frmwithdraw.getContentPane().add(btnclear);

		JButton btnconfirm = new JButton("CONFIRM");
		btnconfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pin = Integer.parseInt(textField.getText());
				if (pin <= 5000) {
					if (pin <= operations.balance) {
						double z = operations.main(pin);
						withdraw_result.function(z);
						// System.out.println(z);
						textField.setText(null);
						withdraw_result.main(null);
						frmwithdraw.setVisible(false);
					} else {
						textField.setText(null);
						JOptionPane.showMessageDialog(null,
								"Withdrawal amount is greater than\r\n" + " the current balance.", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					textField.setText(null);
					JOptionPane.showMessageDialog(null, "Sorry,\r\n Maximum withdrawal $ 5000.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnconfirm.setForeground(new Color(0, 128, 0));
		btnconfirm.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnconfirm.setBounds(401, 146, 131, 50);
		frmwithdraw.getContentPane().add(btnconfirm);

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select_tran.main(null);
				frmwithdraw.setVisible(false);
			}
		});
		btnCancel.setForeground(new Color(220, 20, 60));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(503, 211, 189, 38);
		frmwithdraw.getContentPane().add(btnCancel);

		JLabel label = new JLabel("Maximum withdrawal $ 5000.");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(311, 49, 256, 30);
		frmwithdraw.getContentPane().add(label);
	}

}
