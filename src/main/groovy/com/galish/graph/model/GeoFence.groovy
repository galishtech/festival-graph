package com.galish.graph.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@NodeEntity(label="geofence")
class GeoFence {
    @GraphId
    Long id
}
