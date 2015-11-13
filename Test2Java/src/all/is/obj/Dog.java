package all.is.obj;

public class Dog {
	int age;
	public void bark(){
		System.out.println("旺旺");
	};
	public void barking(){
		System.out.println("哈哈");
	};
	public void howling(){
		System.out.println("吼吼");
	};
	Dog(){bark();}
	Dog(int age){barking();}
	Dog(String name){howling();}
}
