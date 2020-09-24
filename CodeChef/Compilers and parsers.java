import java.util.*;
import java.io.*;

class codechef {
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0;i<T;i++){
			String s = br.readLine();
			Stack<Character> stack = new Stack<>();
			int PE = 0;
			for(int j = 0 ; j<s.length(); j++){
				if(s.charAt(j) == '<'){
					stack.push('<');
				}else{
					if(stack.isEmpty()){
						break;
					}else{
						stack.pop();
						if(stack.isEmpty()){
							PE = j+1;
						}
					}
				}
			}System.out.println(PE);

		}
	}
}
