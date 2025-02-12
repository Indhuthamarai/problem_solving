class Solution {
    public String reformatNumber(String number) {
        String n=number.replaceAll("[\\s-]","");
        String newString="";
        if(n.length()<4){
            return n;
        }
        while(n.length()>0){
            if(n.length()<4){
                newString+=n;
                n="";
            }
            else if(n.length()==4){
                newString+=n.substring(0,2);
                newString+="-";
                newString+=n.substring(2);
                n="";
            }
            else if(n.length()>4){
                newString+=n.substring(0,3);
                newString+="-";
                n=n.substring(3);
            }
        }
        return newString;
    }
}