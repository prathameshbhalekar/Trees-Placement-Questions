class Tree
{
    void leftView(Node root)
    {
      if(root==null)
        return ;
      maxDepth=Integer.MIN_VALUE;
      traverse(root,0);
    }
    int maxDepth;
    void traverse(Node n,int depth){
        if(depth>maxDepth){
            System.out.print(n.data+" ");
            maxDepth=depth;
        }
        if(n.left!=null)
            traverse(n.left,depth+1);
        if(n.right!=null)
            traverse(n.right,depth+1);
    }
}
