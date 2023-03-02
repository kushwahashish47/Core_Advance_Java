package in.co.immutable;

public final class ImmutableClass  {
	private final int length  ;							//immutable means does not change ones created.
	private final int width  ;
	private double area;
	
	public ImmutableClass(int length , int width) {
		this.length = length;
		this.width = width;
		
	}
	public int getLength() {
		return length;
		
	}
	public int getWidth() {
		return width;
	}
	public double area () {
		this.area = getLength()*getWidth();
		return area;
	}
}
