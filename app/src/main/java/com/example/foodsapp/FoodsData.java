package com.example.foodsapp;

import java.util.ArrayList;
import java.util.Date;

public class FoodsData {

    public static String[][] data =new String[][]{

            {"Nasi Goreng", "Nasi goreng sendiri adalah makanan berupa nasi yang digoreng bersama kecap dan bumbu lain yang kemudian diaduk-aduk sampai nasi berubah menjadi kecokelatan sebagai tanda kecap telah meresap dan menyebar ke semua nasi. Setelah nasi selesai digoreng, nasi kemudian dituang dalam selembar piring. Untuk memberikan kekayaan rasa, biasanya nasi ditambah dengan isian seperti telur, ayam, kerupuk, irisan mentimun, irisan sosis, ikan asin, dan masih banyak lagi, tergantung selera.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Nasi-Goreng-Khas-Indonesia.jpg"},

            {"Nasi Uduk", "Nasi uduk biasanya dimakan bersama lauk tambahan seperti telur dadar iris, tempe orek, udang goreng, empal, dan bahkan sayur asem atau lalapan. Saat ini nasi uduk telah menyebar ke berbagai daerah sehingga komposisi bahan yang digunakan juga mulai beragam. Tapi nasi uduk yang paling umum disajikan dengan taburan bawang goreng, lauk berupa tahu, tempe, dan ayam goreng, dan sambal kemiri merah ataupun sambal kacang.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Nasi-Uduk-Khas-Indonesia.jpg"},

            {"Nasi Padang", "Mengulas tentang nasi padang maka tak hanya berbicara soal nasi, tetapi juga seluruh lauk pauknya yang rasanya terkenal pedas dan bersantan. Ada berbagai pilihan lauk yang bisa dipilih pada makanan khas Indonesia yang berasal dari Sumatera Barat ini. Mulai dari yang paling umum seperti ayam bakar, ayamg goreng, ikan bakar, ikan goreng, hingga lauk pauk yang juga berasal dari tanah Sumatera, seperti rendang yang paling ternama.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Nasi-Padang-Khas-Indonesia.jpg"},

            {"Ayam Goreng", "Di Indonesia sendiri ayam goreng telah menjadi panganan kesukaan banyak penduduk. Tepung ayam yang renyah yang bertemu dengan cocolan saus sambal atau tomat telah menjadi ciri khas orang Indonesia dalam menyantap ayam goreng. Saat ini bisa ditemukan rumah makan yang menjajakan ayam goreng, mulai dari yang tradisional seperti Kentucky Fried Chicken hingga rumah makan ayam goreng tradisional seperti Ayam Goreng Suharti dan Mbok Berek.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Ayam-Goreng-Khas-Indonesia.jpg"},

            {"Bakmi", "Saat ini bakmi telah diolah dengan bumbu khas nusantara beserta bahan-bahan yang juga mudah ditemui di Indonesia, seperti ayam dan sayuran sawi. Bakmi sendiri dibuat dari bahan utama tepung terigu atau bakmi kuning. Penyajian bakmi biasa dilakukan dalam mangkuk bersama isian, kuah, dan tak lupa sambalnya. Sebagai negara dengan penduduk yang kreatif, bakmi sekarang bisa ditemukan dalam dua bentuk, yakni bakmi kuah dan bakmi goreng.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Bakmi-Khas-Indonesia.jpg"},

            {"Gudeg", "Kekayaan kuliner nusantara bisa ditemukan hampir di setiap kota di Indonesia. Seperti di Yogyakarta, ada makanan khas yang terkenal bernama gudeg. Bahkan, kota Yogyakarta sendiri mendapatkan julukan sebagai Kota Gudeg karena menjadi tempat lahir dari makanan yang sangat familiar di telinga masyarakat Indonesia ini. Gudeg merupakan makanan tradisional yang mempunyai cita rasa manis sebagai ciri khas dari masakan Jawa pada umumnya.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Gudeg-Khas-Indonesia.jpg"},

            {"Rawon", "Rawon adalah menu masakan tradisional khas Indonesia andalan penduduk Jawa Timur yang mempunyai banyak sekali penggemar. Hidangan tradisional bernama rawon ini mempunyai bentuk seperti sup daging dengan kuah yang berwarna cokelat pekat cenderung hitam. Warna kuah pada rawon dihasilkan dari penggunaan bumbu bernama kluwak.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Rawon-Khas-Indonesia.jpg"},

            {"Pecel Lele", "Pecel lele [nama lain: pecak lele] adalah makanan khas Indonesia berbahan dasar ikan yang sejak dulu disukai oleh masyarakat lokal, mulai dari kalangan dewasa, remaja, hingga anak-anak. Pecel lele bisa dengan mudah ditemui di dataran Jawa. Biasanya pecel lele dimakan oleh mereka yang sudah bosan dengan olahan ayam. Pecel atau pecak sendiri merujuk pada sambal yang disertakan pada saat penyajian.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Pecel-Lele-Khas-Indonesia.jpg"},

            {"Opor Ayam", "Opor ayam adalah makanan yang diklaim berasal dari kawasan Jawa Tengah dan Jawa Timur bagian barat. Olahan ayam ini menyajikan ayam yang direbus dengan bumbu kental dari santan bersama tambahan bumbu lain seperti serai, kencur, dan lainnya. Penyajian opor ayam biasa dilakukan dengan ketupat atau lontong, bahkan ada juga yang memakan opor bersama nasi. Tak lupa sebelum menyantap opor ayam orang-orang biasanya menambahkan sambal goreng ke dalamnya.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Opor-Ayam-Khas-Indonesia.jpg"},

            {"Gulai", "Gulai merupakan hidangan berat berbahan utama [yang paling umum] daging ayam. Selain daging ayam, tak jarang dipilih daging hewan lain seperti ikan, kambing, dan sapi untuk membuat gulai. Bahkan, ada juga gulai yang menghidangkan beberapa macam sayuran seperti daun singkong dan nangka muda. Menurut catatan sejarah, gulai adalah makanan khas Indonesia yang berasal dari Sumatera karena dari bumbu dan tampilannya memang identik dengan Pulau Emas.", "https://makananoleholeh.com/wp-content/uploads/2017/07/Gulai-Khas-Indonesia.jpg"}

    };

    public static ArrayList<Food> getListData(){

        ArrayList<Food> list = new ArrayList<>();

        for (String[] aData : data){

            Food food = new Food();
            food.setName(aData[0]);
            food.setDeskripsi(aData[1]);
            food.setFoto(aData[2]);
            list.add(food);

        }

        return list;
    }


}
