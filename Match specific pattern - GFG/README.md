# Match specific pattern
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a dictionary of words and a pattern. Every character in the pattern is uniquely mapped to a character in the dictionary. Find all such words in the dictionary that match the given pattern.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
dict[] = {abb,abc,xyz,xyy}
pattern  = foo
<strong>Output: </strong>abb xyy<strong>
Explanation: </strong>xyy and abb have the same
character at index 1 and 2 like the
pattern.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findMatchedWords()&nbsp;</strong>which takes an array of strings dict[] consisting of the words in the dictionary and a string, Pattern and returns an array of strings consisting of all the words in the dict[] that match the given Pattern in lexicographical order.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*K) (where K is the&nbsp;length of the pattern).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10</span></p>
 <p></p>
            </div>