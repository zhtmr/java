package test.main;
/*
 *  [ Java �⺻ ������ type ]
 *  
 *  1. ������
 *  
 *  ������ : byte, short, int, long
 *  
 *  - byte ������;  // -128 ~ 127
 *  - short ������;  // -32768 ~ 32767
 *  - int  ������; // -2147483648 ~ 2147483647
 *  - long ������; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  �Ǽ��� : float, double
 *  
 *  - float ������; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double ������; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		// ������ ���� �������� �����ϰ� �� �����ϱ�
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		// ������ ���� ������ ���� ������ �ִ� ����
		// �ִ°��� ������ �߻� ��Ű�� �ʴ´�.
		int tmp=iByte;
		// casting ������ �̿��ϱ�
		byte tmp2=(byte)iInt;
		
		// �Ǽ��� ���� �������� �����ϰ� �� �����ϱ�
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3;
		
		// float ������ �ִ� ����
		// double ������ ���� �� �ִ�.
		double tmp3=num1; //���� ����
		
		// double ������ ��� ����
		// float ������ �������� casting.
		float tmp4=(float)num2; // ����(num2)�� �� ŭ ==> casting�ؾߵ�
		
	}
}











