package inheritance;

public class testInheritance {

    public static void main (String[] args) {

        Manusia[] manusia = new Manusia[3];
        Mahasiswa[] mahasiswa = new Mahasiswa[3];
        Pekerja[] pekerja = new Pekerja[3];
        Manager[] manager = new Manager[3];

        manusia[0] = new Manusia("Rangga", "3503110101010001", true, true);

        mahasiswa[0] = new Mahasiswa("195150207111029", 4, "Raditya", "111", false, true);

        pekerja[0] = new Pekerja(9, 28, "201777119232", "Delpiero", "293", true, true);

        manager[0] = new Manager(1000, 6, 30, "40977140232", "Zale", "23344", false, true);

        manusia[1] = new Manusia("Icha", "3173118501010231", true, false);

        mahasiswa[1] = new Mahasiswa("205150300111008", 3.2, "Karis", "3171", true, false);

        pekerja[1] = new Pekerja(8, 31, "408777219232", "Silvi", "499058", false, false);

        manager[1] = new Manager(10, 12, 21, "308777519232", "Auryn", "9834758", false, false);

        manusia[2] = new Manusia("Silvi", "8503530102310851", false, false);

        mahasiswa[2] = new Mahasiswa("185150407111029", 3.7, "Naufal", "49849", false, true);

        pekerja[2] = new Pekerja(5, 48, "705777719232", "Bina", "75839", true, false);

        manager[2] = new Manager(20, 8, 7, "703777919232", "Jafar", "5793478", true, true);

        for (int i = 0; i < manusia.length; i++) {
            System.out.println(manusia[i].toString());
            System.out.println("============================================");
        }
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println(mahasiswa[i].toString());
            System.out.println("============================================");
        }
        for (int i = 0; i < pekerja.length; i++) {
            System.out.println(pekerja[i].toString());
            System.out.println("============================================");
        }
        for (int i = 0; i < manager.length; i++) {
            System.out.println(manager[i].toString());
            System.out.println("============================================");
        }


        System.out.println("Total Manusia : " + Manusia.jumlahManusia);
        System.out.println("Total Mahasiswa : " + Mahasiswa.jumlahMahasiswa);
        System.out.println("Total Pekerja : " + Pekerja.jumlahPekerja);
        System.out.println("Total Manager : " + Manager.jumlahManager);







    }
}
