// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 30: K Closest Points to Origin

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int res[][]=new int[k][2];
        double dist[]=new double[points.length];
        for(int i=0;i<points.length;i++){
            dist[i]=Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
        }
        Arrays.sort(dist);
        for(int i=0;i<k;i++){
            for(int j=0;j<points.length;j++){
                if(Math.sqrt((points[j][0]*points[j][0])+(points[j][1]*points[j][1])) == dist[i]){
                    res[i][0]=points[j][0];
                    res[i][1]=points[j][1];
                    points[j][0]=0;
                    points[j][1]=0;
                    break;
                }
            }
        }
        return res;
    }
}