import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class withdraw_result {

	private JFrame frmwithdrawresult;
	static JLabel lbl_result = new JLabel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					withdraw_result window = new withdraw_result();
					window.frmwithdrawresult.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public withdraw_result() {
		initialize();
	}

	private void initialize() {
		frmwithdrawresult = new JFrame();
		frmwithdrawresult.getContentPane().setBackground(SystemColor.activeCaption);
		frmwithdrawresult.setTitle("WITHDRAWAL");
		frmwithdrawresult.setBounds(100, 100, 660, 245);
		frmwithdrawresult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmwithdrawresult.getContentPane().setLayout(null);

		JLabel lblbalance = new JLabel("Your current balance is ");
		lblbalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblbalance.setBounds(12, 13, 284, 58);
		frmwithdrawresult.getContentPane().add(lblbalance);
		lbl_result.setHorizontalAlignment(SwingConstants.LEFT);

		lbl_result.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_result.setBounds(283, 13, 284, 58);
		frmwithdrawresult.getContentPane().add(lbl_result);

		JButton button_1 = new JButton("OK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				select_tran.main(null);
				frmwithdrawresult.setVisible(false);
			}
		});
		button_1.setForeground(new Color(0, 128, 0));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(211, 142, 190, 43);
		frmwithdrawresult.getContentPane().add(button_1);
	}

	public static void function(double z) {
		//System.out.println(z);
		lbl_result.setText("$ " + Double.toString(z));

	}

}
