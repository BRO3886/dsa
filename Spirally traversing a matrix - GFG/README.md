# Spirally traversing a matrix
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a&nbsp;matrix&nbsp;of size R*C. Traverse the matrix in spiral form.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
R = 4, C = 4
matrix[][] = {{1, 2, 3, 4},
&nbsp;          {5, 6, 7, 8},
&nbsp;          {9, 10, 11, 12},
&nbsp;          {13, 14, 15,16}}
<strong>Output</strong>: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
<strong>Explanation</strong>:
</span><img alt="" src="https://www.geeksforgeeks.org/wp-content/uploads/spiral-matrix.png" style="height:242px; width:400px" class="img-responsive"></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
R = 3, C = 4  
matrix[][] = {{1, 2, 3, 4},
&nbsp;          {5, 6, 7, 8},
&nbsp;          {9, 10, 11, 12}}
<strong>Output</strong>: 
1 2 3 4 8 12 11 10 9 5 6 7
<strong>Explanation</strong>:
Applying same technique as shown above, 
output for the 2nd testcase will be 
1 2 3 4 8 12 11 10 9 5 6 7.</span>
</pre>

<p><br>
<strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You dont need to read input or print anything.&nbsp;Complete the function <strong>spirallyTraverse()&nbsp;</strong>that takes <strong>matrix, R&nbsp;and C&nbsp;</strong>as input&nbsp;parameters<strong> </strong>and returns a list of integers denoting the spiral traversal of matrix.&nbsp;<br>
<br>
<strong>Expected Time Complexity:</strong>&nbsp;O(R*C)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(R*C)<br>
<br>
<strong>Constraints:</strong><br>
1 &lt;= R, C&nbsp;&lt;= 100<br>
0 &lt;= matrix<sub>i</sub> &lt;= 100</span></p>
 <p></p>
            </div>