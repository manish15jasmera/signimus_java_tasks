import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}



public class StudentSerializationDemo {
  private static final String FILE_NAME = "student.dat";

  public static void serializeStudent(Student student) {
      try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
          oos.writeObject(student);
          System.out.println("Student object serialized successfully.");
      } catch (IOException e) {
          System.out.println("Serialization error: " + e.getMessage());
      }
  }

  public static Student deserializeStudent() {
      try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
          return (Student) ois.readObject();
      } catch (IOException | ClassNotFoundException e) {
          System.out.println("Deserialization error: " + e.getMessage());
          return null;
      }
  }

  public static void main(String[] args) {
      Student student = new Student("John Doe", 85);

      serializeStudent(student);

      Student deserializedStudent = deserializeStudent();
      
      if (deserializedStudent != null) {
          System.out.println("Deserialized Student:");
          deserializedStudent.display();
      }
  }
}
