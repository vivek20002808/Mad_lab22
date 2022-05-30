// Q1 and Q2
class mother {
  public int x;
  public void show() {
    System.out.println("mother class");
  }
}

class child extends mother {
    public void show() {
    System.out.println("child class");
   }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		mother m = new mother();
		m.show();
		m.x = 5;
		System.out.println(m.x + 10);
		child c = new child();
		c.show();
	}
}





//Q3
class mother {
  public int x;
  public static void show() {
    System.out.println("mother class");
  }
}

class child extends mother {
    public static void show() {
    System.out.println("child class");
  }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		mother m = new mother();
		m.show();
		m.x = 5;
		System.out.println(m.x + 10);
		child c = new child();
		c.show();
		mother m1 = new child();
		m1.show();
	}
}





// Q4
class one {
    int x;
    one(int y){
      x = y;
  }
}

class two extends one {
    int w;
    two(int x, int z){
        super(x);
        w = z;
    }
}

public class Main
{
	public static void main(String[] args) {
        one o = new one(6);
        System.out.println(o.x);
        two t = new two(5,10);
        System.out.println(t.w + t.x);
	}
}


