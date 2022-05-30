public class Main
{
	public static void main(String[] args) {
	    
    //Q1
    System.out.println("Hello world");
    
	    //Q2
      int t = Integer.parseInt(args[0]);
	    for(int i=1;i<=10;i++)
	    {
	        System.out.println(t*i);
	    }
	   
	    
	    // Q3
         for (int i = 0; i < t; i++) {
            for (int j = t - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
}
}
