// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// Day 8 : Check if it is a straight line
// 0 ms : java solution



class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length==2)
            return true;
        int m=0;
        if(coordinates[1][0]- coordinates[0][0]!=0)
        m=(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);  // slope using first two coordinates
        for(int i=2;i<coordinates.length;i++){
            if(coordinates[i][1]-coordinates[0][1] != (m*(coordinates[i][0]-coordinates[0][0]))) // if point lies on line
                return false;
        }
        return true;
        
    }
}