import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun main() {
    println("Введите ссылку на страницу Вики:")
    val inputLink = readlnOrNull()

    if (inputLink != null) {

        val url = URL(inputLink)
        val connection = url.openConnection()
        val reader = BufferedReader(InputStreamReader(connection.getInputStream()))

        val uniqueLinks = mutableSetOf<String>()
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            val pattern = Regex("<a href=\"/wiki/([^:#\"]*)\"")
            val matches = pattern.findAll(line ?: "")
            for (match in matches) {
                val link = "https://en.wikipedia.org/wiki/${match.groupValues[1]}"
                uniqueLinks.add(link)
            }
        }

        uniqueLinks.forEach { println(it) }
    }
}
