package exe5;

import java.util.Scanner;

public class SomaDigitos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero, soma=0, aux2 = 0;
		double aux;
		
		System.out.print("Digite um número de no mínimo 2 dígitos: ");
		numero = leitor.nextInt();
		
		if(numero < 10) {
			System.out.print("Digite um número de no mínimo 2 dígitos: ");
			numero = leitor.nextInt();
		}else
			if(numero > 10 && numero < 100) {
				aux = numero / 10;
				soma += aux; 
				aux = numero % 10;
				soma += aux;		
			}else
				if(numero > 100 && numero<1000) {
					aux2 = numero / 100;//pega o primeiro digito dos 3 digitos
					soma += aux2;//incrementa na variavel que vai guardar a soma
					numero = numero % 100;//elimina o primeiro digito
					
					aux2 = numero / 10;//pega o segundo digito dos 3 digitos
					soma += aux2;//incrementa na variavel que vai guardar a soma
					numero= numero % 10;//elimina o segundo digito
					
					soma += numero;//incrementa na variavel que vai guardar a soma o ultimo digito
				}else
					if(numero > 1000 && numero < 10000) {
						aux2 = numero / 1000;//pega o primeiro digito dos 4 digitos
						soma += aux2;//incrementa na variavel que vai guardar a soma
						numero = numero % 1000;//elimina o primeiro digito
						
						aux2 = numero / 100;//pega o segundo digito dos 4 digitos
						soma += aux2;//incrementa na variavel que vai guardar a soma
						numero = numero % 100;//elimina o segundo digito
						
						aux2 = numero / 10;//pega o terceiro digito dos 4 digitos
						soma += aux2;//incrementa na variavel que vai guardar a soma
						numero= numero % 10;//elimina o terceiro digito
						
						soma += numero;//incrementa na variavel que vai guardar a soma o ultimo digito	
					}else
						if(numero > 10000 && numero <100000) {
							aux2 = numero / 10000;//pega o primeiro digito dos 5 digitos
							soma += aux2;//incrementa na variavel que vai guardar a soma
							numero = numero % 10000;//elimina o primeiro digito
							
							aux2 = numero / 1000;//pega o segundo digito dos 5 digitos
							soma += aux2;//incrementa na variavel que vai guardar a soma
							numero = numero % 1000;//elimina o segundo digito
							
							aux2 = numero / 100;//pega o terceiro digito dos 5 digitos
							soma += aux2;//incrementa na variavel que vai guardar a soma
							numero= numero % 100;//elimina o terceiro digito
							
							aux2 = numero / 10;//pega o terceiro digito dos 5 digitos
							soma += aux2;//incrementa na variavel que vai guardar a soma
							numero= numero % 10;//elimina o quarto digito
							
							soma += numero;//incrementa na variavel que vai guardar a soma o ultimo digito	
							
						}
		
						System.out.print(soma);

	}

}
