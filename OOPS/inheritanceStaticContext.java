package OOPS;
//static context in inheritance concept
//here the static context is recognized and executed ,as per classes loading order.
class A{
  static{
    System.out.println("A");
  }
}
class B extends A{
  static{
    System.out.println("B");
  }
}
class C extends B{
  static{
    System.out.println("C");
  }
}
public class inheritanceStaticContext {
  public static void main(String[] args){
    C c=new C();

  }
  
}
