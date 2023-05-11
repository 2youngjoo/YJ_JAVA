package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Quiz extends JFrame implements ActionListener{
	// 필드
	JTextField inputMsg;
	JTextField inputMsg2;
	JLabel label;
	
	// 생성자
	public Quiz(String title) {
		super(title);
		// 초기 위치와 크기 설정
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// 문자 열을 한 줄 입력 할 수 있는 JTextField 객체 2개 생성
		// JButton 4개 생성
		inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("+");
		JButton sendBtn2 = new JButton("-");
		JButton sendBtn3 = new JButton("*");
		JButton sendBtn4 = new JButton("/");
		inputMsg2 = new JTextField(10);
		
		// 문자 열을 단순히 출력할 수 있는 JLabel 객체
		label = new JLabel("="+"0");
				
		// 함수 형태로 액션 리스너를 등록
		sendBtn.addActionListener((e)->{
			Double msg = Double.parseDouble(inputMsg.getText());
			Double msg2 = Double.parseDouble(inputMsg2.getText());
			
			double result = msg + msg2;
			
			JOptionPane.showMessageDialog(this, msg);
			label.setText(String.valueOf(result));
		});
		
		sendBtn2.addActionListener((e)->{
			Double msg = Double.parseDouble(inputMsg.getText());
			Double msg2 = Double.parseDouble(inputMsg2.getText());
			
			double result = msg - msg2;
			
			JOptionPane.showMessageDialog(this, msg);
			label.setText(String.valueOf(result));
		});
		
		sendBtn3.addActionListener((e)->{
			Double msg = Double.parseDouble(inputMsg.getText());
			Double msg2 = Double.parseDouble(inputMsg2.getText());
			
			double result = msg * msg2;
			
			JOptionPane.showMessageDialog(this, msg);
			label.setText(String.valueOf(result));
		});
		
		sendBtn4.addActionListener((e)->{
			Double msg = Double.parseDouble(inputMsg.getText());
			Double msg2 = Double.parseDouble(inputMsg2.getText());
			
			double result = msg / msg2;
			
			JOptionPane.showMessageDialog(this, msg);
			label.setText(String.valueOf(result));
					
		});
		
		// 프레임에 UI를 추가한다.
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(sendBtn3);
		add(sendBtn4);
		add(inputMsg2);
		add(label);
		
		// 버튼에 action Listener 설정하기
		sendBtn.setActionCommand("this");
		sendBtn2.setActionCommand("this");
		sendBtn3.setActionCommand("this");
		sendBtn4.setActionCommand("this");

		// 버튼에 action command 설정하기
		
		
		// UI를 모두 배치하고 나중에 호출하는 것이 원칙이다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Quiz("계산기");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력한 문자 열 읽어오기
		
		// 눌러진 버튼의 command 읽어오기
		String cmd=e.getActionCommand();
		
		// 연산의 결과 값을 담을 변수를 미리 선언하고 초기 값 대입하기(왜 미리 선언해야하나?를 알아야함)
		double result=0;
		
		// command가 무엇이냐를 확인해서 분기 하기

		// 숫자를(double) 문자열(String)로 바꾸기
		String resultText=Double.toString(result);
		
		// 결과 값을 JLabel에 출력하기
		
	}
}