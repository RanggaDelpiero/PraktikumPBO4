package inheritance;

public class Pekerja extends Manusia {

    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    public static int jumlahPekerja;

    public Pekerja(){
        jumlahPekerja++;
    }
    public Pekerja(int jamKerja, int hariKerja) {
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        jumlahPekerja++;
    }
    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean menikah, boolean jenisKelamin ) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
        jumlahPekerja++;
    }

    public double getGaji() {
        if (getJamKerja() > 7) {
            gaji = 7 * getHariKerja() * 10;
        } else {
            gaji = getJamKerja() * getHariKerja() * 10;
        }

        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        double lembur = 0, libur = 0;
        int hariLibur = 0, jamLembur = 0;

        hariLibur = getHariKerja()/7 * 2;

        if (getJamKerja() > 7) {
            jamLembur = getJamKerja()-7;
        }

        //bonus lembur
        if (getJamKerja() > 7) {
            lembur = jamLembur * 15 * (getHariKerja()-hariLibur) ;
        }

        //bonus libur
        libur = hariLibur * getJamKerja() * 20;


        bonus = lembur + libur;

        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String  getStatus() {
        String cabang;
        String departemen;

        switch (getNIP().charAt(0)) {
            case '1':
                cabang = "Mondstadt";
                break;
            case '2':
                cabang = "Liyue";
                break;
            case '3':
                cabang = "Inazuma";
                break;
            case '4':
                cabang = "Sumeru";
                break;
            case '5':
                cabang = "Fontaine";
                break;
            case '6':
                cabang = "Natlan";
                break;
            case '7':
                cabang = "Snezhnaya";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + getNIP().charAt(0));
        }

        switch (getNIP().charAt(6)) {
            case '1':
                departemen = "Pemasaran";
                break;
            case '2':
                departemen = "Humas";
                break;
            case '3':
                departemen = "Riset";
                break;
            case '4':
                departemen = "Teknologi";
                break;
            case '5':
                departemen = "Personalia";
                break;
            case '6':
                departemen = "Akademik";
                break;
            case '7':
                departemen = "Administrasi";
                break;
            case '8':
                departemen = "Operasional";
                break;
            case '9':
                departemen = "Pembangunan";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + getNIP().charAt(6));
        }
        return departemen + ", " + cabang + " cabang " + getNIP().charAt(2);

    }
    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus();
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nGaji           = $" + getGaji() + "\n" +
                "Bonus          = $" + getBonus() + "\n" +
                "Status         = " + getStatus();
    }
}