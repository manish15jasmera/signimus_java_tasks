// Define an enum StatusCode with constants SUCCESS, ERROR, and PENDING, and map status codes to their messages.

public class StatusCodeExample {
  enum StatusCode {
      SUCCESS("Operation completed successfully."),
      ERROR("An error occurred during the operation."),
      PENDING("The operation is still in progress.");

      private final String message;

      StatusCode(String message) {
          this.message = message;
      }

      public String getMessage() {
          return message;
      }
  }

  public static void main(String[] args) {
      printStatusMessage(StatusCode.SUCCESS);
      printStatusMessage(StatusCode.ERROR);
      printStatusMessage(StatusCode.PENDING);
  }

  public static void printStatusMessage(StatusCode status) {
      System.out.println(status + ": " + status.getMessage());
  }
}

