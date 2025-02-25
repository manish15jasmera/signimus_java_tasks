// Library Management System where students (threads) try to borrow and return books. To ensure thread safety, we use synchronized methods so that only one student can borrow or return a book at a time. Use wait() method and notify() method to manage the synchronization.

class Library {
  private int availableBooks;

  public Library(int availableBooks) {
      this.availableBooks = availableBooks;
  }

  public synchronized void borrowBook(String studentName) {
      while (availableBooks == 0) {
          try {
              System.out.println(studentName + " is waiting to borrow a book.");
              wait();
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          }
      }
      availableBooks--;
      System.out.println(studentName + " borrowed a book. Books left: " + availableBooks);
  }

  public synchronized void returnBook(String studentName) {
      availableBooks++;
      System.out.println(studentName + " returned a book. Books left: " + availableBooks);
      notify();
  }
}

class Student extends Thread {
  private Library library;
  private boolean borrowing;

  public Student(Library library, boolean borrowing, String name) {
      super(name);
      this.library = library;
      this.borrowing = borrowing;
  }

  @Override
  public void run() {
      if (borrowing) {
          library.borrowBook(getName());
      } else {
          library.returnBook(getName());
      }
  }
}

public class LibraryManagementSystem {
  public static void main(String[] args) {
      Library library = new Library(2);

      Thread student1 = new Student(library, true, "Student-1");
      Thread student2 = new Student(library, true, "Student-2");
      Thread student3 = new Student(library, true, "Student-3");
      Thread student4 = new Student(library, false, "Student-4");

      student1.start();
      student2.start();
      student3.start();
      student4.start();
  }
}
