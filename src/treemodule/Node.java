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
public class Node {

    protected Node parent;
    protected Node rightChild;
    protected Node leftChild;
    private String word;
    protected int occurences = 1;

    protected Node(Node parent, String word) {
        this.parent = parent;
        this.word = word;
        
    }

    protected boolean insert(String word) {

        if (word.compareTo(this.word) <= -1) {
            if (leftChild == null) {
                this.leftChild = new Node(this, word);
                return true;
            } else {
                this.leftChild.insert(word);
                return true;
            }
        } else if (word.compareTo(this.word) >= 1) {
            if (this.rightChild == null) {
                this.rightChild = new Node(this, word);
                return true;
            } else {
                this.rightChild.insert(word);
                return true;
            }

        } else {
            occurences++;
            return true;
        }
    }

    protected Node find(String word) {
        if (this.word.equals(word)) {
            return this;
        }
        else {
            Node node = null;
            if (leftChild != null) {
                node = leftChild.find(word);
            }
            if (node == null && rightChild != null) {
                node = rightChild.find(word);
            }
                
            return node;
        }
        
    }

    protected void preorder() {
        
            System.out.print(this.word + "(" + occurences + ") ");
            if (this.leftChild != null) {
                this.leftChild.preorder();
            } 
           
            if (this.rightChild != null) {
                this.rightChild.preorder();
            }
        
    }

    protected void inorder() {
        
        
            if (this.leftChild != null) {
                this.leftChild.inorder();
            } 
            System.out.print(this.word + "(" + occurences + ") ");
            if (this.rightChild != null) {
                this.rightChild.inorder();
            }
    }

    protected void postorder() {
        
            if (this.leftChild != null) {
                this.leftChild.postorder();
            } 
            if (this.rightChild != null) {
                this.rightChild.postorder();
            }
            System.out.print(this.word + "(" + occurences + ") ");
    }

    public Node findSmallest() {
        if (leftChild == null) {
            return this;
        } else {
            return leftChild.findSmallest();
        }
    }
    
    public Node findLargest() {
        if (rightChild == null) {
            return this;
        } else {
            return rightChild.findLargest();
        }
    }
    
    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        
        this.parent = parent;
    }

    
    
    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        
        this.rightChild = rightChild;
        this.rightChild.setParent(this);
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        
        this.leftChild = leftChild;
        this.leftChild.setParent(this);
    }

    @Override
    public String toString() {
        return "Node{" + "word=" + word + '}';
    }

}
