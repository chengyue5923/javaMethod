package Observer;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private List<Observer> vector=new ArrayList<Observer>();
	
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	@Override
	public void notifiyObserver() {
		// TODO Auto-generated method stub

		try{
//			Enumeration<Observer> enumo=vector.elements();
//			while(enumo.hasMoreElements()){
//				enumo.nextElement().update();
//			}
			for(int i=0;i<vector.size();i++){
				System.out.println("------"+i);
				vector.get(i).update();
			}
		}catch(Exception e){
			
		}
	
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub

	}

}
