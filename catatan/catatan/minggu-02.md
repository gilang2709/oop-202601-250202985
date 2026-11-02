# Catatan Minggu NN: (topik)

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya melengkapi kelas `Aset`: empat field private (`kode`, `nama`, `status`, `kondisi`), konstruktor yang memvalidasi `kode` dan `nama`, getter untuk semua field, serta setter untuk `nama`, `status`, dan `kondisi` yang menolak nilai tidak sah dengan `IllegalArgumentException`. Nilai awal status adalah TERSEDIA dan kondisi BAIK. `kode` tidak punya setter karena merupakan identitas aset. Setelah itu saya menjalankan tes `week2` sampai lulus.

## Keputusan desain
- Kode dinormalisasi dengan `trim()` saja, tidak diubah menjadi huruf besar. Alasannya ada di `docs/asumsi.md` (A-08).
- Validasi dilakukan sebelum field diisi, sehingga jika `setNama("")` gagal, nama lama tetap utuh. Ini yang diperiksa tes `setNamaMemvalidasi`.


## Kendala
Kendala saya di minggu ini adalah masih bingung membedakan private dan final pada field kode.
## Penggunaan AI
- Alat yang dipakai: Claude (Anthropic).
- Bagian yang dibantu AI: seluruh isi `Aset.java` untuk jatah minggu 2 (field, konstruktor, getter, setter, dan metode `wajibIsi`), serta rancangan entri A-08 di `docs/asumsi.md`.
- Prompt utama:
  1. "apasaja yang harus di kerjakan di minggu 2"
  2. Saya menempelkan hasil `mvn test` minggu 2 dan menanyakan apakah `Aset.java` sudah benar.
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
- Satu hal yang saya pahami lebih baik sekarang: Saya menjadi tahu perbedaan private dan final
