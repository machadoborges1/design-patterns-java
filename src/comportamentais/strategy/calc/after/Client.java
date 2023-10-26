package comportamentais.strategy.calc.after;

import comportamentais.strategy.calc.after.strategies.AdditionOperation;
import comportamentais.strategy.calc.after.strategies.DivisionOperation;
import comportamentais.strategy.calc.after.strategies.MultiplicationOperation;
import comportamentais.strategy.calc.after.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
