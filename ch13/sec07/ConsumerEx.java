package ch13.sec07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// String Ÿ���� �Ű����� 1���� �޾Ƽ� �Һ��ϴ� ���ٽ�
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");

		// String Ÿ���� �Ű����� 2�� t, u�� �޾Ƽ� �Һ��ϴ� ���ٽ�
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("java", "8");
		
		// double ���� �޾Ƽ� �Һ��ϴ� ���ٽ�
		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);
		
		// String Ÿ�� �Ű����� t�� int �� i�� �޾Ƽ� �Һ��ϴ� ���ٽ�
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
		
	}

}
