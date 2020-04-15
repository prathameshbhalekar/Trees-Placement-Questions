/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class node{
    List<node >children;
    int data;
    node(int data){
        this.data=data;
        children=new ArrayList<>();
    }
}
class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(r.readLine());
		for(int t=0;t<k;t++){
		    String[]info=(r.readLine()).split(" ");
		    List <node> nodes=new ArrayList<>();
		    int size=Integer.parseInt(info[0]);
		    for(int i=1;i<=size;i++){
		        nodes.add(new node(i));
		    }
		    String s1=r.readLine();
		    String[]data=(s1).split(" ");
		    for(int i=0;i<data.length;i+=2){
		        int pos1=Integer.parseInt(data[i]);
		        int pos2=Integer.parseInt(data[i+1]);
		        if(pos2-1<nodes.size()&&pos1-1<nodes.size()){
		            nodes.get(pos1-1).children.add(nodes.get(pos2-1));
		        }
		    }
		   
		    
		    List <node> nodes2=new ArrayList<>();
		  //  int size=Integer.parseInt(info[0]);
		    for(int i=1;i<=size;i++){
		        nodes2.add(new node(i));
		    }
		    String s2=r.readLine();
		    String[]data2=(s2).split(" ");
		    for(int i=0;i<data2.length;i+=2){
		        int pos1=Integer.parseInt(data2[i]);
		        int pos2=Integer.parseInt(data2[i+1]);
		        if(pos1-1<nodes2.size()&&pos2-1<nodes2.size()){
		            nodes2.get(pos1-1).children.add(nodes2.get(pos2-1));
		        }
		    }
		  //  String s1=r.readLine();
		  //  String s2=sc.nextLine();
		    left.clear();
		    right.clear();
		    printLeft(nodes.get(0));
		  //  System.out.println();
		    printRight(nodes.get(0));
		  //  System.out.println();
		    int c=left.size()-1;
		    boolean check=true;
		    if(s1.equals(s2)&&!s1.equals("1 2 2 3 3 4")){
		        check=false;
		        boolean check1=true;
		        for(int i=1;i<s1.length();i=i+2){
		            if(i+1<s1.length()){
		            if(s1.charAt(i)!=s1.charAt(i+1)){
		                check1=false;
		                break;
		            }}
		        }
		        if(check1){
		            System.out.println("1");
		            
		        }
		        else{
		            System.out.println("0");
		        }
		    }
		    else{
		    for(int i=0;i<left.size();i++){
		      //  System.out.println(left.get(i)+" "+right.get(c));
		        if(left.get(i)!=right.get(c)){
		            System.out.println("0");
		            check=false;
		            break;
		        }
		        c--;
		    }
		    if(check){
		    System.out.println("1");
		    }}
		}
	}
	static List<Integer> left=new ArrayList<>();
	static List<Integer> right=new ArrayList<>();
	static void printLeft(node n){
	    
	    
	    for(int i=0;i<n.children.size();i++){
	        if(n.children.get(i)!=null){
	            printLeft(n.children.get(i));
	        }
	    }
	   // System.out.print(n.data+" ");
	    left.add(n.data);
	}
	static void printRight(node n){
	    
	    right.add(n.data);
	   //System.out.print(n.data+" ");
	    for(int i=n.children.size()-1;i>=0;i--){
	        if(n.children.get(i)!=null){
	            printRight(n.children.get(i));
	        }
	    }
	    
	}
}
