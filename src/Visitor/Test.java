
package Visitor;

public class Test {

	public static void main(String args[]){
		Visitor vi=new MyVisitor();
		Subject sub=new MySubject();
		sub.accept(vi);
	}
}
