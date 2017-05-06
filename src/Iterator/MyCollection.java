package Iterator;


public class MyCollection implements Collection {

	
	public String string[]={"A","B","C","D","E","F"};
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return string[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
