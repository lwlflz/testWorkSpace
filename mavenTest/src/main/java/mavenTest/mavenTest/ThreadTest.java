package mavenTest.mavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class ThreadTest {

	
	@Test
	public void test() throws IOException, InterruptedException {
//		FileInputStream fileInputStream = new FileInputStream(new File("F:test1.txt"));
//		int read = fileInputStream.read();
//		System.out.println(read);
		String lock = "lock";
		thread1 thread1 = new thread1(lock);
		thread2 thread2 = new thread2(lock);
		new Thread(thread1).start();
		new Thread(thread2).start();
		
		System.out.println("主线程=睡眠前");
		Thread.sleep(10000);
		System.out.println("主线程=睡眠后");
	
	}
	
	
	
	
	
	
	
	class thread1 implements Runnable{

		String lock;
		thread1(String lock) {
			this.lock = lock;
		}
		
		public void run() {
			
			
			try {
				FileInputStream fileInputStream = new FileInputStream(new File("F:test1.txt"));
				int read = fileInputStream.read();
				System.out.println(read);
				System.out.println("1睡觉前");
				
				System.out.println("1睡觉后");
				FileInputStream fileInputStream2 = new FileInputStream(new File("F:test2.txt"));
				int read2 = fileInputStream.read();
				System.out.println(read);
				System.out.println("我是1号，我没死锁");
				Thread.sleep(1000);
				lock.notifyAll();
				System.out.println("唤醒");
			} catch (Exception e) {
				System.out.println("捕获到宜昌了");
				e.printStackTrace();
			}
			
		}
	
	}
	
	class thread2 implements Runnable{

		String lock;
		public thread2(String lock) {
			this.lock = lock;
		}
		
		
		public void run() {
			synchronized (lock) {
				
			
				try {
					FileInputStream fileInputStream = new FileInputStream(new File("F:test2.txt"));
					int read = fileInputStream.read();
					System.out.println(read);
					System.out.println("2等待前");
					lock.wait();
					
					System.out.println("2等待后");
					FileInputStream fileInputStream2 = new FileInputStream(new File("F:test1.txt"));
					int read2 = fileInputStream.read();
					System.out.println(read);
					System.out.println("我是2号，我没死锁");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}
	
}
