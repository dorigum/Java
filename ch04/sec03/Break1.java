package ch04.sec03;

// break��
// �ݺ��� �ϳ��� ���� ���� �� ���
// �ڽ��� ���� ���� ����� �ϳ��� �ݺ����� �����.

public class Break1 {

	public static void main(String[] args) {
		int i=0;
		
		while(true) { // ������ true�̹Ƿ� ���� �ݺ�
			// �ݺ����� �ߴ� ��ų ������ �ݵ�� �־�� �Ѵ�.
			i+=3;		// 3�� ����
			if(i>20) 	// 20���� ũ��
				break;	// �ݺ��� ����
			
			System.out.println(i);
			
		}

	}

}
