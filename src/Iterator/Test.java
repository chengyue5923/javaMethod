package Iterator;

public class Test {

	public static void main(String args[]){
		Collection collection=new MyCollection();
		Iterator iterator=collection.iterator();
		
		
		while(iterator.hasnext()){
			System.out.println("---"+iterator.next());
		}
	}
}
