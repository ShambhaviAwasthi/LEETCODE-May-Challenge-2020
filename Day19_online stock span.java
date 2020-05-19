// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 19: Online Stock Span

class StockSpanner {
    Stack<int []> stack=new Stack<>();  // initialize stack of array 
    public StockSpanner() {
        
    }
    
    public int next(int price) {
       int result=1; // min value
        while(! stack.isEmpty() && stack.peek()[0]<=price){  // to find consecutive span
            result=result+stack.pop()[1]; // pop the result value for current price
        }
        
        stack.push(new int[] {price,result});  // push the new price and result arrray
        return result; // print the result for current price
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */