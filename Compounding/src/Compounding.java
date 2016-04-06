import java.util.Scanner;

public class Compounding {
	public static void main(String[] args) {
		Frame frame = new Frame();
	//	frame.setContentPane(panel);   //setContentPane()��panel����ΪJFrame���������  
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("----------------------��ӭʹ�ñ�ϵͳ---------------------");
//		System.out.println("������������Ҫ�ķ���(�������Ӧ����):");
//		int a = 0;
//		while (a == 0) {
//			System.out.println("1.������ֵ   2.������Ϣ   3.��������    4.��������   5.��������   6.���Ͷ������ֵ   7.�����ȶ����   8.�˳�");
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
//				System.out.println("���������ָ��������������룡��\n");
//				break;
//			}
//		}
	}

	public static int InputYear(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		int year = scanner.nextInt();
		return year;
	}
	
	
//	public static int InputYear(int year) {
//		return year;
//	}
	
	
	public static double InputMoney(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��:");
		double money = scanner.nextDouble();
		return money;
	}
	
	public static float InputRate(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		float rate = scanner.nextFloat();
		return rate;
	}
	
	public static double InputSum(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ֵ:");
		double sum = scanner.nextDouble();
		return sum;
	}
	
	
	public static void CompoundSum() {
		// �������㣺�ܶ�����(1+����)^����
		double money=InputMoney();
		int year=InputYear();
		float rate=InputRate();
		float sum = 1;
		for (int i = 1; i <= year; i++) {
			sum = sum * (1 + rate);
		}
		System.out.print("��ĸ�����ֵΪ:" + money * sum + "Ԫ");
	}

	public static void SimpleInterest() {
		// �������㣺��Ϣ����������ʡ�����
		double money=InputMoney();
		int year=InputYear();
		float rate=InputRate();
		float interest = 0; // ��Ϣ
		interest = (float) (money * year * rate);
		System.out.print("��ĵ�����ϢΪ:" + interest + "Ԫ");
	}

	public static void SimpleMoney() {
		// ����=��Ϣ�͡£�1+����*���ʣ�
		double sum=InputSum();
		int year=InputYear();
		float rate=InputRate();
		float money = 0;
		money = (float) (sum / (1 + year * rate));
		System.out.print("���������ı���Ϊ:" + money + "Ԫ");
	}

	public static void CompoundYear() {
		double money=InputMoney();
		float rate=InputRate();
		double sum=InputSum();
		int year= (int) ((Math.log(sum)/Math.log(1+rate))-(Math.log(money)/Math.log(1+rate)));
		System.out.print("������Ĵ���Ϊ:"+year+"��");
	}
	
	public static int compoundYear(double money, double rate,double sum ) {
		int year= (int) ((Math.log(sum)/Math.log(1+rate))-(Math.log(money)/Math.log(1+rate)));
		System.out.print("������Ĵ���Ϊ:"+year+"��");
		return year;
	}
	
	
	public static void CompoundRate() {
		double money=InputMoney();
		int year=InputYear();
		double sum=InputSum();
		float rate = (float) ((Math.pow(sum/money, 1.0/year))-1);  
		System.out.print("������ӦΪ:"+rate*100+"%");
	}
	

	
	// 6.���㰴ÿ���ÿ�¶���Ͷ�ʵ���ֵ
	public static void Regular() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a == 0) {
            System.out.println("������������Ҫ�ķ���(�������Ӧ����):");
            System.out.println("1.����Ͷ��   2.����Ͷ��");
            int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				double yearlyMoney=InputMoney();
				int year=InputYear();
				float yearlyRate=InputRate();
                double sum = yearlyMoney * (Math.pow(1 + yearlyRate, year) - 1) / yearlyRate;
                System.out.print("����ʲ���ֵΪ:" + (float)(Math.round(sum*100))/100+"Ԫ");
				a = 1;
				break;
			case 2:
				double monthlyMoney=InputMoney();
				int month=InputYear();
				float monthlyRate=InputRate();
                double sum1 = monthlyMoney * (Math.pow(1 + monthlyRate / 12.0, month * 12) - 1) / (monthlyRate / 12);
                System.out.print("����ʲ���ֵΪ:" + sum1+"Ԫ");
				a = 1;
				break;
			default:
				System.out.println("���������ָ��������������룡��\n");
				break;
			}
        }
    }
    
    //7.�����ȶ����
	public static void Repayment(){
    	double money=InputMoney();
		int year=InputYear();
		float rate=InputRate();
        double repayment=(money*(rate/2)*Math.pow(1+(rate/12), year*12))/(Math.pow(1+(rate/12),year*12)-1);
        System.out.println("��Ļ�����Ϊ:" + (float)repayment+"Ԫ");
    }
}