package human.com.eex;
import java.util.Arrays;

import human.com.dto.Human;

public class Java1026 {
	
	public static void fuction1(int a) {
		a=10;
	}
	public static int function2(int a) {
		a=10;
		return a;
	}
	public static void function3(int a[]) {
		a[0]=10;
	}
	public static int[] function4 (int a[]) {
		int rValue[] =a;
		rValue[0]=12;
		return rValue; 
	}
	public static int[] function5 (int a[]) {
		int rValue[] = new int[a.length];
		rValue[0]=a[0];
		rValue[1]=a[1];
		rValue[1]=21;
		a[1] =22;
		return rValue; 
	}
	public static Human function6(Human h) {
		Human rHuman=h;
		rHuman.age=31;
		return h;
	}
	public static Human function7(Human h) {
		Human rHuman=new Human();
		rHuman.age=32;
		return h;
	}
	public static void main(String[] args) {
		Human h=new Human("ȫ�浿",11,11.1);
		Human rH;
		rH=function7(h);
		System.out.println(h);
		System.out.println(rH);
		h.age=50;
		System.out.println(h);
		System.out.println(rH);
		
		/*
		Human h=new Human("ȫ�浿",11,11.1);
		Human rH;
		rH=function6(h);
		System.out.println(h);
		System.out.println(rH);
		h.age=50;
		System.out.println(h);
		System.out.println(rH);
		
		int b[] = {10,11};
		int rB[]= function4(b);
		System.out.println(Arrays.toString(b)); 
		System.out.println(Arrays.toString(rB));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(rB));

		
		int b[] = {10,11};
		int rB[]= function5(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(rB));
		rB[0]=1;
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(rB)); 
		*/

	}

}
