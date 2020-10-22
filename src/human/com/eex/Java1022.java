package human.com.eex;
import human.com.dto.Car;
import human.com.dto.wheel;
public class Java1022 {

	public static void main(String[] args) {
		human.com.dto.Car car1=new human.com.dto.Car();
		human.com.dto.Car car2=new human.com.dto.Car();
		human.com.dto.Car car3=new human.com.dto.Car();
		System.out.println("차 이름\t\t색상\t바퀴\t\t제조사\t\t최고속도\t차종");
		car1.name="Morning";
		car1.color="Red";
		car1.wheel="Kumho";
		car1.makes="KIA";
		car1.maxspeed=170;
		car1.type="Light";
		System.out.println(car1.name+"\t\t"+car1.color+"\t"+car1.wheel
				+"\t\t"+car1.makes+"\t\t"+car1.maxspeed+"\t"+car1.type);
		car2.name="Sportage";
		car2.color="Silver";
		car2.wheel="Wheelsky";
		car2.makes="KIA";
		car2.maxspeed=249;
		car2.type="SUV";
		System.out.println(car2.name+"\t"+car2.color+"\t"+car2.wheel
				+"\t"+car2.makes+"\t\t"+car2.maxspeed+"\t"+car2.type);
		car3.name="Starcraft";
		car3.color="Black";
		car3.wheel="LDA";
		car3.makes="Chevrolet";
		car3.maxspeed=160;
		car3.type="VAN";
		System.out.println(car3.name+"\t"+car3.color+"\t"+car3.wheel
				+"\t\t"+car3.makes+"\t"+car3.maxspeed+"\t"+car3.type);
		human.com.dto.wheel wheel1=new human.com.dto.wheel();
		human.com.dto.wheel wheel2=new human.com.dto.wheel();
		human.com.dto.wheel wheel3=new human.com.dto.wheel();
		System.out.println();
		System.out.println("바퀴이름\t\t제조사\t\t가격\t주행거리");
		wheel1.name="Kumho";
		wheel1.makes="Kumho";
		wheel1.price=150000;
		wheel1.distance=50000;
		System.out.println(wheel1.name+"\t\t"+wheel1.makes
				+"\t\t"+wheel1.price+"\t"+wheel1.distance);
		wheel2.name="Wheelsky";
		wheel2.makes="Wheelsky";
		wheel2.price=120000;
		wheel2.distance=40000;
		System.out.println(wheel2.name+"\t"+wheel2.makes
				+"\t"+wheel2.price+"\t"+wheel2.distance);
		wheel3.name="LDA";
		wheel3.makes="LDA";
		wheel3.price=130000;
		wheel3.distance=45000;
		System.out.println(wheel3.name+"\t\t"+wheel3.makes
				+"\t\t"+wheel3.price+"\t"+wheel3.distance);
	}

}
