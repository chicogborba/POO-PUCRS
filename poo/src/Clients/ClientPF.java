package Clients;

public class ClientPF extends Client {
  private String cpf;

  public ClientPF(String client, String cpf) {
    super(client, cpf);
    this.cpf = cpf;

  }

  public String getCPF() {
    return this.cpf;
  }

  @Override
  public String toString() {
    return super.toString() + " CPF: " + this.cpf;
  }

  @Override
  public String getDoc() {
    return this.cpf;
  }
}
