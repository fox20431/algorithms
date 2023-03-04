// ref: https://leetcode.com/problems/single-number/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
 public:
  int singleNumber(vector<int>& nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }
};

int main() {
  Solution solution;
  vector<int> nums = {2, 2, 1};
  int out = solution.singleNumber(nums);
  cout << out << endl;
  return 0;
}