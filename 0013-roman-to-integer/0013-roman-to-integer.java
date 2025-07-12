class Solution {
    public int romanToInt(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I': result=result+1;
                    break;
                case 'V': result=result+5;
                    break;
                case 'X': result+=10;
                    break;
                case 'L': result+=50;
                    break;
                case 'C': result+=100;
                    break;
                case 'D': result+=500;
                    break;
                case 'M': result+=1000;
                    break;
            }
        }   
        if(s.contains("IV")||s.contains("IX"))
            result=result-2;
        if(s.contains("XL")||s.contains("XC"))
            result=result-20;
        if(s.contains("CD")||s.contains("CM"))
            result=result-200;
       
        return result;
    }
}