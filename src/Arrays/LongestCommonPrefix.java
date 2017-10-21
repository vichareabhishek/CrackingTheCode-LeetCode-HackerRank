package Arrays;

public class LongestCommonPrefix {

public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0){
            return "";
        }
        
        return getlongString(0, strs.length-1, strs);
        
    }
    
    public String getlongString(int S, int E, String[] strs){
        
        if(S==E){
            return strs[S];
        }
        int mid = (S+E)/2;
        
        String left =  getlongString(S, mid, strs);
        String right =  getlongString(mid+1,E, strs);    
        
        return getLongString2(left, right);
        
    }
    
    public String getLongString2(String L, String R){
        int min = Math.min(L.length(), R.length());
        for(int i=0; i<min; i++){
            if(L.charAt(i)!= R.charAt(i)){
                return L.substring(0,i);
            }
        }
        return L.substring(0,min);
        
    }
}
