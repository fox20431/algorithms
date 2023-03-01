// ref: https://leetcode.com/problems/two-sum/

#include <iostream>
#include <vector>

using namespace std;

// O(n^2) time complexity
class Solution {
 public:
  vector<int> twoSum(vector<int>& nums, int target) {
    // vector<int> indices = {}
    for (int i = 0; i < nums.size(); i++) {
      for (int j = i+1; j < nums.size(); j++) {
        if((nums[i] + nums[j]) == target) {
          return {i, j};
        }
      }
    }
    return {};
  }
};

int main() {
  Solution solution;
  vector<int> nums = {2, 7, 100};
  vector<int> indices = solution.twoSum(nums, 9);
  for (int index : indices) {
    cout << index << " ";
  }
  cout << endl;
  return 0;
}