package com.app.Trailapp.repository;

import com.app.Trailapp.model.PreviousEducation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PreviousEducationRepository extends SimpleJpaRepository<PreviousEducation, String> {
    private final EntityManager em;
    public PreviousEducationRepository(EntityManager em) {
        super(PreviousEducation.class, em);
        this.em = em;
    }
    @Override
    public List<PreviousEducation> findAll() {
        return em.createNativeQuery("Select * from \"trailapp\".\"PreviousEducation\"", PreviousEducation.class).getResultList();
    }
}