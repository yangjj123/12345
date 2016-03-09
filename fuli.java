import java.util.Scanner;


public class fuli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fuli = new Scanner(System.in);
		System.out.println("请输入本金：");
		double PresentValue = fuli.nextDouble(); // 本金
		System.out.println("请输入存款年数：");
		int Annuity = fuli.nextInt(); // 存钱年数
		System.out.println("请输入存款金额：");
		double FutureValue = fuli.nextDouble(); // 存款总额
		System.out.println("请输入利率：");
		double r = fuli.nextDouble(); // 利率
		for (int i = 1; i <= Annuity; i++) {
			FutureValue = (1 + r) * i * PresentValue;
			System.out.println("存入第" + i + "年后的存款总额为：" + FutureValue);
		}
		
	}

}
