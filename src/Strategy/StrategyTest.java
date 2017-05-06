package Strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp="2+8";
		ICalculator cal=new Plus();
		int result=cal.calculate(exp);
		System.out.println("----"+result);
		
		String expMul="8-3";
		ICalculator calMul=new Minus();
		int results=calMul.calculate(expMul);
		System.out.println("----"+results);
		
		String Mulply="2*3";
		ICalculator calply=new Multiply();
		int resultsd=calply.calculate(Mulply);
		System.out.println("-----"+resultsd);
	}
}
