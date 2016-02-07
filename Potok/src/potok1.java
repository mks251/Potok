public class potok1 {
	public static void main(String[] args){
		Thread t1 = new Thread(new potok2("1"));
		Thread t2 = new Thread(new potok2("2"));
		Thread t3 = new Thread(new potok2("3"));
		t1.start();
		t2.start();
		t3.start();
}
}
