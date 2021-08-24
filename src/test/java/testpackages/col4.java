package testpackages;

import java.util.ArrayList;
import java.util.List;

public class col4 {
	
	
	public static ArrayList<Collection2<String>> a = new ArrayList<>();
	
	Collection2<List<Integer>> o = new Collection2(a);
	
	public void ahh() {
		
		a.add(new Collection2<>(List.of("kkk", "kkkk")));
		
	//	a.add((Collection2<Integer>) List.of(5,6,7,8));
		
		
		System.out.println(o.getdata());
		
	}
	
	public static void main(String[] args) {
		
		
		col4 c = new col4();

		c.ahh();
	}

}

