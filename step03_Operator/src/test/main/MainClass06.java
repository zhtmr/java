package test.main;
/*
 *	[ ������ ]
 *
 * 	6. 3�� ������
 * 
 * 	- ����
 * 
 * 	boolean type ? ��1 : ��2
 *
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		
		// ������ ���Ǻη� ���� �ְ������
		String result=isWait ? "��ٷ�" : "��ٸ�����";  // true : false
		System.out.println(result);
		
		// ==
		String result2=null;
		if(isWait) {
			result2="��ٷ�";
		}else{
			result2="��ٸ�����";
		}
		System.out.println(result2);
	}
}
