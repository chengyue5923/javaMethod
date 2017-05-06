package Visitor;


public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		// TODO Auto-generated method stub

		System.out.println("------visi the subject :"+sub.getSubject());
	}

}
