package InputNOutputt;

import java.io.Serializable;

public class MarksheetBean implements Serializable {
	String name = null;
	int math = 0;
	int physics = 0;
	int chemistry = 0;
	
	public String getName() {
		return name;
	}
		public void setName(String name) {
			this.name = name;	
	}
}
//see another method in ppt