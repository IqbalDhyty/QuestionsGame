package Tree;

// Class for binary tree node

public class Node {
    // 
    public String answer;
    
    // Left and Right for 
    public Node right;
    public Node left;

    // Method Constructor
    // Gunakan ini nanti dalam logika pembuatan tree
    public Node(String answer) {
        this.answer = answer;
        this.left = null;
        this.right = null;
    }

    // Method pengecek jika leaf
    // Digunakan nanti dalam logika program utama
    public boolean checkLeaf() {
        return left == null && right == null;
    }
}
