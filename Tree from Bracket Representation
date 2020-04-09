    import java.util.*;

    class Node{
        int data;
        Node left;
        Node right;

    }

    class tree{
        Node root;
        void preorder(Node n){
            System.out.print(n.data+" ");
            if(n.left!=null){
                preorder(n.left);
            }
            if(n.right!=null){
                preorder(n.right);
            }
        }
        void divide(String data,Node n){
            n.data=Integer.parseInt(String.valueOf(data.charAt(0)));
            if(data.length()==1){
                return;
            }
            Stack<Character>s=new Stack<>();
            s.push(data.charAt(1));
            int count=2;
            String s1="";
            String s2="";
            while(!s.isEmpty()){
                if(data.charAt(count)!=')') {
                    s1 = s1 + data.charAt(count);
                }
                if(data.charAt(count)=='('){
                    s.push(data.charAt(count));
                }
                if(data.charAt(count)==')'){
                    s.pop();
                    if(!s.isEmpty()){
                        s1=s1+")";
                    }
                }
                count++;
            }
            for(int i=count+1;i<data.length()-1;i++){

                s2=s2+data.charAt(i);
            }
//            System.out.println(s1);
//            System.out.println(s2);
            if(!s1.equals("")){
                n.left=new Node();
                divide(s1,n.left);
            }
            if(!s2.equals("")){
                n.right=new Node();
                divide(s2,n.right);
            }
        }
    }


    public class Implementation {
        public static void main(String []args){
            tree t=new tree();
            t.root=new Node();
            t.divide("4(2(3)(1))(6(5))",t.root);
            t.preorder(t.root);
        }
    }
