public class Main{

	public static void main (String args[]){

		int len = args.length;
		int i;

		Teacher ourTeacher = new Teacher (args[0], "teacher");
		ourTeacher.getStudentsName ("my new group");
		ourTeacher.dataPrint();
		
		Student [] newStudent;
		newStudent = new Student[len-1];
		
		for (i=1; i<len; i++){

			newStudent[i-1] = new Student (args[i], "student");
			newStudent[i-1].getTeachersName (args[0]);
			newStudent[i-1].dataPrint();

		}

	}
}
