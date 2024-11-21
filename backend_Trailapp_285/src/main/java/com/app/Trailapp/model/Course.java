package com.app.Trailapp.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.Trailapp.model.College;
import com.app.Trailapp.model.Subject;
import com.app.Trailapp.model.Department;
import com.app.Trailapp.model.PreviousEducation;
import com.app.Trailapp.model.Student;
import com.app.Trailapp.model.Course;
import com.app.Trailapp.model.Lecturer;
import com.app.Trailapp.converter.DurationConverter;
import com.app.Trailapp.converter.UUIDToByteConverter;
import com.app.Trailapp.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Course")
@Table(name = "\"Course\"", schema =  "\"trailapp\"")
@Data
                        
public class Course {
	public Course () {   
  }
	  
  @Id
  @Column(name = "\"CourseID\"", nullable = true )
  private String courseID;
	  
  @Column(name = "\"CourseName\"", nullable = true )
  private String courseName;
  
	  
  @Column(name = "\"CourseDuration\"", nullable = true )
  private Integer courseDuration;
  
	  
  @Column(name = "\"NoOfStudentEnrolled\"", nullable = true )
  private Integer noOfStudentEnrolled;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CourseContains\"",
            joinColumns = @JoinColumn( name="\"CourseID\""),
            inverseJoinColumns = @JoinColumn( name="\"SubjectID\""), schema = "\"trailapp\"")
private List<Subject> contains = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Course [" 
  + "CourseID= " + courseID  + ", " 
  + "CourseName= " + courseName  + ", " 
  + "CourseDuration= " + courseDuration  + ", " 
  + "NoOfStudentEnrolled= " + noOfStudentEnrolled 
 + "]";
	}
	
}