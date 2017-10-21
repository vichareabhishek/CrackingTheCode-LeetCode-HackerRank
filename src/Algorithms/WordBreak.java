package Algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

//Solution using brute force	
public boolean wordBreak(String s, List<String> wordDict) {
        
	return word_break(s,new HashSet<String>(wordDict), 0);
	
    }

private boolean word_break(String s, Set<String> wordDict, int start) {
	
	if(start == s.length()){
		return true;
	}
	
	for(int end=start+1; start<=s.length(); end++){
		
		if(wordDict.contains(s.substring(start, end)) && word_break(s,wordDict,end)){
			return true;
		}
	}
	return false;
}


//Solution using DP and memorization
public boolean wordBreak2(String s, List<String> wordDict) {
    
	return word_break2(s,new HashSet<String>(wordDict), 0, new Boolean[s.length()]);
	
    }

private boolean word_break2(String s, Set<String> wordDict, int start, Boolean[] memo) {
	
	if(start == s.length()){
		return true;
	}
	
	if(memo[start]!=null){
		return memo[start];
	}
	
	for(int end=start+1; start<=s.length(); end++){
		
		if(wordDict.contains(s.substring(start, end)) && word_break2(s,wordDict,end,memo)){
			return memo[start]=true;
		}
	}
	return memo[start]=false;
}
}
