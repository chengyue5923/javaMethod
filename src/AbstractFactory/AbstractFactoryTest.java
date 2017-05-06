
package AbstractFactory;

public class AbstractFactoryTest {

	public static void main(String args[]){
		Provider pv=new SmsSemderFactory();
		Sender sd=pv.producr();
		sd.Send();
		
		Provider pvmail=new MailSenderFactory();
		Sender pvmailsd=pvmail.producr();
		pvmailsd.Send();
	}
	                                      
}
