package ch10.sec02;

// ����� ���� ���� Ŭ���� : Exception Ŭ���� ���
// ����� ���� ���� Ŭ������ �ʵ�, �޼ҵ�, ������ ���� ����������
// ��κ� �����ڸ� ����
// �⺻ ������/�Ű������� �ִ� ������

public class BalanceInsufficientExecption extends Exception {
	public BalanceInsufficientExecption() { } // �⺻ ������
	
	// �Ű������� �ִ� ������
	// ���� �߻� ����(���� �޼���)�� ���� Ŭ���� �����ڿ��� ȣ���ϱ� ����
	// String Ÿ���� �Ű������� ���� ������ ���
	public BalanceInsufficientExecption(String message) {
		super(message);
	}

}

// String Ÿ���� �Ű������� ���� ������
// - ���� �߻� ����(���� �޼���)�� �����ϱ� ���� ������
// - ���� Ŭ������ �����ڸ� ȣ���ؼ� ���� �޼����� ����
// - ���� �޼����� �뵵 : catch{} ��Ͽ��� ���� ó���� �� ���







