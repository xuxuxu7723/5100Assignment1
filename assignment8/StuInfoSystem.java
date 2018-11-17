

public class StuInfoSystem {
	
	
	
	
			
	
	
	public static void main(String[] args) {
		Student student1 = new Student(1,"xuyishu","female");
		Student student2 = new Student(2,"xuyishu2","male");
		Students s = new Students();
		s.addStudent(student1);
		//s.addStudent(student2);
		StudentsTableModel model = new StudentsTableModel(s);
		model.addStudent(student2);
		StudentView view = new StudentView(model);

	}
}
