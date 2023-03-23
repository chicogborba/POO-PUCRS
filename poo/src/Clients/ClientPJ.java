package Clients;

public class ClientPJ extends Client {
  private String cnpj;

  public ClientPJ(String client, String cnpj) {
    super(client, cnpj);
    this.cnpj = cnpj;
  }

  public String getCNPJ() {
    return this.cnpj;
  }

  @Override
  public String toString() {
    return super.toString() + " CNPJ: " + this.cnpj;
  }

  @Override
  public String getDoc() {
    return this.cnpj;
  }

}
