package TugasInheritance;

public class Mahasiswa extends Orang
{
    private String jurusan;
    private String kampus;
    private int semester;

    public Mahasiswa(String nama, int tahunLahir, String jurusan, String kampus, int semester)
    {
        super(nama, tahunLahir);
        this.jurusan = jurusan;
        this.kampus = kampus;
        this.semester = semester;
    }

    public String tampilkanData()
    {
        return super.tampilkanData() + "Jurusan = " + jurusan + "\nKampus = " + kampus +
                "\nSemester = " + semester;
    }
}
