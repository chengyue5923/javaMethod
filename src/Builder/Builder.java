package Builder;

import java.util.ArrayList;
import java.util.List;

import FactoryMethod.MailSender;
import FactoryMethod.Sender;
import FactoryMethod.SmsSender;

public class Builder {
	
	private List<Sender> list=new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		if(count > 0){
			for(int i=0;i<count;i++){
				list.add(new MailSender());
			}
		}
	}
	public void produceSmsSender(int count){
		if(count >0){
			for(int i=0;i<count;i++){
				list.add(new SmsSender());
			}
		}
	}

}
