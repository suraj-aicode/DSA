class Solution {
    public void getPreorder(Node n, List<Integer> al) {
        if (n == null)
            return;
        
        
        al.add(n.val);
        
        
        for (Node child : n.children)
            getPreorder(child, al);
    }
    
    
    public List<Integer> preorder(Node root) {
        List<Integer> al = new ArrayList<>();
        getPreorder(root, al);
        return al;
    }
}