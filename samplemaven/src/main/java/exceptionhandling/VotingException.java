package exceptionhandling;

public class VotingException extends Exception { 

	public VotingException(String s) {
		super(s); //constructor to be invoked so super is used- ie value of s which is age under 18 here.
	} 

}
