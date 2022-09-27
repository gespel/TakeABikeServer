import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.Socket

class ClientThread(private val client: Socket): Thread() {
    public override fun run() {
        println("Client connected : ${client.inetAddress.hostAddress}")
        println(BufferedReader(InputStreamReader(client.inputStream)).readLine())
        client.getOutputStream().write("Bla".toByteArray())
        client.close()
    }
}