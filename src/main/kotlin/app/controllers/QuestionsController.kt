package app.controllers

import spark.*

class QuestionsController {

    init {
        Spark.path("/question") {

            Spark.get("") { req, res ->
                "Forms Server"
            }
        }
    }
}
