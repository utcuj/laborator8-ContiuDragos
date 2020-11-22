public class Persoana implements Comparable{
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }

    @Override
    public int compareTo(Object o) {
        return this.varsta-((Persoana) o).varsta;
    }

    public String toString()
    {
        return this.nume+" "+this.prenume+" "+this.varsta;
    }
}
