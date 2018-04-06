import java.util.*;

public class scoringACM {

	public static void main(String[] args) {

		//read in file
        Scanner stdin = new Scanner(System.in);
        int nInt = stdin.nextInt();
        //storing variables
        char c;
        String s;
        int i;
        int score = 0;
        int numRight = 0;

        //array to store how many attempts at each problem
        int[] attempts = new int[26];
        Arrays.fill(attempts,0);

        while(nInt != -1){
            //read char, string and int from file
            c = stdin.next().charAt(0);
            s = stdin.next();
        	i = nInt;
            
            //convert the question's char to int.
        	int questionNum = charToInt(c);

        	//if the question is wrong, increment the given array's location
        	if(s.contains("wrong")){
        		attempts[charToInt(c)]++;
        	}else{
                //if its right, record and add 20 * numWrong for question.
        		numRight++;
        		score += 20*attempts[charToInt(c)];
        		score += i;
        	}
            //read the int to check if it is -1 to end loop.
        	nInt = stdin.nextInt();

        }

        System.out.println(numRight + " " + score);


    }
    //convert chars to int to allow array to hold how many attempts at each problem
    public static int charToInt(char c){
    	int i = (char) c - 'A';
        return i;
    }
    //convert ints to char to be able to use for loop to check for 
    public static char intToChar(int i){
    	char c =(char)i;
        c+= 'A';
        return c;
    }

}
