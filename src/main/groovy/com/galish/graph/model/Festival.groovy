package com.galish.graph.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@NodeEntity(label="festival")
class Festival {
    @GraphId
    Long id
    String name
    @Relationship(type="LOCATED_IN", direction = Relationship.OUTGOING)
    GeoFence fence

    @Relationship(type = "CONTAINS", direction = Relationship.OUTGOING)
    Set<Stage> stages

}
