import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.Socket
import java.sql.DriverManager

class ClientThread(private val client: Socket): Thread() {
    public override fun run() {
        println("Client connected : ${client.inetAddress.hostAddress}")
        val fromClient = BufferedReader(InputStreamReader(client.inputStream)).readLine()
        println(fromClient)
        //client.getOutputStream().write("Bla".toByteArray())
        var gson = Gson()
        var model = gson.fromJson(fromClient)
        client.close()

        /*try {
            Class.forName("com.mysql.jdbc.Driver")
            val con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo", "root", "root"
            )
            //here sonoo is database name, root is username and password
            val stmt = con.createStatement()
            val rs = stmt.executeQuery("select * from emp")
            while (rs.next()) println(rs.getInt(1).toString() + "  " + rs.getString(2) + "  " + rs.getString(3))
            con.close()
        } catch (e: Exception) {
            println(e)
        }*/
    }
}



