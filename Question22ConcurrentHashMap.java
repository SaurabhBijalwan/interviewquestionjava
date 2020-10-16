// Java program to illustrate 
// HashMap drawbacks 
import java.util.HashMap; 
import java.util.concurrent.*; 

class Question22ConcurrentHashMap extends Thread 
{ 
	static ConcurrentHashMap<Integer,String> l = 
					new ConcurrentHashMap<Integer,String>(); 

	public void run() 
	{ 
	
		// Child add new element in the object 
		l.put(103,"D"); 
		
		try
		{ 
			Thread.sleep(20000); 
		} 
		catch(InterruptedException e) 
		{ 
			System.out.println("Child Thread going to add element"); 
		} 
	} 
	
	public static void main(String[] args) throws InterruptedException 
	{ 
		l.put(100,"A"); 
		l.put(101,"B"); 
		l.put(102,"C"); 
		Question22ConcurrentHashMap t=new Question22ConcurrentHashMap(); 
		t.start(); 
		
		for (Object o : l.entrySet()) 
		{ 
			Object s=o; 
			System.out.println(s); 
			Thread.sleep(10000); 
		} 
		System.out.println(l); 
	} 
} 
/**
100=A
101=B
102=C
103=D
{100=A, 101=B, 102=C, 103=D}
 */