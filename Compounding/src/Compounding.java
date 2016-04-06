import java.util.Scanner;

public class Compounding {
	public static void main(String[] args) {
		Frame frame = new Frame();
	//	frame.setContentPane(panel);   //setContentPane()把panel设置为JFrame的内容面板  
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("----------------------欢迎使用本系统---------------------");
//		System.out.println("请输入你所需要的服务(请输入对应数字):");
//		int a = 0;
//		while (a == 0) {
//			System.out.println("1.复利终值   2.单利总息   3.单利本金    4.复利存期   5.复利利率   6.定额定投收益终值   7.复利等额还款金额   8.退出");
//			int choice = scanner.nextInt();
//			switch (choice) {
//			case 1:
//				CompoundSum();
//				a = 1;
//				break;
//			case 2:
//				SimpleInterest();
//				a = 1;
//				break;
//			case 3:
//				SimpleMoney();
//				a=1;
//				break;
//			case 4:
//				CompoundYear();
//				a=1;
//				break;
//			case 5:
//				CompoundRate();
//				a=1;
//				break;
//			case 6:
//				Regular();
//				a=1;
//				break;
//			case 7:
//				Repayment();
//				break;
//			case 8:
//				System.exit(0);
//				break;
//			default:
//				System.out.println("你所输入的指令错误！请重新输入！！\n");
//				break;
//			}
//		}
	}

	public static int InputYear(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入年限:");
		int year = scanner.nextInt();
		return year;
	}
	
	
//	public static int InputYear(int year) {
//		return year;
//	}
	
	
	public static double InputMoney(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金:");
		double money = scanner.nextDouble();
		return money;
	}
	
	public static float InputRate(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入利率:");
		float rate = scanner.nextFloat();
		return rate;
	}
	
	public static double InputSum(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入终值:");
		double sum = scanner.nextDouble();
		return sum;
	}
	
	
	public static void CompoundSum() {
		// 复利计算：总额＝本金×(1+利率)^存期
		double money=InputMoney();
		int year=InputYear();
		float rate=InputRate();
		float sum = 1;
		for (int i = 1; i <= year; i++) {
			sum = sum * (1 + rate);
		}
		System.out.print("你的复利终值为:" + money * sum + "元");
	}

	public static void SimpleInterest() {
		// 单利计算：本息＝本金×利率×存期
		double money=InputMoney();
		int year=InputYear();
		float rate=InputRate();
		float interest = 0; // 利息
		interest = (float) (money * year * rate);
		System.out.print("你的单利本息为:" + interest + "元");
	}

	public static void SimpleMoney() {
		// 本金=本息和÷（1+存期*利率）
		double sum=InputSum();
		int year=InputYear();
		float rate=InputRate();
		float money = 0;
		money = (float) (sum / (1 + year * rate));
		System.out.print("你所需存入的本金为:" + money + "元");
	}

	public static void CompoundYear() {
		double money=InputMoney();
		float rate=InputRate();
		double sum=InputSum();
		int year= (int) ((Math.log(sum)/Math.log(1+rate))-(Math.log(money)/Math.log(1+rate)));
		System.out.print("你所需的存期为:"+year+"年");
	}
	
	public static int compoundYear(double money, double rate,double sum ) {
		int year= (int) ((Math.log(sum)/Math.log(1+rate))-(Math.log(money)/Math.log(1+rate)));
		System.out.print("你所需的存期为:"+year+"年");
		return year;
	}
	
	
	public static void CompoundRate() {
		double money=InputMoney();
		int year=InputYear();
		double sum=InputSum();
		float rate = (float) ((Math.pow(sum/money, 1.0/year))-1);  
		System.out.print("报酬率应为:"+rate*100+"%");
	}
	

	
	// 6.计算按每年或每月定期投资的终值
	public static void Regular() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a == 0) {
            System.out.println("请输入你所需要的服务(请输入对应数字):");
            System.out.println("1.按年投资   2.按月投资");
            int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				double yearlyMoney=InputMoney();
				int year=InputYear();
				float yearlyRate=InputRate();
                double sum = yearlyMoney * (Math.pow(1 + yearlyRate, year) - 1) / yearlyRate;
                System.out.print("你的资产总值为:" + (float)(Math.round(sum*100))/100+"元");
				a = 1;
				break;
			case 2:
				double monthlyMoney=InputMoney();
				int month=InputYear();
				float monthlyRate=InputRate();
                double sum1 = monthlyMoney * (Math.pow(1 + monthlyRate / 12.0, month * 12) - 1) / (monthlyRate / 12);
                System.out.print("你的资产总值为:" + sum1+"元");
				a = 1;
				break;
			default:
				System.out.println("你所输入的指令错误！请重新输入！！\n");
				break;
			}
        }
    }
    
    //7.复利等额还款金额
	public static void Repayment(){
    	double money=InputMoney();
		int year=InputYear();
		float rate=InputRate();
        double repayment=(money*(rate/2)*Math.pow(1+(rate/12), year*12))/(Math.pow(1+(rate/12),year*12)-1);
        System.out.println("你的还款金额为:" + (float)repayment+"元");
    }
}