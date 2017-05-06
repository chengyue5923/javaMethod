package Strategy;

public class Plus extends AbstractCalCulator implements ICalculator {

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[] =split(exp, "\\+");
		return arrayInt[0]+arrayInt[1];
	}

}
