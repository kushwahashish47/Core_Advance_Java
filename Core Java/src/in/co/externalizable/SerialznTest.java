package in.co.externalizable;

public class SerialznTest {
	public static void main(String[] args) {
		SerializableWTransient st = new SerializableWTransient();
		st.name = "ak";
		st.physics = 70;
		st.maths = 75;
		
		System.out.println(st.physics);
		System.out.println(st.maths);

	System.out.println(st.getTotal());
	}
}