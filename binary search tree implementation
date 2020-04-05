class node{
    node (int data){
        this.data=data;
        left=null;
        right=null;
    }
    int data;
    node left;
    node right;
}
class bst{
    node root;
    void add(int data){
        node newNode=new node(data);
        if(root==null){
            root=newNode;
        }
        else{
            node n=root;
            while((data<n.data&&n.left!=null)||(data>n.data&&n.right!=null)){
                if(n.data>data){
                    n=n.left;
                }
                else if(n.data<data){
                    n=n.right;
                }
            }
            if(n.data>data){
                n.left=newNode;
            }
            else if (n.data<data){
                n.right=newNode;
            }
        }
    }
    void dfsInfix(node n){
        System.out.print(n.data+",");
        if(n.left!=null){
            dfsInfix(n.left);
        }
        if(n.right!=null){
            dfsInfix(n.right);
        }
    }
    node search(int data){
        node n=root;
        for(;;){
            if(n.data==data){
                return n;
            }
            else if(n.data>data&&n.left!=null){
                n=n.left;
            }
            else if(n.data<data&&n.right!=null){
                n=n.right;
            }
            if(n.left==null&&n.right==null){
                break;
            }
        }
        return null;
    }
}
public class Implementation {
    public static void main(String[]args){
        bst tree=new bst();
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);
        //using infix to read the whole tree
        tree.dfsInfix(tree.root);
        System.out.println();
        System.out.println(tree.search(70).data);
    }
}
