# Aplikasi Mobile HIMABIDA

## 📱 Tentang Aplikasi
HIMABIDA (HMBS_APP) adalah aplikasi mobile yang dikembangkan untuk platform Android yang berfungsi sebagai platform manajemen dan akses informasi terkait organisasi mahasiswa. Aplikasi ini dibangun menggunakan bahasa pemrograman Java dan mengikuti praktik pengembangan Android modern.

## 🌟 Fitur-Fitur Utama

### 1. Halaman Selamat Datang
- Pesan selamat datang dengan animasi ("SELAMAT DATANG")
- Tampilan logo dengan animasi
- Tombol login dengan efek fade dan slide-up
- Transisi halaman yang halus

### 2. Menu Utama (Dashboard)
Aplikasi ini dilengkapi dengan beberapa fitur utama yang dapat diakses melalui sistem navigasi berbasis kartu:

- **Tentang** (About)
  - Informasi lengkap tentang organisasi
  - Sejarah dan latar belakang organisasi
  - Visi dan misi organisasi

- **Kepengurusan** (Management)
  - Struktur organisasi
  - Daftar pengurus beserta jabatan
  - Profil anggota kepengurusan

- **Produk** (Products)
  - Katalog produk atau layanan organisasi
  - Informasi detail setiap produk
  - Deskripsi dan spesifikasi produk

- **Laporan** (Reports)
  - Dokumentasi kegiatan organisasi
  - Laporan keuangan
  - Laporan kegiatan berkala

- **Forum Diskusi**
  - Ruang diskusi antar anggota
  - Pembahasan topik-topik terkait organisasi
  - Interaksi antar pengguna

- **Hubungi Kami** (Contact Us)
  - Informasi kontak pengurus
  - Form komunikasi
  - Alamat dan lokasi sekretariat

### 3. Fitur Navigasi
- Navigasi intuitif antar bagian aplikasi
- Tombol kembali yang konsisten
- Akses menu yang mudah di semua halaman
- Transisi antar aktivitas yang halus

## 🛠 Detail Teknis

### Lingkungan Pengembangan
- Bahasa Pemrograman: Java
- Platform: Android
- Sistem Build: Gradle (Kotlin DSL)

### Struktur Proyek
```
app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── hmbs_app/
│       │               ├── MainActivity.java
│       │               ├── halamanActivity2.java
│       │               ├── HalamanActivity3.java
│       │               ├── KepengurusanActivity.java
│       │               ├── LaporanActivity.java
│       │               ├── ProdukActivity.java
│       │               ├── ForumActivity.java
│       │               └── HubungiKamiActivity.java
│       └── res/
└── build.gradle
```

### Komponen Utama

1. **MainActivity**
   - Menangani tampilan awal aplikasi
   - Implementasi animasi pembuka
   - Pengelolaan proses login pengguna

2. **halamanActivity2**
   - Aktivitas dashboard utama
   - Sistem navigasi berbasis kartu
   - Akses ke semua fitur utama

3. **Aktivitas-aktivitas Fitur**
   - Kepengurusan (Manajemen organisasi)
   - Laporan (Dokumentasi kegiatan)
   - Produk (Katalog produk/layanan)
   - Forum (Ruang diskusi)
   - Hubungi Kami (Kontak dan komunikasi)

## 🚀 Panduan Penggunaan

### Persyaratan Sistem
- Android Studio
- JDK 8 atau lebih tinggi
- Android SDK
- Perangkat Android atau emulator

### Cara Instalasi
1. Clone repository:
```bash
git clone https://github.com/firmanwhid/Project-Mobile-HIMABIDA.git
```

2. Buka proyek menggunakan Android Studio

3. Sinkronisasi file Gradle

4. Build dan jalankan aplikasi

## 📝 Dependensi
Proyek ini menggunakan dependensi utama berikut:
```gradle
dependencies {
    // Dependensi inti Android
    implementation 'androidx.appcompat:appcompat'
    implementation 'androidx.cardview:cardview'
    // Tambahkan dependensi lain sesuai kebutuhan
}
```

## 💡 Cara Penggunaan
1. Buka aplikasi HIMABIDA
2. Tunggu animasi selamat datang selesai
3. Gunakan tombol login untuk mengakses dashboard utama
4. Navigasi ke berbagai bagian menggunakan menu kartu
5. Gunakan tombol kembali untuk navigasi ke halaman sebelumnya

## 🤝 Kontribusi
1. Fork proyek ini
2. Buat branch fitur baru (`git checkout -b fitur/FiturBaru`)
3. Commit perubahan Anda (`git commit -m 'Menambahkan FiturBaru'`)
4. Push ke branch (`git push origin fitur/FiturBaru`)
5. Buat Pull Request


## 📞 Kontak
- Link Proyek: [https://github.com/firmanwhid/Project-Mobile-HIMABIDA](https://github.com/firmanwhid/Project-Mobile-HIMABIDA)
- Pengembang: [firmanwhid](https://github.com/firmanwhid)

---
Dibuat dengan ❤️ oleh Kelompok 2
