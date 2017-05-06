package AbstractFactory;

public class SmsSemderFactory  implements Provider{

	@Override
	public Sender producr() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
