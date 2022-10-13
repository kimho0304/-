package Student;

public class StudentScores{
	private final int MAX_STUDENTS = 100;
	//private String[] names;
	//private int[] scores;
	private int numStudents;
	private Student[] student;
	
	public StudentScores(){
		//scores = new int[MAX_STUDENTS];
		//names = new String[MAX_STUDENTS];
		student = new Student[MAX_STUDENTS];
		//for(int i=0; i < MAX_STUDENTS; i++) {

		//	student[i] = new Student();
		//}
		numStudents = 0;
	}
	
	public void add(String name, int score){
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		student[numStudents] = new Student();
		student[numStudents].name = name;
		student[numStudents].score = score;
		numStudents++;
	}
	
	public String getHighest(){
		if (numStudents == 0)
			return null;
		int highest = 0;
		for (int i = 1; i < numStudents; i++) {
			if(student[i] == null) {
				continue;
			}
			if (student[i].score > student[highest].score)
				highest = i;
		}

		/*for(int i=0; i < numStudents; i++) {
			System.out.println(student[i].name);
		}*/
		return student[highest].name;
	}
	
	public String getLowest(){
		if (numStudents == 0)
			return null;
		int lowest = 0;
		
		for (int i = 1; i < numStudents; i++) {
			if(student[i] == null) {
				continue;
			}
			if (student[i].score < student[lowest].score)
				lowest = i;
		}
		
		return student[lowest].name;
	}
}