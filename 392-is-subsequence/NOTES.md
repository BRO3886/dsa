```java
int i = 0;
for(int j = 0;j<t.length() && i<s.length();j++)
if(t.charAt(j) == s.charAt(i)) i++;
return i == s.length();
```
​
^ shorter version