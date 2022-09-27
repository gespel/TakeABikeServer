import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.ServerSocket
import java.util.*

fun main(args: Array<String>) {
    val s = Server()
    s.mainServerLoop()
}