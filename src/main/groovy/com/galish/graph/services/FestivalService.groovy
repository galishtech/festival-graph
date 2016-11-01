package com.galish.graph.services

import com.galish.graph.model.Festival
import com.galish.graph.repositories.graph.FestivalGraphRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by kenobrien76 on 01/11/2016.
 */
@Slf4j
@Component("festivalService")
class FestivalService {

    @Autowired
    FestivalGraphRepository festivalGraphRepository

    /**
     * Create a festival
     * @param name
     * @return
     */
    Festival createFestival(Festival festival){
        log.info "Create festival ${festival.name}"
        festivalGraphRepository.save(festival)
    }

    def deleteFestival(Festival festival){
        log.info "Delete festival ${festival.name}"
        festivalGraphRepository.delete(festival)
    }

}
