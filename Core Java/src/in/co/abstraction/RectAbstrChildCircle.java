package in.co.abstraction;

public class RectAbstrChildCircle extends RectAbstr
{

	@Override
	public double area() {												// in this we completed the unimplemented method.
	double area = getlength()*getWidth()	;							// delete override and check and then undo,u will get it.
	return area;
	}
}
