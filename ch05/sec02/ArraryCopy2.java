package ch05.sec02;

// �迭 ���� : System.arraycopy() �޼ҵ� ���
// System.arraycopy(����, ���� �ε���, ���, ���� �ε���, ������ ����)

public class ArraryCopy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "Array", "Copy"};
		String[] newStrArray = new String[5]; // �⺻�� null�� �ʱ�ȭ
		
		// System.arraycopy() �޼ҵ� ��� �迭 ����
		// System.arraycopy(����, ���� �ε���, ���, ���� �ε���, ������ ����)
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i] + ",");

	}

}
