package human.com.eex;
import java.util.*;
public class Java1026test {

	public static void main(String[] args) {
		//369����
		int a=0,b=0;
		for(int i=1;i<=1000;i++) {
			if((i>=300&&i<400)||(i>=600&&i<700)||(i>=900&&i<1000)) {
				System.out.print("¦");
				a=i%100;
				if((a>=30&&a<40)||(a>=60&&a<70)||(a>=90&&a<100)) {
					System.out.print("¦");
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("¦("+i+"),");
					}else {
						System.out.print("("+i+"),");
					}
				}else {
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("¦("+i+"),");
					}else {
						System.out.print("("+i+"),");
					}
				}
			}else {
				a=i%100;
				if((a>=30&&a<40)||(a>=60&&a<70)||(a>=90&&a<100)) {
					System.out.print("¦");
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("¦("+i+"),");
					}else {
						System.out.print("("+i+"),");
					}
				}else {
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("¦("+i+"),");
					}else {
						System.out.print(i+",");
					}
				}
			}
		}
		
		//��������
		Scanner scanner=new Scanner(System.in);
		int a1,b1,sum1=0,ans=0,i1=0;
		
		System.out.println("1�ܰ�");
		for(i1=0;i1<5;i1++) {
			a1=(int)(Math.random()*99)+1;
			b1=(int)(Math.random()*99)+1;
			System.out.print(a1+"+"+b1+"=");
			sum1=a1+b1;
			ans=scanner.nextInt();
			if(ans==sum1) {
				System.out.println("����");
			}else {
				System.out.println("�����Դϴ�.");
				break;
			}
		}
		if(i1==5) {
			System.out.println("2�ܰ�");
			for(i1=0;i1<5;i1++) {
				a1=(int)(Math.random()*99)+1;
				b1=(int)(Math.random()*99)+1;
				System.out.print(a1+"-"+b1+"=");
				sum1=a1-b1;
				ans=scanner.nextInt();
				if(ans==sum1) {
					System.out.println("����");
				}else {
					System.out.println("�����Դϴ�.");
					break;
				}
			}
			if(i1==5) {
				System.out.println("3�ܰ�");
				for(i1=0;i1<5;i1++) {
					a1=(int)(Math.random()*99)+1;
					b1=(int)(Math.random()*99)+1;
					System.out.print(a1+"*"+b1+"=");
					sum1=a1*b1;
					ans=scanner.nextInt();
					if(ans==sum1) {
						System.out.println("����");
					}else {
						System.out.println("�����Դϴ�.");
						break;
					}
				}
				if(i1==5) {
					System.out.println("4�ܰ�");
					for(i1=0;i1<5;i1++) {
						a1=(int)(Math.random()*99)+1;
						b1=(int)(Math.random()*99)+1;
						System.out.print(a1+"/"+b1+"=");
						sum1=a1/b1;
						ans=scanner.nextInt();
						if(ans==sum1) {
							System.out.println("����");
						}else {
							System.out.println("�����Դϴ�.");
							break;
						}
					}
				}else {}
			}else {}
		}else {}
	}
}
