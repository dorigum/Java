package ch04.sec03;

// continue��
// ���� ���� ������ �ߴ��ϰ�, ���� �ݺ� ��� ����

public class Continue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2!=0) { // i���� Ȧ���� ������� �ʰ�, ���� �ݺ� ���
				continue;
			}
			System.out.println(i);
		}
	}

}
