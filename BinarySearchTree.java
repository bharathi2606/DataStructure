package BinarySearchTree;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTree {
	class Node{
		int value;
		Node leftNode;
		Node rightNode;
		public Node(int value) {
			this.value=value;
			this.leftNode=null;
			this.rightNode=null;
		}
	}
	Node root=null;
	void insert(int data) {
		Node temp = new Node(data);
		if(root==null) {
			root=temp;
		}else {
			Node current = root;
			while(true) {
				if(current.value<data) {
					if( current.rightNode == null) {
						current.rightNode = temp;
						return;
					}
					current = current.rightNode;
				}else if(current.value>data) {
					if( current.leftNode == null) {
						current.leftNode = temp;
						return;
					}
					current = current.leftNode;
				}
			}
		}
	}
	void preOrderTraversal(Node node) {
		if(node!=null) {
			System.out.print(node.value+" ");
			preOrderTraversal(node.leftNode);
			preOrderTraversal(node.rightNode);
		}
	}
	void postOrderTraversal(Node node) {
		if(node!=null) {
			preOrderTraversal(node.leftNode);
			preOrderTraversal(node.rightNode);
			System.out.print(node.value+" ");
		}
	}
	void inOrderTraversal(Node node) {
		if(node!=null) {
			preOrderTraversal(node.leftNode);
			System.out.print(node.value+" ");
			preOrderTraversal(node.rightNode);
		}
	}
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		List<Integer> numberList = Arrays.asList(27, 14, 35, 10, 19, 31, 42);
		numberList.stream().forEach(number->{
			binarySearchTree.insert(number);
		});
		System.out.println("pre");
		binarySearchTree.preOrderTraversal(binarySearchTree.root);
		System.out.println("post");
		binarySearchTree.postOrderTraversal(binarySearchTree.root);
		System.out.println("in");
		binarySearchTree.inOrderTraversal(binarySearchTree.root);
	}
}
