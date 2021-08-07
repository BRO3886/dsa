#User function Template for python3
'''
	Function to merge two sorted lists in one
	using constant space.
	
	Function Arguments: head_a and head_b (head reference of both the sorted lists)
	Return Type: head of the obtained list after merger.

	{
		# Node Class
		class Node:
		    def __init__(self, data):   # data -> value stored in node
		        self.data = data
		        self.next = None
	}

'''
#Function to merge two sorted linked list.
def sortedMerge(head1, head2):
    b1 = head1.data
    b2 = head2.data
    
    head = Node(0)
    
    start = head
    
    if b1 <= b2:
        head.data = b1
        head1 = head1.next
    
    else:
        head.data = b2
        head2 = head2.next
    
    while(head1 != None and head2 != None):
        ele1 = head1.data
        ele2 = head2.data
        if(ele1 > ele2):
            new = Node(ele2)
            head.next = new
            head = new
            head2 = head2.next
        else:
            new = Node(ele1)
            head.next = new
            head = new
            head1 = head1.next
    
    if(head1 != None):
        while(head1 != None):
            ele1 = head1.data
            new = Node(ele1)
            head.next = new
            head = new
            head1 = head1.next
    
    if(head2 != None):
        while(head2 != None):
            ele2 = head2.data
            new = Node(ele2)
            head.next = new
            head = new
            head2 = head2.next
    
    return start
#{ 
#  Driver Code Starts
#Initial Template for Python 3
# Node Class
class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None

# Linked List Class
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
    
    # creates a new node with given value and appends it at the end of the linked list
    def append(self, new_value):
        new_node = Node(new_value)
        if self.head is None:
            self.head = new_node
            self.tail = new_node    
            return
        self.tail.next = new_node
        self.tail = new_node
        
# prints the elements of linked list
def printList(n):
    while n is not None:
        print(n.data, end=' ')
        n = n.next
    print()

if __name__ == '__main__':
    for _ in range(int(input())):
        n,m = map(int, input().strip().split())
        
        a = LinkedList() # create a new linked list 'a'.
        b = LinkedList() # create a new linked list 'b'.
        
        nodes_a = list(map(int, input().strip().split()))
        nodes_b = list(map(int, input().strip().split()))
        
        for x in nodes_a:
            a.append(x)
        
        for x in nodes_b:
            b.append(x)
        
        printList(sortedMerge(a.head,b.head))

# } Driver Code Ends