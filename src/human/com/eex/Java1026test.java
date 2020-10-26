package human.com.eex;
import java.util.*;
public class Java1026test {

	public static void main(String[] args) {
		//369게임
		int a=0,b=0;
		for(int i=1;i<=1000;i++) {
			if((i>=300&&i<400)||(i>=600&&i<700)||(i>=900&&i<1000)) {
				System.out.print("짝");
				a=i%100;
				if((a>=30&&a<40)||(a>=60&&a<70)||(a>=90&&a<100)) {
					System.out.print("짝");
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("짝("+i+"),");
					}else {
						System.out.print("("+i+"),");
					}
				}else {
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("짝("+i+"),");
					}else {
						System.out.print("("+i+"),");
					}
				}
			}else {
				a=i%100;
				if((a>=30&&a<40)||(a>=60&&a<70)||(a>=90&&a<100)) {
					System.out.print("짝");
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("짝("+i+"),");
					}else {
						System.out.print("("+i+"),");
					}
				}else {
					b=i%10;
					if(b==3||b==6||b==9) {
						System.out.print("짝("+i+"),");
					}else {
						System.out.print(i+",");
					}
				}
			}
		}
		
		//랜덤문제
		Scanner scanner=new Scanner(System.in);
		int a1,b1,sum1=0,ans=0,i1=0;
		
		System.out.println("1단계");
		for(i1=0;i1<5;i1++) {
			a1=(int)(Math.random()*99)+1;
			b1=(int)(Math.random()*99)+1;
			System.out.print(a1+"+"+b1+"=");
			sum1=a1+b1;
			ans=scanner.nextInt();
			if(ans==sum1) {
				System.out.println("정답");
			}else {
				System.out.println("오답입니다.");
				break;
			}
		}
		if(i1==5) {
			System.out.println("2단계");
			for(i1=0;i1<5;i1++) {
				a1=(int)(Math.random()*99)+1;
				b1=(int)(Math.random()*99)+1;
				System.out.print(a1+"-"+b1+"=");
				sum1=a1-b1;
				ans=scanner.nextInt();
				if(ans==sum1) {
					System.out.println("정답");
				}else {
					System.out.println("오답입니다.");
					break;
				}
			}
			if(i1==5) {
				System.out.println("3단계");
				for(i1=0;i1<5;i1++) {
					a1=(int)(Math.random()*99)+1;
					b1=(int)(Math.random()*99)+1;
					System.out.print(a1+"*"+b1+"=");
					sum1=a1*b1;
					ans=scanner.nextInt();
					if(ans==sum1) {
						System.out.println("정답");
					}else {
						System.out.println("오답입니다.");
						break;
					}
				}
				if(i1==5) {
					System.out.println("4단계");
					for(i1=0;i1<5;i1++) {
						a1=(int)(Math.random()*99)+1;
						b1=(int)(Math.random()*99)+1;
						System.out.print(a1+"/"+b1+"=");
						sum1=a1/b1;
						ans=scanner.nextInt();
						if(ans==sum1) {
							System.out.println("정답");
						}else {
							System.out.println("오답입니다.");
							break;
						}
					}
				}else {}
			}else {}
		}else {}
	}
}
