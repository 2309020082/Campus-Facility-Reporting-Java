import java.util.Date;

public class Laporan {
    private int id_Laporan;
    private int id_User;
    private String judul;
    private String deskripsi;
    private String lantai;
    private String ruangan;
    private String foto;
    private String status;
    private Date tanggal_Lapor;

    public Laporan(int id_Laporan, int id_User, String judul, String deskripsi,
            String lantai, String ruangan, String foto,
            String status, Date tanggal_Lapor) {

        this.id_Laporan = id_Laporan;
        this.id_User = id_User;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.lantai = lantai;
        this.ruangan = ruangan;
        this.foto = foto;
        this.status = status;
        this.tanggal_Lapor = tanggal_Lapor;
    }

    public int getId_Laporan() {
        return id_Laporan;
    }

    public int getId_User() {
        return id_User;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getLantai() {
        return lantai;
    }

    public String getRuangan() {
        return ruangan;
    }

    public String getFoto() {
        return foto;
    }

    public String getStatus() {
        return status;
    }

    public Date getTanggal_Lapor() {
        return tanggal_Lapor;
    }

    public static void main(String[] args) {
        System.out.println("Class Laporan berhasil dibuat");
    }

}