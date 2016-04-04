import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class test1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {//����"����������ֵ"��ʽ�Ƿ���ȷ����������Ԥ��������Ƿ����1
		double PresentValue=1000000.0;
        int year=30;
        double r=0.03;
        double FutureValue = 1;
		for (int i = 1; i <= year; i++) {
			FutureValue = (1 + r) * FutureValue;
			
		}
		float F=(float) (Math.round(FutureValue * PresentValue * 100)) / 100;
		Assert.assertEquals(F, 2427262,1.0);//��������Ԥ��������Ƿ����1
	} 
	
	@Test
	public void test2() {//���Լ���"�������㱾��"��ʽ�Ƿ���ȷ����������Ԥ��������Ƿ����1
		double FutureValue=3000000.0;
        int year=10;
        double r=0.03;
        double PresentValue = 1;
		for (int i = 1; i <= year; i++) {
			PresentValue = (1 + r) * PresentValue;
		}
		float f=(float) (Math.round(FutureValue * (1 / PresentValue) * 100))/ 100;
		Assert.assertEquals(f, 2232281,1.0);//��������Ԥ��������Ƿ����1
	}
	
	
	
	

}
