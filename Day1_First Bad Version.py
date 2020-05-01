# Shambhavi Awasthi
# LeetCode : May Challenge Solution 1 : first bad version
# Using Binary Search approach : time complexity is O(logn)
# 12 ms and 12.7 Mb.


# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        start=0
        end=n
        while start<end:
            mid = start+(end-start)//2
            if isBadVersion(mid)==False:
                start=mid+1
            else:
                end=mid
        return start
        