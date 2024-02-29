package exercicio01;
import java.util.*;
 
 class somar2numeros {
	 public static Scanner sc = new Scanner(System.in);
	 
	 public static void main(String args[]) {
	  //Declarar variaveis.
      int soma,num1,num2;

      //Ler primeira variavel.
      System.out.println("Digite um numero");
      num1 = sc.nextInt();

      //Ler segunda variavel 
      System.out.println("Digite um numero");
      num2 = sc.nextInt();
	
	  //Soma
      soma = num1 + num2;
      
      //Mostrar na tela.
      System.out.println("soma: " + soma);
      
	 }
}
