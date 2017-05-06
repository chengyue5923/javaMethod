package FactoryMethod;

public class SendFactory {

	public Sender producr(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.print("请输入正确的类型");
			return null;	
		}
	}
}
