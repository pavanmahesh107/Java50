package DataStructures4.Tries;

public class ImplementingTrie {
    private final TrieNode root;

    public ImplementingTrie(){
        root = new TrieNode();
    }

    //  Insert a word into Trie.
    public void insert(String word){
        TrieNode currentNode = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';  // Caluclate the index for each constructor.
            if(currentNode.children[index] == null){
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.isEndOfWord = true;
    }

    // Search for a full word in the Trie.
    public boolean search(String word){
        TrieNode currentNode = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(currentNode.children[index] == null){
                return false;
            }
          currentNode  = currentNode.children[index];
        }
        return currentNode.isEndOfWord;
    }

    // Check if there is any word in the Trie that starts with the given Prefix.
    public boolean startsWith(String prefix){
        TrieNode currentNode = root;
        for(char ch : prefix.toCharArray()){
            int index = ch - 'a';
            if(currentNode.children[index] == null){
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        ImplementingTrie trie = new ImplementingTrie();

        // Insert words into the trie.
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");

        // Search for a word.
        System.out.println(trie.search("cat"));
        System.out.println(trie.search("car"));
        System.out.println(trie.search("nil"));
        System.out.println(trie.search("man"));

        // Starts with a word.

        System.out.println(trie.startsWith("d"));
        System.out.println(trie.startsWith("pa"));
        System.out.println(trie.startsWith("ct"));

    }
}
