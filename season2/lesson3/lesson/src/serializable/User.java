package serializable;

import java.io.Serializable;

public class User implements Serializable {

  private String userName;
  private transient String password; // Модификатор 'transient' помечает для сериализатора, что поле сериализовывать не нужно

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public String toString() {
    return "User{" +
        "userName='" + userName + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
