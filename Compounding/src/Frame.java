import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Frame extends JFrame {

	// 设置界面宽高
	int centerX;
	int centerY;

	// 初始化菜单栏
	private JMenuBar menu = new JMenuBar();
	private JButton compound = new JButton("Compounding(复利)");
	private JButton loan = new JButton("Simple(单利)");
	private JButton invest = new JButton("Invest(投资)");
	private JButton exit = new JButton("Exit(退出)");
	private JComboBox jb1=new JComboBox();
	

	public Frame() {
		setTitle("多功能复利计算器");
		MyPanel mp = new MyPanel(); // 图片面板类
		menu.add(compound);
		menu.add(loan);
		menu.add(invest);
		menu.add(exit);
		menu.add(jb1);		

		// 添加图片面板到顶层容器
		add(mp);
		setJMenuBar(menu);
		MyItemListener list = new MyItemListener(); // 设置监听器
		compound.addActionListener(list);
		exit.addActionListener(list);
		loan.addActionListener(list);
		invest.addActionListener(list);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 结束进程

		centerX = Toolkit.getDefaultToolkit().getScreenSize().width;
		centerY = Toolkit.getDefaultToolkit().getScreenSize().height;

		// x：组件在容器X轴上的起点 y：组件在容器Y轴上的起点 width：组件的长度 height：组件的宽度
		setBounds(centerX / 4, centerY / 5, centerX / 2, centerY / 2);
		setResizable(false); // 改变窗体
		setVisible(true);

	}

	private class MyItemListener implements ActionListener// 处理事件
	{
		public void actionPerformed(ActionEvent e) {
			Object bj = e.getSource(); // 获得事件源
			Object jb1 = e.getSource(); 
			if (jb1 == compound) {
				new Compound();
			} else if (bj == loan) {
				// new Credit();
				new Simple();
			} else if (bj == invest) {
				// new Invest();
			} else if (bj == exit) // 若是点击结束按钮，则退出登录界面
				System.exit(0);
		}

	}

	private class MyPanel extends JPanel {

		// 写了一个带参数的构造方法.但又想让这个类在没有参数的情况下也能实例化,构造空的构造方法用作反射，Java内部会有调用，一般都通过反射实现，
		public MyPanel() {
		}

		protected void paintComponent(Graphics g) // 重写绘画组件方法
		{
			ImageIcon imgIcon = new ImageIcon("image/welcom.jpg");
			Image img = imgIcon.getImage();
			g.drawImage(img, 0, 0, getSize().width, getSize().height, this);// 100,50,null);
		}
	}

	public static void main(String[] args) {
		new Frame();
	}

}
