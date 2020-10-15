Node* SortedMerge(Node* a, Node* b) 
{ 
Node* result = NULL; 
	
/* point to the last result pointer */
Node** lastPtrRef = &result; 
	
while(1) 
{ 
	if (a == NULL) 
	{ 
	*lastPtrRef = b; 
	break; 
	} 
	else if (b==NULL) 
	{ 
	*lastPtrRef = a; 
	break; 
	} 
	if(a->data <= b->data) 
	{ 
	MoveNode(lastPtrRef, &a); 
	} 
	else
	{ 
	MoveNode(lastPtrRef, &b); 
	} 
	
	/* tricky: advance to point to the next ".next" field */
	lastPtrRef = &((*lastPtrRef)->next); 
} 
return(result); 
} 

//This solution is structurally very similar to the above, but it avoids using a dummy node. Instead, it maintains a struct node** pointer, lastPtrRef, that always points to the last pointer of the result list. This solves the same case that the dummy node did — dealing with the result list when it is empty. If you are trying to build up a list at its tail, either the dummy node or the struct node** “reference” strategy can be used (see Section 1 for details). 
 
