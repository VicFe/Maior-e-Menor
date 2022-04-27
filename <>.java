package numeração;
import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 6; 
	    int v[] = new int[n]; 
	    int i; 
	    String resultado;

	    // Entrada de Dados
	    for (i=0; i<n; i++) {
	      System.out.printf("Informe o primeiro valor [%d]: ",i);
	      v[i] = Integer.parseInt(ler.nextLine());
	    }

	    // Processamento: somar todos os valores, definir o maior e o menor valor
	    int soma = 0;
	    int menor = v[0]; 
	    int maior = v[0];
	    for (i=0; i<n; i++) {
	      soma = soma + v[i];

	      if (v[i] < menor)
	         menor = v[i];

	      if (v[i] > maior)
	         maior = v[i];
	    }

	    // Saída (resultados)
	    System.out.printf("\n");
	    for (i=0; i<n; i++) {
	      if (v[i] == menor)
	        System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
	      else if (v[i] == maior)
	              System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
	           else System.out.printf("v[%d] = %2d\n", i, v[i]);
	    } 
	    
	    System.out.printf("\n");
	    System.out.printf("Você gostaria de saber a soma de todos os números: %n"
	    				+ "Se sim digite (S) %n"
	    				+ "se não digite (N) %n"
	    				+ "Digite aqui --->:"); 
	    resultado = ler.nextLine();
	    
	    if (resultado.equals("S")) {
	    	System.out.printf("\nSoma = %d\n", soma);
	    } else if (resultado.equals("N")) {
	    	System.out.printf("Ta baum");
	    } else {System.out.printf("Operação invalida");}
	    
	    ler.close();
	} 
}
