package app.services

import app.models.QuestionsModel
import app.models.Database
import com.github.salomonbrys.kotson.jsonArray
import com.google.gson.JsonArray

class QuestionsService {

    private var collection = Database.instance.db.getCollection("cards")

    fun getQuestions(): JsonArray {
        val questions = jsonArray()
        collection.find().all { document ->
            questions.add(QuestionsModel(document).toJson())
            true
        }
        return questions
    }
}
