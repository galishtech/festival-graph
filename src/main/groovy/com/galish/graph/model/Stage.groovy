package com.galish.graph.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@NodeEntity(label="stage")
class Stage {
    @GraphId
    Long id
    String name
    @Relationship(type="LOCATED_IN", direction = Relationship.OUTGOING)
    GeoFence fence
    @Relationship(type="AT", direction = Relationship.OUTGOING)
    Festival festival

    @Relationship(type = "HOSTS", direction = Relationship.OUTGOING)
    Set<Performance> performances

}
