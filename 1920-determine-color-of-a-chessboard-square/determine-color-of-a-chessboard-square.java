class Solution {
    public boolean squareIsWhite(String coordinates) {
       int ascii = coordinates.codePointAt(0)+ coordinates.charAt(1);
       if(ascii%2==0)
       {
        return false;
       }
       else
       return true;
        
    }
}