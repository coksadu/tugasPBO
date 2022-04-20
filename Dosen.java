package TugasInheritance;

public class Dosen extends Orang
{
    private int gaji;
    private String kampus;

    public Dosen(String nama, int tahunLahir, int gaji, String kampus)
    {
        super(nama, tahunLahir);
        this.gaji = gaji;
        this.kampus = kampus;
    }

    public String tampilkanData()
    {
        return "Dosen :\n" + super.tampilkanData() + "Gaji = " + gaji + "\nKampus = " + kampus;
    }

}
