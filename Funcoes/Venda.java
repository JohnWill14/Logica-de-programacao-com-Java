import java.util.Scanner;
//Programa baseado no Exercicio 5 de funções
public class Venda{
	public static Scanner sc;
	public static double venda(double valor){
		valor=valor*1.25+valor*0.65;
		return valor;
	}
	public static double desconto(double valor,double desconto){
		valor=valor*(100-desconto)/100.0;
		return valor;
	}
	public static double parcelamento(double valor,int parcelas){
		valor=(valor/(parcelas*1.0))*1.02;
		return valor;
	}
	public static double CalculaAtraso(double valor,double taxa,int dia){
		valor=valor+(valor+	(taxa/100)*dia);
		return valor;
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		String menu="\tMenu\n"+
				"=================\n"+
				"1- Venda\n"+
				"2- Pagamento a vista\n"+
				"3- Pagamento parcelado\n"+
				"4- Prestacao atraso\n"+
				"5- Sair";
		int opcao;
		programa:while(true){
			System.out.println(menu+"\nSelecione uma opcao do menu: ");
			opcao=sc.nextInt();
			
			if(opcao==5){ 
				break programa;
			}
			else if(opcao==1){
				System.out.print("Insira o valor da venda: R$ ");
				double venda;
				venda=sc.nextDouble();
				double valor=venda(venda);
				System.out.println("A venda ficou em "+valor);
			}
			else if(opcao==2){
				System.out.print("Insira o valor da venda: R$ ");
				double venda,desconto;
				venda=sc.nextDouble();
				while(true){					
					System.out.print("Insira o valor do percentual de desconto: ");
					desconto=sc.nextDouble();
					if(desconto>15)System.out.println("\nValor de desconto nao aceito\n\n");
					else break;
				}
				double valor=desconto(venda,desconto);
				System.out.println("O pagamento ficou em "+valor);
			}
			else if(opcao==3){
				System.out.print("Insira o valor da venda: R$ ");
				double venda=0;
				int parcelas=0;
				venda=sc.nextDouble();
				while(true){					
					System.out.print("Insira o valor a quantidade de parcelas: ");
					parcelas=sc.nextInt();
					if(parcelas>=3&&parcelas<=36)System.out.println("\nQuantidade de parcelas nao permitido\nquantidade possivel >3 e menor que 36\n\n");
					else break;
				}
				double valor=parcelamento(venda,parcelas);
				System.out.println("As parcelas ficaram em "+valor);
			}
			else if(opcao==4){
				System.out.print("Insira o valor atual da prestacao ");
				double prestacao,taxa;
				int diasAtraso;
				prestacao=sc.nextDouble();
				System.out.print("Insira o valor da taxa: ");
				taxa=sc.nextDouble();
				System.out.print("Insira a quantidade de dias atrasados ");
				diasAtraso=sc.nextInt();
				double valor=CalculaAtraso(prestacao,taxa,diasAtraso);
				System.out.println("A prestacao ficou em  "+valor);
			}
			
		

		}
	}
}