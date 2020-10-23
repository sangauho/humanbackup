package human.com.eex;
import human.com.dto.Human;
public class Java1023test {
	public static void main(String[] args) {
		
		
		
		Human arr1[]=new Human[2];
		arr1[0]=new Human("홍길동",10,155.5);
		arr1[1]=new Human("홍길남",10,155.5);
		Human arr2[]=arr1;
		Human arr3[]=new Human[2];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr1[i];
		}
		//홍길남 나이 10을 20으로 변경해보자.
		arr1[1].age=20;
		System.out.println(arr1[1].age);
		System.out.println(arr2[1].age);
		System.out.println(arr3[1].age);
		/*
		arr3[0]=new Human();
		arr3[0].name=arr1[0].name;
		arr3[0].age=arr1[0].age;
		arr3[0].height=arr1[0].height;

		arr3[1]=new Human();
		arr3[1].name=arr1[0].name;
		arr3[1].age=arr1[0].age;
		arr3[1].height=arr1[0].height;
		*/
		
		
		
	}

}