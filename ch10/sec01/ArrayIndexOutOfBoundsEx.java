package ch10.sec01;

// �迭���� �ε��� ���� �ʰ��� ��� �߻��Ǵ� ����
public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		if(args.length ==2 ) {
		String data1 = args[0];
		String data2 = args[1];

		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[���� ���]");
			System.out.println("java ArrayIndexOutOfBoundsEx");
			System.out.println("��1 ��2");
		}
		
		// main() �޼ҵ��� args�� ���޵Ǵ� ���� ��� �߻��ϴ� ����
		// args�� �� �����ϴ� ��� : Run/Run Configurationâ���� Arguments �ǿ� �Է�
		
	}

}
