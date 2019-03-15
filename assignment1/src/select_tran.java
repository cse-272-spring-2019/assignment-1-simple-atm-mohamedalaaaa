import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class select_tran {

	private JFrame frmselect;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					select_tran window = new select_tran();
					window.frmselect.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public select_tran() {
		initialize();
	}

	private void initialize() {
		frmselect = new JFrame();
		frmselect.getContentPane().setBackground(SystemColor.activeCaption);
		frmselect.setTitle("ATM");
		frmselect.setBounds(100, 100, 772, 433);
		frmselect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmselect.getContentPane().setLayout(null);

		JLabel label = new JLabel("Select your transaction.");
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBounds(25, 35, 365, 50);
		frmselect.getContentPane().add(label);

		JButton btnwithdraw = new JButton("Withdrawal");
		btnwithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawal.main(null);
				frmselect.setVisible(false);
			}
		});
		btnwithdraw.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnwithdraw.setBounds(402, 36, 256, 50);
		frmselect.getContentPane().add(btnwithdraw);

		JButton btndeposit = new JButton("Deposit");
		btndeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deposit.main(null);
				frmselect.setVisible(false);
			}
		});
		btndeposit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btndeposit.setBounds(402, 99, 256, 50);
		frmselect.getContentPane().add(btndeposit);

		JButton btnbalance = new JButton("Balance Inquiry");
		btnbalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balance_inquiry.main(null);
				frmselect.setVisible(false);
			}
		});
		btnbalance.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnbalance.setBounds(402, 162, 256, 50);
		frmselect.getContentPane().add(btnbalance);

		JButton button = new JButton("Log Out");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATM.main(null);
				frmselect.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 23));
		button.setBounds(45, 270, 156, 59);
		frmselect.getContentPane().add(button);
	}

}
