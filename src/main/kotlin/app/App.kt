package app

import app.controllers.InfoController
import app.controllers.QuestionsController

class App {

    fun run() {
        initControllers()
    }

    private fun initControllers() {
        InfoController()
        QuestionsController()
    }
}
