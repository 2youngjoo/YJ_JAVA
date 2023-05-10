package frame06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	// 필드 선언
	// 필드 = 메소드에서 필요한 값을 담고 있다.
	// 동일한 type인 경우 1줄에 선언할 수 있다.
	JButton sendBtn, deleteBtn, updateBtn;
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		
		// setBounds(x, y, width, height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		
		// 이프레임(MyFrame)의 x 버튼(close 버튼)을 눌렀을 때 프로세스도 같이 종료 되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());

		// 전송 버튼의 참조 값을 필드에 저장(this.은 생략 가능)
		this.sendBtn=new JButton("전송");
		add(sendBtn);

		this.deleteBtn=new JButton("삭제");
		add(deleteBtn);

		this.updateBtn=new JButton("수정");
		add(updateBtn);
		// 전송, 삭제, 수정 버튼 모두 다 하나의 리스터 등록하기
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드의 매개 변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어 있다.
		// 이 객체를 활용하면 어떤 버튼이 눌러 졌는지 구별할 수 있다.
		
		// e.getSource = 눌러진 Button의 참조 값이 Object type으로 리턴 된다!
		// 눌러진 버튼의 참조 값 얻어오기
		Object which = e.getSource();
		if(which == sendBtn) {
			// 전송 버튼을 누른 것이다.
			JOptionPane.showMessageDialog(this, "전송합니다.");
		}else if(which == deleteBtn) {
			JOptionPane.showMessageDialog(this, "삭제합니다.");	
		}else if(which == updateBtn) {
			JOptionPane.showMessageDialog(this, "수정합니다.");	
		}
	}
}
