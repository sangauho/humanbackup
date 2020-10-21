package human.com.eex;

public class Java1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.out.println("테스트");
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
*/
		
		//사용자가 1004를 입력할때까지 반복해보자.
		for(;;) {
			System.out.println(">>");
			int a=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
			if(a==1004) {
				break;
			}
			
		}
		
		
		
	}

}
