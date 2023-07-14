package Trie;

public class Trie1 {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("divesh");
        System.out.println(t.search("dive"));
        System.out.println(t.search("divesh"));
        System.out.println(t.startsWith("dive"));
    }
}

class Node{
    Node[] links = new Node[26];
    boolean flag = false;

    boolean containsKey(char ch){
        return (links[ch - 'a'] != null);
    }

    Node get(char ch){
        return links[ch -'a'];
    }

    void put(char ch, Node node){
        links[ch - 'a'] = node;
    }

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            if(!temp.containsKey(word.charAt(i))){
                temp.put(word.charAt(i), new Node());
            }
            temp = temp.get(word.charAt(i));
        }
        temp.setEnd();
    }

    public boolean search(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            if(!temp.containsKey(word.charAt(i))){
                return false;
            }
            temp = temp.get(word.charAt(i));
        }

        return temp.isEnd();
    }

    public boolean startsWith(String prefix) {
        Node temp = root;

        for (int i = 0; i < prefix.length(); i++) {
            if(!temp.containsKey(prefix.charAt(i))){
                return false;
            }
            temp = temp.get(prefix.charAt(i));
        }
        return true;
    }
}