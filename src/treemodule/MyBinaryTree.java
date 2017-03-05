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
    
    public boolean insert(String word){
        if (root == null){
            root = new Node(word);
            return true;
        }
        else {
            return root.insert(word);
        }
}
//    public boolean find(String word){
//        if (root == null){
//            return false;
//        }
//        else {
//            return root.find(word);
//        }
//    }
    public void postorder(){
        if (root != null){
            System.out.println("Postorder \n");
            root.postorder();
        }
    }
    
    public void inorder(){
        if (root != null){
            System.out.println("Inorder \n");
            root.inorder();
        }
    }
    
    public void preorder(){
        if (root != null){
            System.out.println("Preorder \n");
            root.preorder();
        }
    }
    
    
}
