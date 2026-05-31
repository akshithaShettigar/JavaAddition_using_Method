class Add{
	int a;
	int b;
	int c;
	Add(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int calc(){
		int result=a+b+c;
		return result;
	}
	void display(){
		System.out.println("The result of addition of 3 numbers:"+calc());
	}
}
class AddMain{
	public static void main(String args[]){
		Add a1=new Add(12,13,14);
		a1.display();
	}
}