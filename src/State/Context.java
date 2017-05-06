package State;

public class Context {

	private Sate sate;

	public Context(Sate sate) {
		this.sate = sate;
	}

	public Sate getSate() {
		return sate;
	}

	public void setSate(Sate sate) {
		this.sate = sate;
	}
	
	
	public void method(){
		if(sate.getValue().equals("state1")){
			sate.method1();
		}else if (sate.getValue().equals("state2")){
			sate.method2();
		}
	}
	
}
