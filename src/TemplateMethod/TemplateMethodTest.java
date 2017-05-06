package TemplateMethod;

public class TemplateMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp="8+8";
		AnstractCalculator an1=new Plus();
		int result=an1.calculate(exp, "\\+");
		System.out.println("----exp--"+result);
		
		String expmul="12-4";
		AnstractCalculator anmul=new Multi();
		int resultmul=anmul.calculate(expmul, "\\-");
		System.out.println("---expmul---"+resultmul);
		
		String ecpmulyipy="3*4";
		AnstractCalculator mulyipy=new Multiliplty();
		int resultmulyipy=mulyipy.calculate(ecpmulyipy, "\\*");
		System.out.println("---ecpmulyipy---"+resultmulyipy);
		
		
	}

}
