import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.ServerSocket

class Server {
    init {
        val server = ServerSocket(9999)
    }

    println("Server running on port ${server.localPort}")
    while(true) {
        val client = server.accept()
        println("Client connected : ${client.inetAddress.hostAddress}")
        println(BufferedReader(InputStreamReader(client.inputStream)).readLine())
        client.getOutputStream().write("Bla".toByteArray())
        client.close()
    }
    server.close()
}