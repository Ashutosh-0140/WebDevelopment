import java.util.ArrayList;
import java.util.HashMap;
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

        //Number of nodes
        static int TotalNodes(Node root){
            if(root == null){
                return 0;
            }
            int lc = TotalNodes(root.left);
            int rc = TotalNodes(root.right);
            return lc+rc+1;
        }

        //Sum of all nodes
        static int Sum(Node root){
            if(root == null){
                return 0;
            }
            int ls = Sum(root.left);
            int rs = Sum(root.right);
            return ls+rs+root.data;
        }

        //Diameter of the tree
        static int Diameter(Node root){
            if(root == null){
                return 0;
            }
            int ldiam = Diameter(root.left);
            int rdiam = Diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfDiam = lh+rh+1;
            int max = Math.max(ldiam,rdiam);
            return Math.max(max, selfDiam);
        }

        //Diameter approach 2 optimized one
        static class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }
        public static Info diameter(Node root){
            if(root == null){
                return new Info(0,0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(leftInfo.diam, Math.max(rightInfo.diam,leftInfo.ht+rightInfo.ht+1));
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(diam, ht);
        }

        public static boolean isIdentical(Node node,Node subRoot){
            if(node == null || subRoot ==null){
                return true;
            }else if(node == null || subRoot == null || node.data != subRoot.data){
                return false;
            }
            if(!isIdentical(node.left,subRoot.left)) return false;
            if(!isIdentical(node.right,subRoot.right)) return false;

            return true;
        }
        //is tree 2 sub tree of tree 1
        public static boolean isSubtree(Node root, Node subRoot){
            if(root == null) return false;
            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left,subRoot)||isSubtree(root.right, subRoot);
        }


        //top view of a tree
        static class Info2{
            Node node;
            int hd;
            public Info2(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        public static void topView(Node root){
            Queue<Info2> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0, max =0;
            q.add(new Info2(root,0));
            q.add(null);

            while(!q.isEmpty()){
                Info2 curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info2(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info2(curr.node.right, curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
                }
            }
            for(int i = min; i<=max; i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }


        //print k level elements present in tree
        public static void kthLevelElement(Node root, int level, int k){
            if(root == null){
                return;
            }
            if(level == k){
                System.out.print(root.data+" ");
            }
            kthLevelElement(root.left, level+1,k);
            kthLevelElement(root.right, level+1, k);
        }


        //Lowest common ancestor find
        public static boolean getPath(Node root, int n, ArrayList<Node> path){
            if(root == null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }
            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right,n, path);

            if(foundLeft || foundRight){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }
        public static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1,path1);
            getPath(root, n2, path2);

            //calculate lca
            int i = 0;
            for(; i<path1.size() && i<path2.size(); i++){
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }
            Node lca = path1.get(i-1);
            return lca;
        }

        // find lca approach 2
        public static Node lca2(Node root, int n1, int n2){
            if(root == null ||root.data==n1 || root.data == n2){
                return root;
            }
            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right ,n1, n2 );

            if(rightLca == null){
                return leftLca;
            }
            if(leftLca == null){
                return rightLca;
            }
            return root;
        }

        //calculate the minimum distance between nods

        public static int lcaDist(Node root, int n){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }

            int leftDist = lcaDist(root.left, n);
            int rightDist = lcaDist(root.right,n);
            if(leftDist == -1 && rightDist == -1){
                return -1;
            }else if(leftDist == -1){
                return rightDist+1;
            }else{
                return leftDist+1;
            }
        }
        public static int minDist(Node root, int n1, int n2){
            Node lca = lca2(root,n1,n2);
            int dist1 = lcaDist(lca, n1);
            int dist2 = lcaDist(lca, n2);
            return dist1+dist2;
        }

        //kth Ancestor of node
        public static int KAncestor(Node root, int n, int k){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int leftDist = KAncestor(root.left, n, k);
            int rightDist = KAncestor(root.right, n, k);

            if(leftDist == -1 && rightDist ==-1){
                return -1;
            }
            int max= Math.max(leftDist, rightDist);
            if(max+1==k){
                System.out.println(root.data);
            }
            return max+1;
        }

        //Transform to sum tree
        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = transform(root.left);
            int rightSum = transform(root.right);

            int oldValue = root.data;

            // Update current node’s value to sum of children
            root.data = leftSum + rightSum;

            // Return total sum including original value
            return oldValue + root.data;
        }
    }

    public static void main(String s[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);



       // System.out.println(tree.isSubtree(root, subRoot));
       // tree.topView(root);

        //tree.kthLevelElement(root, 1, 2);

        //System.out.println(tree.lca2(root,4,7).data);

        //System.out.println(tree.minDist(root,4,5));

        //tree.KAncestor(root,4,2);


        tree.preorderTraversal(root);
        tree.transform(root);
        System.out.println();
        tree.preorderTraversal(root);

        /*int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
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
        System.out.println("Sum of all nodes of the tree is "+tree.Sum(root));
        System.out.println("Diameter of the tree is "+tree.Diameter(root));

        System.out.println("Diameter of the tree is "+tree.diameter(root).diam);*/
    }
}