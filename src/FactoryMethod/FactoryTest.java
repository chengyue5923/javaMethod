package FactoryMethod;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/**
	 * ��������
	 */
		try{
			SendFactory sf=new SendFactory();
			Sender sms=sf.producr("sms");
			sms.Send();
			Sender mail=sf.producr("mail");
			mail.Send();
			Sender test=sf.producr("test");
			test.Send();
		}catch(Exception e){
			
		}
	/**
	 * �����������
	 * 
	 */
		try{
			Sender sms=SendMoreFactory.producrSms();
			sms.Send();
			
			Sender maild=SendMoreFactory.producrMail();
			maild.Send();
		}catch(Exception e){
			
		}
		
		
		
	}

}
