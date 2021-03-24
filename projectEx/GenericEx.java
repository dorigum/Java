package projectEx;

import java.util.ArrayList;

class Car {
	public void fuel() {
		System.out.println("�ڵ���");
	}
}

class GasolineCar extends Car {
	public void fuel() {
		System.out.println("�ֹ���");
	}
}

class DisselCar extends Car {
	public void fuel() {
		System.out.println("����");
	}
}



class VehicleList<T> {
	ArrayList<T> list = new ArrayList<T>();

	public static void fuelVehicleList(VehicleList<? extends Car> v) {
		Car car = v.get(1);
		car.fuel();

		/*GasolineCar car = v.et(0);
		 car.fuel();*/
	}

	void add(T vehicle) {
		list.add(vehicle);
	}

	T get(int index) {
		return list.get(index);
	}

	boolean remove(T vehicle) {
		return list.remove(vehicle);
	}

	int size() {
		return list.size();
	}
}



public class GenericEx {
	public static void main(String[] args) {
		VehicleList<Car> carList = new VehicleList<>();

		carList.add(new Car());
		carList.add(new GasolineCar());
		carList.add(new DisselCar());

		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).fuel();
		}
		System.out.println("ũ�� : " + carList.size());

		System.out.println("�Ű������� ���ϵ� ī�� ���ѵ� �޼ҵ� ȣ��");
		VehicleList.fuelVehicleList(carList);
	}
}