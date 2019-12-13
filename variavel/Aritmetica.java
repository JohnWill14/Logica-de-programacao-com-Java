import java.util.Scanner;
public class Aritmetica{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira dois numeros inteiros:");
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.printf("%02d + %02d = %02d\n",x,y,x+y);
		System.out.printf("%02d - %02d = %02d\n",x,y,x-y);
		System.out.printf("%02d * %02d = %02d\n",x,y,x*y);
		System.out.printf("%02d / %02d = %02.02f\n",x,y,x/(y*1.0));
	}
}