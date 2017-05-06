package Composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children=new Vector<TreeNode>();
	
	TreeNode(String name){
		this.name=name;
	}
	
	private String getName(){
		
		return name;
	}
	private void setName(String name){
		this.name=name;
	}
	
	public TreeNode getParent(){
		return parent;
	}
	public void setParent(TreeNode parent){
		
		this.parent=parent;
	}
	
	public void remove(TreeNode node){
		children.remove(node);
	}
	
	public void add(TreeNode node){
		children.add(node);
	}
	
	public Vector<TreeNode> getChildren(){
		return children;
	} 
	
}
