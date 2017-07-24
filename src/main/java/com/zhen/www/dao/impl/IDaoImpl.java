package com.zhen.www.dao.impl;

import com.zhen.www.bean.Attractions;
import com.zhen.www.bean.VisaCountry;
import com.zhen.www.dao.IDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by caiwei on 2017/7/18.
 */
@Repository("daoimpl")
public class IDaoImpl implements IDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<VisaCountry> selectAttractions() {
        String hql = "from VisaCountry";
        Query query = em.createQuery(hql);
        List resultList = query.getResultList();
        return resultList;
    }


}
