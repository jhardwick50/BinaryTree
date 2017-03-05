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

    private Node rightChild;
    private Node leftChild;
    private String word;
    private int occurences;

    protected Node(String word) {
        this.word = word;
    }

    protected boolean insert(String word) {

        if (word.compareTo(this.word) <= -1) {
            if (leftChild == null) {
                this.leftChild = new Node(word);
                return true;
            } else {
                this.leftChild.insert(word);
                return true;
            }
        } else if (word.compareTo(this.word) >= 1) {
            if (this.rightChild == null) {
                this.rightChild = new Node(word);
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

//    protected boolean find(String word) {
//        boolean found = false;
//        if (this == null) {
//            return false;
//        } else {
//            if (word == this.word) {
//                return true;
//            } else {
//                (word < this.word && this.leftChild != null)
//            }
//            {
//                found = this.leftChild.find(word);
//            }
//            else (word > this.word && this.rightChild != null)
//            
//            {
//                found = this.rightChild.find(word);
//            }
//            return found;
//        }
//    }

    protected void preorder() {
        
            System.out.println(this.word);
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
            System.out.println(this.word);
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
            System.out.println(this.word);
    }

}
