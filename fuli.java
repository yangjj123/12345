import java.util.Scanner;


public class fuli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fuli = new Scanner(System.in);
		System.out.println("�����뱾��");
		double PresentValue = fuli.nextDouble(); // ����
		System.out.println("��������������");
		int Annuity = fuli.nextInt(); // ��Ǯ����
		System.out.println("���������");
		double FutureValue = fuli.nextDouble(); // ����ܶ�
		System.out.println("���������ʣ�");
		double r = fuli.nextDouble(); // ����
		for (int i = 1; i <= Annuity; i++) {
			FutureValue = (1 + r) * i * PresentValue;
			System.out.println("�����" + i + "���Ĵ���ܶ�Ϊ��" + FutureValue);
		}
		
	}

}
