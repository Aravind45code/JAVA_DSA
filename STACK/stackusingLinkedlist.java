package STACK;
 class StackNode{
    int data;
    StackNode next;
    StackNode() {}
    StackNode(int data) {this.data=data;}
  }

class stackUsingLL{
  // StackNode root;
  // static class StackNode{
  //   int data;
  //   StackNode next;
  //   StackNode(int data) {this.data=data;}
  // }
  public boolean isEmpty(StackNode root){
    if(root==null){
      return true;
    }
    else{
      return false;
    }
  }
  public StackNode push(int data,StackNode root){
    StackNode newNode=new StackNode(data);
     // System.out.println(newNode);
    if(root==null){
       root=newNode;
    }
    else{
      StackNode temp=root;
      root=newNode;
      newNode.next=temp;
      //System.out.println("ar");
    }
    System.out.println(data+"pushed into the stack");
    return newNode;
  }
  public int pop(StackNode root){
    int popped=Integer.MIN_VALUE;
    if(root==null){
      System.out.println("stack is empty");
    }
    else{
      popped=root.data;
      root=root.next;
    }
    return popped;

  }
  public int peek(StackNode root){
    if(root==null){
      System.out.println("stack is empty");
      return Integer.MIN_VALUE;
    }
    else{
      return root.data;
    }
  }

}

public class stackusingLinkedlist {
  public static void main(String[] args){
    stackUsingLL s=new stackUsingLL();
    StackNode st=null;
    //System.out.println(s.isEmpty(st));
    //here when we are passing the st ,then in the push function new node was assigned to it ,so now 
    st=s.push(10,st);
    // System.out.println(st);
    st=s.push(20,st);
    st=s.push(30,st);
    st=s.push(40,st);
    System.out.println(s.peek(st));
    System.out.println(s.isEmpty(st));
  }
  
}
