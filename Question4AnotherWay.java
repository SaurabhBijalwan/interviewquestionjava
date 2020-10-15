// Java program to find whether
// a no is power of two
import java.io.*;

class Question4AnotherWay {

	// Function to check if 
	// x is power of 2
	static boolean isPowerOfTwo(int n)
	{
		if (n == 0)
			return false;
        if (n == 1)
			return false;
		
		while (n != 1)
		{
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	// Driver program 
	public static void main(String args[])
	{
		if (isPowerOfTwo(1))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (isPowerOfTwo(64))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}


