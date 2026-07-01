import java.util.ArrayList;

import javax.swing.tree.TreeNode;

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

    //Sorted array to balanced bst
    public static Node createNode(int arr[], int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createNode(arr, st, mid-1);
        root.right = createNode(arr, mid+1, end);
        return root;

    }

    //bst to balanced bst
    public static void findInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        findInorder(root.left, inorder);
        inorder.add(root.data);
        findInorder(root.right, inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st,mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }
    public static Node balanceBST(Node root) {
        //find inorder
        ArrayList<Integer> inorder = new ArrayList<>();
        findInorder(root,inorder);

        //create bst
        return createBST(inorder,0,inorder.size()-1);
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

        //mirror(root);
        //preOrder(root);
        int arr[] = {1,2,3,4,5,6,7};
        int st = 0;
        int end = arr.length-1;
        Node bbst =createNode(arr, st, end);
        inorder(bbst);
        balanceBST(root);
    }
}