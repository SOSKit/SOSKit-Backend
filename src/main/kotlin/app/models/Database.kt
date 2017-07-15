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
        val client = KMongo.createClient(MongoClientURI("mongodb://admin:devSolidbr33Ze@ds135519.mlab.com:35519/soskit"))
        this.db = client.getDatabase("soskit")
    }
}
