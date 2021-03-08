package liveCodingBatch1;
public class person {
//    property
    private String nama;
    private String jenisKelamin;
    private String nomorPegawai;
    
//    konstruktor
    public person(String nama, String jenisKelamin, String nomorPegawai){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nomorPegawai = nomorPegawai;
    }
    
//    method info yang di override pada subclass
    public void info(){
        System.out.println("Berikut identitas pegawai:");
        System.out.println("nama = "+nama);
        System.out.println("jenis kelamin = "+jenisKelamin);
        System.out.println("nomor pegawai "+nomorPegawai);
    }
}
