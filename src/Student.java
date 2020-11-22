public class Student implements Cloneable{
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.masina=masina;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public String toString()
    {
        return "Nume: "+this.nume+"\nPrenume: "+this.prenume+"\nMasina "+this.masina.toString();
    }

    public Student shallowClone()
    {
        return this;
    }


    public Student deepClone()
    {
        Student studentClone = new Student(this.nume,this.prenume,this.masina);
        return studentClone;
    }


    public void vopsesteMasina(String culoare)
    {
        this.masina.setCulaore(culoare);
    }

}
