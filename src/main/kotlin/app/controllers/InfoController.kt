package app.controllers

import spark.Spark.*
import com.github.salomonbrys.kotson.*

class InfoController {

    init {
        path("/info") {

            get("") { req, res ->
                res.type("json")
                jsonObject(
                        "version" to System.getenv("VERSION"),
                        "mode" to System.getenv("ENV")
                )
            }
        }
    }
}
