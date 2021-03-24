package ch11.sec03;

import java.io.UnsupportedEncodingException;

public class StringGetBytes {

	public static void main(String[] args) {
		// �⺻ ���ڼ�
		System.out.println("file.encoding : "
		+ System.getProperty("file.encoding"));
		
		// ����  ������� CP949 ����� ����ߴµ�
		// MS�翡�� EUC-KR ��Ŀ��� Ȯ���� MS949�� ���
		
		String str = "�ȳ��ϼ���";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		
		// ���ڿ� ����?
		System.out.println("str.length : " + str.length());
		
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		System.out.println("----------------------------");
		
	
		// Ư�� ���� ������ ���ڵ��� ����Ʈ �迭 ���
		try {
			byte [] bytes2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length : " + bytes2.length);
			// �⺻ ���ڼ��� EUC-KR�� ���ڵ��� ����Ʈ �迭 ���
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);
			
			
			System.out.println("----------------------------");
			
			
			byte [] bytes3 = str.getBytes("UTF-8");
			System.out.println("byte3.length : " + bytes3.length);
			// �⺻ ���ڼ��� UTF-8�� ���ڵ��� ����Ʈ �迭 ���
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 -> String : " + str3);
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
