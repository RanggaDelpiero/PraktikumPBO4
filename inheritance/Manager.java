package inheritance;

public class Manager extends Pekerja{
    private int lamaKerja;
    public static int jumlahManager;

    public Manager() {

    }
    public Manager(int lamaKerja) {
        this.lamaKerja = lamaKerja;
        jumlahManager++;
    }

    public Manager (int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean menikah, boolean jenisKelamin) {
        super(jamKerja,hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
        jumlahManager++;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + 15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus() * 0.35);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLama Kerja     = " + lamaKerja + " tahun";
    }
}
