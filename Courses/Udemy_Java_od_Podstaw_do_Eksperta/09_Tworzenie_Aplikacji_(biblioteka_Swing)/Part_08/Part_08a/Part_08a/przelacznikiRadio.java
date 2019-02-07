package Part_08a;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class przelacznikiRadio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					przelacznikiRadio frame = new przelacznikiRadio();
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
	public przelacznikiRadio() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JRadioButton malyPrzelacznik = new JRadioButton("Maly");
		contentPane.add(malyPrzelacznik, BorderLayout.NORTH);
		
		JRadioButton sredniPrzelacznik = new JRadioButton("Sredni");
		contentPane.add(sredniPrzelacznik, BorderLayout.CENTER);
		
		JRadioButton duzyPrzelacznik = new JRadioButton("Duzy");
		contentPane.add(duzyPrzelacznik, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Cos");
		contentPane.add(lblNewLabel, BorderLayout.EAST);
	}

}
