// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 23: Interval List Intersections

class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int []> l=new ArrayList<>();
        for(int i=0 , j=0; i<A.length && j<B.length;){
            if(A[i][1]<B[j][0]){
                i++;
            }
            else if(B[j][1]<A[i][0]){
                j++;
            }
            else{
            int C[]=new int[2];
            C[0]=Math.max(A[i][0], B[j][0]);
            C[1]=Math.min(A[i][1],B[j][1]);
            l.add(new int[]{C[0],C[1]});
                if(A[i][1]<B[j][1]){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        return l.toArray(new int[l.size()][2]);
    }
}