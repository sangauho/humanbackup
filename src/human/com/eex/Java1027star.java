package human.com.eex;
import java.util.Scanner;
public class Java1027star {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//3-1 별찍기
		int a1,b1;
		for(a1=1;a1<=9;a1++) {
			for(b1=0;b1<a1;b1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-2 별찍기
		int a2,b2,c2;
		for(a2=1;a2<=9;a2++) {
			for(b2=0;b2<9-a2;b2++) {
				System.out.print(" ");
			}
			for(c2=0;c2<a2;c2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-3 별찍기
		int a3,b3;
		for(a3=1;a3<=9;a3++) {
			for(b3=0;b3<=9-a3;b3++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-4 별찍기
		int a4,b4,c4;
		for(a4=1;a4<=9;a4++) {
			for(b4=10-a4;b4<9;b4++) {
				System.out.print(" ");
			}
			for(c4=0;c4<=9-a4;c4++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-5 별찍기
		int a5,b5;
		for(a5=1;a5<=9;a5++) {
			if(a5>=5) {
				for(b5=0;b5<=9-a5;b5++) {
					System.out.print("*");
				}
			}else {
				for(b5=0;b5<a5;b5++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//3-6 별찍기
		int a6,b6,c6;
		for(a6=1;a6<=9;a6++) {
			if(a6>=5) {
				for(c6=5;c6<a6;c6++) {
					System.out.print(" ");
				}
				for(b6=0;b6<=9-a6;b6++) {
					System.out.print("*");
				}
			}else {
				for(c6=a6;c6<5;c6++) {
					System.out.print(" ");
				}
				for(b6=0;b6<a6;b6++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//3-7 별찍기
		int a7,b7;
		for(a7=1;a7<=9;a7++) {
			if(a7>=5) {
				for(b7=5;b7<=a7;b7++) {
					System.out.print("*");
				}
			}else {
				for(b7=a7;b7<=5;b7++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//3-8 별찍기
		int a8,b8,c8;
		for(a8=1;a8<=9;a8++) {
			if(a8>=5) {
				for(c8=0;c8<9-a8;c8++) {
					System.out.print(" ");
				}
				for(b8=5;b8<=a8;b8++) {
					System.out.print("*");
				}
			}else {
				for(c8=1;c8<a8;c8++) {
					System.out.print(" ");
				}
				for(b8=a8;b8<=5;b8++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//3-9 별찍기
		int a9,b9,c9;
		for(a9=1;a9<=9;a9++) {
			if(a9>=5) {
				for(b9=5;b9<=a9;b9++) {
					System.out.print("*");
				}
				for(c9=(2*a9);c9<19;c9++) {
					System.out.print(" ");
				}
				for(b9=5;b9<=a9;b9++) {
					System.out.print("*");
				}
			}else {
				for(b9=a9;b9<=5;b9++) {
					System.out.print("*");
				}
				for(c9=1;c9<(2*a9);c9++) {
					System.out.print(" ");
				}
				for(b9=a9;b9<=5;b9++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//3-10 별찍기
		int a10,b10,c10;
		for(a10=1;a10<=9;a10++) {
			for(b10=0;b10<9-a10;b10++) {
				System.out.print(" ");
			}
			for(c10=0;c10<(2*a10)-1;c10++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-11 별찍기
		int a11,b11,c11;
		for(a11=1;a11<=9;a11++) {
			for(b11=1;b11<a11;b11++) {
				System.out.print(" ");
			}
			for(c11=0;c11<19-(2*a11);c11++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3-12 별찍기
		int a12,b12,c12;
		for(a12=1;a12<=9;a12++) {
			if(a12>=5) {
				for(b12=0;b12<9-a12;b12++) {
					System.out.print(" ");
				}
				for(c12=10;c12<(2*a12)+1;c12++) {
					System.out.print("*");
				}
			}else {
				for(b12=1;b12<a12;b12++) {
					System.out.print(" ");
				}
				for(c12=1;c12<12-(2*a12);c12++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//3-13 별찍기
		int a13,b13,c13;
		for(a13=1;a13<=9;a13++) {
			if(a13>=5) {
				for(b13=0;b13<9-a13;b13++) {
					System.out.print(" ");
				}
				for(c13=0;c13<5;c13++) {
					System.out.print("*");
				}
			}else {
				for(b13=1;b13<a13;b13++) {
					System.out.print(" ");
				}
				for(c13=0;c13<5;c13++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//3-14 별찍기
		int a14,b14;
		for(a14=0;a14<9;a14++) {
			for(b14=0;b14<17;b14++) {
				if(a14==8) {
					System.out.print("*");
				}else if(b14==8-a14||b14==8+a14) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//3-15 별찍기
		int a15,b15;
		for(a15=0;a15<9;a15++) {
			for(b15=0;b15<9;b15++) {
				if(b15==a15||b15==8-a15) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//프로젝트 문제
		//3 에버랜드 가격계산
		int man=0,student=0,weak=0,sum3=0,type1=0;
		for(;;) {
			System.out.print("종류(주간권,오후권,윈터야간권,2일권)=>");
			String type=scanner.next();
			switch(type) {
			case "주간권":
				type1=1;
				break;
			case "오후권":
				type1=2;
				break;
			case "윈터야간권":
				type1=3;
				break;
			case "2일권":
				type1=4;
				break;
			default:
				System.out.println("오류");
				break;
			}
			if(type1!=0) {
				break;
			}
		}
		System.out.print("인원 수=>");
		int people=scanner.nextInt();
		for(;;) {
			if(sum3>people) {
				System.out.println("오류");
			}else if(sum3==people) {
				break;
			}else {
				System.out.print("대인=>");
				man=scanner.nextInt();
				System.out.print("청소년=>");
				student=scanner.nextInt();
				System.out.print("소인/경로=>");
				weak=scanner.nextInt();
				sum3=man+student+weak;
			}
		}
		switch(type1) {
		case 1:
			sum3=(man*46000)+(student*39000)+(weak*36000);
			break;
		case 2:
			sum3=(man*38000)+(student*32000)+(weak*29000);
			break;
		case 3:
			sum3=(man*20000)+(student*17000)+(weak*16000);
			break;
		default:
			sum3=(man*74000)+(student*62000)+(weak*58000);
			break;
		}
		System.out.println("가격은 =>"+sum3);
		
		//4 임의의 숫자 맞추기
		int i4=(int)(Math.random()*100)+1;
		System.out.print("숫자 입력(1~100)=>");
		int j4=scanner.nextInt();
		for(;;) {
			if(j4<0||j4>100) {
				System.out.println("오류");
			}else if(i4==j4) {
				System.out.println("정답!");
				break;
			}else if(i4<j4) {
				System.out.println("입력하신 수보다 작습니다.");
				System.out.print("숫자 입력(1~100)=>");
				j4=scanner.nextInt();
			}else {
				System.out.println("입력하신 수보다 큽니다.");
				System.out.print("숫자 입력(1~100)=>");
				j4=scanner.nextInt();
			}
		}
		//5 "종료"입력될때까지 무한루프
		for(;;) {
			System.out.print("입력=>");
			String i5=scanner.next();
			if(i5.equals("종료")) {
				break;
			}
		}
		
		while(true) {
			System.out.print("입력=>");
			String i5=scanner.next();
			if(i5.equals("종료")) {
				break;
			}
		}
		
		do {
			System.out.print("입력=>");
			String i5=scanner.next();
			if(i5.equals("종료")) {
				break;
			}
		}while(true);
		
	}

}
