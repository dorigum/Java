package ch14.sec07;

// ���׸� Ÿ���� ���
// �ڽ� Ŭ�������� Ÿ�� �Ķ���� ���
// �ڽ� Ŭ������ �߰����� Ÿ�� �Ķ���͸� ���� �� ����

public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}