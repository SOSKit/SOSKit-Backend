package app.controllers

import spark.Spark.*

class InfoController {

    init {
        path("/info") {

            get("") { req, res ->
                "Forms Server"
            }
        }
    }
}
