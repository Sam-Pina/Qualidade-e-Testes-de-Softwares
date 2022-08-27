import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraJUnitTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void somarDoisNumerosPositivos() {
		/**
		 * Soma:
		 * Esse teste será verdadeiro utilizando a soma como operador, estamos pegando a classe Soma e instanciando uma variavel 'calc1'
		 * setamos como inteiro uma variavel 'soma', pegando a variavel instanciada 'calc1' e atribuindo o metodo da Classe Soma e seus valores.
		 * 
		 * O teste JUnit desse cenario com o uso do assert devera passar, pois estamos somando o valor 3 e o valor 7, resultando em 10 que colocamos no assert.
		 */
		System.out.println("Calculos de Soma:");
		Soma calc1 = new Soma();
		
		int soma = calc1.somar(3,7);
		System.out.println(soma);
		
		Assert.assertEquals(10, soma);
		
		/**
		 * Subtração:
		 * Esse teste será verdadeiro utilizando a subtracao como operador, estamos pegando a classe Subtracao e instanciando uma variavel 'calc2'
		 * setamos como inteiro uma variavel 'sub', pegando a variavel instanciada 'calc2' e atribuindo o metodo da Classe Subtracao e seus valores.
		 * 
		 * O teste JUnit desse cenario com o uso do assert devera passar, pois estamos subtraindo o valor 30 e o valor 7, resultando em 23 que colocamos no assert.
		 * O assert serve como uma comparação em nosso teste.
		 */
		System.out.println("\nCalculos de Subtracao:");
		Subtracao calc2 = new Subtracao();
		
		int sub = calc2.subtrair(30, 7);
		System.out.println(sub);
		
		Assert.assertEquals(23, sub);
		
		/**
		 * Multiplicação:
		 * Esse teste será falso utilizando a multiplicacao como operador, estamos pegando a classe Multiplicação e instanciando uma variavel 'calc3'
		 * setamos como inteiro uma variavel 'mult', pegando a variavel instanciada 'calc3' e atribuindo o metodo da Classe Multiplicação e seus valores.
		 * 
		 * O teste JUnit desse cenario com o uso do assert devera falhar, pois estamos multiplicando o valor 3 e o valor 10, resultando em 30 e colocamos o resultado como 60 no assert.
		 * Entao vai ocorrer uma quebra na aplicacao e nao seguira para o caso de divisao, para resolução dessa falha deveriamos alterar o valor do resultado no assert.
		 */
		System.out.println("\nCalculos de Multiplicacao:");
		Multiplicacao calc3 = new Multiplicacao();
				
		int mult = calc3.multiplicar(3, 10);
		System.out.println(mult);
		
		Assert.assertEquals(60, mult);
		
		/**
		 * Divisao:
		 * Esse teste será falso utilizando a divisao como operador, estamos pegando a classe Divisao e instanciando uma variavel 'calc4'
		 * setamos como inteiro uma variavel 'div', pegando a variavel instanciada 'calc4' e atribuindo o metodo da Classe Divisao e seus valores.
		 * 
		 * O teste JUnit desse cenario com o uso do assert devera falhar, pois apesar de estarmos com resultado certo no assert
		 * estamos dividindo o valor 30 (que é um valor inteiro) e o valor 2.0 (que é um valor decimal float/double), para resolucao desse caso devemos alterar os tipos de variaveis, deixando-as iguais.
		 * e assim teremos o resultado 15 desse calculo, que sera imprimido no assert.
		 
		System.out.println("\nCalculos de Divisao:");
		Divisao calc4 = new Divisao();
						
		int div = calc4.dividir(30, 2.0);
		System.out.println(div);
		
		Assert.assertEquals(15, div);
		
		*/
	}
}
