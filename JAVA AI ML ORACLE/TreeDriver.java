public class TreeDriver {
    public static void main(String[] args) {
        System.out.println("Creating Tree");
        BTree tree = new BTree();

        System.out.println("Count Nodes in empty tree");
        System.out.println(tree.countNodes());

        System.out.println("Create node with data as 1");
        Node root = new Node(1);

        System.out.println("Set node as root");
        tree.setRoot(root);

        System.out.println("Count nodes in tree with only root added");
        System.out.println(tree.countNodes());

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);


        root.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node5);
        node5.setLeft(node7);
        root.setRight(node3);
        node3.setRight(node6);

        System.out.println("Set the current node to be the root");
        tree.setCurrent(tree.getRoot());

        System.out.println("Display the current node");
        System.out.println(tree.getCurrent().getData());

        Node currentNode = tree.getCurrent();
        System.out.println("The current node 'Using the currentNode variable which haven't been used");
        System.out.println(currentNode);

        System.out.println("Count nodes in tree with 7 nodes added");
        System.out.println(tree.countNodes());

        System.out.println("In Order print");
        tree.printInOrder();

        System.out.println("\nPre order print");
        tree.printPreOrder();
        
        System.out.println("\nPost order print");
        tree.printPostOrder();
        
        System.out.println("\nDisplay the nodes as tree diagram");
        tree.print();

    }
    
}
