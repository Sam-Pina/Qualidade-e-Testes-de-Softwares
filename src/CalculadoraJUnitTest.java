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
		
	
		Soma calc10 = new Soma();
		
		int soma1 = calc10.somar(30,7);
		System.out.println(soma1);
		
		Assert.assertEquals(37, soma1);
		

		Soma calc11 = new Soma();
		
		int soma2 = calc11.somar(32,8);
		System.out.println(soma2);
		
		Assert.assertEquals(40, soma2);
		
		
		Soma calc12 = new Soma();
		
		int soma3 = calc12.somar(13,7);
		System.out.println(soma3);
		
		Assert.assertEquals(20, soma3);
		
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
		
		Subtracao calc21 = new Subtracao();
		
		int sub1 = calc21.subtrair(80, -7);
		System.out.println(sub1);
		
		Assert.assertEquals(87, sub1);
		
		Subtracao calc22 = new Subtracao();
		
		int sub2 = calc22.subtrair(10, 7);
		System.out.println(sub2);
		
		Assert.assertEquals(3, sub2);
		
		Subtracao calc23 = new Subtracao();
		
		int sub3 = calc23.subtrair(600, 1);
		System.out.println(sub3);
		
		Assert.assertEquals(599, sub3);
		
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
		
		Multiplicacao calc = new Multiplicacao();
				
		int mult1 = calc.multiplicar(2, 10);
		System.out.println(mult);
		
		Assert.assertEquals(20, mult1);
		
		
		Multiplicacao calc5 = new Multiplicacao();
				
		int mult2 = calc5.multiplicar(2, -10);
		System.out.println(mult2);
		
		Assert.assertEquals(-20, mult2);
		
		
		Multiplicacao calc6 = new Multiplicacao();
				
		int mult3 = calc6.multiplicar(22, -10);
		System.out.println(mult3);
		
		Assert.assertEquals(-220, mult3);
		
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
		
		System.out.println("\nCalculos de Divisao:");
		Divisao calc41 = new Divisao();
						
		int div = calc41.dividir(30, 2);
		System.out.println(div);
		
		Assert.assertEquals(15, div);
		
		System.out.println("\nCalculos de Divisao:");
		Divisao calc42 = new Divisao();
						
		int div1 = calc42.dividir(8, 2);
		System.out.println(div1);
		
		Assert.assertEquals(4, div1);
		
		System.out.println("\nCalculos de Divisao:");
		Divisao calc43 = new Divisao();
						
		int div2 = calc43.dividir(9, 3);
		System.out.println(div);
		
		Assert.assertEquals(3, div2);
	}
}
