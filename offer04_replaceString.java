
public class replaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="   ";
		//String test="";
		//String test=null;
		//String test="  we are  not happy ";
		//String test="   ";
		String res=new replaceString().replaceStr(test);
		System.out.println(res);
		
	}
	
	public String replaceStr(String str){
		if(str==" " || str==null || str==""){
			return null;
		}
		int len=str.length();
		int count=0;
		for(int i=0; i<len; i++){
			if(str.charAt(i)==' '){
				count++;
			}
		}
		char[] res=new char[len+count*2];
		for(int i=len-1, j=len-1+count*2; i>=0; i--){
			if(str.charAt(i)==' '){
				res[j--]='0';
				res[j--]='2';
				res[j--]='%';
			}
			else{
				res[j--]=str.charAt(i);
			}	
		}	
		//System.out.println(res.toString());
		String temp=new String(res);
		return temp;
	}

}
