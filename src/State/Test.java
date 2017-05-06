package State;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sate state=new Sate();
		Context con=new Context(state);
		
		state.setValue("state1");
		con.method();
		
		state.setValue("state2");
		con.method();
		
	}

}
