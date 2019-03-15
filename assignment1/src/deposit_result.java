import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class deposit_result {

	private JFrame frmdepositrsult;
	static JLabel lblresult = new JLabel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposit_result window = new deposit_result();
					window.frmdepositrsult.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public deposit_result() {
		initialize();
	}

	private void initialize() {
		frmdepositrsult = new JFrame();
		frmdepositrsult.getContentPane().setBackground(SystemColor.activeCaption);
		frmdepositrsult.setTitle("DEPOSIT");
		frmdepositrsult.setBounds(100, 100, 681, 281);
		frmdepositrsult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmdepositrsult.getContentPane().setLayout(null);

		JLabel label = new JLabel("Your current balance is ");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(12, 13, 284, 58);
		frmdepositrsult.getContentPane().add(label);

		lblresult.setHorizontalAlignment(SwingConstants.LEFT);
		lblresult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblresult.setBounds(283, 13, 284, 58);
		frmdepositrsult.getContentPane().add(lblresult);

		JButton button_1 = new JButton("OK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select_tran.main(null);
				frmdepositrsult.setVisible(false);
			}
		});
		button_1.setForeground(new Color(0, 128, 0));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(232, 178, 190, 43);
		frmdepositrsult.getContentPane().add(button_1);
	}

	public static void function(double x) {

		//System.out.println(x);
		lblresult.setText("$ " + Double.toString(x));
	}

}
