package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		// �ݺ����� �̸�(��)�� ���̰� break �̸�;
		// break;
		// break Outter;
		// break�� 2�� ���
		
		Outter:for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter; // ���� �ݺ��� ����
				}
				
				if(upper=='K') {
					break Outter; // �ٱ��� �ݺ������� ����
				}
			}
		System.out.println("���α׷� ���� ����");
		
		// �ٱ��� �ݺ������� ����
		// �ݺ����� �̸�(��)�� ���̰� break �̸�;
		/* Outter:for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter; // �ٱ��� �ݺ������� ����
				}
			}
		}
		System.out.println("���α׷� ���� ����"); */
		
		
		
		
		
		
		// ���� for���� ����
		/*for(char upper='A'; upper<='Z'; upper++){
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break; // ���� for���� ����
				}
			}
		}
		System.out.println("���α׷� ���� ����");*/
		}

	}
}
