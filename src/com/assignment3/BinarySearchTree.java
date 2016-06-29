package com.assignment3;

public class BinarySearchTree {
	BinarySearchTreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		return false;
	}

	public void insertData(int data) {
		root = insert(root, data);
	}

	private BinarySearchTreeNode insert(BinarySearchTreeNode node, int data) {
		if (node == null)
			node = new BinarySearchTreeNode(data);
		else {
			if (data <= node.getData())
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}
		return node;
	}

	public boolean deleteData(int val) {
		boolean flag = false;
		if (isEmpty())
			System.out.println("tree is empty..........");
		else if (searchData(val) == false)
			System.out.println("sorry value " + val + " is not present in the tree");
		else {
			root = delete(root, val);
			System.out.println("value deleted successfully");
			flag = true;
		}
		return flag;
	}

	private BinarySearchTreeNode delete(BinarySearchTreeNode root, int val) {
		BinarySearchTreeNode p1, p2, n;
		if (root.getData() == val) {
			BinarySearchTreeNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)
				return null;
			else if (lt == null) {
				p1 = rt;
				return p1;
			} else {
				p2 = rt;
				p1 = rt;
				while (p1.getLeft() != null)
					p1 = p1.getLeft();
				p1.setLeft(lt);
				return p2;
			}

		}
		if (val < root.getData()) {
			n = delete(root.getLeft(), val);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(), val);
			root.setRight(n);
		}
		return root;
	}

	public boolean searchData(int val) {
		return search(root, val);
	}

	private boolean search(BinarySearchTreeNode r, int val) {
		boolean found = false;
		while (r != null && !found) {
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}

	public void inOrder() {
		System.out.print("** inorder   **  ");
		inOrder(root);
		System.out.println();
	}

	private void inOrder(BinarySearchTreeNode n) {
		if (n != null) {
			inOrder(n.getLeft());
			System.out.print(n.getData() + "  ");
			inOrder(n.getRight());
		}
	}

	public void preOrder() {
		System.out.print("** preorder  **  ");
		preOrder(root);
		System.out.println();
	}

	private void preOrder(BinarySearchTreeNode n) {
		if (n != null) {
			System.out.print(n.getData() + "  ");
			preOrder(n.getLeft());
			preOrder(n.getRight());
		}
	}

	public void postOrder() {
		System.out.print("** postorder **  ");
		postOrder(root);
		System.out.println();
	}

	private void postOrder(BinarySearchTreeNode n) {
		if (n != null) {
			postOrder(n.getLeft());
			postOrder(n.getRight());
			System.out.print(n.getData() + "  ");
		}
	}

	public int getLeafCount() {
		return getLeafCount(root);
	}

	private int getLeafCount(BinarySearchTreeNode node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return 1;
		} else {
			return getLeafCount(node.left) + getLeafCount(node.right);
		}
	}

	public int treeHeight() {
		return treeHeight(root);
	}

	private int treeHeight(BinarySearchTreeNode root) {
		if (root == null)
			return 0;
		return (1 + Math.max(treeHeight(root.left), treeHeight(root.right)));
	}

	public static void main(String ar[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(40);
		bst.insertData(30);
		bst.insertData(35);
		bst.insertData(80);
		bst.insertData(100);
		bst.inOrder();
		bst.postOrder();
		bst.preOrder();
		System.out.println("leafes       " + bst.getLeafCount());
		bst.deleteData(4);
		bst.inOrder();
		System.out.println("leafes       " + bst.getLeafCount());
		System.out.println("height of tree ==        " + bst.treeHeight());
	}
}
