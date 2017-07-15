package app.models

import com.github.salomonbrys.kotson.jsonObject
import com.google.gson.JsonObject
import org.bson.Document

class QuestionsModel(obj: Document) {
    val _id = obj["_id"]
    val type = obj["type"]
    val option1 = obj["option1"]
    val option2 = obj["option2"]
    val content = obj["content"] as Document

    fun toJson(): JsonObject {
        return jsonObject(
                "id" to this._id.toString(),
                "type" to this.type.toString(),
                "option1" to this.option1.toString(),
                "option2" to this.option2.toString(),
                "content" to jsonObject(
                        "title" to this.content["title"],
                        "text" to this.content["text"],
                        "imgUrl" to this.content["imgUrl"]
                )
        )
    }
}
