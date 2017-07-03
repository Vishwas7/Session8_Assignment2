package Assignment2;

	//here we extends the class student
	public class School extends Student {
		
		int roll=3;
		String name="vishwas";
		
		public static void main(String[]args){
			Student s1= new Student();
			System.out.println();
			s1.display();
		}
	}

	class Student{
		int roll=3;
		String name="vishwas";
		
		//final method declare
		final void display(){
			
			System.out.println("Roll : " + roll+", Name : " + name); 
		}
	}


