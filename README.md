# import java.util.Scanner;


public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int a=scanner.nextInt();
int b=scanner.nextInt();
int c=scanner.nextInt();
if(a>b&& a>c){
	System.out.println("a is greater");
}else if(b>c){
	System.out.println("b is greater");
}else{
	System.out.println("c is greater");
}
	}

}
