public class Masina {
    private String marca;
    private String culaore;

    public Masina(String marca, String culaore)
    {
        this.marca=marca;
        this.culaore=culaore;
    }

    public String getMarca() {
        return marca;
    }

    public String getCulaore() {
        return culaore;
    }

    public void setCulaore(String culaore) {
        this.culaore = culaore;
    }

    public String toString()
    {
        return "Marca "+this.marca+" si culoarea "+this.culaore;
    }
}
