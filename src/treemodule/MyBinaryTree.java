/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treemodule;

/**
 *
 * @author Jason
 */
public class MyBinaryTree {

    Node root;

    public boolean insert(String word) {
        if (root == null) {
            root = new Node(null, word);
            return true;
        } else {
            return root.insert(word);
        }
    }

    public Node find(String word) {
        if (root == null) {
            return null;
        } else {
            return root.find(word);
        }
    }

    public void postorder() {
        if (root != null) {
            System.out.println("Postorder \n");
            root.postorder();
        }
    }

    public void inorder() {
        if (root != null) {
            System.out.println("Inorder \n");
            root.inorder();
        }
    }

    public void preorder() {
        if (root != null) {
            System.out.println("Preorder \n");
            root.preorder();
        }
    }

    public void delete(String word) {
        Node node = root.find(word);
        if (node == null) {
            return;
        } else if (node.occurences > 1) {
            node.occurences--;
        } else {
            removeNode(node);
        }
    }

    public void deleteAll(String word) {
        Node node = root.find(word);
        if (node != null) {
            removeNode(node);
        }
    }

    private void removeNode(Node node) {
        Node replacement = null;

        if (node.getRightChild() != null) {

            replacement = node.getRightChild().findSmallest();

        } else if (node.getLeftChild() != null) {

            replacement = node.getLeftChild().findLargest();

        }

        // 1. Left child of parent of "replacement" should be set to null if not null, otherwise right child of parent of "replacement" should be set to null
        // 2. Right or left child of parent of "node" (if not null) should be set to "replacement"
        // 3. Parent of "replacement" should be set to parent of "node" (already done with step 2 in Node.setRightChild())
        // 4. Left child of "replacement" should be set to left child of "node"
        // 5. Right child of "replacement" should be set to right child of "node"
        if (replacement != null) {
            Node newParent = node.getParent();
            Node oldParent = replacement.getParent();
            //step 1
            if (replacement.isLeftChildOfParent()) {
                oldParent.setLeftChild(null);
            } else {
                oldParent.setRightChild(null);
            }
            //step 2 and 3
            if (node.isLeftChildOfParent()) {
                newParent.setLeftChild(replacement);
            } else {
                newParent.setRightChild(replacement);
            }
            //step 4
            replacement.setLeftChild(node.getLeftChild());

            // Step  5
            replacement.setRightChild(node.getRightChild());
        }
    }
}
