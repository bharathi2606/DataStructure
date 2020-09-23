package DepthFirstSearch;

import java.util.List;
import java.util.ArrayList;

public class DepthFirstSearch {
	class Stack{
		List<Integer> stack = new ArrayList<>();
		int top = -1;
		void push(Integer data) {
			stack.add(++top, data);
		}
		void pop() {
			if(top>-1) {
				stack.remove(top--);
			}
		}
		Integer peek() {
			return stack.get(top);
		}
		Boolean isEmpty() {
			return top==-1;
		}
	}
	class Graph{
		class Node{
			String name;
			Boolean visited;
			public Node(String name) {
				this.name=name;
				this.visited=false;
			}
		}
		int totalNode;
		List<Node> nodeList = new ArrayList<>();
		int[][] adjNode;
		void initialize(int n) {
			this.totalNode=n;
			this.adjNode=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					adjNode[i][j]=0;
				}
			}
		}
		void addVertex(String name) {
			this.nodeList.add(new Node(name));
		}
		void addEdge(int startNode, int endNode) {
			this.adjNode[startNode][endNode]=1;
			this.adjNode[endNode][startNode]=1;
		}
		void display(int index) {
			System.out.println(this.nodeList.get(index).name);
		}

		Integer getAdjacent(int index) {
			for(int i=0;i<this.totalNode;i++) {
				if(this.adjNode[index][i]==1&&!this.nodeList.get(i).visited) {
					return i;
				}
			}
			return -1;
		}
	}

	void depthFirstSearch() {
		Graph g = new Graph();
		Stack s = new Stack();
		g.initialize(5);
		g.addVertex("S");   // 0
		g.addVertex("A");   // 1
		g.addVertex("B");   // 2
		g.addVertex("C");   // 3
		g.addVertex("D");   // 4
		g.addEdge(0, 1);    // S - A
		g.addEdge(0, 2);    // S - B
		g.addEdge(0, 3);    // S - C
		g.addEdge(1, 4);    // A - D
		g.addEdge(2, 4);    // B - D
		g.addEdge(3, 4);
		g.nodeList.get(0).visited=true;
		s.push(0);
		g.display(0);
		while(!s.isEmpty()) {
			int currentNode = g.getAdjacent(s.peek());
			if(currentNode==-1) {
				s.pop();
			}else {
				g.nodeList.get(currentNode).visited=true;
				s.push(currentNode);
				g.display(currentNode);
			}
		}
	}
	public static void main(String[] args) {
		new DepthFirstSearch().depthFirstSearch();
	}
}
