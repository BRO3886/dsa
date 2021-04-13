# Merge Without Extra Space
## Hard 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given two sorted arrays arr1[]&nbsp;of size N and arr2[]&nbsp;of size M. Each array is sorted in non-decreasing order. Merge the two&nbsp;arrays into one sorted array in non-decreasing order without using any extra space.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
<strong>Output:</strong> 0 1 2 3 5 6 7 8 9
<strong>Explanation:</strong> Since you can't use any 
extra space, modify the given arrays
to form </span>
<span style="font-size:18px">arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}
</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 2, M = 3
arr1[] = {10, 12}
arr2[] = {5, 18, 20}
<strong>Output:</strong> 5 10 12 18 20
<strong>Explanation:</strong>&nbsp;Since you can't use any
extra space, modify the given arrays
to form </span>
<span style="font-size:18px">arr1[] = {5, 10}
arr2[] = {12, 18, 20}</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything.&nbsp;Complete the function <strong>merge()</strong>&nbsp;which takes the two arrays&nbsp;arr1[]<strong>, </strong>arr2[]<strong> </strong>and&nbsp;their sizes&nbsp;n and<strong>&nbsp;</strong>m,&nbsp;as input parameters. The function does not return anything. Use the given arrays to sort and merge arr1[] and arr2[] in-place.&nbsp;<br>
Note: The generated output will print all the elements of arr1[] followed by all the elements of arr[2].</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O((n+m)*log(n+m))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;=&nbsp;N, M&nbsp;&lt;= 5*10<sup>4</sup><br>
0 &lt;= arr1<sub>i</sub>, arr2<sub>i</sub>&nbsp;&lt;= 10<sup>6</sup></span></p>

<p>&nbsp;</p>
 <p></p>
            </div>