package human.com.eex;
import java.util.Scanner;

public class Java1027Test {
	public static boolean f369(int count) {
		boolean isReturnFlag=true;
		while (count != 0) {
			if (count % 10 % 3 == 0&&count%10!=0) {
				System.out.print("짝");
				isReturnFlag=false;
			}
			count = count / 10;
		}
		return isReturnFlag;
	}
	public static void main(String[] args) {
		//1 자릿수 관계없이 369게임 만들기
		for (int count = 1; count < 1000; count++) {
			if (f369(count)) {
				System.out.print(count);
			}
			System.out.print("\t");
		}
		
		// 2 함수를 사용해서 랜덤문제풀이
		int scour = 0, level = 1;
		for (;;) {
			// 입력화면
			System.out.println(level+"단계");
			int result = madeQuestionAndDisplay(level);
			scour+=result;
			level = madeLevel(scour,level);
			// 입력후 결과화면
			int a=resultDisplay(scour, level);
			// 게임계속진행여부결정
			if(a==1) {
				break;
			}else {}
		}
		System.out.println("게임종료");
	}
	public static int madeQuestionAndDisplay(int c) {
		Scanner scanner=new Scanner(System.in);
		int result=0;
		for(;;) {
			int a1=(int)(Math.random()*99)+1;
			int b1=(int)(Math.random()*99)+1;
			if (c == 1) {
				System.out.print(a1 + "+" + b1 + "=");
				int ans = scanner.nextInt();
				if (ans == a1 + b1) {
					System.out.println("정답");
					result=20;
					break;
				} else {
					System.out.println("오답");
					result=-10;
					break;
				}
			}else if(c==2) {
				System.out.print(a1 + "-" + b1 + "=");
				int ans = scanner.nextInt();
				if (ans == a1 - b1) {
					System.out.println("정답");
					result=20;
					break;
				} else {
					System.out.println("오답");
					result=-10;
					break;
				}
			}else if(c==3) {
				System.out.print(a1 + "*" + b1 + "=");
				int ans = scanner.nextInt();
				if (ans == a1 * b1) {
					System.out.println("정답");
					result=20;
					break;
				} else {
					System.out.println("오답");
					result=-10;
					break;
				}
			}else {
				System.out.print(a1 + "/" + b1 + "=");
				int ans = scanner.nextInt();
				if (ans == a1 / b1) {
					System.out.println("정답");
					result=20;
					break;
				} else {
					System.out.println("오답");
					result=-10;
					break;
				}
			}
		}
		return result;
	}
	public static int madeLevel(int scour,int level) {
		if(scour>=300) {
			level=4;
		}else if(scour>=200) {
			level=3;		
		}else if(scour>=100) {
			level=2;			
		}else {
			level=1;
		}
		System.out.println(scour+"점 "+level+"단계");
		return level;
	}
	public static int resultDisplay(int scour,int level) {
		int a;
		if(scour>=400&&level==4) {
			a=1;
		}else {
			a=0;
		}
		return a;
	}

}
