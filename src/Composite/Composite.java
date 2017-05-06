package Composite;

public class Composite {

	TreeNode root=null;
	public Composite(String name){
		root=new TreeNode(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Composite tree=new Composite("A");
		
		TreeNode tC=new TreeNode("C");
		TreeNode tB=new TreeNode("B");
		tB.add(tC);
		
		tree.root.add(tB);
		
		System.out.print("Add finsh");
	}

}
