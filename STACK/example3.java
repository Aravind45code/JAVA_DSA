package STACK;
// Swapping object references

import java.io.*;
class Demo {
  public int i=10;
  public int j=20;

	// Swapping Method
	int Swap(Demo A, Demo B)
	{
		Demo temp = A;
		A = B;
		B = temp;
    System.out.println(A.i);
    System.out.println(A.j);
		return 0;
    
	}
}
class Main {
	public static void main(String[] args)
	{
		Demo C = new Demo();

		Demo D = new Demo();
    System.out.println(C.i);
    System.out.println(C.j);
    System.out.println(D.i);
    System.out.println(D.j);
    D.j=100;
    D.i=10000;

		// Passing C and reference variables
		// to Swap method
		C.Swap(C, D);
    System.out.println(D.i);
    System.out.println(D.j);

	}
}

