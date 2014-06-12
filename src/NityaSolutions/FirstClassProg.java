package NityaSolutions;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *  Explain this class what this for
 *  
 * @author put your name here
 */
public class FirstClassProg {
	/**
	 * put explanation here. 
	 */
	private String field1;
    /**
     * explain what ever method u wrote 
     * and what method is do 
     * 
     * @param a  explain this Param
     */
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator<String> itr = arrl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
                       
            
        }
        System.out.println("what if i change the same class and save. can i modify , commit and push");
        System.out.println("i vlv try");
    }
    /**
     * put explanation of this method  here
     * 
     * @return int explain what this method will return
     */
    public static int getCount() {
    	
    	return 0;
    }
    
}