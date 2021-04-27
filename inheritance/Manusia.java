package inheritance;

public class Manusia {

    protected String nama;
    protected String NIK;
    protected boolean jenisKelamin;
    protected boolean menikah;
    public static int jumlahManusia = 0;

    public Manusia () {
        jumlahManusia++;
    }
    public Manusia(String nama, String NIK, boolean menikah, boolean jenisKelamin) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        jumlahManusia++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String isJenisKelamin() {
        if (jenisKelamin) {
            return "Laki-Laki";
        } else {
            return "Perempuan";
        }
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String isMenikah() {
        if (menikah) {
            return "Menikah";
        } else {
            return "Belum Menikah";
        }
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan = 0;
        if (menikah) {
            if (jenisKelamin) {
                tunjangan = 25;
            } else if (!jenisKelamin) {
                tunjangan = 20;
            }
        } else if (!menikah) {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();

    }

    @Override
    public String toString() {
        return  "Nama           = " + nama + "\n" +
                "NIK            = " + NIK + "\n" +
                "Jenis Kelamin  = " + isJenisKelamin() + "\n" +
                "Pendapatan     = $" + getPendapatan();
    }
}
