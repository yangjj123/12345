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
					.println("��ѡ��1/2/3/4/5/6��\n1.����������ֵ\n2.�������㱾��\n3.�������㱾Ϣ\n4.�����ȡ������ֵ������\n5.���㱨����\n6.ÿ���ÿ�¶���Ͷ��\n7.ÿ�µȶϢ����");
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

				System.out.println("\n�����������,������ѡ��");
				a1 = a;
			}
		}
		System.out
				.println("\n��л����ʹ�ã�ϣ���´������������ʲô����������������лл��\n          --by ���");

	}

	// 1.����������ֵ
	static void CFutureValue() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("�����뱾��");
		double PresentValue = fuli.nextDouble(); // ����
		System.out.println("��������������");
		int year = fuli.nextInt(); // ��Ǯ����
		System.out.println("���������ʣ�");
		double r = fuli.nextDouble(); // ����
		double FutureValue = 1;
		for (int i = 1; i <= year; i++) {
			FutureValue = (1 + r) * FutureValue;
		}
		System.out.println("�ܶ�Ϊ��" + (float)(Math.round(FutureValue * PresentValue*100))/100);
	}

	// 2.�������㱾��
	static void CPresentValue() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("��������ֵ��");
		double FutureValue = fuli.nextDouble(); // ������ֵ
		System.out.println("��������������");
		int year = fuli.nextInt(); // ��Ǯ����
		System.out.println("���������ʣ�");
		double r = fuli.nextDouble(); // ����
		double PresentValue = 1;
		for (int i = 1; i <= year; i++) {
			PresentValue = (1 + r) * PresentValue;
		}
		System.out.println("�ܶ�Ϊ��" + (float)(Math.round(FutureValue * (1 / PresentValue)*100))/100);
	}

	// 3.�������㱾Ϣ
	static void PrincipalAndInterest() {
		Scanner danli = new Scanner(System.in);
		System.out.println("�����뱾��");
		double PresentValue = danli.nextDouble(); // ����
		System.out.println("��������������");
		int year = danli.nextInt(); // ��Ǯ����
		System.out.println("���������ʣ�");
		double r = danli.nextDouble(); // ����
		double FutureValue = 1;
		FutureValue = (1 + r * year) * PresentValue;
		System.out.println("��ϢΪ��" + (float)(Math.round(FutureValue*100))/100);
	}

	// 4.��������
	static void CYear() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("�����뱾��");
		double PresentValue = fuli.nextDouble(); // ����
		System.out.println("�����븴����ֵ��");
		double FutureValue = fuli.nextInt(); // ������ֵ
		System.out.println("���������ʣ�");
		double r = fuli.nextDouble(); // ������
		int year = (int) ((Math.log(FutureValue) / Math.log(1 + r)) - (Math
				.log(PresentValue) / Math.log(1 + r)));
		System.out.println("��������Ϊ��" + year);

	}

	// 5.���㱨����
	static void Rate() {
		Scanner fuli = new Scanner(System.in);
		int a = 0;
		while (a == 0) {
			System.out.println("�Ƿ�ѡ����㷭����\n1������\n2��������");
			int a1 = fuli.nextInt();
			if (a1 == 2) {
				System.out.println("�����뱾��");
				double PresentValue = fuli.nextDouble(); // ����
				System.out.println("�����븴����ֵ��");
				double FutureValue = fuli.nextInt(); // ������ֵ
				System.out.println("��������������");
				int year = fuli.nextInt(); // ��Ǯ����
				double r = (Math.pow(FutureValue / PresentValue, 1.0 / year)) - 1;
				System.out.println("������Ϊ��" + (float)(Math.round(r*100))/100);
				break;
			} else if (a1 == 1) {
				System.out.println("�����뼸���");
				int year = fuli.nextInt();
				System.out.println("��������");
				int FutureValue = fuli.nextInt();
				double r = 72.0 / (year / FutureValue); // 72����
				System.out.println(year + "��󱾽𷭱�������������Ϊ��" + (float)(Math.round(r*100))/100+"%");
				break;
			} else {
				System.out.println("\n�����������������ѡ��");
				a1 = a;
			}
		}

	}

	// 6.���㰴ÿ���ÿ�¶���Ͷ�ʵ���ֵ
	static void regular() {
		Scanner fuli = new Scanner(System.in);
		int a = 0;
		while (a == 0) {
			System.out.println("��ѡ��\n1.����Ͷ��\n2.����Ͷ��");
			int a1 = fuli.nextInt();
			if (a1 == 1) {
				System.out.println("ҪͶ�ʵı���");
				double P = fuli.nextDouble();
				System.out.println("��õ���ر��ʣ�");
				double r = fuli.nextDouble();
				System.out.println("Ͷ������(��)��");
				double Y = fuli.nextInt();

				double F = P * (Math.pow(1 + r, Y) - 1) / r;
				System.out.println("����Ͷ�ʵ������ֵΪ��" + (float)(Math.round(F*100))/100);

				break;
			}

			else if (a1 == 2) {
				System.out.println("ҪͶ�ʵı���");
				double P = fuli.nextDouble();
				System.out.println("��õ��»ر��ʣ�");
				double r = fuli.nextDouble();
				System.out.println("Ͷ������(��)��");
				double Y = fuli.nextInt();
				double F = P * (Math.pow(1 + r / 12.0, Y * 12) - 1) / (r / 12);
				System.out.println("����Ͷ�ʵ������ֵΪ��" + (float)(Math.round(F*100))/100);
				break;
			} else {
				System.out.println("\n�����������������ѡ��");
				a1 = a;
			}
		}

	}
	//7.ÿ�µȶϢ����
	//ÿ�»����� = ������� / ����������+������ �� �ѹ黹�����ۼƶ��ÿ������
	//�ȶϢ���㹫ʽ���������������ʡ���1�������ʣ��޻����������¡���1�������ʣ��޻���������1��
	static void reimbursement() {
		Scanner fuli = new Scanner(System.in);
		System.out.println("����������");
		double P = fuli.nextDouble(); // �����
		System.out.println("�����뻹���ޣ�");
		float Y = fuli.nextInt(); // ��������
		System.out.println("�����������ʣ�");
		double r = fuli.nextDouble(); // ������
		
        double reimbursement=(P*(r/2)*Math.pow(1+(r/12), Y*12))/(Math.pow(1+(r/12),Y*12)-1);
		System.out.println("�ܶ�Ϊ��" + (float)(Math.round(reimbursement*100))/100);
	}

}
