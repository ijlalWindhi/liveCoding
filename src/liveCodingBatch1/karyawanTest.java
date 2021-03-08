package liveCodingBatch1;
public class karyawanTest {
    public static void main(String[] args) {
        
//        objek karyawan1
        karyawan1 karyawan1 = new karyawan1("painem", "perempuan", "123456",
                2500000);
//        memanggil method info dari class karyawan1
        karyawan1.info();
//        memanggil method gaji dari class karyawan1
        karyawan1.gaji(3000000);
        
//        objek karyawan2
        karyawan2 karyawan2 = new karyawan2("paijo", "laki-laki", "234567",
                2600000);
//        memanggil method info dari class karyawan1
        karyawan2.info();
//        memanggil method gaji dari class karyawan1
        karyawan2.gaji(3250000);
    }
}