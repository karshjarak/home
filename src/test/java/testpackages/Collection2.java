package testpackages;

import java.awt.List;

public class Collection2<T> {

	public  java.util.List<T> data;

	public Collection2(java.util.List<T>  data) {

		this.data = data;

	}

	
	public java.util.List<T>  getdata() {

		return data;

	}

	
	public void setdata(java.util.List<T>  data) {

		this.data = data;

	}

	@Override
	public String toString() {

		return " data is " + data;

	}
}
