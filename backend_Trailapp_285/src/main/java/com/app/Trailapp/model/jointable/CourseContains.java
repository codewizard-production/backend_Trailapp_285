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

@Entity(name = "CourseContains")
@Table(schema = "\"trailapp\"", name = "\"CourseContains\"")
@Data
public class CourseContains{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CourseID\"")
	private String courseID;

    
    @Column(name = "\"SubjectID\"")
    private Integer subjectID;
 
}