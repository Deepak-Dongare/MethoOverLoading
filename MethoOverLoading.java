
public class MethoOverLoading {

	
	
	static int x;
	static int y;
	static int z;
	 static  void m1() {
		x=10;
		y=20;
		z=x+y;
		System.out.println(z);
	}
	 static  int m1(int a)
	{
		y=3;
		z=a+y;
		  return z;
		//System.out.println(z);
	}
	 static	int   m1(int a,int b)
	{
		return z=a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethoOverLoading mo=new MethoOverLoading();
		mo.m1();
		int x=mo.m1(10);
		System.out.println("In method overloding return type may be same or not=="+x);
		mo.m1(10,20);
	}

}
