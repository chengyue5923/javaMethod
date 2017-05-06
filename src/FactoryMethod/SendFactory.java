package FactoryMethod;

public class SendFactory {

	public Sender producr(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.print("��������ȷ������");
			return null;	
		}
	}
}
