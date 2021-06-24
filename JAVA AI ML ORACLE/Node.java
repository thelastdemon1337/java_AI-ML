public class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }

        public void setLeft(Node node){
            if(left == null){
                left = node;
            }
        }

        public void setRight(Node node){
            if(right == null){
                right = node;
            }
        }

        public Node getLeft(){
            return left;
        }

        public Node getRight(){
            return right;
        }

        public void setData(int data){
            this.data = data;
        }

        public int getData(){
            return data;
        }

        public void printPreOrder(Node node){
            if(node == null)
                return; 

            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
 
        public void printPostOrder(Node node){
            if(node == null)
                return;

            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }
        public void printInOrder(Node node){
            if(node == null)
                return;

            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }

        public String print(){
            return this.print("", true, "");
        }

        public String print(String prefix, boolean isTail, String sb){
            if(right != null){
                right.print(prefix + (isTail ? "|   " : "   "), false,sb);
            }
            System.out.println( prefix + (isTail ? "\\--" : "/--") + data);
                if(left != null) {
                    left.print(prefix + (isTail? "  " : "|  "), true, sb);
                }
                return sb;
        }
}
