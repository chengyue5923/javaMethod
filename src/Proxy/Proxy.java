package Proxy;

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy(Source source) {
		super();
		this.source = source;
	}

	private void after(){
		
		System.out.println("after()");
	}
	private void berore(){
		System.out.println("berore()");
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub

		berore();
		source.method();
		after();
	}

}
