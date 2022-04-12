```
class Solution {
public int[] twoSum(int[] nums, int target) {
Map<Integer, Integer> map = new HashMap<>();
for (int i=0; i<nums.length; i++) {
map.put(nums[i], i); //key=2, value=0 | key=7, value=1...
}
for (int i=0; i<nums.length; i++) {
int complement = target - nums[i];
if (map.containsKey(complement) && map.get(complement) != i) {
return new int[] {i, map.get(complement)};
}
}
return null;
}
}
//hash map: time - O(n), space - O(n)
​
class Solution {
public int[] twoSum(int[] nums, int target) {
for (int i=0; i<nums.length; i++) {
for (int j=i+1; j<nums.length; j++) {
if (nums[j] == target - nums[i]) {
return new int[] {i, j};
}
}
}
return null; //in case no solution
}
}
//brute force: time - O(n^2), space - O(1)
```
​
​