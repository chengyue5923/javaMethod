package Observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("notify--------");
		notifiyObserver();
	}

}
