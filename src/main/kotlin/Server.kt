import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.ServerSocket

class Server {
    private var server: ServerSocket = ServerSocket(9999)
    init {
        println("Server running on  ${server.inetAddress.hostAddress}:${server.localPort}")
        server.inetAddress.hostAddress
    }

    fun mainServerLoop() {
        while(true) {
            ClientThread(server.accept()).start()
        }
        server.close()
    }
}