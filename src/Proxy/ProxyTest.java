package Proxy;

public class ProxyTest {


	public static void main(String args[]){
		
		Source source=new Source();
		
		Proxy px=new Proxy(source);
		
		px.method();
	}
}
