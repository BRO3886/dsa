# User function Template for Python3

# Following is the structure of node 
# class Node:
#     def __init__(self, data):  
#         self.val = data
#         self.link = None

class Solution:
    def divide(self, N, head):
        odd=[]
        even=[]
        temp=head
        while(temp!=None):
            if int(temp.data % 2) == 0: 
                even.append(temp.data)
            else:
                odd.append(temp.data)
            temp = temp.next
                
        l=even+odd
        head = node()
        head.data = l[0]
        temp = head
        
        for i in l[1:]:
            b = node()
            b.data = i
            temp.next = b
            temp = b
        
        
        return head

#{ 
#  Driver Code Starts
# Initial Template for Python3

# Node Class    
class node:
    def __init__(self):
        self.data = None
        self.next = None

# Linked List Class
class Linked_List:
    def __init__(self):
        self.head = None
        self.tail = None
        
    def insert(self, data):
        if self.head == None:
            self.head = node()
            self.tail = self.head
            self.head.data = data
        else:
            new_node = node()
            new_node.data = data
            new_node.next = None
            self.tail.next = new_node
            self.tail = self.tail.next

def printlist(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print('')

# Driver Program
if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        list1 = Linked_List()
        n = int(input())
        values = list(map(int, input().strip().split()))
        for i in values:
            list1.insert(i)
        ob = Solution()
        newhead = ob.divide(n, list1.head)
        printlist(newhead)


# } Driver Code Ends