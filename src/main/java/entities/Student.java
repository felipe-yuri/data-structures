package entities;

public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Student other = (Student) obj;
		return other.getName().equals(this.name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
