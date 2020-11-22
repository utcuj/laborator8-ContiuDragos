import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args)
    {
        /*
        Numeric a = new Complex(1,2);
        Numeric b = new Fractie(2.85);
        Numeric c= new Complex(2,3);
        Numeric d = new Fractie(4.75);

        a.adunare(b);
        System.out.println(a.toString());

        a.adunare(c);
        System.out.println(a.toString());

        b.adunare(d);
        System.out.println(b.toString());

        Numeric[][] matrice1 = new Numeric[3][3];
        Numeric[][] matrice2 = new Numeric[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrice1[i][j] = new Complex(3,3);
                matrice2[i][j] = new Fractie(2.2);
            }
        }
        Matrice A = new Matrice(matrice1);
        Matrice B = new Matrice(matrice2);

        A.adunare(B);
        A.afisare();

        Persoana[] persoane = new Persoana[5];
        persoane[0] = new Persoana("Buri","Buri",35);
        persoane[1] = new Persoana("Emi","Anton",20);
        persoane[2] = new Persoana("Gion","Hatz",25);
        persoane[3] = new Persoana("Popa","Dorian",18);
        persoane[4] = new Persoana("Rus","Buri",17);

        for(Persoana i : persoane)
            System.out.println(i.toString());

        Arrays.sort(persoane);

        for(Persoana i : persoane)
            System.out.println(i.toString());

            */
        Masina masina1 = new Masina("BMW","albastru");
        Masina masina2 = new Masina("Mercedes","negru");
        Student student1 = new Student("Marin","Marius",masina1);
        Student student2 = student1.shallowClone();
        Student student3 = student1.deepClone();

        System.out.println("Intial");
        System.out.println("Student 1\n"+student1.toString());
        System.out.println();
        System.out.println("Student 2\n"+student2.toString());
        System.out.println();
        System.out.println("Student 3\n"+student3.toString());
        System.out.println();

        System.out.println("Dupa ce schimb masina la studentul 1");
        student1.setMasina(masina2);
        System.out.println("Student 1\n"+student1.toString());
        System.out.println();
        System.out.println("Student 2\n"+student2.toString());
        System.out.println();
        System.out.println("Student 3\n"+student3.toString());
        System.out.println();

        System.out.println("Dupa ce vopsesc masina studentului 1");
        student1.vopsesteMasina("Galben");
        System.out.println("Student 1\n"+student1.toString());
        System.out.println();
        System.out.println("Student 2\n"+student2.toString());
        System.out.println();
        System.out.println("Student 3\n"+student3.toString());
        System.out.println();

        System.out.println("Dupa ce vopsesc masina studentului 3");
        student3.vopsesteMasina("Verde");
        System.out.println("Student 1\n"+student1.toString());
        System.out.println();
        System.out.println("Student 2\n"+student2.toString());
        System.out.println();
        System.out.println("Student 3\n"+student3.toString());
        System.out.println();


    }


}
