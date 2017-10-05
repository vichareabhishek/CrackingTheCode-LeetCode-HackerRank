package Arrays;

public class RobotMoves {

	public static void main(String[] args) {
		

	}
	
	public boolean judgeCircle(String moves) {
        char[] ch = moves.toCharArray();
        int x=0;
        int y=0;
        for(int i=0 ; i<moves.length(); i++){
           if(ch[i]=='U'){
            x++;
           }
            else if(ch[i]=='D'){
                x--;
            }
            else if(ch[i]=='R'){
                y++;
            }
            else if(ch[i]=='L'){
                y--;
            }
        }
        if(x==0 && y==0){
            return true;
        }else{
            return false;
        }
        
    }

}
