package week1.day21;

public class myMobile {
  int amps=5;
  String brandname;
  float cost=2.2f;
  
	public void makeCall()
	
	{
		System.out.println("make call");
	}
	public void sendMsg()
	{
		System.out.println("send message");
	}
	private void payBill()
	{
		System.out.println("paybill");
	}
	public static void main(String[] args) {
		myMobile obj=new myMobile();
		myMobile obj1=new myMobile();
		float ampsam=obj.cost;
		System.out.println("ampsam" +ampsam);
		obj1.sendMsg();
		System.out.println("aaa"+obj1.cost);
		obj.makeCall();
		
		

	}

}
