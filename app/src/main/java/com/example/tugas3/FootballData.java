package com.example.tugas3;

import java.util.ArrayList;

public class FootballData {
    private static String[] image = new String[] {
            "http://4.bp.blogspot.com/-g2vbsePIoGs/VJ1pVtRis2I/AAAAAAAAAgs/AAfRNW4_GCQ/s1600/Idezia.com%2B-%2BMilan.png",
            "http://1.bp.blogspot.com/-0P5fcGdR7q8/VJ1pdanS0II/AAAAAAAAAhs/79L6j872OHw/s1600/Idezia.com%2B-%2BRoma.png",
            "http://1.bp.blogspot.com/-ya08VMGYT0o/VJ1pNJVIcpI/AAAAAAAAAfs/hiLeAIzYskY/s1600/Idezia.com%2B-%2BFiorentina.png",
            "http://3.bp.blogspot.com/-1smElPm1qFQ/VJ1pNxH6jKI/AAAAAAAAAfw/pFlM5zABN_Q/s1600/Idezia.com%2B-%2BGenoa.png",
            "http://3.bp.blogspot.com/-8gKAVMJwmNI/VJ1pQiG3kGI/AAAAAAAAAgE/twKU8t_W5VU/s1600/Idezia.com%2B-%2BInternazionale.png",
            "http://2.bp.blogspot.com/-vGLlH3-2eZ8/VJ1pRkc2OoI/AAAAAAAAAgQ/HvjHu4bqwk8/s1600/Idezia.com%2B-%2BLazio.png",
            "http://3.bp.blogspot.com/-_n8QRpA7A-c/VJ1pXDW7V1I/AAAAAAAAAg8/sP2OQAQqkKQ/s1600/Idezia.com%2B-%2BNapoli.png",
            "http://4.bp.blogspot.com/-IXOa2BHyPYA/VJ1pXdelhjI/AAAAAAAAAhA/vBH-H5tv2IM/s1600/Idezia.com%2B-%2BParma.png",
            "http://4.bp.blogspot.com/-CXNJ4uMIaWI/VJ1peowJwrI/AAAAAAAAAiA/bAQa9Au6B7I/s1600/Idezia.com%2B-%2BSassuolo.png",
            "http://4.bp.blogspot.com/-Bf4Rdp6etPY/VJ1pgb_9tkI/AAAAAAAAAiY/h_vHPilQTHo/s1600/Idezia.com%2B-%2BTorino.png"};
    private static String[] name = new String[]{
            "AC Milan",
            "AS Roma",
            "Fiorentina",
            "Genoa",
            "Internazionale",
            "Lazio",
            "Napoli",
            "Parma",
            "Sassuolo",
            "Torino"
    };

    private static String[] desc = new String[]{
            "A.C. Milan atau hanya Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih (kadang-kadang hitam), sehingga dijuluki rossoneri (merah-hitam). Milan adalah tim tersukses kedua dalam sejarah persepak bolaan Italia, menjuarai Serie A 18 kali dan Piala Italia 5 kali.",
            "AS Roma, adalah sebuah klub sepak bola Italia yang bermarkas di Roma. Klub ini berlaga di Serie A. Roma telah memenangkan Serie A tiga kali, pertama di 1941-42 kemudian pada 1982-1983 dan sekali lagi pada 2000-01, serta memenangkan sembilan gelar Coppa Italia dan Supercoppa Italiana dua gelar.",
            "Fiorentina adalah klub sepak bola profesional Italia dari Florence, Tuscany. Didirikan pada tahun 1926 (didirikan ulang pada tahun 2002), Fiorentina merupakan klub yang bermain di Serie A Liga Italia.",
            "Genoa sebuah tim sepak bola Italia yang bermain di Serie A, Italia. Bermarkas di Genoa, Liguria, Italia. Didirikan tahun 1893. Klub ini satu-satunya merupakan klub tertua di Italia.",
            "Internazionale adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia. Inter Milan mempunyai julukan sebagai il Nerazzurri (si biru hitam), il Biscone (si ular besar), dan juga La Beneamata (yang tersayang). Klub bermain di Serie A (divisi pertama) sejak tahun 1908, dan pendukung Internazionale disebut Interisti.",
            "Lazio adalah sebuah perkumpulan olahraga profesional Italia yang berbasis di Roma, ibu kota Italia, yang terkenal karena cabang sepak bolanya. Perkumpulan yang didirikan pada 1900 itu bermain di Serie A dan menghabiskan sebagian besar sejarah mereka di level tertinggi. Lazio telah dua kali menjadi juara Italia, tujuh Piala Italia, lima Piala Super Italia, dan masing-masing satu trofi Piala Winners UEFA dan Piala Super UEFA.",
            "Napoli adalah sebuah klub sepak bola Italia yang bermarkas di Napoli, Campania. Klub ini memainkan pertandingan kandangnya di Stadion San Paolo yang berkapasitas 78.210 penonton. Seragam mereka berwarna biru langit, sehingga mereka dijuluki Azzurri (Biru).",
            "Parma adalah sebuah klub sepak bola Italia yang bermarkas di Parma, Emilia-Romagna. Klub ini memainkan pertandingan kandangnya di Stadion Ennio Tardini yang berkapasitas 27.650 penonton. Seragam mereka adalah biru-kuning, sehingga mereka dijuluki Gialloblu (biru-kuning).",
            "Sassuolo adalah sebuah klub sepak bola Italia yang berada di kota Sassuolo, Emilia-Romagna. Pada musim 2012-13, mereka berhasil promosi ke Serie A untuk pertama kalinya sepanjang sejarah. Mereka dijuluki Neroverdi karena seragam mereka yang berwarna hitam-hijau.",
            "Torino merupakan nama klub sepak bola Italia yang bermain di Divisi Utama Serie A. Klub ini didirikan pada tahun 1906 dan bermarkas di kota Torino, Italia."
    };

    public static ArrayList<FootballModel> getListData(){
        FootballModel heroModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            heroModel = new FootballModel();
            heroModel.setImage(image[i]);
            heroModel.setName(name[i]);
            heroModel.setDesc(desc[i]);
            list.add((FootballModel));
        }
        return list;
    }

}
