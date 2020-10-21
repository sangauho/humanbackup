package human.com.eex;

public class JavaClass1021 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		//1.
		int a1=2, b1=1;
		b1++;
		System.out.println(a1+","+b1);
		while(b1<15) {
			a1+=1;
			b1+=a1;
		}
		System.out.println(a1+","+b1);
		
		int a11=2, b11=1;
		b11++;
		System.out.println(a11+","+b11);
		for(b11=2;b11<15;b11+=a11) {
			a11+=1;
		}
		System.out.println(a11+","+b11);
		
		//2.
		int a2;
		for(a2=1;a2<100;a2++) {
			if(100%a2==0) {
				System.out.print(a2+" ");
			}else {
			}
		}
		System.out.println();
		
		//3.
		System.out.print("숫자 입력==>");
		int a3=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력==>");
		int b3=Integer.parseInt(scanner.nextLine());
		int c3, d3=0;
		if(a3>=b3) {
			for(c3=1;c3<a3;c3++) {
				if(a3%c3==0&&b3%c3==0) {
					System.out.print(c3+" ");
					d3=c3;
				}
			}
		}else {
			for(c3=1;c3<b3;c3++) {
				if(a3%c3==0&&b3%c3==0) {
					System.out.print(c3+" ");
					d3=c3;
				}
			}			
		}
		System.out.println();
		System.out.println("최대공약수는 "+d3);
		
		//4.
		System.out.print("숫자 입력==>");
		int a4=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력==>");
		int b4=Integer.parseInt(scanner.nextLine());
		int c4, d4=0;
		if(a4>=b4) {
			for(c4=1;c4<a4;c4++) {
				if(a4%c4==0&&b4%c4==0) {
					d4=c4;
				}
			}
		}else {
			for(c4=1;c4<b4;c4++) {
				if(a4%c4==0&&b4%c4==0) {
					d4=c4;
				}
			}			
		}
		System.out.println("최대공약수는 "+d4);
		
		//5.
		System.out.print("숫자 입력==>");
		int a5,b5=0;
		for(;;) {
			a5=Integer.parseInt(scanner.nextLine());
			b5+=a5;
			if(b5>=100) {
				break;
			}
		}
		System.out.println(b5);
		
		//6.
		System.out.print("숫자 입력==>");
		int a6,b6=0,c6=0,d6=0;
		for(;;) {
			a6=Integer.parseInt(scanner.nextLine());
			if(a6>0&&a6<=10) {
				b6+=a6;
				c6++;
			}else {
				d6++;
			}
			if(c6==3) {
				break;
			}
		}
		System.out.println("제대로 입력한 횟수==>"+c6+
				"\n잘못 입력한 횟수==>"+d6+"\n총합==>"+b6);
		
		//7.
		System.out.print("숫자 입력==>");
		int a7=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력==>");
		int b7=Integer.parseInt(scanner.nextLine());
		int c7, d7=1, e7=0;
		for(c7=1;c7<=b7;c7++) {
			e7=c7*a7;
			for(d7=1;d7<=a7;d7++) {
				if(e7==(d7*b7)) {
					break;
				}
			}
			if(e7==(d7*b7)) {
				break;
			}
		}
		System.out.println("최소공배수는 "+e7);
		
		//8.
		System.out.print("숫자 입력==>");
		int a8=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력==>");
		int b8=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력==>");
		int c8=Integer.parseInt(scanner.nextLine());
		if(a8<b8) {
			if(a8<c8) {
				if(b8<c8) {
					System.out.println("가장 작은 수=>"+a8+" 가장 큰 수=>"+c8);
				}else {
					System.out.println("가장 작은 수=>"+a8+" 가장 큰 수=>"+b8);
				}
			}else {
				System.out.println("가장 작은 수=>"+c8+" 가장 큰 수=>"+b8);
			}
		}else {
			if(b8<c8) {
				if(a8<c8) {
					System.out.println("가장 작은 수=>"+b8+" 가장 큰 수=>"+c8);
				}else {
					System.out.println("가장 작은 수=>"+b8+" 가장 큰 수=>"+a8);
				}
			}else {
				System.out.println("가장 작은 수=>"+c8+" 가장 큰 수=>"+a8);
			}
		}
		
		//9.
		int a9,b9=0;
		for(a9=0;a9<5;) {
			System.out.print("수학 점수=>");
			int c9=Integer.parseInt(scanner.nextLine());
			if(c9>100||c9<0) {
				System.out.println("잘못 입력하셨습니다.");
			}else if(c9<60) {
				b9++;
				a9++;
			}else {
				a9++;
			}
		}
		System.out.println("탈락자=>"+b9+"명");
		
		//10.
		int a10,sum10=0;
		for(a10=1;;a10++) {
			sum10+=a10;
			if(sum10>=100) {
				break;
			}else {
				System.out.print(a10+":"+sum10+" ");
			}
		}
		
		//11.
		System.out.print("메세지 입력=>");
		String a111=scanner.nextLine();
		System.out.print("숫자 입력=>");
		int b111=Integer.parseInt(scanner.nextLine());
		for(int c111=0;c111<b111;c111++) {
			System.out.print(a111);
		}
		System.out.println();
		
		//12.
		System.out.print("숫자 입력=>");
		int a12=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력=>");
		int b12=Integer.parseInt(scanner.nextLine());
		int sum12=0;
		for(a12+=1;a12<b12;a12++) {
			sum12+=a12;
		}
		System.out.println("두 수 사이의 숫자들의 합=>"+sum12);
		
		//13.
		System.out.print("숫자 입력=>");
		int a13=Integer.parseInt(scanner.nextLine());
		int b13, c13=0;
		for(b13=1;b13<=a13;b13++) {
			if(a13%b13==0) {
				c13++;
			}
		}
		if(c13==2) {
			System.out.println(a13+"은 소수입니다.");
		}else {
			System.out.println(a13+"은 소수가 아닙니다.");
		}
		
		//14.
		System.out.print("숫자 입력=>");
		int a14=Integer.parseInt(scanner.nextLine());
		System.out.print("숫자 입력=>");
		int b14=Integer.parseInt(scanner.nextLine());
		int c14;
		for(c14=a14;c14<(a14+b14);c14++) {
			System.out.print(c14+" ");
		}
		
		//15.
		System.out.print("숫자 입력(1~9)=>");
		int a15=Integer.parseInt(scanner.nextLine());
		int b15;
		if(a15>0&&a15<10) {
			for(b15=1;b15<10;b15++) {
				System.out.println(a15+"x"+b15+"="+(a15*b15));
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		//16.
		System.out.print("숫자 입력(1~1000)=>");
		int a16=Integer.parseInt(scanner.nextLine());
		int b16,c16=0;
		for(b16=a16;b16<=1000;b16++) {
			if(b16%a16==0) {
				c16++;
			}
		}
		System.out.println(a16+" 배수의 갯수는 "+c16+"개");
		
		//17.
		System.out.print("행 입력=>");
		int a17=Integer.parseInt(scanner.nextLine());
		System.out.print("열 입력=>");
		int b17=Integer.parseInt(scanner.nextLine());
		int c17,d17,e17=1;
		if(a17*b17>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(c17=0;c17<a17;c17++) {
				for(d17=0;d17<b17;d17++) {
					System.out.print(e17+"\t");
					e17++;
				}
				System.out.println();
			}
		}
		
		//18.
		int a18,b18,c18=1;
		for(a18=0;a18<5;a18++) {
			if(a18==0) {
				for(b18=0;b18<5;b18++) {
					System.out.print(c18+"\t");
					c18++;
				}
			}else if(a18%2==1) {
				c18+=4;
				for(b18=0;b18<5;b18++) {
					System.out.print(c18+"\t");
					c18--;
				}
			}else {
				c18+=6;
				for(b18=0;b18<5;b18++) {
					System.out.print(c18+"\t");
					c18++;
				}
			}
			System.out.println();
		}
		
		//19.
		System.out.print("시작 요일 입력(일~토)=>");
		String a19=scanner.nextLine();
		System.out.print("일수 입력=>");
		int b19=Integer.parseInt(scanner.nextLine());
		int c19;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		switch(a19) {
		case "일":
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if(c19%7==0) {
					System.out.println();
				}else {}
			}
			break;
		case "월":
			System.out.print("\t");
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if((c19+1)%7==0) {
					System.out.println();
				}else {}
			}
			break;
		case "화":
			System.out.print("\t\t");
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if((c19+2)%7==0) {
					System.out.println();
				}else {}
			}
			break;
		case "수":
			System.out.print("\t\t\t");
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if((c19+3)%7==0) {
					System.out.println();
				}else {}
			}
			break;
		case "목":
			System.out.print("\t\t\t\t");
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if((c19+4)%7==0) {
					System.out.println();
				}else {}
			}
			break;
		case "금":
			System.out.print("\t\t\t\t\t");
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if((c19+5)%7==0) {
					System.out.println();
				}else {}
			}
			break;
		default:
			System.out.print("\t\t\t\t\t\t");
			for(c19=1;c19<=b19;c19++) {
				System.out.print(c19+"\t");
				if((c19+6)%7==0) {
					System.out.println();
				}else {}		
			}
			break;
		}
		
		//20.
		System.out.print("게임 회수=>");
		int b20=Integer.parseInt(scanner.nextLine());
		int sum20=0,sum220=0;
		for(int c20=0;c20<b20;c20++) {
			System.out.print("동전 앞,뒤=>");
			String a20=scanner.nextLine();
			if((int)(Math.random()*2)==0) {
				if(a20=="앞") {
					sum20++;
				}else {
					sum220++;
				}
			}else {
				if(a20=="앞") {
					sum220++;
				}else {
					sum20++;
				}
			}
		}
		System.out.println("게임 회수=>"+b20+"맞춘 회수=>"+sum20+"틀린 회수=>"+sum220);
		
		//21.
		System.out.print("게임 회수=>");
		int b21=Integer.parseInt(scanner.nextLine());
		int sum21=0,sum221=0;
		for(int c21=0;c21<b21;c21++) {
			System.out.print("주사위 숫자(1~6)=>");
			int a21=Integer.parseInt(scanner.nextLine());
			if((int)(Math.random()*6)==(a21-1)) {
				sum21++;
			}else {
				sum221++;
			}
		}
		System.out.println("게임 회수=>"+b21+"맞춘 회수=>"+sum21+"틀린 회수=>"+sum221);
		
	}

}
