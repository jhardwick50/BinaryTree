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
        tree.preorder();
        System.out.println("\n\n");
        tree.inorder();
        System.out.println("\n\n");
        tree.postorder();
    }
}
