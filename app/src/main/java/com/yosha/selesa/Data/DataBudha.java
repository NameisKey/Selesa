package com.yosha.selesa.Data;

import com.yosha.selesa.Model.ModelTempatBersejarah;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataBudha {
    public static String[][] data = new String[][]{
            {"Candi Borobudur", "Tempat ziarah umat Buddha paling ternama Indonesia adalah Candi Borobudur. Candi peninggalan kerajaan Mataram Kuno ini merupakan salah satu warisan sejarah umat Buddha di Indonesia serta saksi bisu persebaran ajaran Buddha di Nusantara pada masa lampau. Hingga kini, Candi Borobudur tak cuma jadi destinasi wisata sejarah sekaligus religi bagi umat Buddha, tapi juga masih digunakan sebagai tempat ibadah dan perayaan-perayaan hari besar keagamaan umat Buddha di Indonesia. Perayaan Waisak yang khusuk dan selalu diramaikan oleh banyak umat Buddha baik dari dalam maupun luar negeri ini membuat Candi Borobudur jadi salah satu destinasi wisata religi agama Buddha paling populer di Indonesia.", "Yogyakarta", "750 Masehi", "2.500 m²", "https://i0.wp.com/jowonews.com/wp-content/uploads/2017/09/candi-borobudur.jpg", "7K7FQACA-Ws"},
            {"Maha Vihara Mojopahit", "Patung Budhha Tidur yang terdapat di Maha Vihara Mojopahit yang berwarna emas menggambarkan wafatnya Siddharta Gautama. Patung ini dibangun menghadap ke arah Selatan, yang mana adalah kiblat umat Buddha. Disekitar patung Buddha Tidur terdapat pagar berwarna emas sebagai pembatas untuk pengunjung yang ingin mengabadikan momen. Hal itu sebagai bentuk menjaga kesakralan dari patung Buddha Tidur sendiri, karena Maha Vihara juga menjadi rumah ibadah masyarakat Buddha.", "Mojokerto", "1987", "132 Meter", "https://thumb.viva.co.id/media/frontend/thumbs3/2018/05/09/5af2b467d1606-patung-buddha-tidur-di-maha-vihara-mojopahit-trowulan-mojokerto_663_372.jpg", "nh2AeqTygHk"},
            {"Klenteng Kwan Sing Bio", "Klenteng Kwan Sing Bio adalah rumah ibadah bagi penganut agama Buddha, Tao, dan Konghucu atau yang disebut dengan ajaran Tri Dharma. Bangunan Klenteng Kwan Sing Bio dibagi menjadi tiga bagian. Bagian pertama berfungsi sebagai tempat pembakaran hio. Bagian kedua atau bagian tengah digunakan sebagai tempat sembahyang serta meletakkan buah-buah untuk persembahan. Sementara di bagian ketiga atau bagian belakang gedung terdapat patung Dewa Kwan Kong dan patung lain yang dianggap keramat.", "Tuban", "1773", " 5 Hektar", "https://ik.imagekit.io/tvlk/blog/2021/04/Klenteng-Kwan-Sing-Bio-shutterstock_1770241313-1024x682.jpeg", "pOTiBix4_qg"},
            {"Candi Mendut", "Arsitektur Candi Mendut dipenuhi dengan relief-relief bercorak Buddhis, termasuk ukiran-ukiran yang menggambarkan makhluk-makhluk kahyangan berupa dewata gandarwa dan apsara atau bidadari, dua ekor kera dan seekor garuda serta relief Boddhisatva di antaranya Avalokiteśvara, Maitreya, Vajrapāṇi dan Manjuśri. Di dalam induk candi terdapat tiga buah arca Buddha besar yaitu Dhyani Buddha Wairocana dengan sikap tangan (mudra) dharmacakramudra yang kiri dan kanannya diapit oleh arca Avalokiteśvara (Padmapāņi) dan sebelah kanan arca Vajrapāņi." ,"Magelang", "824 Masehi", "13,7 Meter", "https://ik.imagekit.io/tvlk/blog/2021/01/Candi-Mendut-shutterstock_459560953-1024x768.jpeg", "4lOYVxrY1BM"}
    };

    public static ArrayList<ModelTempatBersejarah> ambilData(){
        ArrayList<ModelTempatBersejarah> dataTempatBersejaraha = new ArrayList<>();
        for (String[] varData : data){
            ModelTempatBersejarah model = new ModelTempatBersejarah();
            model.setNamaTempat(varData[0]);
            model.setDeskripsi(varData[1]);
            model.setKota(varData[2]);
            model.setTglDibangun(varData[3]);
            model.setLuas(varData[4]);
            model.setFoto(varData[5]);
            model.setVideoId(varData[6]);

            dataTempatBersejaraha.add(model);
        }
        return dataTempatBersejaraha;
    }
}
