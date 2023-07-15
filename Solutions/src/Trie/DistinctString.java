package Trie;

public class DistinctString {
    private static class Node{
        private Node[] node;

        public Node(){
            node = new Node[26];
        }

        public boolean containsKey(char ch){
            return (node[ch - 'a'] != null);
        }

        public Node get(char ch){
            return node[ch - 'a'];
        }

        void put(char ch , Node temp){
            node[ch - 'a'] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(distinctSubstring("abcd"));
    }

    public static int distinctSubstring(String word) {
        // Write your code here.
        Node root = new Node();
        int n = word.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            Node node = root;
            for (int j = i; j < word.length(); j++) {
                if(!node.containsKey(word.charAt(j))){
                    node.put(word.charAt(j), new Node());
                    count++;
                }
                node = node.get(word.charAt(j));
            }
        }
        return count;
    }
}
