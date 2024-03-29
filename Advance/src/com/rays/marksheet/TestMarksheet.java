package com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
//		 testInsert();
//		 testUpdate();
//		 testDelete();
//		 testSearch();
//		testFindById();
		testSearchMultiple();
		
	}
	
	private static void testInsert() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		
		bean.setRollNo(21);
		bean.setName("yansh");
		bean.setPhysics(90);
		bean.setChemistry(80);
		bean.setMaths(70);

		MarksheetModel m = new MarksheetModel();
		m.insert(bean);

	}
	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setId(11);
		bean.setRollNo(21);
		bean.setName("heyansh");
		bean.setPhysics(90);
		bean.setChemistry(80);
		bean.setMaths(70);

		MarksheetModel m = new MarksheetModel();
		m.update(bean);

	}
	private static void testDelete() throws Exception {

		MarksheetModel m = new MarksheetModel();
		m.delete(14);
	}

	private static void testSearch() throws Exception {

		MarksheetModel m = new MarksheetModel();
		List list = m.search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean bean = (MarksheetBean) it.next();
			System.out.print(bean.getId() + "\t");
			System.out.print(bean.getRollNo() + "\t");
			System.out.print(bean.getName() + "\t");
			System.out.print(bean.getPhysics() + "\t");
			System.out.print(bean.getChemistry() + "\t");
			System.out.println(bean.getMaths() + "\t");

		}
	}	
	private static void testFindById() throws Exception {

		MarksheetModel m = new MarksheetModel();
		MarksheetBean bean = m.findById(5);

		if (bean != null) {
			System.out.print(bean.getId() + "\t");
			System.out.print(bean.getRollNo() + "\t");
			System.out.print(bean.getName() + "\t");
			System.out.print(bean.getPhysics() + "\t");
			System.out.print(bean.getChemistry() + "\t");
			System.out.println(bean.getMaths() + "\t");
		} else {
			System.out.println("invalid id...");
		}
		
	}
	private static void testSearchMultiple() throws Exception {

		MarksheetBean bean1 = new MarksheetBean();
		bean1.setName("Ajay");
		bean1.setChemistry(90);
		MarksheetModel m = new MarksheetModel();
		
		List list = m.searchMultiple(bean1);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean bean = (MarksheetBean) it.next();
			System.out.print(bean.getId() + "\t");
			System.out.print(bean.getRollNo() + "\t");
			System.out.print(bean.getName() + "\t");
			System.out.print(bean.getPhysics() + "\t");
			System.out.print(bean.getChemistry() + "\t");
			System.out.println(bean.getMaths() + "\t");

		}
	}	
}
