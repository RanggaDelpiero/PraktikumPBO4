package inheritance;

public class Mahasiswa  extends Manusia {
    private String NIM;
    private double IPK;
    public static int jumlahMahasiswa = 0;

    public Mahasiswa() {
        jumlahMahasiswa++;

    }

    public Mahasiswa(String NIM, double IPK, String nama, String NIK, boolean menikah, boolean jenisKelamin) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
        jumlahMahasiswa++;
    }


    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public double getPendapatan() {
       return super.getPendapatan() + getBeasiswa();
    }

    public String getStatus() {
        String prodi;
        String angkatan = "20" + getNIM().substring(0,2);

        switch (getNIM().charAt(6)) {
            case '2':
                prodi = "Teknik Meniup Gelembung";
                break;
            case '3':
                prodi = "Teknik Berburu Ubur Ubur";
                break;
            case '4':
                prodi = "Sistem Perhamburgeran";
                break;
            case '6':
                prodi = "Pendidikan Chum Bucket";
                break;
            case '7':
                prodi = "Teknologi Telepon Kerang";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + getNIM().charAt(6));
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (getIPK() >= 3 && getIPK() < 3.5) {
            beasiswa = 50;
        } else if (getIPK() >= 3.5) {
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNIM            = " + NIM + "\n" +
                "IPK            = " + IPK + "\n" +
                "Status         = " + getStatus();
    }
}
