import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Simple extends JFrame {

	// ��ǩ
	private JLabel JLabel1; // Ͷ�ʽ��
	private JLabel JLabel2; // Ͷ��ʱ��
	private JLabel JLabel3; // ��ĩ��ֵ
	private JLabel JLabel4; // ����˾
	private JLabel JLabel5; // ��������
	private JLabel JLabel6; // �ڼ�ر�

	// �����
	private JTextField InputBox1; // Ͷ�ʽ��
	private JTextField InputBox2; // Ͷ��ʱ��
	private JTextField InputBox3; // ��ĩ��ֵ
	private JTextField InputBox4; // �ر���

	// ��ť
	private JButton JButton1; // ����
	private JButton JButton2; // ���
	private JButton JButton3; // �鿴����Ͷ��

	// �����б��
	private JComboBox jb1;
	private JComboBox jb2;

	// ��ť�������
	private JPanel toolbar = new JPanel();

	// �����ı����������������Ͷ������
	private JTextArea jtextArea;

	public double[] Money = new double[100];
	public double[] Sum = new double[100];
	public double[] Year = new double[100];
	public double[] Rate = new double[100];
	private int input = 0;

	public Simple() {
		CreateWindows();// ��������
		CreateComponent();// �������
		LayoutComponent();// �������
		MouseLinsten(); // ������
		InitjtextArea(); // ��ʼ���հ��ı�����
	}

	private void CreateWindows() {
		// ����һ������
		int Windowswidth = 300;
		int Windowsheight = 430;
		setVisible(true);
		setSize(Windowswidth, Windowsheight);
		setResizable(false);
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width - Windowswidth) / 2, (height - Windowsheight) / 2); // ���ھ���
		setTitle("�๦�ܸ���������");
	}

	private void CreateComponent() {
		JLabel1 = new JLabel("����(Ԫ)");
		JLabel2 = new JLabel("����(��)");
		JLabel3 = new JLabel("�ر���ֵ");
		JLabel4 = new JLabel("��˾");
		JLabel5 = new JLabel("��������");
		JLabel6 = new JLabel("����(%)");

		InputBox1 = new JTextField(10);
		InputBox2 = new JTextField(10);
		InputBox3 = new JTextField(10);
		InputBox4 = new JTextField(10);

		JButton1 = new JButton("����");
		JButton2 = new JButton("�������");
		JButton3 = new JButton("�鿴��ʷ��¼");

		jb1 = new JComboBox();
		jb2 = new JComboBox();

		jtextArea = new JTextArea();
	}

	private void LayoutComponent() {

		setLayout(new FlowLayout());
		// ���������� һ����ǩ��Ӧһ�����������
		JPanel jpanel1 = new JPanel();
		jpanel1.add(JLabel1);
		jpanel1.add(InputBox1);

		JPanel jpanel2 = new JPanel();
		jpanel2.add(JLabel2);
		jpanel2.add(InputBox2);

		JPanel jpanel3 = new JPanel();
		jpanel3.add(JLabel3);
		jpanel3.add(InputBox3);

		JPanel jpanel4 = new JPanel();
		jpanel4.add(JLabel4);
		jpanel4.add(jb1);

		Object[] types = { "��������", "��������", "C��˾", "D��˾", "E��˾" };
		DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) types);
		jb1.setModel(model);

		Object[] types2 = { "A���� ", "B���� ", "C���� ", "D����" };
		DefaultComboBoxModel model2 = new DefaultComboBoxModel((Object[]) types2);
		jb2.setModel(model2);

		JPanel jpanel5 = new JPanel();
		jpanel5.add(JLabel5);
		jpanel5.add(jb2);

		JPanel jpanel6 = new JPanel();
		jpanel6.add(JLabel6);
		jpanel6.add(InputBox4);

		JPanel centerpanel = new JPanel(new GridLayout(3, 1)); // 3��1��

		// ����
		centerpanel.add(jpanel1);
		centerpanel.add(jpanel2);
		centerpanel.add(jpanel6);

		// �м�������ť
		toolbar.add(JButton1);
		toolbar.add(JButton2);
		toolbar.add(JButton3);

		// ���ÿɹ������ı������
		JScrollPane text = new JScrollPane(jtextArea);
		text.setPreferredSize(new Dimension(280, 150));

		add(jpanel4, BorderLayout.CENTER);
		add(jpanel5, BorderLayout.CENTER);
		add(centerpanel, BorderLayout.CENTER); // ����
		add(toolbar, BorderLayout.CENTER);

		add(text);
		add(jpanel3, BorderLayout.CENTER);

	}

	private void MouseLinsten() {
		// ʵ����˽���������
		JButton1.addActionListener(new CalculateAction()); // ����
		JButton2.addActionListener(new EraseAction()); // ���
		JButton3.addActionListener(new CheckAction()); // �鿴���ڼ�¼

	}

	public void InitjtextArea() {
		jtextArea.setEditable(false);// �����ı���������ֻ�����
	}

	private class CalculateAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double money = 0; // InputBox1
			double sum = 1; // InputBox3
			float rate = 0; // InputBox4
			double year = 0; // InputBox2

			// ������Ϣ
			if (InputBox3.getText().equals("") && InputBox1.getText() != null
					&& InputBox4.getText() != null
					&& InputBox2.getText() != null) {
				try {
					rate = Float.parseFloat(InputBox4.getText());
					money = Double.parseDouble(InputBox1.getText());
					year = Double.parseDouble(InputBox2.getText());
				} catch (Exception e2) {
					rate = 0;
					money = 0;
					year = 0;
				}

				sum = (float) (money * year * (rate/100));
				InputBox3.setText(""
						+ sum);
				Sum[input] = (Math.round(sum * 100)) / 100;//sum;
				Year[input] = year;
				Money[input] = money;
				Rate[input]=rate;
				input += 1;

			}

			// �㱾��
			else if (InputBox1.getText().equals("")
					&& InputBox2.getText() != null
					&& InputBox4.getText() != null
					&& InputBox3.getText() != null) {

				try {
					rate = Float.parseFloat(InputBox4.getText());
					year = Double.parseDouble(InputBox2.getText());
					sum = Double.parseDouble(InputBox3.getText());
				} catch (Exception e2) {
					rate = 0;
					year = 0;
					sum = 0;
				}
				money = (float) (sum / (1 + year * (rate/100)));
				InputBox1.setText("" + money);
				Sum[input] = sum;
				Year[input] = year;
				Money[input] = money;
				Rate[input]=rate;
				input += 1;
			}


			else if (InputBox3.getText() != null && InputBox1.getText() != null
					&& InputBox4.getText() != null
					&& InputBox2.getText() != null) {
				JOptionPane.showMessageDialog(null, "��ɾ������һ�����ݣ�");
			}
			/*
			 * else { JOptionPane.showMessageDialog(null, "����������"); }
			 */
		}
	}

	private class EraseAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				InputBox1.setText("");
				InputBox2.setText("");
				InputBox4.setText("");
				InputBox3.setText("");
			} catch (NullPointerException e2) {
			}
		}
	}

	private class CheckAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String outup = "��������" + "     ����"+"     ����" + "     ������ֵ" + "\n";
			for (int i = 0; i < input; i++) {
				outup = outup + Money[i] +"      "+ Year[i] +"      "+Rate[i]+"%"+ "       " + Sum[i]
						+ "\n";
			}
			jtextArea.setText(outup);
		}
	}

}