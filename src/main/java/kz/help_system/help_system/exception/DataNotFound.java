package kz.help_system.help_system.exception;

public class DataNotFound extends RuntimeException {
  public DataNotFound(String placeId, String data, Object param) {
    super(placeId + " :: not found product by " + data + " : " + param);
  }
}
