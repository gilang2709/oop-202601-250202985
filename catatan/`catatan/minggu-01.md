# Catatan Minggu 01: Paradigma Pemrograman dan Setup

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya menyiapkan JDK21, Maven, dan Git. Saya mengisi NIM dan nama di mahasiswa.properties, lalu saya mengerjakan HelloProsedural, HelloOOP, dan HelloFungsional. lalu saya juga menjalankan tes week1.

## Keputusan desain
- Ketiga kelas memakai kalimat sapaan yang sama persis, karena tes membandingkan hasilnya satu sama lain. Kalimatnya tetap memuat tiga hal yang diminta: kata "Aset-Pinjam", nama, dan NIM.
- Di `HelloOOP`, saya menjadikan `nama` dan `nim` sebagai field `private final`. Dengan begitu data hanya bisa diisi sekali lewat konstruktor dan tidak bisa diubah dari luar kelas, yang merupakan penerapan encapsulation.
- Di `HelloFungsional`, urutannya dipisah: NIM diberikan dulu ke `pembuatSapaan(nim)`, lalu nama diberikan belakangan ke fungsi yang dikembalikan lewat `apply(nama)`. Jadi NIM tersimpan di dalam lambda dan ikut terbawa saat fungsi itu dipakai.

## Kendala
Skrip `uji.ps1` ditolak Windows karena Execution Policy PowerShell. Saya mengatasinya dengan menjalankan Maven langsung: `mvn -B -ntp test -pl core -Dgroups=week1`.

## Kelebihan dan keterbataskan tiap gaya
- Prosedural
  - kelebihannya: sederhana dan mudah dibaca untuk logika pendek, misalnya menghitung denda satu kali.
  - keterbatasan: Data dan fungsi terpisah. Saat aset punya banyak atribut dan aturan (ruang, laptop, alat lab), parameter menumpuk dan kode mudah berantakan.
- OOP
  - kelebihan: Data dan perilaku menyatu dalam objek. Cocok memodelkan aset dan peminjaman yang punya status, serta mudah dikembangkan lewat pewarisan.
  - keterbatasan: Perlu lebih banyak kode awal (kelas, konstruktor, field) untuk hal yang sederhana.
- Fungsional
  - kelebihan: Fungsi bisa dirakit dan dipakai ulang, cocok untuk aturan yang bisa ditukar seperti perhitungan denda atau penyaringan daftar.
  - keterbatasan: Kurang alami untuk menyimpan keadaan yang terus berubah, seperti status peminjaman.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: menjelaskan apasaja yang harus di kerjakan, kelas, dan `uji.ps1` karena error di tolak oleh windows.
- Prompt utama:
  - jelaskan aku harus mengisi dan mengerjakan apasaja.
  - Saya menempelkan pesan error PowerShell dan hasil `mvn test`, lalu menanyakan penyebabnya.
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
  - Saya mengubah bagian script terminal karena error, makannya saya menggunakan ai. sisanya saya terima semua.
- Satu hal yang saya pahami lebih baik sekarang:
  - Saya jadi lebih memahami tentang java yang sebelumnya saya belum memahaminya.
