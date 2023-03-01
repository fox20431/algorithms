// ref: https://leetcode.com/problems/reverse-linked-list/

#include <functional>
#include <iostream>
#include <typeinfo>
#include <unordered_map>
#include <vector>

using namespace std;

struct ListNode {
  int val;
  ListNode* next;
  ListNode() : val(0), next(nullptr) {}
  ListNode(int x) : val(x), next(nullptr) {}
  ListNode(int x, ListNode* next) : val(x), next(next) {}
};

class Solution {
 public:
  ListNode* reverseList(ListNode* head) {
    ListNode *prev = nullptr, *cur = head, *next = nullptr;
    while (cur) {
        next = cur->next;
        cur->next = prev;
        prev = cur;
        cur = next;
    }
    return prev;
  }
};

int main() {
  Solution solution;
  ListNode 
  solution.reverseList
}