package com.galish.graph.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@NodeEntity(label="performance")
class Performance {
    @GraphId
    Long id
    Long day
    Long startTime
    Long endTime
    @Relationship(type="LOCATED_IN", direction = Relationship.OUTGOING)
    GeoFence fence
    @Relationship(type="PERFORMED_ON", direction = Relationship.OUTGOING)
    Stage stage
    @Relationship(type="GIVEN_BY", direction = Relationship.OUTGOING)
    Act act



}
