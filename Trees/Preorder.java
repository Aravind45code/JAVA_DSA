package Trees;

public class Preorder {
  public static void printPreorder(Node root){
    if(root==null)
      return;
    System.out.println(root.data);
    printPreorder(root.left);
    printPreorder(root.right);


  }
  public static void main(String[] args){
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.right.right=new Node(5);
    printPreorder(root);
  }
}
