package in.co.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Marksheet  {
	
	String name = null;
	int physics =0;
	int chemistry = 0;
	transient int total =0;
	
	

//	e@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		out.writeObject(name);
//		out.writeObject(physics);
//		out.writeObject(chemistry);
//		out.writeObject(total);	
//	}
//
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		name = (String) in.readObject();
//		physics = in.readInt();
//		chmistry= in.readInt();
//		total = in.readInt();
	}


