// ref: https://leetcode.com/problems/fibonacci-number/

/*
F(0) = 0
F(1) = 1
F(2) = F(1) + F(0)
F(3) = F(2) + F(1) = [ F(1) + F(0) ]  + F(1)
F(4) = F(3) + F(2) = ...
*/

// the sequence of result:
// [0, 1, 1, 2, 3, 5, 8, 13]

#include <iostream>
#include <vector>

using namespace std;

class Solution {
 public:
  int fib(int n) {
    int fir_n = 0;
    int sec_n = 1;
    if (n == 0 || n == 1) {
        return n;
    }
    for (int i = 0; i < (n-1); i++) {
        int temp = fir_n + sec_n;
        fir_n = sec_n;
        sec_n = temp;
    }
    return sec_n;
  }
};


int main() {
  Solution solution;
  int out = solution.fib(3);
  cout << out << endl;
  return 0;
}