import java.util.Scanner;

public class fuli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner caculate = new Scanner(System.in);
		int a = 0;
		while (a == 0 || a == 1 || a == 2 || a == 3) {
			System.out.println("请选择1/2/3：\n1.复利计算终值2.复利计算本金3.单利计算本息");
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
			} else {
				System.out.println("\n您的输入错误");
				a1 = a;
			}
		}
	}

	// 复利计算终值
	static void CFutureValue() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入本金：");
		double PresentValue = fuli.nextDouble(); // 本金
		System.out.println("请输入存款年数：");
		int year = fuli.nextInt(); // 存钱年数
		System.out.println("请输入利率：");
		double r = fuli.nextDouble(); // 利率
		double sum = 1;
		for (int i = 1; i <= year; i++) {
			sum = (1 + r) * sum;
		}
		System.out.println("总额为：" + sum * PresentValue);
	}

	// 复利计算本金
	static void CPresentValue() {

		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入终值：");
		double sum = fuli.nextDouble(); // 终值
		System.out.println("请输入存款年数：");
		int year = fuli.nextInt(); // 存钱年数
		System.out.println("请输入利率：");
		double r = fuli.nextDouble(); // 利率
		double PresentValue = 1;
		for (int i = 1; i <= year; i++) {
			PresentValue = (1 + r) * PresentValue;
		}
		System.out.println("总额为：" + sum * (1 / PresentValue));
	}

	// 单利计算本息
	static void PrincipalAndInterest() {
		Scanner danli = new Scanner(System.in);
		System.out.println("请输入本金：");
		double PresentValue = danli.nextDouble(); // 本金
		System.out.println("请输入存款年数：");
		int Annuity = danli.nextInt(); // 存钱年数
		System.out.println("请输入利率：");
		double r = danli.nextDouble(); // 利率
		double sum1 = 1;
		sum1 = (1 + r * Annuity) * PresentValue;
		System.out.println("本息为：" + sum1);
	}

}
