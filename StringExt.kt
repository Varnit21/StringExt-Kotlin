// StringExt.kt

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
