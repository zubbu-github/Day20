package day20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer Interface 
class A implements Consumer<Integer>{
	 public void accept(Integer i) {
		  System.out.println(i);
	  }
}
public class StreamAPI_Demo2 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
	
//	values.forEach(i-> System.out.println(i));//Lamda Expression
	
	//Anonymous method
	/*	for(int i : values) {
				values.forEach(new Consumer<Integer>(){
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
    }
		Consumer<Integer> c = new  A();
		values.forEach(c);
		*/
	values.forEach(StreamAPI_Demo2::doubleIt);
	}

       public static void doubleIt(int i) {
	    System.out.println(i*2);
}
}