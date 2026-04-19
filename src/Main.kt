open class libraryItems (
    val title: String,
    val id: Int
) {
    var isIssued: Boolean = false

    open fun displayInfo () {
        println("Title: $title , Id: $id, Issued: $isIssued")
    }
}

class Book (
    title: String,
    id: Int,
    val author: String
) : libraryItems(title, id) {
    override fun displayInfo() {
        println("Book Information: ")
        println("Title: $title , Id: $id , Author: $author, Issued: $isIssued")
    }
}

class Magazine(
    title: String,
    id: Int,
): libraryItems(title, id) {
    override fun displayInfo() {
        println("Magazine Information: ")
        println("Title: $title , Id: $id, Issued: $isIssued")
    }
}

class Newspaper(
    title: String,
    id: Int,
    val date: String
): libraryItems(title, id) {
    override fun displayInfo() {
        println("Newspaper Information: ")
        println("Title: $title , Id: $id, Date: $date, Issued: $isIssued")
    }
}

open class user(
    val name: String,
    val UniId: Int
)

class librarian (
    name: String,
    UniId: Int,
): user(name, UniId) {
    fun addItems(items: MutableList<libraryItems>){
        println("Select items: ")
        println("1. Book\n2. Magazine\n3. Newspapers")
        val ch = readLine()!!.toInt()

        when (ch) {
            1 -> {
                println("Book Title: ")
                val title = readLine()!!
                println("Author: ")
                val author = readLine()!!

                items.add (Book(title, (1..1000).random(), author))
                println("Book Added...")
            }
            2 -> {
                println("Magazine Title: ")
                val title = readLine()!!

                items.add(Magazine(title, (1..1000).random()))
                println("Magazine Added...")
            }
            3 -> {
                println("Newspaper Title: ")
                val title = readLine()!!
                println("Date: ")
                val publishDate = readLine()!!.toString()

                items.add(Newspaper(title, (1..1000).random(), publishDate))
                println("Newspaper Added...")
            }
            else -> println("Invalid Input...")
        }
    }
}

class Student (
    name: String,
    UniId: Int,
    val Email: String
): user(name, UniId) {
    fun issueItems(items: libraryItems) {
        if (!items.isIssued) {
            items.isIssued = true
            println("Issued: $items")
        }
        else {
            println("Items is already issued")
        }
    }

    fun returnItems(items: libraryItems) {
        if (items.isIssued) {
            items.isIssued = false
            println("Returned: $items")
        }
        else{
            println("Wrong items!!!")
        }
    }
}

fun main() {
    val items = mutableListOf<libraryItems>()
    println("Welcome to the LMS!")
    println("Type S for student and L for librarian: ")
    val person = readLine()!!.toString()

    if (person.lowercase() == "s") {
        println("Enter Your Name: ")
        val name = readLine()!!
        println("Enter Your University Id: ")
        val uniId = readLine()!!.toInt()
        println("Enter your Email: ")
        val email = readLine()!!.toString()
        val student = Student(name, uniId, email)

        while (true) {
            print("1. View Items\n2. Issue Items\n3. Return Items\n4. Exit: ")

            when (readLine()!!.toInt()) {
                1 -> {
                    if (items.isEmpty()) println("No items yet!")
                    else items.forEach { it.displayInfo() }
                }
                2 -> {
                    println("Book Id: ")
                    val id = readLine()!!.toInt()
                    val item = items.find { it.id == id }

                    if (item != null) student.issueItems(item)
                    else println("Not found!")
                }
                3 -> {
                    print("Enter ID: ")
                    val id = readLine()!!.toInt()
                    val item = items.find { it.id == id }

                    if (item != null) student.returnItems(item)
                    else println("Item not found")
                }
                4 -> break
            }
        }
    }
    else if (person.lowercase() == "l") {

        print("Enter librarian name: ")
        val name = readLine()!!.toString()
        println("enter University ID: ")
        val uniId = readLine()!!.toInt()

        val Librarian = librarian(name, uniId)

        while (true) {
            println("\n1. Add Item\n2. View Items\n3. Exit")

            when (readLine()) {

                "1" -> Librarian.addItems(items)

                "2" -> {
                    if (items.isEmpty()) println("No items available")
                    else items.forEach { it.displayInfo() }
                }

                "3" -> break
            }
        }
    } else {
        println("Invalid input")
    }
}
