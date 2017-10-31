package amazonTest;

import java.util.Stack;

public class PrefixToPostFix {
	
	private static String prefixtopostfix(String prefixExp) {
        if(prefixExp.isEmpty()){
            return null;
        }
    
    String sep = "seperator";
    Stack<String> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for( char c: prefixExp.toCharArray()){
        if(!Character.isDigit(c)) {
            stack.push(String.valueOf(c));
        } else {
            sb.append(String.valueOf(c));
            while(!stack.isEmpty() && stack.peek().equals(sep)){
                stack.pop();
                sb.append(stack.pop());
            }
            stack.push(sep);
        }
    } 
    return sb.toString();
}

static String[] prefixToPostfix(String[] prefixes){
    
    String [] ans = new String[prefixes.length];
    
    for(int i=0; i < prefixes.length; i++) {
        ans[i] = prefixtopostfix(prefixes[i]);
    }
    return ans;
} 

}
