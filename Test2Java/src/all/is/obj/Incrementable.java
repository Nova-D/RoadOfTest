package all.is.obj;

import java.util.function.IntConsumer;

public class Incrementable {
	static void increment(){
		StaticTest.i++;
	}
	
	public void f(StaticTest st){
		st.c = 'a';
	}
	
	public static void main(String... args){
		Incrementable i = new Incrementable();
		i.increment();
		System.out.println("i == " + StaticTest.i);
		
		System.out.println("----------------------------");
		
		StaticTest st =  new StaticTest();
		StaticTest _st =  new StaticTest();		
		st.j = 9;
		_st.j = 47;		
		System.out.println("st_j=" + st.j + " ;  _st_j=" + _st.j);		
		st = _st;		
		System.out.println("st_j=" + st.j + " ;  _st_j=" + _st.j);		
		st.j = 11;
		System.out.println("st_j=" + st.j + " ;  _st_j=" + _st.j);
		
		System.out.println("----------------------------");
		
		st.c = 'z';
		System.out.println("1:st.c == " + st.c);
		i.f(st);
		System.out.println("2:st.c == " + st.c);
	}
}
