package test.main;

public class mainclass02 {
	public static void main(String[] args) {
		//국어 점수
		int kor=95;
		//영어 점수
		int eng=100;
		
		//국어 점수와 영어점수의 평균을 구해서 출력하고 싶다면?
		int sum=kor+eng;
		double avg=sum/2.0; // 실수끼리 연산(sum,2.0)해야 실수가나옴
		System.out.println(avg);
	}
}
