
public class CalculadoraTestes {
	public static void main(String[]args) {
		
		
		/**
		 * Soma:
		 * linha 14 sera o titulo desse bloco de testes
		 * linha 15 estamos pegando a classe Soma e instanciando uma variavel 'calc1' 
		 * linha 17 setamos como inteiro uma variavel 'soma', pegando a variavel instanciada 'calc1' e atribuindo o metodo da Classe Soma e seus valores.
		 * linha 18 estamos imprimindo o resultado da variavel 'soma'.
		 * linha 20 a 27 sera criano um novo teste, usando valores diferentes atribuidos a variavel instanciada, seu metodo e valores. Em seguida imprime seu resultado.
		 */
		System.out.println("Calculos de Soma:");
		Soma calc1 = new Soma();
		
		int soma = calc1.somar(3,7);
		System.out.println(soma);
		
		soma = calc1.somar(3,0);
		System.out.println(soma);
		
		soma = calc1.somar(0,0);
		System.out.println(soma);
		
		soma = calc1.somar(3,-1);
		System.out.println(soma);
		
		 
		/* Subtracao:
		 * linha 37 sera o titulo desse bloco de testes
		 * linha 38 estamos pegando a classe Subtracao e instanciando uma variavel 'calc2'
		 * linha 40 setamos como inteiro uma variavel 'sub', pegando a variavel instanciada 'calc2' e atribuindo o metodo da Classe Subtracao e seus valores.
		 * linha 41 estamos imprimindo o resultado da variavel 'sub'.
		 * linha 43 a 50 sera criano um novo teste, usando valores diferentes atribuidos a variavel instanciada, seu metodo e valores. Em seguida imprime seu resultado.
		 */
		System.out.println("\nCalculos de Subtracao:");
		Subtracao calc2 = new Subtracao();
		
		int sub = calc2.subtrair(10, 7);
		System.out.println(sub);
		
		sub = calc2.subtrair(3, 1);
		System.out.println(sub);
		
		sub = calc2.subtrair(0, 0);
		System.out.println(sub);
		
		sub = calc2.subtrair(100, 10);
		System.out.println(sub);
		
		/* Multiplicacao:
		 * linha 59 sera o titulo desse bloco de testes
		 * linha 60 estamos pegando a classe Multiplicacao e instanciando uma variavel 'calc3'
		 * linha 62 setamos como inteiro uma variavel 'mult', pegando a variavel instanciada 'calc3' e atribuindo o metodo da Classe Multiplicacao e seus valores.
		 * linha 63 estamos imprimindo o resultado da variavel 'mult'.
		 * linha 35 a 72 sera criano um novo teste, usando valores diferentes atribuidos a variavel instanciada, seu metodo e valores. Em seguida imprime seu resultado.
		 */
		System.out.println("\nCalculos de Multiplicacao:");
		Multiplicacao calc3 = new Multiplicacao();
				
		int mult = calc3.multiplicar(3, 7);
		System.out.println(mult);
				
		mult = calc3.multiplicar(3, 0);
		System.out.println(mult);
				
		mult = calc3.multiplicar(0, 0);
		System.out.println(mult);
				
		mult = calc3.multiplicar(3, -1);
		System.out.println(mult);
		
		/* Divisao:
		 * linha 81 sera o titulo desse bloco de testes
		 * linha 82 estamos pegando a classe Divisao e instanciando uma variavel 'calc4'
		 * linha 84 setamos como inteiro uma variavel 'div', pegando a variavel instanciada 'calc4' e atribuindo o metodo da Classe Multiplicacao e seus valores.
		 * linha 85 estamos imprimindo o resultado da variavel 'div'.
		 * linha 106 sera criano um novo teste, usando valores diferentes atribuidos a variavel instanciada, seu metodo e valores. 
		 * Em seguida na linha 107 imprime seu resultado.
		 */
		System.out.println("\nCalculos de Divisao:");
		Divisao calc4 = new Divisao();
						
		int div = calc4.dividir(30, 10);
		System.out.println(div);
			
		/**
		 * 	div = calc4.dividir(3, 1.5);
			System.out.println(div);
			
			Esse cenario em especifico retornara um erro, quebrando teste... O motivo ocorre por conta da tipagem dos valores, 
			o primeiro (int) e o segundo (float/double)
			
			Para resolucao desse problema seria trocar a tipagem, deixando iguais, no caso de numeros decimais usariamos float/double para resolver.
		 */
		
		/**
		 * 	div = calc4.dividir(0, 0);
			System.out.println(div);
			
			Nesse cenario tambem retornara um erro, pois 0 nao e divisor, ocorrendo uma quebra no teste!
			Para esse teste dar certo, teriamos que alterar os valores passados no indice a e b.
		 */
		
						
		div = calc4.dividir(3, -1);
		System.out.println(div);
	}
}
