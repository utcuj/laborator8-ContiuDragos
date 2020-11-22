public class Fractie implements Numeric{
    private double fractie;

    public Fractie(double fractie)
    {
        this.fractie=fractie;
    }

    @Override
    public Numeric adunare(Numeric x) {
        if(x instanceof Complex)
        {
            Complex a = new Complex(fractie+((Complex) x).getParteaReala(),0);
            return a;
        }
        this.fractie+=((Fractie) x).getFractie();
            return this;


    }

    @Override
    public Numeric scadere(Numeric x) {
        if(x instanceof Complex)
        {
            Complex a = new Complex(fractie-((Complex) x).getParteaReala(),0);
            return a;
        }
        this.fractie-=((Fractie) x).getFractie();
        return this;

    }

    public double getFractie() {
        return fractie;
    }

    public String toString()
    {
        return this.fractie+"";
    }
}
