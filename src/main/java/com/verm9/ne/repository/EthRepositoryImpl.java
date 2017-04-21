package com.verm9.ne.repository;

import com.verm9.ne.repository.model.EthTimepoint;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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

    public EthTimepoint getLastTimepoint() {
        String queryString = "select e from EthTimepoint e WHERE e.time IN (SELECT max(e2.time) from EthTimepoint e2)";
        Query query = entityManager.createQuery(queryString);
        List resultList = query.getResultList();
        if (resultList.size() > 0) {
            return (EthTimepoint) resultList.get(0);
        }
        return null;
    }

    public EthTimepoint getClosestTimepoint(long timestamp) {
        String queryString = "select e from EthTimepoint e ORDER BY ABS(timestamp - :xtimestamp)";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("xtimestamp", timestamp);
        query.setMaxResults(1);
        List resultList = query.getResultList();
        if (resultList.size() > 0) {
            return (EthTimepoint) resultList.get(0);
        }
        return null;
    }
}