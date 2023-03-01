cmake_minimum_required(VERSION 3.24)
project(leetcode)

set(CMAKE_CXX_STANDARD 14)

add_executable(leetcode
        algorithms/cpp/FibonacciNumber.cpp
        algorithms/cpp/LongestSubstringWithoutRepeatingCharacters.cpp
        algorithms/cpp/ReverseLinkList.cpp
        algorithms/cpp/SingleNumber.cpp
        algorithms/cpp/Test.cpp
        algorithms/cpp/TwoSum.cpp)
