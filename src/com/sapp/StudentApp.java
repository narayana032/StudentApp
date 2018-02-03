/**
 * 
 */
package com.sapp;

import com.sapp.model.Student;

/**
 * @author Admin
 *
 */
public interface StudentApp {

	void addStudent(Student aStudent);

	boolean deleteStudent(String studentId);

	Student updateStudent(Student uStudent);

	Student getStudentInfo(String id, String name);

}
