// Java Program to find whether a
// no is power of two
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
class Question4
{
/* Function to check if x is power of 2*/
static boolean isPowerOfTwo(int n)
{
	if(n==0)
	return false;
System.out.println(Math.ceil((Math.log(n)/Math.log(2))));
System.out.println(Math.floor((Math.log(n)/Math.log(2))));
return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
	(int)(Math.floor(((Math.log(n) / Math.log(2)))));
}

// Driver Code
public static void main(String[] args)
{

	if(isPowerOfTwo(31))
	System.out.println("Yes 31 is power of 2");
	else
	System.out.println("No 31 is not a power of 2");
	
	if(isPowerOfTwo(64))
	System.out.println("Yes 64 is power of 2");
	else
	System.out.println("No 64 is not power of 2");
    System.out.println("  Please  enter  the  input  string  :");
    Scanner in = new Scanner(System.in); // read from System input
    String input = in.nextLine();

	if(isPowerOfTwo(Integer.parseInt(input)))
	System.out.println("Yes " +input +" is "+ Math.ceil((Math.log(Integer.parseInt(input))/Math.log(2))) +" power of 2");
	else
	System.out.println("No " +input + " is not power of 2");
 

}
}


