package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    private final String spesifikasi;
    private final String nomorInventaris;

    // TODO minggu 3: field spesifikasi dan nomorInventaris.

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        this.spesifikasi = wajibIsi(spesifikasi, "spesifikasi");
        this.nomorInventaris = wajibIsi(nomorInventaris, "nomor inventaris");
    }

    public String getSpesifikasi() {
        return this.spesifikasi;
    }

    public String getNomorInventaris() {
        return this.nomorInventaris;
    }

    @Override 
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }

    // TODO minggu 3: override getJenis(). Minggu 4: override hitungDenda(int).
}
