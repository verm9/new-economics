package com.verm9.ne.repository;

import com.verm9.ne.repository.model.BtcTimepoint;
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
 * Created by verm on 4/23/2017
 */
@Repository
public class BtcRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public Collection<BtcTimepoint> getAllTimepoints() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<BtcTimepoint> cq = builder.createQuery(BtcTimepoint.class);
        Root<BtcTimepoint> root = cq.from(BtcTimepoint.class);
        cq.select(root);
        return (List<BtcTimepoint>)(List<?>)entityManager.createQuery(cq).getResultList();
    }

    @Transactional
    public void upsertTimePoint(BtcTimepoint timepoint) {
        try {
            CriteriaQuery<BtcTimepoint> criteria = entityManager.getCriteriaBuilder().createQuery(BtcTimepoint.class);
            Root<BtcTimepoint> timepointRoot = criteria.from(BtcTimepoint.class);
            criteria.select(timepointRoot);
            criteria.where(entityManager.getCriteriaBuilder().equal(timepointRoot.get("time"), timepoint.getTime()));
            List<BtcTimepoint> timepointsFromDb = entityManager.createQuery(criteria).getResultList();

            // Do not insert duplicates by timestamp.
            if (timepointsFromDb.size() == 0) {
                entityManager.persist(timepoint);
            }
        } catch (ConstraintViolationException e) {
            e.printStackTrace();
        }

    }

    public BtcTimepoint getLastTimepoint() {
        String queryString = "select e from BtcTimepoint e WHERE e.time IN (SELECT max(e2.time) from BtcTimepoint e2)";
        Query query = entityManager.createQuery(queryString);
        List resultList = query.getResultList();
        if (resultList.size() > 0) {
            return (BtcTimepoint) resultList.get(0);
        }
        return null;
    }

    public BtcTimepoint getClosestTimepoint(long timestamp) {
        String queryString = "select e from BtcTimepoint e ORDER BY ABS(timestamp - :xtimestamp)";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("xtimestamp", timestamp);
        query.setMaxResults(1);
        List resultList = query.getResultList();
        if (resultList.size() > 0) {
            return (BtcTimepoint) resultList.get(0);
        }
        return null;
    }
}