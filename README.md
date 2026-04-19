# 📚 Library Management System (Kotlin - CLI)

A simple **Library Management System (LMS)** built using **Kotlin** for the command line.
This project demonstrates **Object-Oriented Programming (OOP)** concepts like **class hierarchy, inheritance, and polymorphism**.

---

## 🚀 Features

* 👤 User Roles:

  * Student
  * Librarian

* 📦 Library Items:

  * Books
  * Magazines
  * Newspapers

* 🔄 Functionalities:

  * Add new items (Librarian)
  * View all items
  * Issue items
  * Return items

---

## 🧠 Concepts Used

* ✅ Class Hierarchy
* ✅ Inheritance
* ✅ Polymorphism
* ✅ Encapsulation
* ✅ Kotlin Collections (`MutableList`)
* ✅ User Input Handling (`readLine()`)

---

## 🏗️ Class Structure

```
LibraryItem
 ├── Book
 ├── Magazine
 └── Newspaper

User
 ├── Student
 └── Librarian
```

---

## 💻 How It Works

1. User selects role:

   * `S` → Student
   * `L` → Librarian

2. Librarian can:

   * Add Books, Magazines, Newspapers
   * View all items

3. Student can:

   * View items
   * Issue items
   * Return items

---

## ▶️ Sample Run

```
📚 Welcome to LMS!
Type S for student and L for librarian:

L
Enter librarian name: John

1. Add Item
2. View Items
3. Exit
```

---

## 🛠️ How to Run

1. Install Kotlin
2. Save file as `Main.kt`
3. Compile:

   ```
   kotlinc Main.kt -include-runtime -d lms.jar
   ```
4. Run:

   ```
   java -jar lms.jar
   ```

---

## ⚠️ Limitations

* Data is stored **in-memory only**
* No database or file storage
* No authentication system

---

## 🚀 Future Improvements

* 💾 Add file/database storage (Room / SQLite)
* 🔐 Add login system
* 🔍 Search functionality
* ⏰ Fine/penalty system
* 📱 Convert into Android App

---

## 👩‍💻 Author

Your Name

---

## ⭐ Contribution

Feel free to fork this repo and improve it!

---

