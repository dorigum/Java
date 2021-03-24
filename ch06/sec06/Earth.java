package ch06.sec06;

// static final

public class Earth {
	static final double EARTH_RADIUS=6400;
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS;
		
		// Math.PI : 자바에서 원주율을 구할 때 사용
	}
}
