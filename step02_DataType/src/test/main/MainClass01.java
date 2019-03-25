package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2147483648 ~ 2147483647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 정수형 변수 종류별로 선언하고 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		// 범위가 넓은 변수에 좁은 변수에 있는 값을
		// 넣는것은 문제를 발생 시키지 않는다.
		int tmp=iByte;
		// casting 연산자 이용하기
		byte tmp2=(byte)iInt;
		
		// 실수형 변수 종류별로 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3;
		
		// float 변수에 있는 값을
		// double 변수에 담을 수 있다.
		double tmp3=num1; //문제 없음
		
		// double 변수에 담긴 값을
		// float 변수에 담을때는 casting.
		float tmp4=(float)num2; // 더블(num2)이 더 큼 ==> casting해야됨
		
	}
}











