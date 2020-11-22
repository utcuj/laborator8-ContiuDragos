public class Matrice {

    private Numeric[][] matrice = new Numeric[3][3];

    public Matrice(Numeric[][] a)
    {
        this.matrice=a;
    }

    public void adunare(Matrice A)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                this.matrice[i][j].adunare(A.getElement(i,j));
        }
    }
    public void scadere(Matrice A)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                this.matrice[i][j].scadere(A.getElement(i,j));
        }
    }

    public Numeric getElement(int i, int j)
    {
        return this.matrice[i][j];
    }
    public Numeric[][] getMatrice() {
        return matrice;
    }

    public void setMatrice(Numeric[][] matrice) {
        this.matrice = matrice;
    }

    public void afisare()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(this.matrice[i][j]+" ");
            System.out.println();
        }
    }
}
