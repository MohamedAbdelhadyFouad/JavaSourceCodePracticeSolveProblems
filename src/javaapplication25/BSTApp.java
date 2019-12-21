
package javaapplication25;

public class BSTApp extends Node{
    
    //Create value in the tree
    public Node CreatNewNode(int val){
    Node x = new Node();
    x.data= val;
    x.left= null;
    x.Right= null;
    return  x;
    
    
    }
    
    // insert value in the tree
    public Node insertNode(Node node, int val){
        // check if this node is the first Node
    if (node ==null){
    return CreatNewNode(val);
    }
    if (val < node.data){
        
            node.left= insertNode(node.left, val);
            
                    }    
    if (val > node.data){
        
            node.Right= insertNode(node.Right, val);
            
                    }    
    return node;
   }
    
    
}
