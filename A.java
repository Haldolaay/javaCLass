class A{
	static B a = new B();
	
	
}
class B{
	C b = new C();
	int u;
}
class C{
	A c = new A();
	public static void main(String[]args){
		System.out.println(A.a.b.c.a.u):
	}
}