package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void main(String[] args) {
		JFrame frmWordCounter = new JFrame();
		
		JLabel titleLabel = new JLabel("WORD COUNTER");
		titleLabel.setBackground(new Color(255, 255, 255));
		titleLabel.setForeground(new Color(246, 246, 246));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		titleLabel.setBounds(146, 22, 304, 54);
		frmWordCounter.getContentPane().add(titleLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 115, 537, 233);
		frmWordCounter.getContentPane().add(scrollPane);
		
		final JTextArea wordsTextArea = new JTextArea();
		wordsTextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		wordsTextArea.setLineWrap(true);
		scrollPane.setViewportView(wordsTextArea);
		wordsTextArea.setBackground(new Color(243, 243, 243));
		
		JLabel enterLable = new JLabel("Enter text:");
		enterLable.setForeground(new Color(255, 255, 255));
		enterLable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		enterLable.setBounds(32, 88, 77, 24);
		frmWordCounter.getContentPane().add(enterLable);
		
		JLabel wordsLabel = new JLabel("# of words:");
		wordsLabel.setForeground(new Color(255, 255, 255));
		wordsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wordsLabel.setBounds(39, 408, 88, 24);
		frmWordCounter.getContentPane().add(wordsLabel);
		
		JLabel charsLabel = new JLabel("# of characters:");
		charsLabel.setForeground(new Color(255, 255, 255));
		charsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		charsLabel.setBounds(39, 443, 113, 24);
		frmWordCounter.getContentPane().add(charsLabel);
		
		final JLabel nWordsLabel = new JLabel("0");
		nWordsLabel.setForeground(new Color(255, 255, 255));
		nWordsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nWordsLabel.setBounds(135, 408, 179, 24);
		frmWordCounter.getContentPane().add(nWordsLabel);
		
		final JLabel nCharsLabel = new JLabel("0");
		nCharsLabel.setForeground(new Color(255, 255, 255));
		nCharsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nCharsLabel.setBounds(162, 443, 179, 24);
		frmWordCounter.getContentPane().add(nCharsLabel);
		
		JButton countBtn = new JButton("Get Count");
		countBtn.setForeground(new Color(255, 255, 255));
		countBtn.setBackground(new Color(0, 61, 89));
		countBtn.setOpaque(true);
		countBtn.setBorderPainted(false);
		countBtn.setFont(new Font("Arial", Font.PLAIN, 20));
		countBtn.setBounds(216, 478, 164, 46);
		frmWordCounter.getContentPane().add(countBtn);
		
		frmWordCounter.setTitle("Word Counter");
		frmWordCounter.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
		frmWordCounter.getContentPane().setBackground(new Color(0, 96, 142));
		frmWordCounter.setResizable(false);
		frmWordCounter.setBounds(100, 100, 613, 600);
		frmWordCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordCounter.getContentPane().setLayout(null);
		
		JLabel parsLabel = new JLabel("# of paragraphs:");
		parsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		parsLabel.setForeground(new Color(255, 255, 255));
		parsLabel.setBounds(39, 371, 133, 24);
		frmWordCounter.getContentPane().add(parsLabel);
		
		final JLabel nParsLabel = new JLabel("0");
		nParsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nParsLabel.setForeground(new Color(255, 255, 255));
		nParsLabel.setBounds(172, 371, 179, 24);
		frmWordCounter.getContentPane().add(nParsLabel);
		frmWordCounter.setVisible(true);
		
		countBtn.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				String words = wordsTextArea.getText();  
				
				String[] numCounts = getCount(words);
				
				nParsLabel.setText(numCounts[0]);
				nWordsLabel.setText(numCounts[1]);
				nCharsLabel.setText(numCounts[2]);
			}  
		});  
	}
	
	static String[] getCount(String words) {
		String[] arrStr = {"0", "0", "0"};
		if ("".equals(words)) {
			return arrStr;
		}
		
		String[] wordsStr = words.split("\\s");
		Integer wordCount = 0;
		Integer parCount = 1;
		Integer charCount = words.split("").length;
		
		for (String word : wordsStr) {
			wordCount++;
			if("".equals(word)) {
				parCount++;
			}
		}
		wordCount = wordCount - (parCount - 1);
		
		arrStr[0] = parCount.toString();
		arrStr[1] = wordCount.toString();
		arrStr[2] = charCount.toString();
		
		return arrStr;
	}
}