package app.models

import com.mongodb.MongoClientURI
import com.mongodb.client.MongoDatabase
import org.litote.kmongo.*

class Database {

    var db: MongoDatabase

    companion object {
        val instance = Database()
    }

    init {
        val uri = "mongodb://" + System.getenv("DB_USER") + ":" + System.getenv("DB_PASSWORD") + "@" + System.getenv("DB_HOST") + "/" + System.getenv("DB_NAME")
        val client = KMongo.createClient(MongoClientURI(uri))
        this.db = client.getDatabase("soskit")
    }
}
