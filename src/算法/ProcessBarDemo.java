package �㷨;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

public class ProcessBarDemo extends JFrame{
	private static final long serialVersionUID = 1L;
	private JProgressBar processBar;
 
	public ProcessBarDemo() {
 
		setUndecorated(true); // ȥ�����ڵ�װ��
		getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);// ����ָ���Ĵ���װ�η��
		setResizable(false);
		setTitle("��������"); // ���ô������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô����˳��Ĳ���
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // �õ���Ļ�ĳߴ�
		setBounds(screenSize.width / 2 - 200, screenSize.height / 2 - 100, 400, 100);// ���ô����λ�úʹ�С
		JPanel contentPane = new JPanel(); // �����������
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// �����������߿�
		setContentPane(contentPane);// Ӧ��(ʹ��)�������
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));// ����Ϊ��ʽ����
		processBar = new JProgressBar();// ����������
		processBar.setStringPainted(true);// ���ý������ϵ��ַ�����ʾ��false������ʾ
		processBar.setBackground(Color.darkGray);
		// processBar.setForeground(Color.RED);
		// �����߳���ʾ����
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(100); // �õ�ǰ�߳�����0.1ms
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					processBar.setValue(i); // ���ý�������ֵ
				}
				processBar.setString("���سɹ�");// ������ʾ��Ϣ
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				dispose();
			}
		}.start(); // �����������߳�
		contentPane.add(processBar);// �������ӽ��ȿؼ�
	}
 
	public static void main(String[] args) {
		ProcessBarDemo JPBD = new ProcessBarDemo();
		JPBD.setVisible(true);
	}


}
