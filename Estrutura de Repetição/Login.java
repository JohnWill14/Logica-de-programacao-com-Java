import java.util.Scanner;
public class Login{
	public static void main(String[] args) {
		final String login="user",password="123";
		 String logo,senha;
		Scanner sc;
		sc=new Scanner(System.in);
		Login:while(true){
			System.out.print("Insira o login: ");
			logo=sc.next();
			System.out.print("Insira senha: ");
			senha=sc.next();
			if(logo.equals(login)&&senha.equals(password)){
				System.out.println("Acesso permitido\n");
				break Login;
				
			}else{
				System.out.println("Acesso negado\n");
				continue Login;
			}
		}
	}
}