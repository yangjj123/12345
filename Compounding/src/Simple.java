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

	// 标签
	private JLabel JLabel1; // 投资金额
	private JLabel JLabel2; // 投入时间
	private JLabel JLabel3; // 期末价值
	private JLabel JLabel4; // 基金公司
	private JLabel JLabel5; // 基金名称
	private JLabel JLabel6; // 期间回报

	// 输入框
	private JTextField InputBox1; // 投资金额
	private JTextField InputBox2; // 投入时间
	private JTextField InputBox3; // 期末价值
	private JTextField InputBox4; // 回报率

	// 按钮
	private JButton JButton1; // 计算
	private JButton JButton2; // 清除
	private JButton JButton3; // 查看往期投资

	// 下拉列表框
	private JComboBox jb1;
	private JComboBox jb2;

	// 按钮存放容器
	private JPanel toolbar = new JPanel();

	// 多行文本区域，用于输出往期投资数据
	private JTextArea jtextArea;

	public double[] Money = new double[100];
	public double[] Sum = new double[100];
	public double[] Year = new double[100];
	public double[] Rate = new double[100];
	private int input = 0;

	public Simple() {
		CreateWindows();// 创建窗口
		CreateComponent();// 创建零件
		LayoutComponent();// 零件布局
		MouseLinsten(); // 鼠标监听
		InitjtextArea(); // 初始化空白文本区域
	}

	private void CreateWindows() {
		// 创建一个窗口
		int Windowswidth = 300;
		int Windowsheight = 430;
		setVisible(true);
		setSize(Windowswidth, Windowsheight);
		setResizable(false);
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		setLocation((width - Windowswidth) / 2, (height - Windowsheight) / 2); // 窗口居中
		setTitle("多功能复利计算器");
	}

	private void CreateComponent() {
		JLabel1 = new JLabel("本金(元)");
		JLabel2 = new JLabel("存期(年)");
		JLabel3 = new JLabel("回报终值");
		JLabel4 = new JLabel("公司");
		JLabel5 = new JLabel("基金名称");
		JLabel6 = new JLabel("利率(%)");

		InputBox1 = new JTextField(10);
		InputBox2 = new JTextField(10);
		InputBox3 = new JTextField(10);
		InputBox4 = new JTextField(10);

		JButton1 = new JButton("计算");
		JButton2 = new JButton("清空数据");
		JButton3 = new JButton("查看历史记录");

		jb1 = new JComboBox();
		jb2 = new JComboBox();

		jtextArea = new JTextArea();
	}

	private void LayoutComponent() {

		setLayout(new FlowLayout());
		// 五个面板容器 一个标签对应一个输入输出框
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

		Object[] types = { "复利计算", "单利计算", "C公司", "D公司", "E公司" };
		DefaultComboBoxModel model = new DefaultComboBoxModel((Object[]) types);
		jb1.setModel(model);

		Object[] types2 = { "A基金 ", "B基金 ", "C基金 ", "D基金" };
		DefaultComboBoxModel model2 = new DefaultComboBoxModel((Object[]) types2);
		jb2.setModel(model2);

		JPanel jpanel5 = new JPanel();
		jpanel5.add(JLabel5);
		jpanel5.add(jb2);

		JPanel jpanel6 = new JPanel();
		jpanel6.add(JLabel6);
		jpanel6.add(InputBox4);

		JPanel centerpanel = new JPanel(new GridLayout(3, 1)); // 3行1列

		// 上三
		centerpanel.add(jpanel1);
		centerpanel.add(jpanel2);
		centerpanel.add(jpanel6);

		// 中间三个按钮
		toolbar.add(JButton1);
		toolbar.add(JButton2);
		toolbar.add(JButton3);

		// 设置可滚动条文本输出框
		JScrollPane text = new JScrollPane(jtextArea);
		text.setPreferredSize(new Dimension(280, 150));

		add(jpanel4, BorderLayout.CENTER);
		add(jpanel5, BorderLayout.CENTER);
		add(centerpanel, BorderLayout.CENTER); // 居中
		add(toolbar, BorderLayout.CENTER);

		add(text);
		add(jpanel3, BorderLayout.CENTER);

	}

	private void MouseLinsten() {
		// 实例化私有鼠标点击类
		JButton1.addActionListener(new CalculateAction()); // 计算
		JButton2.addActionListener(new EraseAction()); // 清除
		JButton3.addActionListener(new CheckAction()); // 查看往期记录

	}

	public void InitjtextArea() {
		jtextArea.setEditable(false);// 设置文本框不能输入只能输出
	}

	private class CalculateAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double money = 0; // InputBox1
			double sum = 1; // InputBox3
			float rate = 0; // InputBox4
			double year = 0; // InputBox2

			// 算总利息
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

			// 算本金
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
				JOptionPane.showMessageDialog(null, "请删除其中一个数据！");
			}
			/*
			 * else { JOptionPane.showMessageDialog(null, "请输入数据"); }
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
			String outup = "复利本金" + "     存期"+"     利率" + "     计算终值" + "\n";
			for (int i = 0; i < input; i++) {
				outup = outup + Money[i] +"      "+ Year[i] +"      "+Rate[i]+"%"+ "       " + Sum[i]
						+ "\n";
			}
			jtextArea.setText(outup);
		}
	}

}