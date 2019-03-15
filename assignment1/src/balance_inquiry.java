import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class balance_inquiry {

	private JFrame frmbalance;
	private JLabel label;
	private JLabel label_1;
	private JButton btnBack;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					balance_inquiry window = new balance_inquiry();
					window.frmbalance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public balance_inquiry() {
		initialize();
	}

	private void initialize() {
		frmbalance = new JFrame();
		frmbalance.getContentPane().setBackground(SystemColor.activeCaption);
		frmbalance.setTitle("BALANCE INQUIRY");
		frmbalance.setBounds(100, 100, 656, 234);
		frmbalance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmbalance.getContentPane().setLayout(null);

		label = new JLabel("Your current balance is ");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(12, 13, 284, 58);
		frmbalance.getContentPane().add(label);

		label_1 = new JLabel();
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(283, 13, 284, 58);
		frmbalance.getContentPane().add(label_1);
		double y = operations.main3();
		label_1.setText("$ " + Double.toString(y));

		btnBack = new JButton("OK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select_tran.main(null);
				frmbalance.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 128, 0));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(216, 131, 190, 43);
		frmbalance.getContentPane().add(btnBack);

	}
}
