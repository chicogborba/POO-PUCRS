package Clients;

public class Student extends ClientPF {
  private String institution;

  public Student(String client, String cpf, String institution) {
    super(client, cpf);
    this.institution = institution;
  }

  public String getInstitution() {
    return this.institution;
  }

  @Override
  public String toString() {
    return super.toString() + " Instituição: " + this.institution;
  }

}
