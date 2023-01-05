package com.yosha.selesa.Data;

import com.yosha.selesa.Model.ModelTempatBersejarah;

import java.util.ArrayList;

public class DataHindu {
    public static String[][] data = new String[][]{
            {"Candi Jago", "Menurut kitab Negarakertagama pupuh 41:4 dan Pararaton, nama Candi Jago sebenarnya berasal dari kata Jajaghu, yang didirikan pada masa Kerajaan Singhasari pada abad ke-13 sebagai penghormatan bagi Raja ketiga Singhasari, Wisnuwardhana. Jajaghu, yang artinya adalah 'keagungan', merupakan istilah yang digunakan untuk menyebut tempat suci. Candi ini berlokasi di Dusun Jago, Desa Tumpang, Kecamatan Tumpang, Kabupaten Malang, Jawa Timur atau sekitar 22 km dari Kota Malang Candi Jago berlatar agama Buddha Tatrayana. Salah satu ciri dari agaama Buddha Tatrayana adalah arcanya yang berbentuk amoghapasa, bentuk Tatris dari awaloketeswara disertai pengiring-pengiring nya. Arca tersebut merupakan arca dari perwujudan dari raja keempat singasari yang bernama Raja Wisnuwarddhana, yang meninggal tahun 1190 Saka (1280 Masehi).", "Malang", "1280 Masehi", "336 M", "https://images.tokopedia.net/blog-tokopedia-com/uploads/2017/12/candi-4.jpg", "kmLx7HjCN-I"},
            {"Candi Gedong Songo","Candi Gedong Songo (bahasa Jawa: ꦕꦤ꧀ꦝꦶ​ꦒꦼꦝꦺꦴꦁ​ꦱꦔ, translit. Candhi Gedhong Sanga) adalah nama sebuah kompleks bangunan candi peninggalan budaya Hindu yang terletak di desa Candi, Kecamatan Bandungan, Kabupaten Semarang, Jawa Tengah, Indonesia tepatnya di lereng Gunung Ungaran. Di kompleks candi ini terdapat sembilan buah candi. Candi ini ditemukan oleh Raffles pada tahun 1804 dan merupakan peninggalan budaya Hindu dari zaman Wangsa Syailendra abad ke-9 (tahun 927 masehi).", "Jawa Tengah", "927m","",  "//images.tokopedia.net/blog-tokopedia-com/uploads/2017/12/candi-3.jpg", "Qq71Qi6iMYw"},
            {"Candi Prambanan", "Candi Prambanan atau Candi Roro Jonggrang (Hanacaraka:ꦕꦤ꧀ꦝꦶ​ꦥꦿꦩ꧀ꦧꦤꦤ꧀, Candhi Prambanan) adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. Candi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wishnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah. Berdasarkan prasati Siwagrha nama asli kompleks candi ini adalah Siwagrha (bahsa Sansekerta yang bermakna ‘Rumah Siwa’), dan memang di garbagriha (ruang utama) candi ini bersemayam arca Siwa Mahadewa setinggi tiga meter yang menujukkan bahwa di candi ini dewa Siwa lebih diutamakan.","Sleman, Yogyakarta", "850 m", "80 Hektar", "https://images.tokopedia.net/blog-tokopedia-com/uploads/2017/12/candi-1.jpg", "1zKoUCwqwh4"},
            {"Candi Dieng","Kompleks candi ini dibangun pada kisaran pertengahan abad ke-7 sampai akhir abad ke-8 Masehi, namun perkiraan tersebut tidak menjelaskan secara pasti terkait kapan candi-candi tersebut selesai dibangun. Kompleks tersebut merupakan bangunan menhir tertua yang diketahui di Jawa Tengah. Diperkirakan semula terdapat sebanyak 400 candi, tetapi hanya delapan yang tersisa saat ini. Setelah mempelajari gaya arsitektur candi Jawa, arkeolog mengelompokkan Kompleks Candi Dieng ke dalam gaya arsitektur Jawa Tengah bagian Utara, bersamaan dengan Candi Gedong Songo, Candi Badut di Jawa Timur, serta Candi Cangkuang dan Candi Bojongmenje di Jawa Barat. Selain itu, para arkeolog juga mengemukakan bahwa semua candi pada kompleks ini dibangun dalam periode yang sama, berkisar antara abad ke-7 sampai abad ke-8. Sebuah prasasti bertarikh sekitar tahun 808-809 M yang ditemukan di dekat Candi Arjuna, Dieng, menjadi salah satu contoh aksara Jawa kuno tertua yang masih bertahan. Prasasti tersebut mengungkapkan bahwa Candi Dieng terus dihuni dari pertengahan abad ke-7 sampai awal abad ke-9.","Wonosobo, Jawa Tengah","abad ke-8 Masehi","3 Km","https://images.tokopedia.net/blog-tokopedia-com/uploads/2017/12/candi-2.jpg","NfhplQURRnQ"},
            {"Kerajaan Kutai","Kerajaan Kutai Martapura adalah kerajaan bercorak Hindu di Nusantara yang memiliki bukti sejarah tertua berupa prasasti Yupa dan berdiri sekitar abad ke-4, bersamaan dengan Kerajaan Tarumanegara di Jawa. Pusat kerajaan ini terletak di Muara Kaman, yang saat ini adalah sebuah kecamatan di Kabupaten Kutai Kartanegara, Provinsi Kalimantan Timur. Nama Kutai diberikan oleh para ahli mengambil dari nama tempat ditemukannya prasasti yang menunjukkan eksistensi kerajaan tersebut. Informasi nama Martapura diperoleh dari kitab Salasilah Raja dalam Negeri Kutai Kertanegara yang menceritakan pasukan Kerajaan Kutai Kertanegara dari Kutai Lama menyerang ibu kota kerajaan ini","Kalimantan Timur","399 M","2.270 m2","https://www.quipper.com/id/blog/wp-content/uploads/2021/03/letak-kerajaan-kutai.jpg","Id-DVfa2z10"}
    };

    public static ArrayList<ModelTempatBersejarah> ambilData(){
        ArrayList<ModelTempatBersejarah> dataTempatBersejarah = new ArrayList<>();
        for (String[] varData : data){
            ModelTempatBersejarah model = new ModelTempatBersejarah();
            model.setNamaTempat(varData[0]);
            model.setDeskripsi(varData[1]);
            model.setKota(varData[2]);
            model.setTglDibangun(varData[3]);
            model.setLuas(varData[4]);
            model.setFoto(varData[5]);
            model.setVideoId(varData[6]);

            dataTempatBersejarah.add(model);
        }
        return dataTempatBersejarah;
    }
}
