package 算法;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreenShot extends JFrame implements ActionListener{
	JButton button1,button2;
	JPanel panel1,panel2;
	BufferedImage image;
	
	
	public ScreenShot() {
		super("抓取");
		setBounds(600,400,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);
		
		button1 = new JButton("抓取图片");
		button2 = new JButton("保存图片");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		panel1.add(button1);
		panel1.add(button2);
		
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		
		validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			takeImage();
		}
		if(e.getSource() == button2) {
			File file = new File("E://shot.jpg");
			try {
				ImageIO.write(image, "JPEG", file);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void takeImage() {
		try {
			Robot robot = new Robot();
			Toolkit toolkit = getToolkit().getDefaultToolkit();
			Rectangle rect = new Rectangle(0, 0,toolkit.getScreenSize().width,toolkit.getScreenSize().height);
			this.setVisible(false);
			image = robot.createScreenCapture(rect);
			this.setVisible(true);
			repaint();
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ScreenShot();
	}
	

}
