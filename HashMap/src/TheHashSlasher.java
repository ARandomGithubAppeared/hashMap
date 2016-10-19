import java.util.HashMap;
import java.util.Scanner;

public class TheHashSlasher {
	private char[] chars;
	private HashMap<Character, Integer> hashy;
	
	public TheHashSlasher(){

		hashy=new HashMap<Character,Integer>();
	}
	
	public void nextString(String a){
		chars=new char[a.length()];
		
		for (int x=0;x<a.length();x++){
			chars[x]=a.charAt(x);
		//	System.out.println(x);
		}
	}
	
	public void putHash(){
		for (int x=0;x<chars.length;x++){
			if(hashy.get(chars[x])==null){
				hashy.put(chars[x],1);
			}else{
				hashy.put(chars[x],(int) hashy.get(chars[x])+1);
				//System.out.println(hashy.get(chars[x]));
			}
			
		}
		
	}
	
	public void showAll(){
		for (int x=0;x<256;x++){
			if(hashy.containsKey((char)(x))){
				System.out.println((char) x + " " + hashy.get((char)x));
			}
		}
	}
	
	
	
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		TheHashSlasher hash= new TheHashSlasher();
		while(scan.hasNext()){
			hash.nextString(scan.nextLine());
			hash.putHash();
		}
		hash.showAll();

		
			
	}
}
