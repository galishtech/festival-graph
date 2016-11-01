package com.galish.graph.repositories.graph

import com.galish.graph.model.Festival
import org.springframework.data.neo4j.repository.GraphRepository
import org.springframework.data.repository.query.Param

/**
 * Festival graph repository
 */
interface FestivalGraphRepository extends GraphRepository<Festival> {

    /**
     * Find country by name
     * @param name
     * @return Country
     */
    Festival findOneByName(@Param("name") String name)

}

