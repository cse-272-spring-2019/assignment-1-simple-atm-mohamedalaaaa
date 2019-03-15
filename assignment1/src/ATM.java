import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class ATM {

	private JFrame frmAtm;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM window = new ATM();
					window.frmAtm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ATM() {
		initialize();
	}

	private void initialize() {
		frmAtm = new JFrame("ATM MACHINE");
		frmAtm.getContentPane().setBackground(SystemColor.activeCaption);
		frmAtm.setTitle("ATM ");
		frmAtm.setBounds(100, 100, 679, 330);
		frmAtm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAtm.getContentPane().setLayout(null);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(12, 13, 50, 50);
		frmAtm.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(97, 13, 50, 50);
		frmAtm.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(178, 13, 50, 50);
		frmAtm.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(12, 76, 50, 50);
		frmAtm.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(97, 76, 50, 50);
		frmAtm.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(178, 76, 50, 50);
		frmAtm.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn7.getText();
				textField.setText(EnterNum);

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(12, 139, 50, 50);
		frmAtm.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(97, 139, 50, 50);
		frmAtm.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(178, 139, 50, 50);
		frmAtm.getContentPane().add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(12, 202, 50, 50);
		frmAtm.getContentPane().add(btn0);

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
		textField.setBounds(297, 97, 306, 73);
		frmAtm.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("ENTER YOUR PIN NUMBER.");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(297, 53, 306, 50);
		frmAtm.getContentPane().add(lblNewLabel);

		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.BLACK);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(97, 202, 131, 50);
		frmAtm.getContentPane().add(btnClear);

		JButton btnDone = new JButton("CONFIRM");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pin = textField.getText();

				if (pin.contentEquals("1234")) { /*************** ACCOUNT PIN NUMBER "1234" ********************/
					textField.setText(null);
					select_tran.main(null);
					frmAtm.setVisible(false);

				} else {
					textField.setText(null);
					JOptionPane.showMessageDialog(null, "Invalid Pin Number.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnDone.setForeground(new Color(0, 128, 0));
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDone.setBounds(380, 183, 131, 50);
		frmAtm.getContentPane().add(btnDone);

	}
}
