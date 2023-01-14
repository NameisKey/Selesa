package com.yosha.selesa.Data;

import com.yosha.selesa.Model.ModelTempatBersejarah;

import java.util.ArrayList;

public class DataKemerdekaanIndonesia {
    public static String[][] data = new String[][]{
            {"Monumen Nasional (Monas)", "Monas dibangun untuk mengenang perjuangan para pahlawan bangsa Indonesia masa revolusi. Pada puncak Monas, terdapat emas seberat 35 kilogram dengan cawan seberat 14,5 ton. Emas tersebut merupakan pemberian seorang saudagar kaya asal Aceh kepada bangsa Indonesia. Di dalam Monas, Anda juga dapat menemukan banyak sekali koleksi ruangan bersejarah serta ruang-ruang yang menceritakan perjuangan kemerdekaan Indonesia. Bonusnya, di pelataran puncak, Anda dapat melihat pemandangan kota Jakarta.", "Jakarta Pusat", "17 Agustus 1961", "80 hektare", "https://berita.99.co/wp-content/uploads/2022/08/emas-di-monas-1.jpg", "ydSSOIObIZQ"},
            {"Museum Sumpah Pemuda", "Museum ini merupakan tempat yang melahirkan persetujuan Indonesia; berbangsa satu, berbahasa satu, dan bertanah air satu, yang akhirnya melahirkan kemerdekaan Indonesia. Gedung yang dahulunya merupakan tempat tinggal para pelajar ini sekarang dikenal dengan nama Gedung Kramat No. 106. Di dalam gedung ini, Anda juga dapat melihat patung lilin para tokoh Sumpah Pemuda seperti Muhammad Yamin dan A. K. Gani serta patung lilin Wage Rudolf Supratman, pencipta lagu kemerdekaan Indonesia.Museum ini memiliki koleksi foto dan benda-benda yang berhubungan dengan sejarah Sumpah Pemuda 1928, serta kegiatan-kegiatan dalam pergerakan nasional kepemudaan Indonesia. Museum Sumpah Pemuda ini didirikan berdasarkan SK Gubernur DKI Jakarta pada tahun 1972 dan menjadi benda cagar budaya nasional.", "Jakarta Pusat", "20 Mei 1974", "1.138 meter persegi", "https://asset.kompas.com/crops/nlst9t2orZvARJv49LDOltD4fF8=/0x129:1600x1196/750x500/data/photo/2022/10/28/635b7f463262d.jpeg", "yqQXsZJ26Iw"},
            {"Lawang Sewu", "Lawang Sewu (bahasa Belanda: Het administratiegebouw van de Nederlandsch-Indische Spoorweg-Maatschappij, N.V. te Samarang) (Bahasa Jawa: ꧋ꦭꦮꦁꦱꦺꦮꦸ artinya Seribu Pintu) adalah bangunan perkantoran yang terletak di seberang Tugu Muda, Kota Semarang, Jawa Tengah, Indonesia, yang dibangun sebagai kantor pusat Nederlandsch-Indische Spoorweg Maatschappij (NIS). Bangunan ini berstatus sebagai aset Kereta Api Indonesia (KAI) karena merupakan buah dari perebutan NIS oleh Djawatan Kereta Api Republik Indonesia (DKARI) pada masa Perang Kemerdekaan. Saat ini bangunan tersebut dijadikan sebagai museum dan galeri sejarah perkeretaapian oleh Unit Pusat Pelestarian dan Desain Arsitektur dan KAI Wisata.", "Semarang", "1907", "18.232 meter persegi", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Lawang_sewu.jpg/240px-Lawang_sewu.jpg", "agMZZLjY0tI"},
            {"Benteng Rotterdam", "Benteng Rotterdam atau kerap kali dikenal sebagai Benteng Ujung Pandang merupakan benteng bersejarah peninggalan dari Kerajaan Gowa-Tallo. Benteng ini dibangun pada tahun 1545 oleh seorang raja yaitu Raja Gowa ke-9. Benteng ini juga menjadi saksi bisu dalam kemerdekaan Bangsa Indonesia dalam melawan Belanda pada masa itu. Pada mulanya, benteng ini dibangun dengan konstruksi tanah liat, dan baru ketika pada masa pemerintahan Raja Gowa ke-14, benteng ini direnovasi ulang dan dibangunan dengan menggunakan bahan konstruksi batu padas yang berasal dari Pegunungan Karst. Benteng ini memiliki bentuk yang unik, yaitu menyerupai penyu yang seperti akan merangkak menuruni laut. Hal ini menjadi filosofi tertentu yang dimaknai dengan Kerajaan Gowa yang akan tetap berjaya di laut dan darat. Kemudian, Belanda menempati benteng ini dan mengganti namanya menjadi Benteng Fort Rotterdam untuk mengenang daerah kelahiran para penjajah pada masa itu, yaitu Belanda. Benteng ini kemudian dijadikan pusat penampungan rempah-rempah daerah Indonesia timur.", "Makassar", "1545", "11.805,85 meter persegi", "https://th.bing.com/th/id/OIP.TwOvaW_bp_tZXT4XfTBISgHaEK?w=276&h=180&c=7&r=0&o=5&dpr=1.1&pid=1.7", "KJoiZclZbjc"}
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
//            model.setLokasi(varData[7]);

            dataTempatBersejarah.add(model);
        }
        return dataTempatBersejarah;
    }
}
