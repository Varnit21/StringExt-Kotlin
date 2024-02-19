// Main.kt

import StringExt.*

fun main() {
    val originalString = "hello"
    val reversedString = originalString.reverse()
    println("Original: $originalString")
    println("Reversed: $reversedString")
    println()

    val palindromeString = "A man, a plan, a canal, Panama"
    val isPalindrome = palindromeString.isPalindrome()
    println("Palindrome check for '$palindromeString': $isPalindrome")
    println()

    val sentence = "This is sentence for word counting."
    val wordCount = sentence.countWords()
    println("Word count in sentence: $wordCount")
    println()

    val title = "the quick brown fox"
    val capitalizedTitle = title.capitalizeWords()
    println("Capitalized title: $capitalizedTitle")
    println()

    val longText = "This is a very long text that needs to be truncated for demonstration purposes."
    val truncatedText = longText.truncate(30)
    println("Truncated text: $truncatedText")
    println()

    val replaceExample = "Replace me with Kotlin"
    val replacedText = replaceExample.findAndReplace("Replace", "Updated")
    println("Original: $replaceExample")
    println("Replaced: $replacedText")
    println()

    val camelCaseExample = "convert this text to camel case"
    val camelCaseText = camelCaseExample.toCamelCase()
    println("Original: $camelCaseExample")
    println("Camel Case: $camelCaseText")
    println()

    val emailText = "Contact us at info@wrongnet.com or support@wrongnet.com for assistance."
    val extractedEmails = emailText.extractEmails()
    println("Emails in the text: $extractedEmails")
}
