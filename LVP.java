class LVP {
    public int longestValidParentheses(String s) {
        
        Stack stk = new Stack();
        int max = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c =='('){
                stk.push(new Integer(i+1));                
            }
            else if(!stk.empty()){
                stk.pop();
                if(stk.empty())
                    max = Math.max(max, i+1-count);
                else
                    max = Math.max(max, i+1 - (int)stk.peek());
            }
            else{
                count = i+1;
            }
        }
        //if(count > max)
          //  max = count;
        return max;
    }
}