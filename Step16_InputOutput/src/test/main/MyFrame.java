package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField textStr;
	
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		textStr = new JTextField(10);
		JButton  save = new JButton("저장");
		
		textStr.addActionListener(this);
		save.addActionListener(this);
		
		add(textStr);
		add(save);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("저장");
	}
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		System.out.println("텍스트가 저장 됐습니다!");
		String msg=textStr.getText();
		File f=new File("c:/acorn202304/myFolder/diary.txt");
		
		try { 
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("diary.txt 파일만듬");
			}
			
			FileWriter fw=new FileWriter(f);
			
			fw.write(msg);
			fw.flush();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
