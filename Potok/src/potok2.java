 import java.util.*;
class potok2 implements Runnable{
	int time;
	String name;
	Random r = new Random();
		public potok2(String name){ 
		this.name = name;
		time = r.nextInt(999);
	}
 	public void run() {
		System.out.printf("����� %s ���� %d\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("����� %s ��������� � ����������\n", name);
		}
	}

