package ChainOfRespomsibility;

public class MyHandler extends AbstractHandler implements Handler {

	
	String name;

	public MyHandler(String name) {
		super();
		this.name = name;
	}
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println("operator---"+name);
		if(getHandler()!=null){
			getHandler().operator();
		}
	}
}
