public class TodaTabuada{
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			int multiplicador;
			multiplicador=i<=10?i:i-5;

			if(i==1||i==11){
				if(i==11)System.out.println();
				System.out.println("Tabuada de "+multiplicador+"\t\tTabuada de "+(multiplicador+1)+"\t\tTabuada de "+(multiplicador+2)+"\t\tTabuada de "+(multiplicador+3)+"\t\tTabuada de "+(multiplicador+4));
			}
			String linha=new String("");
			int multiplicando;
			multiplicando=i>10?multiplicador-5:multiplicador;
			for(int j=0;j<5;j++){
				int n;
				n=i<=10?j+1:j+6;
				if(j!=0&&i<10)linha+=" 		  ";
				else if(i>=10&&j!=0)linha+="   		  ";
				linha+=(n)+"x"+multiplicando+" = "+(n*multiplicando);
			}
			System.out.println(linha);
		}
	}
}