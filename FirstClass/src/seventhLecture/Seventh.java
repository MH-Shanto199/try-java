package seventhLecture;

import java.util.Scanner;

public class Seventh {
	
	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurThread thread1=new OurThread("Child 1", 0, 1, 500, null, true);
		OurThread thread2=new OurThread("Child 2", 100, 10, 1000, thread1, true);
		OurThread thread3=new OurThread("Child 3", 1000, 100, 2000, thread2, true);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("Please write a command: ");
		String comandString=myScanner.nextLine();
		
		while (!comandString.toLowerCase().equals("exit")) {
			if (comandString.equals("1")) {
				System.out.println("Counter in Thread 1: "+thread1.getCounter());
			} else if(comandString.equals("2")) {
				System.out.println("Counter in Thread 2: "+thread2.getCounter());
			}else if (comandString.equals("3")) {
				System.out.println("Counter in Thread 3: "+thread3.getCounter());
			}
			else if (comandString.equals("1s")) {
				thread1.stopThread();
				System.out.println("Thread 1 is Stooped");
			}else if (comandString.equals("2s")) {
				thread2.stopThread();
				System.out.println("Thread 2 is Stooped");
			}else if (comandString.equals("3s")) {
				thread3.stopThread();
				System.out.println("Thread 3 is Stooped");
			}else {
				System.out.println("Please Give a proper command!!");
			}
			comandString=myScanner.nextLine();
		}
	}

}
