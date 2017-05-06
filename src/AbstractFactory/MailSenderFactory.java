package AbstractFactory;

public class MailSenderFactory implements Provider{

	@Override
	public Sender producr() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
