package in.co.interfacee;

public class Businessman implements Richman,SocialWorker {
	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
	}
	@Override
	public void earnMoney() {
		System.out.println("to help others");
		return; 
	}
	@Override
	public void donation() {
		// TODO Auto-generated method stub
	}
	@Override
	public void party() {
		// TODO Auto-generated method stub	
	}
	private String name;
	private String Address;
	public void donation1() {
		System.out.println();
	}
}
