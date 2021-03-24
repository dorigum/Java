package ch12.sec13;

// 생산자 스레드 : 데이터 저장(setData() 메소드 사용)

public class ProducerThread extends Thread {
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			// 데이터 생산
			String data = "Data-" + i;
			dataBox.setData(data); // 생산된 데이터를 공유 객체에 저장
		}
	}
}
