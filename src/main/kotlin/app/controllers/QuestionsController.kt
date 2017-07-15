package app.controllers

import app.services.QuestionsService
import spark.Spark.*

class QuestionsController {

    private var service = QuestionsService()

    init {
        path("/question") {

            get("") { req, res ->
                res.type("json")
                this.service.getQuestions()
            }
        }
    }
}
