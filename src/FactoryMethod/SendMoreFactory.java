package FactoryMethod;

public class SendMoreFactory {

	
	 public static Sender producrSms(){
		 return new SmsSender();
	 }
	 
	 public static Sender producrMail(){
		 return new MailSender();
	 }
}
