import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args) {
		Scanner sc;
		int opcao;
		char caractere;
		sc=new Scanner(System.in);
		repeticao:while(true){
			String menu="\tMenu\n"+
						"1- soma\n"+
						"2- subtracao\n"+
						"3- multiplicacao\n"+
						"4- divisao\n"+
						"5- sair\n"+
						"Digite a opcao: ";
			System.out.println(menu);
			opcao=sc.nextInt();
			if(opcao==5)break repeticao;
			double num1,num2,resposta;
			System.out.println("Primeiro numero");
			num1=sc.nextDouble();
			System.out.println("Segundo numero");
			num2=sc.nextDouble();
			resposta=0;
			caractere=' ';
			if(opcao==1){
				resposta=num1+num2;
				caractere='+';
			}else if(opcao==2){
				resposta=num1-num2;
				caractere='-';
			}else if(opcao==3){
				resposta=num1*num2;
				caractere='*';
			}else if(opcao==4){
				resposta=num1/num2;
				caractere='/';
			}
			if(opcao>=1&&opcao<=4)
				System.out.println(num1+" "+caractere+" "+num2+" = "+resposta);
			else System.out.println("Opcao nao encontrada");
		}

	}
}