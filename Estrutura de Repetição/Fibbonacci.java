public class Fibbonacci{
	public static void main(String[] args) {
		int a,b,c,aux;
		a=1;
		b=1;
		c=0;
		for(int i=3;i<=15;i++){
			c=a+b;
			aux=b;
			b=c;
			a=aux;
		}
		System.out.println(b);
	}
}