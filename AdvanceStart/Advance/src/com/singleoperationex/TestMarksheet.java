package com.singleoperationex;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testInsert();	
	}
	private static void testInsert() throws Exception {
		MarksheetBean bean = new MarksheetBean();										//we set values in this class
		bean.setId(3);
		bean.setRollNo(34);
		bean.setName("Arun");
		bean.setPhysics(75);
		bean.setChemistry(80);
		bean.setMaths(76);
		
		MarksheetModel m = new MarksheetModel();
		m.insert(bean);		
	}
}
