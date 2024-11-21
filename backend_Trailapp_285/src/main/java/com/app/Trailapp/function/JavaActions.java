package com.app.Trailapp.function;

import com.app.Trailapp.model.College;
import com.app.Trailapp.model.Subject;
import com.app.Trailapp.model.Department;
import com.app.Trailapp.model.PreviousEducation;
import com.app.Trailapp.model.Student;
import com.app.Trailapp.model.Course;
import com.app.Trailapp.model.Lecturer;




import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  