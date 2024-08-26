public class TesGuru {
  int nip;
  String nama;
  String mapel;
  String status;

  //Constructor Default
  public TesGuru() {
   nip = 0;
   nama = "Kosong";
   mapel = "Kosong";
   status = "Kosong";
  }

  public void print() {
    System.out.println("NIP: "+nip);
    System.out.println("Nama: "+nama);
    System.out.println("Mata Pelajaran: "+mapel);
    System.out.println("Status: "+status);
  }
}
