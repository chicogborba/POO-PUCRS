package Clients;

public class Client {
  private String client;
  private String doc;

  public Client(String client, String doc) {
    this.client = client;
    this.doc = doc;
  }

  public String getClient() {
    return this.client;
  }

  public String getDoc() {
    return this.doc;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "nome='" + getClient() + '\'' +
        ", documento='" + getDoc() + '\'' +
        '}';
  }

}
