# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE
# DAY 28: Counting Bits

class Solution:
    def countBits(self, num: int) -> List[int]:
        my_list=[];
        for i in range(0,num+1):
            b=bin(i);
            my_list.append(b.count("1"))
        return my_list