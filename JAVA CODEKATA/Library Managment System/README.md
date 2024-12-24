# Library Management System

# Problem Statement:
Design a library management system using OOP principles. The system should allow adding books, borrowing books, and returning books. Implement classes for Book and Library.

# Description:
Your task is to create a Java program that models a library management system. You need to create a class Book with attributes for the book title, author, and a boolean to indicate if it is borrowed. Create another class Library that contains a list of books and methods to add a book, borrow a book by title, and return a book by title.

# Input Format:
The first line contains an integer N, the number of operations.
The next N lines contain operations in the format add <title> <author>, borrow <title>, or return <title>.
# Output Format:
Print the result of each operation. For borrow, print "Book borrowed" if successful or "Book not available" if not. For return, print "Book returned". For add, print "Book added".

# Sample Input:
3 
add HarryPotter J.K.Rowling 
borrow HarryPotter 
return HarryPotter
# Sample Output:
Book added 
Book borrowed 
Book returned
