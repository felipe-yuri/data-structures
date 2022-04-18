package entities;

import java.util.Arrays;

public class Vector {

	private Student[] students = new Student[10];
	private int totalStudents = 0;

	public void duplicateSize() {
		if (totalStudents == students.length) {
			Student[] newArray = new Student[students.length * 2];
			for (int i = 0; i < totalStudents; i++) {
				newArray[i] = students[i];
			}
			// Isso serve para apontar para a nova referência
			students = newArray;
		}
	}

	public void add(Student student) {
		duplicateSize();
		students[totalStudents] = student;
		totalStudents++;
	}

	public void add(int index, Student student) {
		duplicateSize();
		if (!indexExists(index)) {
			throw new IllegalArgumentException("Index not exists!");
		}
		for (int i = totalStudents - 1; i >= index; i--) {
			students[i + 1] = students[i];
		}
		students[index] = student;
		totalStudents++;
	}

	public boolean indexBusy(int index) {
		return index >= 0 && index < totalStudents;
	}

	public boolean indexExists(int index) {
		return index >= 0 && index <= totalStudents;
	}

	public Student get(int index) {
		if (!indexBusy(index)) {
			throw new IllegalArgumentException("Index is empty!");
		}
		return students[index];
	}

	public void remove(int index) {
		if (!indexExists(index)) {
			throw new IllegalArgumentException("Index not exists!");
		}
		for (int i = index; i < totalStudents; i++) {
			students[i] = students[i + 1];
		}
		totalStudents--;
	}

	public boolean contains(Student student) {
		for (int i = 0; i < totalStudents; i++) {
			if (students[i] != null && students[i].equals(student)) {
				return true;
			}
		}
		return false;
	}

	public int length() {
		return totalStudents;
	}

	public String toString() {
		return Arrays.toString(students);
	}

}
