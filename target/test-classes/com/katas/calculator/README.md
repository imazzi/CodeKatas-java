# CalculatorTDD
Clean Code and Test-Driven Development (TDD)
<h1>Before you start:</h1> 
<ul>
  <li>Try not to read ahead.</li>
  <li>Do one task at a time. The trick is to learn to work incrementally.</li>
  <li>
Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata</li>
</ul>

<h1>String Calculator</h1>

Create a simple String calculator with a method signature:<br>
———————————————<br>
int Add(string numbers)<br>
———————————————<br>
<p>The method can take up to two numbers, separated by commas, and will return their sum. 
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0) </p>
Hints:
<ul>
  <li>Start with the simplest test case of an empty string and move to one and two numbers
</li>
  <li>Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
</li>
  <li>Remember to refactor after each passing test</pre>
</li>
</ul>
———————————————————————————————<br>
Allow the Add method to handle an unknown amount of numbers<br>
————————————————————————————————<br>
<p>Allow the Add method to handle new lines between numbers (instead of commas).
the following input is ok: “1\n2,3” (will equal 6)
the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)</p>
——————————————————————————————<br>
<p>Support different delimiters
to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
the first line is optional. all existing scenarios should still be supported</p>
————————————————————————————————<br>
<p>Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. 
if there are multiple negatives, show all of them in the exception message.</p>
————————————————————————————————<br>
<mark>STOP HERE if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.</mark>
————————————————————————————————<br>
Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
————————————————————————————————<br>
Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6
————————————————————————————————<br>
Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
————————————————————————————————<br>
make sure you can also handle multiple delimiters with length longer than one char
