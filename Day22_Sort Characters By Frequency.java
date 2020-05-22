// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 22: Sort Characters By Frequency

class Solution {
    static int MAX=256;
    public String frequencySort(String s) {
        int freq[]=new int[MAX];
        int len=s.length();
        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
        }
        int max=0;
        int index=0;
        String st="";
        for(int i=0;i<MAX;i++){
            for(int j=0;j<MAX;j++){
                if(freq[j]>max){
                    max=freq[j];
                    index=j;
                }
            }
            for(int k=0;k<max;k++){
                st=st+(char)index;
            }
            max=0;
            freq[index]=0;
        }
        return st;
    }
}


