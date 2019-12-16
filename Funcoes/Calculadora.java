import java.util.Scanner;
//Programa baseado no Exercicio 1 e 2 de funções
public class Calculadora{
	public static double soma(double  a,double  b){
		return a+b;
	}
	public static double subtracao(double  a,double b){
		return a-b;
	}
	public static double multiplicacao(double  a,double  b){
		return a*b;
	}
	public static double divisao(double  a,double  b){
		return a/(b*1.0);
	}
	public static double potencia(double  a,int  b){
		double pot=1;
		for(int i=0;i<b;i++){
			pot*=a;
		}
		return pot;
	}
	public static int raiz(double  a){
		int num=(int)a,aux,cont;
		aux=num;
		cont=0;
		for(int i=1;num>0;i+=2,cont++){
			num-=i;
		}
		return cont;
	}
	
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
						"5- potencia\n"+
						"6- raiz\n"+
						"7- sair\n"+
						"Digite a opcao: ";
			System.out.println(menu);
			opcao=sc.nextInt();
			if(opcao==7)break repeticao;
			else if(opcao>7){
				System.out.println("\n============\nOpcao nao encontrada\n\n");
				continue repeticao;
			}
			double num1,num2,resposta;
			int pot=1;
			System.out.print("Primeiro numero: ");
			num1=sc.nextDouble();
			num2=0;
			if(opcao!=5&&opcao!=6){
				System.out.print("Segundo numero: ");
				num2=sc.nextDouble();
			}else if(opcao!=6){
				System.out.print("Segundo numero, inteiro: ");
				pot=sc.nextInt();
			}
			resposta=0;
			caractere=' ';
			if(opcao==1){
				resposta=soma(num1,num2);
				caractere='+';
			}else if(opcao==2){
				resposta=subtracao(num1,num2);
				caractere='-';
			}else if(opcao==3){
				resposta=multiplicacao(num1,num2);
				caractere='*';
			}else if(opcao==4){
				resposta=divisao(num1,num2);
				caractere='/';
			}else if(opcao==5){
				resposta=potencia(num1,pot);
				caractere='^';
			}else if(opcao==6){
				resposta=(double)raiz(num1);
				caractere='/';
			}
			if(opcao>=1&&opcao<=4)
				System.out.println("\n============\n"+num1+" "+caractere+" "+num2+" = "+resposta+"\n\n");
			else if(opcao==5){
				num2=pot;
				System.out.println("\n============\n"+num1+" "+caractere+" "+num2+" = "+resposta+"\n\n");
			}
			else if(opcao==6){
				int inteiro=(int)resposta;
				System.out.println("\n============\nraiz de "+num1+" = "+inteiro+"\n\n");
			}
			 
		}

	}
}