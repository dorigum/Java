package ch11.sec03;

// ���ڿ� �и� ���
// (1) String Ŭ������ split() �޼ҵ� �̿�
// (2) java.util.StringTokenizer Ŭ���� ���


// (1) String Ŭ������ split() �޼ҵ� �̿�
public class SplitEx {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̸���/������";
		String[] names = text.split("/");	// ������ : ������(/)
		
		for(String name : names) {
			System.out.println(name);
		}
		
		String text2 = "ȫ�浿&�̸���,������,���е�-�ں�ȣ";
		String[] names2 = text2.split("&|,|-");
		
		for(String name : names2) {
			System.out.println(name);
		}
		
	}

}
