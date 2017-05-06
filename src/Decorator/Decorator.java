package Decorator;

public class Decorator  implements Sourceable{

	
	private Sourceable source;
	
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}


	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before----");
		source.method();
		System.out.println("After-----");
	}

}
