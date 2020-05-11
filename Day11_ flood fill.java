// SHAMBHAVI AWASTHI
// LEETCODE MAY CHALLENGE
// DAY 11 : FLOOD FILL : recursive search approach


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color=image[sr][sc];  // original color at (sr,sc)
        if(image[sr][sc]!=newColor) // checking base case 
            search(image,sr,sc,color,newColor);  // calling recusive function for search and replace with new pixels.
        return image;    // return the new image 
        
    }
    public void search(int [][]image,int i,int j,int color,int newColor){
        if (i<0 || j<0 ) 
            return ;
        if (i>=image.length || j>=image[0].length)
            return;
        if (image[i][j]!=color)  // if new and orignal image is same, no change, return original image
            return ;
        image[i][j]=newColor;  // replacing the pixels
        search(image,i,j-1,color,newColor);  // 4 directional replacement of pixels
        search(image,i,j+1,color,newColor);
        search(image,i-1,j,color,newColor);
        search(image,i+1,j,color,newColor);
    }
}