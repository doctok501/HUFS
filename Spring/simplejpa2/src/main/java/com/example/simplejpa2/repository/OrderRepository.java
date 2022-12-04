package com.example.simplejpa2.repository;

import com.example.simplejpa2.domain.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class OrderRepository {

    private final EntityManager em;
    public OrderRepository(EntityManager em) {
        this.em = em;
    }


    public void save(Order order)
    {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    public List<Order> findOrderByName(String m_name)
    {
        try {
            return em.createQuery("select o from Order o " +
                            "where o.member.m_name =: m_name ", Order.class)
                    .setParameter("m_name",m_name)
                    .getResultList();
        }catch(NoResultException nre){
            return null;
        }
    }



}
