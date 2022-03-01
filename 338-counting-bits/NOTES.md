O(nlogn) soln:
​
```java
class Solution {
public int[] countBits(int n) {
int[] arr = new int[n+1];
for(int i=0; i <= n; i++){
arr[i] = findOnes(i);
}
return arr;
}
​
private int findOnes(int n) {
int count = 0;
while(n != 0) {
n = n&(n-1);
count++;
}
return count;
}
}
```
​
`findOnes` takes `log(n)` time and for loop takes `n`. Total `nlog(n)`
​
---
**Other Approach: DP**
```
0 = 0000 | DP[0] = 0
1 = 0001 | 1 + DP[1-1]
2 = 0010 | 1 + DP[2-2]
3 = 0011 | 1 + DP[3-2]
4 = 0100 | 1 + DP[4-4]
5 = 0101 | 1 + DP[5-4]
...
```