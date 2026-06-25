import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        static Node BuildTree(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = BuildTree(arr);
            newNode.right = BuildTree(arr);


            return newNode;
        }

        public static void preorderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        

        public static void inorderTraversal(Node root){
            if(root==null){
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }
        public static void postorderTraversal(Node root){
            if(root == null){
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrderTraversal(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curNode = q.remove();
                if(curNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curNode.data+" ");
                    if(curNode.left!=null){
                        q.add(curNode.left);
                    }
                    if(curNode.right != null){
                        q.add(curNode.right);
                    }
                }
            }
        }
        static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh=height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1; 
        }
        static int TotalNodes(Node root){
            if(root == null){
                return 0;
            }
            int lc = TotalNodes(root.left);
            int rc = TotalNodes(root.right);
            return lc+rc+1;
        }
    }

    public static void main(String s[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.BuildTree(nodes);
        System.out.println(root.data);
        tree.preorderTraversal(root);
        System.out.println();
        tree.inorderTraversal(root);
        System.out.println();
        tree.postorderTraversal(root);

        System.out.println();
        tree.levelOrderTraversal(root);

        System.out.println("Height of the tree is "+tree.height(root));
        System.out.println("Total number of nodes tree is "+tree.TotalNodes(root));

    }
}