interface myInterface{
	public static final double PI=3.14;
	public abstract void area();
}

class myClass implements myInterface{
	int rad;
	myClass(int a){
		rad=a;
	}

	public void area(){
		System.out.println(PI*rad*rad);
	}
}

class mainClass{
	public static void main(String[] args) {
		myClass mC=new myClass(10);
		mC.area();
	}
}