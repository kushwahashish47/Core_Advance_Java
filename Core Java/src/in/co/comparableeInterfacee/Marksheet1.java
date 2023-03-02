package in.co.comparableeInterfacee;

public class Marksheet1 implements Comparable {
	public String rollNo;
	public String name;
	public int physics;
	public int chemistry;
	public int maths;										// complete it
	
	public Marksheet1(String r,String n,int p,int c,int m) {
		this.rollNo = r;
		this.name = n;
		this.physics = p;
		this.chemistry = c;
		this.maths = m;
	}
		public String getRollNo () {
			return rollNo;
		}
		public String getName () {
			return name;
		}
		public int getPhysics() {
			return physics;
		}
		public int getChemistry() {
			return chemistry;
		}
		public int getMaths() {
			return maths;
		}
		public String toString() {
			return rollNo + ","+name+","+physics+","+chemistry+","+maths;
			}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
		}

