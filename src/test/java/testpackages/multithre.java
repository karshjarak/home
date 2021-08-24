package testpackages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class multithre<T> extends Thread {

	static ConcurrentHashMap<String, String> a = new ConcurrentHashMap<String, String>();

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		ha g = s -> s.length();

		int len = g.length("karhak");

		System.out.println(len);

	}

}

interface ha {

	public int length(String s);

}
