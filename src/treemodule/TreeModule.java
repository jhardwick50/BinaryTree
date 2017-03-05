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
public class TreeModule {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String[] result = "DURING the whole of a dull, dark, and soundless day in the autumn of the year, when the clouds hung oppressively low in the heavens, I had been passing alone, on horseback, through a singularly dreary tract of country; and at length found myself, as the shades of the evening drew on, within view of the melancholy House of Usher"
                .split("[ ,;]+");
        MyBinaryTree tree = new MyBinaryTree();
        for (int x=0; x<result.length; x++) {
            
            tree.insert(result[x]);
            
        }
        
        System.out.println("Initial Tree\n______________________________________\n");
        printTree(tree);  
        System.out.println("\n______________________________________\n\nDelete Single \"I\" \n______________________________________\n");
        tree.delete("I");
        printTree(tree);
        System.out.println("\n______________________________________\n\nDecrement Single \"of\" \n______________________________________\n");
        tree.delete("of");
        printTree(tree);
        System.out.println("\n______________________________________\n\nDelete Multiple \"of\"\n______________________________________\n");
        tree.deleteAll("of");
        printTree(tree);
    }
    
    public static void printTree(MyBinaryTree tree){
        tree.preorder();
        System.out.println("\n");
        tree.inorder();
        System.out.println("\n");
        tree.postorder();
    }
    
}
