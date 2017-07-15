package app

import spark.Request
import spark.Spark.*

fun main(args: Array<String>) {

    port(8083)

    val app = App()
    app.run()

    exception(Exception::class.java) { e, req, res -> e.printStackTrace() }
}

fun Request.qp(key: String): String = this.queryParams(key) //adds .qp alias for .queryParams on Request object
