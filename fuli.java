import java.util.Scanner;

public class fuli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner caculate=new Scanner(System.in);
		System.out.println("��ѡ��1/2/3��\n1.����������ֵ2.�������㱾��3.�������㱾Ϣ");
		int a=caculate.nextInt();
		if(a==1)
			fuli.CFutureValue();
		else if(a==2)
			fuli.CPresentValue();
		else if(a==3)
			fuli.PrincipalAndInterest();
		else
		{
			System.out.println("\n�����������������1/2/3��");
		}
		
		
	}

	// ����������ֵ
	static void CFutureValue() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("�����뱾��");
		double PresentValue = fuli.nextDouble(); // ����
		System.out.println("��������������");
		int year = fuli.nextInt(); // ��Ǯ����
		System.out.println("���������ʣ�");
		double r = fuli.nextDouble(); // ����
		double sum = 1;
		for (int i = 1; i <= year; i++) {
			sum = (1 + r) * sum;
		}
		System.out.println("�ܶ�Ϊ��" + sum * PresentValue);
	}

	// �������㱾��
	static void CPresentValue() {

		Scanner fuli = new Scanner(System.in);
		System.out.println("��������ֵ��");
		double sum = fuli.nextDouble(); // ��ֵ
		System.out.println("��������������");
		int year = fuli.nextInt(); // ��Ǯ����
		System.out.println("���������ʣ�");
		double r = fuli.nextDouble(); // ����
		double PresentValue = 1;
		for (int i = 1; i <= year; i++) {
			PresentValue = (1 + r) * PresentValue;
		}
		System.out.println("�ܶ�Ϊ��" + sum * (1 / PresentValue));
	}

	// �������㱾Ϣ
	static void PrincipalAndInterest() {
		Scanner danli = new Scanner(System.in);
		System.out.println("�����뱾��");
		double PresentValue = danli.nextDouble(); // ����
		System.out.println("��������������");
		int Annuity = danli.nextInt(); // ��Ǯ����
		System.out.println("���������ʣ�");
		double r = danli.nextDouble(); // ����
		double sum1 = 1;
		sum1 = (1 + r * Annuity) * PresentValue;
		System.out.println("��ϢΪ��" + sum1);
	}

}
