# SHAMBHAVI AWASTHI
# LEETCODE MAY CHALLENGE 2020
# DAY 4: NUMBER COMPLEMENT
# Python 3 Solution

class Solution:
    def findComplement(self, num: int) -> int:
        binary=bin(num).replace("0b", "")  #converting given number to binary
        number_of_digits=len(binary)
        complement=""
        for i in range(number_of_digits): # taking complement
            if binary[i]=='0':
                complement+='1'
            else:
                complement+='0'
        decimal=int(complement,2) # converting back to Decimal
        return decimal
        