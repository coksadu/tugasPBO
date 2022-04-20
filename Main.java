package TugasInheritance;

public class Main {

    public static void main(String[] args) {
        {
            Orang orang1 = new Orang("Anton", 2001);
            Mahasiswa mahasiswa1 = new Mahasiswa("Agung", 2003, "Teknologi Informasi", "Universitas Udayana", 2);
            Mahasiswa mahasiswa2 = new Mahasiswa(" Jono", 1986, "Matematika", "Universitas Udayana", 5);
            Dosen dosen1 = new Dosen("Budi", 1975, 8000000, "Universitas Udayana");

            System.out.println(orang1.tampilkanData());

            System.out.println(mahasiswa1.tampilkanData());
            System.out.println("");

            System.out.println(mahasiswa2.tampilkanData());
            System.out.println("");

            System.out.println(dosen1.tampilkanData());
        }
    }
}
