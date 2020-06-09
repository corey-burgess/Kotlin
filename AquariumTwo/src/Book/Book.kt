package Book

const val MAX_NUMBER_BOOKS = 20

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

class Book(val title: String, val author: String, val year: Int) {

    fun getPair(): Pair<String, String> {
        return (title to author)
    }

    fun getTriple(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(currentBorrowed : Int) : Boolean {
        return (currentBorrowed < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }
}

fun main(args: Array<String>) {
    val book = Book("H&H","Jack Mehoff", 1989)
    val bookTitleAuthor = book.getPair()
    val bookTitleAuthorYear = book.getTriple()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second} written in ${bookTitleAuthorYear.third}")

    val allBooks = Set
}