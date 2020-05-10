// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// Day 10: find the town judge
// 2 ms : Dynamic programming solution in java


class Solution {
    public int findJudge(int N, int[][] trust) {
        int l=trust.length;     // no. of rows in trust
        int arr[]=new int[N];   // lookup table
        int judge=0;           // suspected judge
        int i=0;
        for(i=0;i<l;i++){         // iterate for 1st column of trust
            arr[trust[i][0]-1]++;
        }
        for( i=0;i<N;i++){         // the array index with value 0 is suspected judge
            if(arr[i]==0){
                judge=i;
                break;
            }
                
        }
        if(i==N){         // if no array index has 0 values so no judge
            return -1;
        }
        for( i=0;i<l;i++){        // checking condition 2
            arr[trust[i][1]-1]++;
        }
        if( arr[judge]==N-1)  // if number of people trusting suspected judge is N-1, he is surely the judge
            return judge+1;
        return -1;
        
    }
}