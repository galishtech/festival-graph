package com.galish.graph.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@NodeEntity(label="lineUp")
class LineUp {
    @GraphId
    Long id
    @Relationship(type = "FOR", direction = Relationship.OUTGOING)
    Festival festival
    @Relationship(type = "CONTAINS", direction = Relationship.OUTGOING)
    Set<Act> acts
}
