package no_3;
public static void main(String[] args) {
        Binarytree tree=new Binarytree();
        
        Treenode node;
        
        node = new Treenode(50);
        tree.insert(node);
        
        node = new Treenode(30);
        tree.insert(node);
        
        node = new Treenode(20);
        tree.insert(node);
        
        node = new Treenode(40);
        tree.insert(node);
        
        node = new Treenode(70);
        tree.insert(node);
        
        
        
        System.out.print("Traversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
    }
}