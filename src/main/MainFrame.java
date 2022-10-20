package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class MainFrame {

	private JFrame frmWordCounter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmWordCounter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordCounter = new JFrame();
		frmWordCounter.setTitle("Word Counter");
		frmWordCounter.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
		frmWordCounter.getContentPane().setBackground(new Color(0, 96, 142));
		frmWordCounter.setResizable(false);
		frmWordCounter.setBounds(100, 100, 500, 525);
		frmWordCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordCounter.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("WORD COUNTER");
		titleLabel.setBackground(new Color(255, 255, 255));
		titleLabel.setForeground(new Color(246, 246, 246));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		titleLabel.setBounds(83, 22, 320, 32);
		frmWordCounter.getContentPane().add(titleLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 98, 428, 208);
		frmWordCounter.getContentPane().add(scrollPane);
		
		JTextArea wordsTextArea = new JTextArea();
		wordsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		wordsTextArea.setLineWrap(true);
		scrollPane.setViewportView(wordsTextArea);
		wordsTextArea.setBackground(new Color(243, 243, 243));
		
		JLabel enterLable = new JLabel("Enter text:");
		enterLable.setForeground(new Color(255, 255, 255));
		enterLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		enterLable.setBounds(29, 73, 77, 24);
		frmWordCounter.getContentPane().add(enterLable);
		
		JLabel wordsLabel = new JLabel("# of words:");
		wordsLabel.setForeground(new Color(255, 255, 255));
		wordsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wordsLabel.setBounds(39, 316, 88, 24);
		frmWordCounter.getContentPane().add(wordsLabel);
		
		JLabel charsLabel = new JLabel("# of chars:");
		charsLabel.setForeground(new Color(255, 255, 255));
		charsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		charsLabel.setBounds(39, 350, 88, 24);
		frmWordCounter.getContentPane().add(charsLabel);
		
		JLabel nWordsLabel = new JLabel("0");
		nWordsLabel.setForeground(new Color(255, 255, 255));
		nWordsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nWordsLabel.setBounds(147, 316, 179, 24);
		frmWordCounter.getContentPane().add(nWordsLabel);
		
		JLabel nCharsLabel = new JLabel("0");
		nCharsLabel.setForeground(new Color(255, 255, 255));
		nCharsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nCharsLabel.setBounds(147, 350, 179, 24);
		frmWordCounter.getContentPane().add(nCharsLabel);
		
		JButton countBtn = new JButton("Get Count");
		countBtn.setForeground(new Color(255, 255, 255));
		countBtn.setBackground(new Color(0, 61, 89));
		countBtn.setOpaque(true);
		countBtn.setBorderPainted(false);
		countBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		countBtn.setBounds(176, 410, 133, 42);
		frmWordCounter.getContentPane().add(countBtn);
	}
}
