import java.awt.*;
import javax.swing.*;
public class UseSplitPane extends JFrame{
	JTextArea textArea;
	JButton button[]=new JButton[5];
	JSplitPane jsp;
	
	public UseSplitPane(String s){
		super(s);
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		textArea=new JTextArea("�ı����������������ֵ�");
		JPanel panel=new JPanel();
		for (int i = 0; i < button.length; i++) {
			button[i]=new JButton("��ť"+(i+1));
				panel.add(button[i]);
		}
		panel.setBackground(Color.blue);
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, textArea,panel);
		container.add(jsp,BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		UseSplitPane useSplitPane=new UseSplitPane("���Դ���");
	}
}
