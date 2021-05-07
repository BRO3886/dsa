# Segregate even and odd nodes in a Link List
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be same as that in the original list.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
N = 7
Link List = 
17 -&gt; 15 -&gt; 8 -&gt; 9 -&gt; 2 -&gt; 4 -&gt; 6 -&gt; NULL</span>

<span style="font-size:18px"><strong>Output:</strong> 8 2 4 6 17 15 9</span>

<span style="font-size:18px"><strong>Explaination:</strong> 17,15,8,9 are odd so they appear 
first and 2,4,6 are the even numbers that appear later.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
Link List = 1 -&gt; 3 -&gt; 5 -&gt; 7</span>

<span style="font-size:18px"><strong>Output:</strong> 1 3 5 7</span>

<span style="font-size:18px"><strong>Explaination:</strong> There is no even number. 
So ne need for modification.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>divide() </strong>which takes N and head of Link List as input parameters and returns the head of modified link list.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 100<br>
1 ≤ arr[i] ≤ 10000&nbsp;</span></p>
 <p></p>
            </div>