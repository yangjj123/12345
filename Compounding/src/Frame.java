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

	// ���ý�����
	int centerX;
	int centerY;

	// ��ʼ���˵���
	private JMenuBar menu = new JMenuBar();
	private JButton compound = new JButton("Compounding(����)");
	private JButton loan = new JButton("Simple(����)");
	private JButton invest = new JButton("Invest(Ͷ��)");
	private JButton exit = new JButton("Exit(�˳�)");
	private JComboBox jb1=new JComboBox();
	

	public Frame() {
		setTitle("�๦�ܸ���������");
		MyPanel mp = new MyPanel(); // ͼƬ�����
		menu.add(compound);
		menu.add(loan);
		menu.add(invest);
		menu.add(exit);
		menu.add(jb1);		

		// ���ͼƬ��嵽��������
		add(mp);
		setJMenuBar(menu);
		MyItemListener list = new MyItemListener(); // ���ü�����
		compound.addActionListener(list);
		exit.addActionListener(list);
		loan.addActionListener(list);
		invest.addActionListener(list);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ��������

		centerX = Toolkit.getDefaultToolkit().getScreenSize().width;
		centerY = Toolkit.getDefaultToolkit().getScreenSize().height;

		// x�����������X���ϵ���� y�����������Y���ϵ���� width������ĳ��� height������Ŀ��
		setBounds(centerX / 4, centerY / 5, centerX / 2, centerY / 2);
		setResizable(false); // �ı䴰��
		setVisible(true);

	}

	private class MyItemListener implements ActionListener// �����¼�
	{
		public void actionPerformed(ActionEvent e) {
			Object bj = e.getSource(); // ����¼�Դ
			Object jb1 = e.getSource(); 
			if (jb1 == compound) {
				new Compound();
			} else if (bj == loan) {
				// new Credit();
				new Simple();
			} else if (bj == invest) {
				// new Invest();
			} else if (bj == exit) // ���ǵ��������ť�����˳���¼����
				System.exit(0);
		}

	}

	private class MyPanel extends JPanel {

		// д��һ���������Ĺ��췽��.���������������û�в����������Ҳ��ʵ����,����յĹ��췽���������䣬Java�ڲ����е��ã�һ�㶼ͨ������ʵ�֣�
		public MyPanel() {
		}

		protected void paintComponent(Graphics g) // ��д�滭�������
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
