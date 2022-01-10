import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8000, host = "0.0.0.0") {
        routing {
            get {
               call.respond("Hello wrld!")
            }
        }
    }.start(wait = true)
}