import java.util.Scanner;

public class fuli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner caculate = new Scanner(System.in);
		int a = 0;
		while (a == 0) {
			System.out
					.println("请选择1/2/3/4/5/6：\n1.复利计算终值\n2.复利计算本金\n3.单利计算本息\n4.计算获取复利终值的年限\n5.计算报酬率\n6.每年或每月定期投资\n7.每月等额本息还款");
			int a1 = caculate.nextInt();
			if (a1 == 1) {
				fuli.CFutureValue();
				break;
			} else if (a1 == 2) {
				fuli.CPresentValue();
				break;
			}

			else if (a1 == 3) {
				fuli.PrincipalAndInterest();
				break;
			} else if (a1 == 4) {
				fuli.CYear();
				break;
			} else if (a1 == 5) {
				fuli.Rate();
				break;
			} else if (a1 == 6) {
				fuli.regular();
				break;
			} else if(a1==7){
				fuli.reimbursement();
				break;
			}
			else {

				System.out.println("\n您的输入错误,请重新选择：");
				a1 = a;
			}
		}
		System.out
				.println("\n感谢您的使用，希望下次再来，如果有什么建议可以向我提出，谢谢！\n          --by 杨晶晶");

	}

	// 1.复利计算终值
	static void CFutureValue() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入本金：");
		double PresentValue = fuli.nextDouble(); // 本金
		System.out.println("请输入存款年数：");
		int year = fuli.nextInt(); // 存钱年数
		System.out.println("请输入利率：");
		double r = fuli.nextDouble(); // 利率
		double FutureValue = 1;
		for (int i = 1; i <= year; i++) {
			FutureValue = (1 + r) * FutureValue;
		}
		System.out.println("总额为：" + (float)(Math.round(FutureValue * PresentValue*100))/100);
	}

	// 2.复利计算本金
	static void CPresentValue() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入终值：");
		double FutureValue = fuli.nextDouble(); // 复利终值
		System.out.println("请输入存款年数：");
		int year = fuli.nextInt(); // 存钱年数
		System.out.println("请输入利率：");
		double r = fuli.nextDouble(); // 利率
		double PresentValue = 1;
		for (int i = 1; i <= year; i++) {
			PresentValue = (1 + r) * PresentValue;
		}
		System.out.println("总额为：" + (float)(Math.round(FutureValue * (1 / PresentValue)*100))/100);
	}

	// 3.单利计算本息
	static void PrincipalAndInterest() {
		Scanner danli = new Scanner(System.in);
		System.out.println("请输入本金：");
		double PresentValue = danli.nextDouble(); // 本金
		System.out.println("请输入存款年数：");
		int year = danli.nextInt(); // 存钱年数
		System.out.println("请输入利率：");
		double r = danli.nextDouble(); // 利率
		double FutureValue = 1;
		FutureValue = (1 + r * year) * PresentValue;
		System.out.println("本息为：" + (float)(Math.round(FutureValue*100))/100);
	}

	// 4.计算年限
	static void CYear() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入本金：");
		double PresentValue = fuli.nextDouble(); // 本金
		System.out.println("请输入复利终值：");
		double FutureValue = fuli.nextInt(); // 复利终值
		System.out.println("请输入利率：");
		double r = fuli.nextDouble(); // 报酬率
		int year = (int) ((Math.log(FutureValue) / Math.log(1 + r)) - (Math
				.log(PresentValue) / Math.log(1 + r)));
		System.out.println("所需年限为：" + year);

	}

	// 5.计算报酬率
	static void Rate() {
		Scanner fuli = new Scanner(System.in);
		int a = 0;
		while (a == 0) {
			System.out.println("是否选择计算翻倍：\n1、翻倍\n2、不翻倍");
			int a1 = fuli.nextInt();
			if (a1 == 2) {
				System.out.println("请输入本金：");
				double PresentValue = fuli.nextDouble(); // 本金
				System.out.println("请输入复利终值：");
				double FutureValue = fuli.nextInt(); // 复利终值
				System.out.println("请输入存款年数：");
				int year = fuli.nextInt(); // 存钱年数
				double r = (Math.pow(FutureValue / PresentValue, 1.0 / year)) - 1;
				System.out.println("年利率为：" + (float)(Math.round(r*100))/100);
				break;
			} else if (a1 == 1) {
				System.out.println("请输入几年后：");
				int year = fuli.nextInt();
				System.out.println("翻几番：");
				int FutureValue = fuli.nextInt();
				double r = 72.0 / (year / FutureValue); // 72法则
				System.out.println(year + "年后本金翻倍的年利率至少为：" + (float)(Math.round(r*100))/100+"%");
				break;
			} else {
				System.out.println("\n您的输入错误，请重新选择");
				a1 = a;
			}
		}

	}

	// 6.计算按每年或每月定期投资的终值
	static void regular() {
		Scanner fuli = new Scanner(System.in);
		int a = 0;
		while (a == 0) {
			System.out.println("请选择\n1.按年投资\n2.按月投资");
			int a1 = fuli.nextInt();
			if (a1 == 1) {
				System.out.println("要投资的本金：");
				double P = fuli.nextDouble();
				System.out.println("获得的年回报率：");
				double r = fuli.nextDouble();
				System.out.println("投资年限(年)：");
				double Y = fuli.nextInt();

				double F = P * (Math.pow(1 + r, Y) - 1) / r;
				System.out.println("按年投资的年金终值为：" + (float)(Math.round(F*100))/100);

				break;
			}

			else if (a1 == 2) {
				System.out.println("要投资的本金：");
				double P = fuli.nextDouble();
				System.out.println("获得的月回报率：");
				double r = fuli.nextDouble();
				System.out.println("投资年限(月)：");
				double Y = fuli.nextInt();
				double F = P * (Math.pow(1 + r / 12.0, Y * 12) - 1) / (r / 12);
				System.out.println("按月投资的年金终值为：" + (float)(Math.round(F*100))/100);
				break;
			} else {
				System.out.println("\n您的输入错误，请重新选择");
				a1 = a;
			}
		}

	}
	//7.每月等额本息还款
	//每月还款金额 = （贷款本金 / 还款月数）+（本金 — 已归还本金累计额）×每月利率
	//等额本息计算公式：〔贷款本金×月利率×（1＋月利率）＾还款月数〕÷〔（1＋月利率）＾还款月数－1〕
	static void reimbursement() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入贷款本金：");
		double P = fuli.nextDouble(); // 贷款本金
		System.out.println("请输入还年限：");
		float Y = fuli.nextInt(); // 还款年限
		System.out.println("请输入年利率：");
		double r = fuli.nextDouble(); // 年利率
		
        double reimbursement=(P*(r/2)*Math.pow(1+(r/12), Y*12))/(Math.pow(1+(r/12),Y*12)-1);
		System.out.println("总额为：" + (float)(Math.round(reimbursement*100))/100);
	}

}
