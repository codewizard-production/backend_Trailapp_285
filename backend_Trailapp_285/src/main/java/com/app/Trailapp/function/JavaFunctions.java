package com.app.Trailapp.function;

import com.app.Trailapp.model.College;
import com.app.Trailapp.model.Subject;
import com.app.Trailapp.model.Department;
import com.app.Trailapp.model.PreviousEducation;
import com.app.Trailapp.model.Student;
import com.app.Trailapp.model.Course;
import com.app.Trailapp.model.Lecturer;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Trailapp.repository.DepartmentRepository;
import com.app.Trailapp.repository.CollegeRepository;
import com.app.Trailapp.repository.PreviousEducationRepository;
import com.app.Trailapp.repository.StudentRepository;
import com.app.Trailapp.repository.CourseRepository;
import com.app.Trailapp.repository.LecturerRepository;
import com.app.Trailapp.repository.SubjectRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
