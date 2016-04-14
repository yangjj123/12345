
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;


public class MainFrame extends javax.swing.JFrame {

	public MainFrame() {
		initComponents();
	}

	public double[] Money = new double[100];
	public double[] Sum = new double[100];
	public double[] Year = new double[100];
	public double[] Rate = new double[100];
	private int input = 0;

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		inputBox1 = new javax.swing.JTextField();
		compoundButton = new javax.swing.JButton();
		simpleButton = new javax.swing.JButton();
		investButton = new javax.swing.JButton();
		exitButton = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		inputBox2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		inputBox3 = new javax.swing.JTextField();
		calculateButton = new javax.swing.JButton();
		clearButton = new javax.swing.JButton();
		checkButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		printoutBox = new javax.swing.JTextArea();
		inputBox4 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		presetButton = new javax.swing.JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u672c\u91d1(\u5143)\uff1a");

		compoundButton.setText("Compound\u590d\u5229");
		compoundButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				compoundButtonActionPerformed(evt);
			}
		});

		simpleButton.setText("Simple\u5355\u5229");
		simpleButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				simpleButtonActionPerformed(evt);
			}
		});

		investButton.setText("Invest\u6295\u8d44");
		investButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				investButtonActionPerformed(evt);
			}
		});

		exitButton.setText("Exit\u9000\u51fa");
		exitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitButtonActionPerformed(evt);
			}
		});

		jLabel2.setText("\u5e74\u9650(\u5e74)\uff1a");

		jLabel3.setText("\u5229\u7387(%)\uff1a");

		calculateButton.setText("Calculate\u8ba1\u7b97");
		calculateButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				calculateButtonActionPerformed(evt);
			}
		});

		clearButton.setText("Clear\u6e05\u7a7a");
		clearButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearButtonActionPerformed(evt);
			}
		});

		checkButton.setText("Check\u67e5\u770b\u5386\u53f2\u8bb0\u5f55");
		checkButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkButtonActionPerformed(evt);
			}
		});
		
		
		// TODO
		presetButton.setText("Preset预设值");
		presetButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				presetButtonActionPerformed(evt);
			}
		});

		printoutBox.setColumns(20);
		printoutBox.setEditable(false);
		printoutBox.setRows(5);
		jScrollPane1.setViewportView(printoutBox);

		jLabel4.setText("\u7ec8\u503c(\u5143)\uff1a");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jLabel4))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						inputBox3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						183,
																						Short.MAX_VALUE)
																				.addComponent(
																						inputBox1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						183,
																						Short.MAX_VALUE)
																				.addComponent(
																						inputBox2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						183,
																						Short.MAX_VALUE)
																				.addComponent(
																						inputBox4,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						183,
																						Short.MAX_VALUE))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(39,
																										39,
																										39)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(10,
																																		10,
																																		10)
																																.addComponent(
																																		clearButton))
																												.addComponent(
																														calculateButton)))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										checkButton))
																										//TODO
																										.addGroup(
																												layout.createSequentialGroup()
																														.addGap(32,
																																32,
																																32)
																														.addComponent(
																																presetButton))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(310,
																		310,
																		310)
																.addComponent(
																		investButton))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		compoundButton)
																.addGap(45, 45,
																		45)
																.addComponent(
																		simpleButton)))
								.addGap(21, 21, 21))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(21, Short.MAX_VALUE)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										409,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(
						layout.createSequentialGroup().addGap(181, 181, 181)
								.addComponent(exitButton)
								.addContainerGap(184, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(43, 43, 43)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(compoundButton)
												.addComponent(simpleButton)
												.addComponent(investButton))
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		calculateButton)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		clearButton)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(			//TODO
																		checkButton).addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(
																						presetButton))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						inputBox1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(10, 10,
																		10)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						inputBox2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						inputBox4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						inputBox3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel4))))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										236,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(exitButton)
								.addGap(27, 27, 27)));

		pack();
	}// </editor-fold>
		// GEN-END:initComponents
		// GEN-END:initComponents

	private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		double money = 0; // InputBox1
		double sum = 1; // InputBox3
		float rate = 0; // InputBox4
		double year = 0; // InputBox2

		// 算终值
		if (inputBox3.getText().equals("") && inputBox1.getText() != null
				&& inputBox4.getText() != null && inputBox2.getText() != null) {
			try {
				rate = Float.parseFloat(inputBox4.getText());
				money = Double.parseDouble(inputBox1.getText());
				year = Double.parseDouble(inputBox2.getText());
			} catch (Exception e2) {
				// TODO: handle exception
				rate = 0;
				money = 0;
				year = 0;
			}

			for (int i = 1; i <= year; i++) {
				sum = sum * (1 + rate / 100);
			}
			inputBox3.setText("" + (float) (Math.round((money * sum) * 100))
					/ 100);
			Sum[input] = (Math.round((money * sum) * 100)) / 100;// sum;
			Year[input] = year;
			Money[input] = money;
			Rate[input] = rate;
			input += 1;

		}

		// 算年限
		else if (inputBox2.getText().equals("") && inputBox1.getText() != null
				&& inputBox4.getText() != null && inputBox3.getText() != null) {

			try {
				rate = Float.parseFloat(inputBox4.getText());
				money = Double.parseDouble(inputBox1.getText());
				sum = Double.parseDouble(inputBox3.getText());
			} catch (Exception e2) {
				rate = 0;
				money = 0;
				sum = 0;
			}
			year = (int) ((Math.log(sum) / Math.log(1 + rate / 100)) - (Math
					.log(money) / Math.log(1 + rate / 100)));
			inputBox2.setText("" + year);
			Sum[input] = sum;
			Year[input] = year;
			Money[input] = money;
			Rate[input] = rate;
			input += 1;
		}

		// 算利率
		else if (inputBox4.getText().equals("") && inputBox1.getText() != null
				&& inputBox2.getText() != null && inputBox3.getText() != null) {

			try {
				year = Double.parseDouble(inputBox2.getText());
				money = Double.parseDouble(inputBox1.getText());
				sum = Double.parseDouble(inputBox3.getText());
			} catch (Exception e2) {
				year = 0;
				money = 0;
				sum = 0;
			}
			rate = (float) ((Math.pow(sum / money, 1.0 / year)) - 1);
			inputBox4.setText("" + rate * 100);
			Sum[input] = sum;
			Year[input] = year;
			Money[input] = money;
			Rate[input] = (Math.round((rate * 100) * 100)) / 100;
			;
			input += 1;
		}

		else if (inputBox3.getText() != null && inputBox1.getText() != null
				&& inputBox4.getText() != null && inputBox2.getText() != null) {
			JOptionPane.showMessageDialog(null, "请删除其中一个数据！");
		}
	}

	private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO Clear清空
		try {
			inputBox1.setText("");
			inputBox2.setText("");
			inputBox4.setText("");
			inputBox3.setText("");
		} catch (NullPointerException e2) {
		}
	}

	private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// Check
		String string = "\t\t往期记录\n  本金\t" + "存期\t"+"利率\t" + "终值\t" + "\n";
		for (int i = 0; i < input; i++) {
			string = string + Money[i] +"\t"+ Year[i] +"\t"+Rate[i]+"%"+ "\t" + Sum[i]
					+ "\n";
		}
		printoutBox.setText(string);
	
	}
	
	
	private void presetButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO  preset
		try {
			inputBox1.setText("1000000");
			inputBox2.setText("30");
			inputBox4.setText("");
			inputBox3.setText("");
		} catch (NullPointerException e2) {
		}
		
	}

	private void investButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// Invest投资

		jLabel1.setText("投资金额(元)：");
		jLabel2.setText("投资年限(年)：");
		jLabel3.setText("利率(%)：");
		jLabel4.setText("资产总值(元)：");

	}

	private void simpleButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// Simple单利
		jLabel1.setText("本金(元)：");
		jLabel2.setText("存期(年)：");
		jLabel3.setText("利率(%)：");
		jLabel4.setText("单利终值(元)：");

	}

	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// Exit退出
		System.exit(0);
	}

	private void compoundButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// Compound复利
		jLabel1.setText("本金(元)：");
		jLabel2.setText("存期(年)：");
		jLabel3.setText("利率(%)：");
		jLabel4.setText("复利终值(元)：");

	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	private javax.swing.JButton calculateButton;
	private javax.swing.JButton checkButton;
	private javax.swing.JButton clearButton;
	private javax.swing.JButton compoundButton;
	private javax.swing.JButton simpleButton;
	private javax.swing.JButton investButton;
	private javax.swing.JButton exitButton;
	private javax.swing.JButton presetButton;
	
	private javax.swing.JTextField inputBox1;
	private javax.swing.JTextField inputBox2;
	private javax.swing.JTextField inputBox3;
	private javax.swing.JTextField inputBox4;
	
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea printoutBox;
	

}