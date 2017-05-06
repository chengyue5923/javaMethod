package Command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Receiver receiver=new Receiver();
		Command cmd=new MyCommand(receiver);
		Invoker iv=new Invoker(cmd);
		iv.action();
	}

}
