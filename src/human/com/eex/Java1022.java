package human.com.eex;
import human.com.dto.Car;
public class Java1022 {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		System.out.println("차 이름\t\t색상\t바퀴\t\t제조사\t\t최고속도\t차종");
		car1.name="Morning";
		car1.color="Red";
		car1.wheel.name="Kumho";
		car1.makes="KIA";
		car1.maxspeed=170;
		car1.type="Light";
		System.out.println(car1.name+"\t\t"+car1.color+"\t"+car1.wheel.name
				+"\t\t"+car1.makes+"\t\t"+car1.maxspeed+"\t"+car1.type);
		car2.name="Sportage";
		car2.color="Silver";
		car2.wheel.name="Wheelsky";
		car2.makes="KIA";
		car2.maxspeed=249;
		car2.type="SUV";
		System.out.println(car2.name+"\t"+car2.color+"\t"+car2.wheel.name
				+"\t"+car2.makes+"\t\t"+car2.maxspeed+"\t"+car2.type);
		car3.name="Starcraft";
		car3.color="Black";
		car3.wheel.name="LDA";
		car3.makes="Chevrolet";
		car3.maxspeed=160;
		car3.type="VAN";
		System.out.println(car3.name+"\t"+car3.color+"\t"+car3.wheel.name
				+"\t\t"+car3.makes+"\t"+car3.maxspeed+"\t"+car3.type);
		System.out.println();
		System.out.println("바퀴이름\t\t제조사\t\t가격\t주행거리");
		car1.wheel.makes="Kumho";
		car1.wheel.price=150000;
		car1.wheel.distance=50000;
		System.out.println(car1.wheel.name+"\t\t"+car1.wheel.makes
				+"\t\t"+car1.wheel.price+"\t"+car1.wheel.distance);
		car2.wheel.makes="Wheelsky";
		car2.wheel.price=120000;
		car2.wheel.distance=40000;
		System.out.println(car2.wheel.name+"\t"+car2.wheel.makes
				+"\t"+car2.wheel.price+"\t"+car2.wheel.distance);
		car3.wheel.makes="LDA";
		car3.wheel.price=130000;
		car3.wheel.distance=45000;
		System.out.println(car3.wheel.name+"\t\t"+car3.wheel.makes
				+"\t\t"+car3.wheel.price+"\t"+car3.wheel.distance);
	}
}
