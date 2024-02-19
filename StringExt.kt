// StringExt.kt

import java.util.regex.Pattern

fun String.reverse(): String {
    return this.reversed()
}

fun String.isPalindrome(): Boolean {
    val cleanString = this.toLowerCase().replace("[^a-zA-Z0-9]".toRegex(), "")
    return cleanString == cleanString.reversed()
}

fun String.countWords(): Int {
    return this.split("\\s+".toRegex()).count { it.isNotBlank() }
}

fun String.capitalizeWords(): String {
    return this.split("\\s+").joinToString(" ") { it.capitalize() }
}

fun String.truncate(length: Int, suffix: String = "..."): String {
    return if (this.length > length) this.substring(0, length) + suffix else this
}

fun String.findAndReplace(find: String, replace: String): String {
    return this.replace(find, replace)
}

fun String.toCamelCase(): String {
    return this.split("\\s+").joinToString("") { it.capitalize() }
}

fun String.extractEmails(): List<String> {
    val emailRegex = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
    val matcher = emailRegex.matcher(this)
    val emails = mutableListOf<String>()

    while (matcher.find()) {
        emails.add(matcher.group())
    }

    return emails
}
