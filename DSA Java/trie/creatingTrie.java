public class creatingTrie {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq; // frequency of words passing through this node

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 0; // ✅ start at 0
        }
    }

    public static Node root = new Node();

    // Insert into a trie
    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++; // ✅ increment frequency for every node visited
        }
        curr.eow = true;
    }

    // Search for prefix problem
    public static void findPrefix(Node root, String ans) {
        if (root == null) return;

        if (root.freq == 1) { // ✅ unique prefix found
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i = 0; i< prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple","app","mango","man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";
        for (String w : words) {
            insert(w);
        }

        // Print unique prefixes
        //findPrefix(root, "");
        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
        
    }
}
