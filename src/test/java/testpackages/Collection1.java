package testpackages;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Collection2<String> col2 = new Collection2("karshak");
//
//	//	System.out.println(col2.toString());
//		
//		Collection2<Integer> col3 = new Collection2(10);
//		
//		Data1<Integer> c = new Collection2();
//		
//		System.out.println(c.getdata());

		Collection2<Integer> g = new Collection2<>(List.of(1, 3, 4, 5, 7));
		
		for (Integer c : g.getdata()) {

			System.out.println(c);
		}

	}

}

interface Data1<T> {

	public T getdata();

	public void setdata(T data);

}
