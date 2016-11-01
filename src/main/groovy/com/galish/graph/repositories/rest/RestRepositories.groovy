package com.galish.graph.repositories.rest

import com.galish.graph.model.Festival
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource(collectionResourceRel = "festivals", path = "festivals")
interface FestivalRepository  extends PagingAndSortingRepository<Festival,Long> {
}