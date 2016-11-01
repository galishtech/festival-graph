package com.galish.graph.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@NodeEntity(label="act")
class Act {
    @GraphId
    Long id
    String name
    @Relationship(type = "GIVES_A", direction = Relationship.OUTGOING)
    Set<Performance> performances
    @Relationship(type = "PART_OF", direction = Relationship.OUTGOING)
    LineUp lineUp

}
