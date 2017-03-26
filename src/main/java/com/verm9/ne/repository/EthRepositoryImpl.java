package com.verm9.ne.repository;

import com.verm9.ne.repository.model.EthTimepoint;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;
import java.util.Collection;
import java.util.List;

/**
 * Created by verm on 3/5/2017
 */
@Repository
public class EthRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public Collection<EthTimepoint> getAllTimepoints() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<EthTimepoint> cq = builder.createQuery(EthTimepoint.class);
        Root<EthTimepoint> root = cq.from(EthTimepoint.class);
        cq.select(root);
        return (List<EthTimepoint>)(List<?>)entityManager.createQuery(cq).getResultList();
    }

    @Transactional
    public void upsertTimePoint(EthTimepoint timepoint) {
        try {
            CriteriaQuery<EthTimepoint> criteria = entityManager.getCriteriaBuilder().createQuery(EthTimepoint.class);
            Root<EthTimepoint> timepointRoot = criteria.from(EthTimepoint.class);
            criteria.select(timepointRoot);
            criteria.where(entityManager.getCriteriaBuilder().equal(timepointRoot.get("time"), timepoint.getTime()));
            List<EthTimepoint> timepointsFromDb = entityManager.createQuery(criteria).getResultList();

            // Do not insert duplicates by timestamp.
            if (timepointsFromDb.size() == 0) {
                entityManager.persist(timepoint);
            }
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
        }

    }
}