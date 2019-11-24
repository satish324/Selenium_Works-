package webdriver;
class Myvalue{
void m1(){
System.out.println("welcome");
}
		void m1(int x)
		{
			System.out.println("x");
		}
		void m1(String a)
		{
			System.out.println(a);
		}
		void m1(int x,int y)
		{
			System.out.println(x+y);
		}
		void m1(int x,String a)
		{
			System.out.println(x+a);
		}
		void m1(char b,int x) {
			System.out.println(b+x);
		}
}

public class Typesof_Variables 
{
	 
		public static void main(String[] args)
		{
      Myvalue obj=new Myvalue();
      obj.m1();
      obj.m1(100);
      obj.m1("testing");
      obj.m1(100,200);
      obj.m1(100,"selenium");
      obj.m1('@',100);
		}
	 }
        
 
