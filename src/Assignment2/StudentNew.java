package Assignment2;


	/*
	 * here i'm written a program in java to demonstrate the use of final keyword with class.
	 */

       public final class StudentNew {//class as final	
		int sub1=80;
		int sub2=92;
		int sum=(sub1+sub2);

		public static void main(String[] args) {//main method
			
			StudentNew s1 = new StudentNew();
			System.out.println(s1.sum);

		}

	}


