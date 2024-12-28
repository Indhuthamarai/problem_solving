class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(s.charAt(i)=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                if(s.charAt(i)==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}