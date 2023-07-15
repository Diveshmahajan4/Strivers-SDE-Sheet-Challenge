package Trie;

public class CompleteString {
    public static void main(String[] args) {
        String[] arr = {"n", "ni", "nin", "ninj", "ninja", "ninga"};
        System.out.println(completeString(6, arr));
    }

    public static String completeString(int n, String[] a) {
        // Write your code here.
        Trie trie = new Trie();
        for(String s : a){
            trie.insert(s);
        }

        String longest = "";
        for(String s : a){
            if(trie.check(s)){
                if(s.length() > longest.length()){
                    longest = s;
                }else if(s.length() == longest.length() && s.compareTo(longest) < 0){
                    longest = s;
                }
            }
        }

        if(longest.equals("")) return "None";
        else return longest;
    }
}
