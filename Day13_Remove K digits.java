// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE 2020
// DAY 13: REMOVE K DIGITS 

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
            return "0";
        StringBuilder sb=new StringBuilder(num);
        for(int j=0;j<k;j++){
            int i=0;
            while(i<sb.length()-1 && sb.charAt(i)<=sb.charAt(i+1)){
                i++;
            }
            sb.delete(i,i+1);
        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.delete(0,1);
        }
        return sb.toString();
        
    }
}