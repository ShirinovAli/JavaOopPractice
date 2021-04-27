package oopPractice;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor(1, "Engin Demirog", "engin@engin.com");
		
		Category category1 = new Category(1,"Programlama");

		Course course1 = new Course(1, "Programlamaya Giriş için Temel Kurs",
				"PYTHON, JAVA, C# gibi tum programlama dilleri için temel programlama mantıgını anlaşılır orneklerle ogrenin.",
				"Engin Demirog");

		
		Course course2 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
				"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.",
				"Engin Demirog");

		Course course3 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
				"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.",
				"Engin Demirog");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.title);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course3);
		
	}

}
