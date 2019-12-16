import java.util.Scanner;
//Programa baseado no Exercicio 2 de vetores
public class Cpf{
	public static int retornaVerificador(int soma){
		int resto=soma%11;
		int digito=11-resto;
		if(digito>9)digito=0;
		return digito;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true){
			//sc.next();
			int[] entrada;
			entrada=new int[9];
			System.out.println("Insira os nove primeiros digitos do cpf:");
			for(int i=0;i<9;i++)entrada[i]=sc.nextInt();
			int soma;
			soma=0;
			for(int i=10;i>1;i--){
				soma+=i*entrada[Math.abs(i-10)];
			}
			System.out.println("soma1 : "+soma);
			int primeiro=retornaVerificador(soma);
			soma=0;
			for(int i=11;i>3;i--){
				soma+=i*entrada[Math.abs(i-11)];
			}
			soma+=primeiro*2;

			System.out.println("soma2 : "+soma);
			int segundo=retornaVerificador(soma);
			String saida="";
			for(int i=0;i<9;i++){
				saida+=entrada[i];
				if(i!=8)saida+=".";
			}
			saida+="-"+primeiro+"."+segundo;

			System.out.println("Seu cpf he: "+saida+"\n");
		}
	}
}