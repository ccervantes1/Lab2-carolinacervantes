---


---

<h2 id="lab-2-answers">Lab 2 Answers</h2>
<p>Question 1: What is the complexity of each of the four search methods in terms of array or list size n? <br><br>
Answer: <br><br>
findTeamPosition (array) = O(n) <br><br>
findTeamPosition (array list) = O(n) <br><br>
findTeamMinFunding = O(n)<br><br>
findTeamMinFundingFast = O(n^2)</p>
<p>Question 2:  What happens in the case of binary search if the array is not sorted? <br><br>
Answer: You can’t apply binary search on a list that is not sorted, because the algorithm assumes that it is sorted in ascending/descending order. A binary search starts at the middle, and if that’s not the item, it cuts the array in half and searches to the left of it because it assumes that the left are items greater than the middle.<br>
<br><br>
Question 3: What is the purpose of constructor argument validity checking?<br><br>
Answer: The purpose of constructor argument validity checking is to make sure what is given to the constructor is appropriate for what is being stored. For example, we tested funding to make sure that the integer given to us was not less than zero. <br><br>
Question 4: -What is the purpose of using the keyword  <code>final</code>  with variables and arguments?<br><br>
Answer: The purpose of using the keyword <code>final</code> is to make sure that within a certain method the variable and/or arguments cannot be changed. Essentially, it means that the variable can only be initialized once. <br><br>
Question 5: What are alternatives to using  <code>Optional</code>  and how do they compare? <br><br>
Answer: Optional is like a container that may or may not contain a value. However, you could use null to represent the absence of a value. The problem with using null is that is the NullPointerException, which can become an issue when you reference a variable that is null.</p>
<blockquote>
<p>Written with <a href="https://stackedit.io/">StackEdit</a>.</p>
</blockquote>

