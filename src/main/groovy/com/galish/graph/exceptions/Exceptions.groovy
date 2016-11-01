package com.galish.graph.exceptions

/**
 * Created by kenobrien76 on 01/11/2016.
 */

class FestivalException extends  Exception{

    FestivalException(String message) {
        super(message)
    }

    FestivalException(String message, Throwable cause) {
        super(message, cause)
    }
}

class RecordAlreadyExistsException extends  FestivalException {


    RecordAlreadyExistsException(String message) {
        super(message)
    }
}
