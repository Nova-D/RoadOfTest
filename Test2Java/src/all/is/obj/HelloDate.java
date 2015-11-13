package all.is.obj;

import java.util.Date;

public class HelloDate {
	/**The First Thinking in Java Demo Program。
	 * @author Nova.ME
	 * @author www.nova.com
	 * @return Nova's Coding enthusiasm
	 * @since 2015-11-13 
	 * 
	 */
	int x;char y;
	public void javaVariableInit(){
		System.out.println("x is： " + x);
		System.out.println("y is： " + y);
	}
	public void iWant2Say(){
		System.out.println("-----------Catherine----------");
	}
	
	public static void main(String[] args){
		HelloDate hd = new HelloDate();
		hd.iWant2Say();
		System.out.println("Hello,this is my first JavaDemo.");
		System.out.println("Current Time is: " + new Date());
		System.out.println("-----------由我组成分割线----------");		
		hd.javaVariableInit();
	}
}
