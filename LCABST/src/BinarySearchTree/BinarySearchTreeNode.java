package BinarySearchTree;

public class BinarySearchTreeNode {
	private int data;
	private BinarySearchTreeNode leftNode;
	private BinarySearchTreeNode rightNode;
	
	public BinarySearchTreeNode(int data) {
		this.data = data;
	}
	
	public void SetBinarySearchTreeNodeData(int data) {
		this.data = data;		
	}
	
	public void SetBinarySearchTreeNodeLeft(BinarySearchTreeNode left) {
		this.leftNode = left;
	}
	
	public void SetBinarySearchTreeNodeRight(BinarySearchTreeNode right) {
		this.rightNode = right;
	}
	
	public int GetBinarySearchTreeNodeData() {
		return this.data;
	}
	
	public BinarySearchTreeNode GetBinarySearchTreeNodeLeftNode() {
		return this.leftNode;
	}
	
	public BinarySearchTreeNode GetBinarySearchTreeNodeRight() {
		return this.rightNode;
	}	
}
