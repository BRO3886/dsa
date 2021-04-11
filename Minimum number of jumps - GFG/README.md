# Minimum number of jumps
## Medium 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given an array of integers where each element represents the max number of steps that can be made forward from that element. Find&nbsp;the minimum number of jumps to reach the end of the array (starting from the first element).&nbsp;If an element is <strong>0</strong>, then you cannot move through that element. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span><span style="font-size:18px"> </span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">N=11 </span>
<span style="font-size:18px">arr=1 3 5 8 9 2 6 7 6 8 9 </span>
<span style="font-size:18px"><strong>Output:</strong> 3 </span>
<span style="font-size:18px"><strong>Explanation:</strong> </span>
<span style="font-size:18px">First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to last. </span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input :</span></strong>
<span style="font-size:18px">N= 6
arr= 1 4 3 2 6 7</span>
<span style="font-size:18px"><strong>Output:</strong> 2 
<strong>Explanation: 
</strong>First we jump from the 1st to 2nd element 
and then jump to the last element.</span>
</pre>

<p><span style="font-size:18px"><strong>Your task:</strong><br>
You don't need to read input or print anything. Your task is to complete function <strong>minJumps()</strong> which takes the array <strong>arr</strong> and it's size <strong>N</strong> as input parameters and returns the minimum number of jumps.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>7</sup><br>
0 &lt;= a<sub>i</sub> &lt;= 10<sup>7</sup></span></p>
 <p></p>
            </div>