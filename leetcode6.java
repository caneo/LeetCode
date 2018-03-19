
class Solution {
    public String convert(String s, int numRows) {
        //List<List<Character>> Buffer=new ArrayList<>();
        StringBuffer[] buffer=new StringBuffer[numRows];        //Buffer.add(i, new );
        StringBuffer result=new StringBuffer();
        for(int i=0;i<numRows;i++){
        	//Buffer.add(i,new ArrayList<>());
            buffer[i]=new StringBuffer();
        }
        if(numRows<=1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            if(i<numRows){
            	buffer[i].append(s.charAt(i));
            	continue;
            }
            if(((i/(numRows-1)))%2==0){
                buffer[i%(numRows-1)].append(s.charAt(i));
            }
            if(((i/(numRows-1)))%2!=0){
                buffer[(numRows-1)-(i%(numRows-1))].append(s.charAt(i));
            }          
        }
        for(int i=0;i<numRows;i++){
        	result.append(buffer[i].toString());
        }
		return result.toString();
    }
}