package Decorator;

public class DecoratorTest {

	public static void main(String args[]){
		
		Sourceable able=new Source();
		Sourceable dec=new Decorator(able);
		dec.method();
	}
}
