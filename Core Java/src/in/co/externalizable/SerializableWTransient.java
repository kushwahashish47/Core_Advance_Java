package in.co.externalizable;

import java.io.Serializable;

public class SerializableWTransient implements Serializable {
	String name = null;
	int maths = 0;
	int physics = 0;
	transient int total=0;
	
	
	public int getTotal() {
		total = maths + physics;
		return total;
	}
	}