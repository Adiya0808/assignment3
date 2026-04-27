## 1. Which sorting algorithm performed faster? Why?
The faster algorithm was the one with lower time complexity, such as Quick Sort or Merge Sort. They are faster because they run in O(nlog⁡n)O(n \log n)O(nlogn), while simpler algorithms like Bubble Sort run in O(n2)O(n^2)O(n2). This means they perform fewer operations on large datasets.
2. How does performance change with input size?
As the input size increases, the execution time also increases.
For inefficient algorithms (like Bubble Sort), the time grows very quickly, while for more efficient ones (Quick Sort, Merge Sort), it grows more slowly. The difference becomes very noticeable with large datasets.
3. How does sorted vs unsorted data affect performance?
The initial order of data can significantly affect performance.
For example, Insertion Sort works very fast on already sorted or nearly sorted arrays (almost O(n)O(n)O(n)).
However, Quick Sort can perform worse on already sorted data if the pivot is chosen poorly.
4. Do the results match the expected Big-O complexity?
Yes, overall the results match the expected Big-O complexity.
For small inputs, the difference may not be very noticeable, but as the input size increases, the behavior aligns with theoretical predictions.
5. Which searching algorithm is more efficient? Why?
Binary Search is more efficient because it runs in O(log⁡n)O(\log n)O(logn), compared to Linear Search which runs in O(n)O(n)O(n).
It repeatedly divides the search space in half, making it much faster for large datasets.
6. Why does Binary Search require a sorted array?
Binary Search requires a sorted array because it compares the target value with the middle element and decides whether to search the left or right half.
If the array is not sorted, it is impossible to determine which direction to go, so the algorithm would not work correctly.
