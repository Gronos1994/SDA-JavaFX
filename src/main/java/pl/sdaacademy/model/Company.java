package pl.sdaacademy.model;

//Id
//Adress
//nip
//regon
public class Company {
    public Company() {
    }

    public String name;
    public String id;
    public Adress adress;
    public String nip;
    public String regon;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", adress=" + adress +
                ", nip='" + nip + '\'' +
                ", regon='" + regon + '\'' +
                '}';
    }

    public Company(String name, String id, Adress adress, String nip, String regon) {
        this.name = name;
        this.id = id;
        this.adress = adress;
        this.nip = nip;
        this.regon = regon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }
}
