package com.verm9.ne.repository;

import com.verm9.ne.repository.model.Coin;
import com.verm9.ne.repository.model.EthCoin;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * Created by verm on 3/5/2017.
 */
@Repository
public class EthRepositoryImpl implements CoinRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<Coin.Timepoint> getAllTimepoints() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<EthCoin.EthTimepoint> cq = builder.createQuery(EthCoin.EthTimepoint.class);
        Root<EthCoin.EthTimepoint> root = cq.from(EthCoin.EthTimepoint.class);
        cq.select(root);
        return (List<Coin.Timepoint>)(List<?>)entityManager.createQuery(cq).getResultList();
    }

    @Override
    @Transactional
    public void upsertCoin(Coin coin) {
        entityManager.persist(coin);
    }
}