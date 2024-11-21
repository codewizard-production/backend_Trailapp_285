package com.app.Trailapp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.Trailapp.model.College;
import com.app.Trailapp.model.Subject;
import com.app.Trailapp.model.Department;
import com.app.Trailapp.model.PreviousEducation;
import com.app.Trailapp.model.Student;
import com.app.Trailapp.model.Course;
import com.app.Trailapp.model.Lecturer;

@Entity(name = "CollegeCoursesOffered")
@Table(schema = "\"trailapp\"", name = "\"CollegeCoursesOffered\"")
@Data
public class CollegeCoursesOffered{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CollegeID\"")
	private Integer collegeID;

    
    @Column(name = "\"CourseID\"")
    private String courseID;
 
}