package ch10.sec01;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
			
			String data11 = "100";
			String data22 = "a100";
			
			int value1 = Integer.parseInt(data11);
			int value2 = Integer.parseInt(data22);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ������ ��� ���ܴ� ���⼭ ó���ϰڽ��ϴ�.");
		}
		
		catch (NumberFormatException e) {
			System.out.println("���� ������ �߸��ż� �߻��� ���ܴ� ���⼭ ó���ϰڽ��ϴ�.");
		}

	}

}
