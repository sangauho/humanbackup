package human.com.eex;

import java.util.*;

public class Java1028 {
	public static int[] function1(int[] a) {
		int[] b=new int[a.length*2];
		int j=a.length-1;
		int i;
		for(i=0;i<a.length*2;i++) {
			if(i>=a.length) {
				b[i]=a[j];
				j--;
			}else {
				b[i]=a[i];
			}
		}
		return b;
	}
	public static int[] function2(int[] a) {
		int[] b=new int[a.length*2];
		int j=a.length-1;
		int k=0;
		int i;
		for(i=0;i<a.length*2;i++) {
			if(i>=a.length) {
				b[i]=a[k];
				k++;
			}else {
				b[i]=a[j];
				j--;
			}
		}
		return b;
	}
	public static int[] function3(int[] a) {
		Scanner scanner=new Scanner(System.in);
		int[] b=new int[a.length];
		System.out.print("�̵�ĭ��=>");
		int c=scanner.nextInt();
		System.out.print("ä�����=>");
		int d=scanner.nextInt();
		for(int i=0;i<a.length;i++) {
			if(i>=a.length-c) {
				b[i]=d;
			}else {
				b[i]=a[i+c];
			}
		}
		return b;
	}
	public static int[] function4(int[] a) {
		Scanner scanner=new Scanner(System.in);
		int[] b=new int[a.length];
		System.out.print("�̵�ĭ��=>");
		int c=scanner.nextInt();
		System.out.print("ä�����=>");
		int d=scanner.nextInt();
		int e=0;
		for(int i=0;i<a.length;i++) {
			if(i<c) {
				b[i]=d;
			}else {
				b[i]=a[e];
				e++;
			}
		}
		return b;
	}
	public static int[] function5(int[] a) {
		Scanner scanner=new Scanner(System.in);
		int[] b=new int[a.length];
		System.out.print("�̵�ĭ��=>");
		int c=scanner.nextInt();
		int d=0;
		for(int i=0;i<a.length;i++) {
			if(i>=a.length-c) {
				b[i]=a[d];
				d++;
			}else {
				b[i]=a[i+c];
			}
		}
		return b;
	}
	public static int[] function6(int[] a) {
		Scanner scanner=new Scanner(System.in);
		int[] b=new int[a.length];
		System.out.print("�̵�ĭ��=>");
		int c=scanner.nextInt();
		int d=a.length-c;
		int e=0;
		for(int i=0;i<a.length;i++) {
			if(i<c) {
				b[i]=a[d];
				d++;
			}else {
				b[i]=a[e];
				e++;
			}
		}
		return b;
	}
	public static void dice(int a) {
		int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0;
		for(int i=0;i<a;i++) {
			int b=(int)(Math.random()*6)+1;
			switch(b) {
			case 1:
				b1++;
				break;
			case 2:
				b2++;
				break;
			case 3:
				b3++;
				break;
			case 4:
				b4++;
				break;
			case 5:
				b5++;
				break;
			default:
				b6++;
				break;
			}
		}
		System.out.printf("�� ����Ƚ��=>%d\n"
				+ "1=>%d��, 2=>%d��, 3=>%d��,\n"
				+ "4=>%d��, 5=>%d��, 6=>%d��,\n", a,b1,b2,b3,b4,b5,b6);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//1
		int[] a1= {1,2,3,4,5};
		System.out.print("���� �Է�(1~5)=>");
		int b1=scanner.nextInt();
		int c1=0;
		for(int i=0;i<5;i++) {
			if(a1[i]==b1) {
				c1=i+1;
			}else {}
		}
		System.out.println(c1+"��°�� �ֽ��ϴ�.");
		
		//3
		System.out.print("�迭 ũ�� �Է�=>");
		int b2=scanner.nextInt();
		int[] a2=new int[b2];
		for(int i=0;i<b2;i++) {
			if((i+1)%3==1) {
				a2[i]=1;
			}else if((i+1)%3==2) {
				a2[i]=2;
			}else {
				a2[i]=3;
			}
		}
		System.out.println(Arrays.toString(a2));
		
		//4
		int[] a4=new int[] {1,2,3};
		int[] b4= {7,15,23,15,23};
		int[] c4=function1(a4);
		int[] d4=function2(b4);
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(b4));
		System.out.println(Arrays.toString(c4));
		System.out.println(Arrays.toString(d4));
		
		//5
		int[] a5=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a5));
		for(;;) {
			System.out.print("�̵�����(����,������)=>");
			String b5=scanner.next();
			if(b5.equals("����")) {
				a5=function3(a5);
				break;
			}else if(b5.equals("������")) {
				a5=function4(a5);
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println(Arrays.toString(a5));
		
		//6
		int[] a6=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a6));
		for(;;) {
			System.out.print("�̵�����(����,������)=>");
			String b6=scanner.next();
			if(b6.equals("����")) {
				a6=function5(a6);
				break;
			}else if(b6.equals("������")) {
				a6=function6(a6);
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println(Arrays.toString(a6));
		
		//7
		int[] a7=new int[100];
		for(int i=0;i<a7.length;i++) {
			a7[i]=i;
		}
		for(int i=2;i<=50;i++) {
			int a;
			for(a=i*2;a<a7.length;a+=i) {
				a7[a]=0;
			}
		}
		for(int i=0;i<a7.length;i++) {
			if(a7[i]==0) {
			}else {
				System.out.print(a7[i]+",");
			}
		}
		
		//8
		System.out.print("�ֻ��� ���� Ƚ��=>");
		int a8=scanner.nextInt();
		dice(a8);
		
		//9
		int a9=1,sum9=0,b91=0,b92=0,b93=0,b94=0;
		while(a9==1) {
			System.out.print("1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� "
					+ "4.������ �߰� 5.������ �߰� 6.���α׷� ����\n�Է�=>");
			int a=scanner.nextInt();
			int b;
			switch(a) {
			case 1:
				System.out.println("1.��ü �⼮����\n�Ἦ��=>"+b91+" �⼮��=>"+b92+"\n"
						+ "������=>"+b93+" ������=>"+b94);
				break;
			case 2:
				System.out.print("2.�Ἦ�� �߰�=>");
				b=scanner.nextInt();
				b91+=b;
				sum9+=b;
				break;
			case 3:
				System.out.print("3.�⼮�� �߰�=>");
				b=scanner.nextInt();
				b92+=b;
				sum9+=b;
				break;
			case 4:
				System.out.print("4.������ �߰�=>");
				b=scanner.nextInt();
				b93+=b;
				sum9+=b;
				break;
			case 5:
				System.out.print("5.������ �߰�=>");
				b=scanner.nextInt();
				b94+=b;
				sum9+=b;
				break;
			case 6:
				System.out.print("6.���α׷� ����=>");
				a9=0;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			if(sum9==50) {
				System.out.println("�� �ο��� Ȯ�εǾ� �����մϴ�.");
				break;
			}else if(sum9>50) {
				System.out.println("����(�� �ο��� �ʰ���)");
				break;
			}else {}
		}
		System.out.println("1.��ü �⼮����\n�Ἦ��=>"+b91+" �⼮��=>"+b92+"\n"
				+ "������=>"+b93+" ������=>"+b94);
		
	}

}
