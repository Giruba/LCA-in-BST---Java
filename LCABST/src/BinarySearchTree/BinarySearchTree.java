package BinarySearchTree;

public class BinarySearchTree {
	private BinarySearchTreeNode root;
	
	public BinarySearchTree(BinarySearchTreeNode rootNode) {
		this.root = rootNode;
	}
	
	public void SetBinarySearchTreeRoot(BinarySearchTreeNode binarySearchTreeNode) {
		this.root = binarySearchTreeNode;
	}
	
	public BinarySearchTreeNode GetBinarySearchTreeRoot() {
		return this.root;
	}
	
	public BinarySearchTreeNode Insert(BinarySearchTreeNode binarySearchTreeNode, int data) {
		if(binarySearchTreeNode == null) {
			binarySearchTreeNode = new BinarySearchTreeNode(data);
			return binarySearchTreeNode;
		}
		
		if(binarySearchTreeNode.GetBinarySearchTreeNodeData() < data) {
			binarySearchTreeNode.SetBinarySearchTreeNodeRight(Insert(
					binarySearchTreeNode.GetBinarySearchTreeNodeRight(), data));
		}else {
			binarySearchTreeNode.SetBinarySearchTreeNodeLeft(Insert(
					binarySearchTreeNode.GetBinarySearchTreeNodeLeftNode(), data));
		}
		
		return binarySearchTreeNode;
	}
	
	public void PrintLowestCommonAncestorInBinarySearchTree(BinarySearchTree binarySearchTree, int value1, int value2) {
		
		BinarySearchTreeNode lowestCommonAncestor = _GetLowestCommonAncestorInBinarySearchTree(
				binarySearchTree.GetBinarySearchTreeRoot(), value1, value2);
		
		System.out.println("The lowest common ancestor of "+value1
				+" and "+value2+" is"+lowestCommonAncestor.GetBinarySearchTreeNodeData());
	}
	
	private BinarySearchTreeNode _GetLowestCommonAncestorInBinarySearchTree(BinarySearchTreeNode binarySearchTreeNode, int value1, int value2) {
		
		if(binarySearchTreeNode == null) {
			return null;
		}
		
		//If both the values are less than root, then lowest common ancestor lies in left side of the tree
		if(value1 < binarySearchTreeNode.GetBinarySearchTreeNodeData() && value2 < binarySearchTreeNode.GetBinarySearchTreeNodeData()) {
			return _GetLowestCommonAncestorInBinarySearchTree(binarySearchTreeNode.GetBinarySearchTreeNodeLeftNode(), value1, value2);
		}
		//If both the values are greater than root, then lowest common ancestor should lie in right side
		else if(value1 > binarySearchTreeNode.GetBinarySearchTreeNodeData() && value2 > binarySearchTreeNode.GetBinarySearchTreeNodeData()){
			return _GetLowestCommonAncestorInBinarySearchTree(binarySearchTreeNode.GetBinarySearchTreeNodeRight(), value1, value2);
		}
		//If both the values are neither less nor greater than root, this means in BST, one node lies left, the other right, so root will be the lca
		return binarySearchTreeNode;
	}
	
	public void PrintInorderTraversal(BinarySearchTree binarySearchTree) {
		System.out.println("-----Printing the inorder traversal-----");
		_PrintInorderTraversal(binarySearchTree.GetBinarySearchTreeRoot());
		System.out.println();
	}
	
	private void _PrintInorderTraversal(BinarySearchTreeNode binarySearchTreeNode) {
		if(binarySearchTreeNode == null) {
			return;
		}
		_PrintInorderTraversal(binarySearchTreeNode.GetBinarySearchTreeNodeLeftNode());
		System.out.print(binarySearchTreeNode.GetBinarySearchTreeNodeData()+" ");
		_PrintInorderTraversal(binarySearchTreeNode.GetBinarySearchTreeNodeRight());
	}
}
