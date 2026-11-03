# Catatan Minggu 03: Inheritance

## Yang saya kerjakan

Saya melengkapi tiga subclass dari `Aset`: `Ruang` (kapasitas), `Laptop` (spesifikasi dan nomor inventaris), dan `AlatLab` (laboratorium dan tingkat risiko). Tiap subclass memanggil `super(kode, nama)` lebih dulu, memvalidasi field miliknya sendiri, lalu meng-override `getJenis()` agar mengembalikan RUANG, LAPTOP, atau ALAT_LAB. Saya juga mengubah `wajibIsi` di `Aset` dari `private` menjadi `protected` supaya subclass bisa memakai ulang pemeriksaan teks kosong.

## Keputusan desain

- **Field di induk:** `kode`, `nama`, `status`, dan `kondisi`, karena semua jenis aset punya data itu dan aturan peminjaman yang sama.
- **Field di subclass:** `kapasitas` (hanya ruang), `spesifikasi` dan `nomorInventaris` (hanya laptop), `laboratorium` dan `tingkatRisiko` (hanya alat lab). Data ini tidak masuk akal untuk jenis lain, jadi menaruhnya di induk akan membuat field yang tidak dipakai.
- Field subclass saya buat `private final` karena tidak ada aturan yang membolehkan datanya berubah setelah objek dibuat.
- `wajibIsi` dijadikan `protected static` agar aturan "tidak boleh kosong" tetap ditulis di satu tempat. Alternatifnya menyalin kode ke tiap subclass, tetapi itu mengulang kode yang justru ingin dihindari inheritance.
- Validasi `Aset` tetap berlaku di subclass karena `super(...)` dipanggil lebih dulu. Kode kosong ditolak sebelum validasi kapasitas dijalankan.

## Kendala

Memutuskan cara memakai ulang pemeriksaan teks kosong di tiga subclass tanpa menyalin kodenya. Saya mengatasinya dengan mengubah `wajibIsi` di `Aset` menjadi `protected`.

## Penggunaan AI

- Alat yang dipakai: Claude (Anthropic).
- Bagian yang dibantu AI: `Ruang`, `Laptop`, `AlatLab` (field, konstruktor, getter, `getJenis`), perubahan `wajibIsi` menjadi `protected`, dan rancangan contoh inheritance versus komposisi.
- Prompt utama:
  1. "berikan aku penjelasan tentang materi minggu 3"
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
- Satu hal yang saya pahami lebih baik sekarang: Konstruktor subclass harus memanggil `super(kode, nama)` lebih dulu, sehingga validasi `Aset` selalu dijalankan sebelum data milik subclass diperiksa. Karena itu `new Ruang("", "Aula", 10)` ditolak karena kodenya kosong, walaupun kapasitasnya valid. Inheritance membuat aturan induk otomatis ikut berlaku di semua anaknya, tetapi hubungannya kaku karena Java hanya membolehkan satu induk.
