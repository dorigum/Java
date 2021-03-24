package ch09.sec03;

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method()");
	}
	
	// ÁßÃ¸ Å¬·¡½º
	class Inner{
		String field = "Inner-field";
		
		void method() {
			System.out.println("Inner-method()");
		}
		
		void print() {
			// this : Inner °´Ã¼ ÂüÁ¶
			this.method();
			
			// Outter.this : Outter °´Ã¼ ÂüÁ¶
			System.out.println("Outter.this.field");
			Outter.this.method();
		}
		
	}
	
}
