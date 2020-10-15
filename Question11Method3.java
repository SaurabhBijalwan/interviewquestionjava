class Question11Method3 
{
	public Node SortedMerge(Node A, Node B) 
	{
	
		if(A == null) return B;
		if(B == null) return A;
		
		if(A.data < B.data) 
		{
			A.next = SortedMerge(A.next, B);
			return A;
		}
		else
		{
			B.next = SortedMerge(A, B.next);
			return B;
		}
		
	}
}

//Method 3 (Using Recursion) 
Merge is one of those nice recursive problems where the recursive solution code is much cleaner than the iterative code. You probably wouldn’t want to use the recursive version for production code, however, because it will use stack space which is proportional to the length of the lists
