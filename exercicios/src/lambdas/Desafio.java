package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod = new Produto("Ipad", 3500.00, 0.15);
		
		Function<Produto , Double> valorDesconto = preco  -> 
		prod.preco * (1 - prod.desconto);
		
		UnaryOperator<Double> imposto = valor ->
		valor >= 2500 ? valor = valor * 1.085 : valor; 		
		
		UnaryOperator<Double> frete = valor ->
		valor >= 3000 ? valor += 100 : valor + 50;
		
		UnaryOperator<Double> arredondar = num ->
		(double) Math.round(num * 100)/ 100;
		
		Function<Double, String> formatar = num -> 
		("R$" + num).replace('.', ',');
		
		System.out.println(valorDesconto.andThen(imposto).andThen(frete.andThen(arredondar)).andThen(formatar).apply(prod));
		
			
		}

}
