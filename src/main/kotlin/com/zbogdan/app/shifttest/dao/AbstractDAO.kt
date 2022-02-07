package com.zbogdan.app.shifttest.dao

import java.io.Serializable
import javax.persistence.EntityManager

abstract class AbstractDAO<T : Serializable>(private val entityClass: Class<T>) {

    abstract fun entityManager(): EntityManager

    fun all(): List<T> {
        val query = entityManager().criteriaBuilder.createQuery()
        query.select(query.from(entityClass))

        return entityManager().createQuery(query).resultList as List<T>
    }

    fun find(id: Int): T = entityManager().find(entityClass, id)
}