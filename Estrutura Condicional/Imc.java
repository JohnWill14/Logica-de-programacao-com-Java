import java.util.Scanner;
public class Imc{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Insira o peso, em kg, e a altura, em metros, para o calculo do imc:");
		double peso,altura,imc;
		peso=sc.nextDouble();
		altura=sc.nextDouble();
		imc=peso/(altura*altura);
		if(imc<10)System.out.println("Desnutricao grau V");
		else if(imc<12.9)System.out.println("Desnutricao grau IV");
		else if(imc<15.9)System.out.println("Desnutricao grau III");
		else if(imc<16.9)System.out.println("Desnutricao grau II");
		else if(imc<18.4)System.out.println("Desnutricao grau I");
		else if(imc<24.9)System.out.println("Normal");
		else if(imc<29.9)System.out.println("Pre-obesidade");
		else if(imc<34.5)System.out.println("Obesidade grau I");
		else if(imc<39.9)System.out.println("Obesidade grau II");
		else System.out.println("Obesidade grau III");
	}
}