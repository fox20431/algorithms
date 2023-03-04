// https://leetcode.com/problems/longest-substring-without-repeating-characters/

#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
 public:
  int lengthOfLongestSubstring(string s) {
    int n = s.length();
    int ans = 0;
    unordered_map<char, int> map;
    for (int i = 0, j = 0; j < n; j++) {
      cout << 0 << endl;
      // if find() doesnot find any element, it will return map.end() obj.
      if (map.find(s[j]) != map.end()) {
        i = max(i, map[s[j]]);
      }
      ans = max(ans, j - i + 1);
      map[s[j]] = j + 1;
    }
    return ans;
  }
};

int main() {
  Solution solution;
  int ans = solution.lengthOfLongestSubstring("abca");
  cout << ans << endl;
  return 0;
}