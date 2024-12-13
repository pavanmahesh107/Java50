package DataStructures4.Tries;

import java.awt.*;

public class Autocompletion {
    private TrieNode root;

    public Autocompletion(){
        root = new TrieNode();
    }

    // Method to insert the words into the Tries.
    public void insert(String word){
        TrieNode currentNode = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(currentNode.children[index] == null){
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }

        currentNode.isEndOfWord = true;
    }

    // Method to find suggestions based on the Prefix.

}
