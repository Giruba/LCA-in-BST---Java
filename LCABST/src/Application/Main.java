package Application;

import java.util.Scanner;
import BinarySearchTree.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lowest Common Ancestor in a Binary Search Tree");
		System.out.println("----------------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of nodes in the Binary Search Tree");
			int numberOfNodes = scanner.nextInt();
			BinarySearchTree binarySearchTree = new BinarySearchTree(null);
			for(int index = 0; index < numberOfNodes; index++) {
				System.out.println("Enter the element "+(index+1));
				binarySearchTree.SetBinarySearchTreeRoot(
						binarySearchTree.Insert(binarySearchTree.GetBinarySearchTreeRoot(), 
								scanner.nextInt()));
			}
			binarySearchTree.PrintInorderTraversal(binarySearchTree);
			System.out.println("Enter the values whose lowest common ancestor has to be found");
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			binarySearchTree.PrintLowestCommonAncestorInBinarySearchTree(binarySearchTree, value1, value2);
		}catch(Exception exception) {
			System.out.println("Application:Main:main:Thrown exception is "+
						exception.getMessage());			
		}
		
	}
}
