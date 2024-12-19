package exceptionHandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}else {
			throw new VotingException("Age Under 18");
		}

	}

}
//First write throw new VotingException(It is custom Exception)
//Then that contain error then the cursor point to that then the error select create VotingException.
//The VotingException class extends the Exception class.
//The again a error in VotingException then again point the cursor then create an constructor.
//Then again a error for throws solve that also