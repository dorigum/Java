package ch14.sec05;

// ���׸� �޼ҵ带 �����ϴ� Ŭ����

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyComp = p1.getKey().equals(p2.getKey());
		boolean valueComp = p1.getValue().equals(p2.getValue());
				
		return keyComp && valueComp;
	}

}
