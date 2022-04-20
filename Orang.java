package TugasInheritance;

public class Orang
{
    private String nama;
    private int tahunLahir;

    public Orang(String nama, int tahunLahir)
    {
        this.nama = nama;
        this.tahunLahir = tahunLahir;
    }

    public String tampilkanData()
    {
        return "Nama = " + nama + "\nTahun Lahir = " + tahunLahir + "\n";
    }
}
