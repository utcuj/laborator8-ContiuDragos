public class Complex implements Numeric{
    private double parteaReala;
    private double parteaImaginara;

    public Complex(double parteaReala, double parteaImaginara)
    {
        this.parteaReala=parteaReala;
        this.parteaImaginara=parteaImaginara;
    }
    public Numeric adunare(Numeric x)
    {
        if(x instanceof Complex)
        {
            this.parteaReala+=((Complex) x).parteaReala;
            this.parteaImaginara+=((Complex) x).parteaImaginara;
        }
        else
        {
            this.parteaReala+=((Fractie) x).getFractie();
        }
        return this;
    }

    @Override
    public Numeric scadere(Numeric x) {
        if(x instanceof Complex)
        {
            this.parteaReala-=((Complex) x).parteaReala;
            this.parteaImaginara-=((Complex) x).parteaImaginara;
        }
        else
        {
            this.parteaReala-=((Fractie) x).getFractie();
        }
        return this;
    }

    public double getParteaReala() {
        return parteaReala;
    }

    public double getParteaImaginara() {
        return parteaImaginara;
    }

    public String toString()
    {
        if(this.parteaImaginara>0)
            return this.parteaReala+"+"+this.parteaImaginara+"*i";
        else
            return this.parteaReala+this.parteaImaginara+"*i";
    }
}
