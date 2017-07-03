package Assignment2;

	/*
	 * here i'm written a program in java to demonstrate the use of final keyword with variable.
	 */
	public class FinalVariable { 

		public static void main(String[] args) {
			 /*
	         * Final variables can be declared using final keyword.
	         * Once created and initialized, its value can not be changed.
	         */
	        final int minutesInOneHours=60;
	       
	        //This statement will not compile. Value can't be changed.
	        //minutesInOneHours=60
	       
	        System.out.println("Minutes in 6 hours  = " + minutesInOneHours * 6);

		}

	}

