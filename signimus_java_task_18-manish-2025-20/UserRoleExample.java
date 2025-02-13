// Define an enum UserRole with roles ADMIN, USER, and GUEST, and print access levels based on the role.

public class UserRoleExample {
  enum UserRole {
      ADMIN, USER, GUEST
  }

  public static void main(String[] args) {
      printAccessLevel(UserRole.ADMIN);
      printAccessLevel(UserRole.USER);
      printAccessLevel(UserRole.GUEST);
  }

  public static void printAccessLevel(UserRole role) {
      switch (role) {
          case ADMIN:
              System.out.println("ADMIN: Full access to the system.");
              break;
          case USER:
              System.out.println("USER: Limited access to specific features.");
              break;
          case GUEST:
              System.out.println("GUEST: Read-only access.");
              break;
          default:
              System.out.println("Unknown role.");
      }
  }
}
