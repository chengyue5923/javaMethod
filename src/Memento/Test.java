package Memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建原始类
		Original origi=new Original("original");
		
		//创建备忘录
		
		Storage storage=new Storage(origi.createMemento());
		
		//修改原始类的状态
		
		System.out.println("原始类的状态："+origi.getValue());
		origi.setValue("new");
		System.out.println("新的状态："+origi.getValue());
		
		//回复原始状态
		
		origi.restoreMemento(storage.getMemento());
		System.out.println("回复原始状态状态："+origi.getValue());
	}

}
