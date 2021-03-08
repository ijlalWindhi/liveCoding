package liveCodingBatch1;
public class karyawan1 extends person{
//    property
    private int gajiUtama;
    
//    konstruktor
    public karyawan1(String nama, String jenisKelamin, String nomorPegawai,
            int gajiUtama){
        super(nama, jenisKelamin, nomorPegawai);
        this.gajiUtama = gajiUtama;
    }
    
//    method gaji
    public void gaji(){
        System.out.println("gaji utama yang didapat "+gajiUtama);
    }
    
//   overloading method gaji
    public void gaji(int gajiTambahan){
        System.out.println("gaji yang didapat jika bekerja secara baik menjadi "
                +gajiTambahan);
        System.out.println();
    }
    
//    override method info
    @Override
    public void info(){
        super.info();
        System.out.println("Bekerja di bagian admin");
        gaji();
    }
}