import java.util.ArrayList;

class buildBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;

        }
    }
    public static Node insert(Node root, int val){
    if(root == null){
        return new Node(val);
    }
    if(val < root.data){
        root.left = insert(root.left, val);
    } else {
        root.right = insert(root.right, val);
    }
    return root;
}

    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Search in BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    //delete node in BST
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //case -1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 single chile
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case - 3 both children
            Node IS =findInorderSuccessor(root.right);
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //print in range
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data<= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i : path){
            System.out.print(i+"->");
        }
        System.out.println("NULL");
    }
    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    //validate BST
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right,root, max);

    }

    //mirror a BST
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);
        
        root.left= rightMirror;
        root.right=leftMirror; 
        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
        public static void main(String s[]){
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i< values.length; i++){
            root =insert(root, values[i]);
        }
        System.out.println("BST successfully created.");
        //inorder(root);
        //System.out.println(search(root, 9));
        System.out.println();
        //delete(root, 2);
        //inorder(root);
        //printInRange(root, 3, 5);
        //rootToLeaf(root, new ArrayList<Integer>());
        //System.out.println(isValidBST(root, null, null));

        mirror(root);
        preOrder(root);
    }
}