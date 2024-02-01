package com.melky.myapplication;

import java.util.ArrayList;

public class DataProvider {
    public static ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category(0, "Appetizer", R.drawable.ap));
        categories.add(new Category(1, "Minuman", R.drawable.minuman));
        categories.add(new Category(2, "Dessert", R.drawable.g));
        categories.add(new Category(3, "Main Course", R.drawable.j));
        categories.add(new Category(4, "Side Dish", R.drawable.img_side_dish));

        return categories;
    }

    public static ArrayList<Recipe> getFavoriteRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Martabak Serabi", R.drawable.photo, getIngredients(0), getSteps(0)));
        recipes.add(new Recipe("Kroket", R.drawable.kroket, getIngredients(1), getSteps(1)));
        recipes.add(new Recipe("Pasta Lasagna", R.drawable.img_pasta_lasagna, getIngredients(2), getSteps(2)));
        recipes.add(new Recipe("Martabak telur", R.drawable.images_martabaktelur, getIngredients(3), getSteps(3)));
        recipes.add(new Recipe("Bolognese Mac and Cheese", R.drawable.img_bolognese_mac_and_cheese, getIngredients(4), getSteps(4)));
        return recipes;
    }

    public static ArrayList<Recipe> getAllRecipes() {
        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe("Martabak serabi", R.drawable.photo, getIngredients(0), getSteps(0)));
        recipes.add(new Recipe("Kroket", R.drawable.kroket, getIngredients(1), getSteps(1)));
        recipes.add(new Recipe("Pasta Lasagna", R.drawable.img_pasta_lasagna, getIngredients(2), getSteps(2)));
        recipes.add(new Recipe("Martabak Telur", R.drawable.images_martabaktelur, getIngredients(3), getSteps(3)));
        recipes.add(new Recipe("Bolognese Mac and Cheese", R.drawable.img_bolognese_mac_and_cheese, getIngredients(4), getSteps(4)));
        recipes.add(new Recipe("Manggo Jelly Milk Ice", R.drawable.img_manggo_jelly_milk_ice, getIngredients(5), getSteps(5)));
        recipes.add(new Recipe("Thai Tea", R.drawable.img_thai_tea, getIngredients(6), getSteps(6)));
        recipes.add(new Recipe("Kopi Susu Gula Aren", R.drawable.img_kopi_susu_gula_aren, getIngredients(7), getSteps(7)));
        recipes.add(new Recipe("Iced Matcha Boba Latte", R.drawable.img_iced_matcha_boba_latte, getIngredients(8), getSteps(8)));
        recipes.add(new Recipe("Taro Milk Tea", R.drawable.img_taro_milk_tea, getIngredients(9), getSteps(9)));
        recipes.add(new Recipe("Pancake Mangga", R.drawable.img_pancake_mangga, getIngredients(10), getSteps(10)));
        recipes.add(new Recipe("Puding Coklat", R.drawable.img_puding_coklat, getIngredients(11), getSteps(11)));
        recipes.add(new Recipe("Puding Custard", R.drawable.img_puding_custard, getIngredients(12), getSteps(12)));
        recipes.add(new Recipe("Oreo Dessert Cup", R.drawable.img_oreo_dessert_cup, getIngredients(13), getSteps(13)));
        recipes.add(new Recipe("Coklat Karamel Puding Cake", R.drawable.img_coklat_karamel_puding_cake, getIngredients(14), getSteps(14)));
        recipes.add(new Recipe("Chawanmushi", R.drawable.img_chawanmushi, getIngredients(15), getSteps(15)));
        recipes.add(new Recipe("Agedashi Tofu", R.drawable.img_agedashi_tofu, getIngredients(16), getSteps(16)));
        recipes.add(new Recipe("Karai Edamame", R.drawable.img_karai_edamame, getIngredients(17), getSteps(17)));
        recipes.add(new Recipe("Nasu No Miso Yaki", R.drawable.img_nasu_no_miso_yaki, getIngredients(18), getSteps(18)));
        recipes.add(new Recipe("Tsukune", R.drawable.img_tsukune, getIngredients(19), getSteps(19)));
        recipes.add(new Recipe("Lyonnaise Potatoes", R.drawable.img_lyonnaise_potatoes, getIngredients(20), getSteps(20)));
        recipes.add(new Recipe("Bayam Stew with Anchovy Powder", R.drawable.img_bayam_stew_with_anchovy_powder, getIngredients(21), getSteps(21)));
        recipes.add(new Recipe("Tumis Wortel Buncis Jagung", R.drawable.img_tumis_wortel_buncis_jagung, getIngredients(22), getSteps(22)));
        recipes.add(new Recipe("Baked Potato Wedges", R.drawable.img_baked_potato_wedges, getIngredients(23), getSteps(23)));
        recipes.add(new Recipe("Chicken Parmigiana", R.drawable.img_chicken_parmigiana, getIngredients(24), getSteps(24)));
        return recipes;
    }

    public static ArrayList<Recipe> getRecipes(int id) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        if (id == 0) {
            recipes.add(new Recipe("Martabak Serabi", R.drawable.photo,  getIngredients(0), getSteps(0)));
            recipes.add(new Recipe("Kroket", R.drawable.kroket,  getIngredients(1), getSteps(1)));
            recipes.add(new Recipe("Pasta Lasagna", R.drawable.img_pasta_lasagna,  getIngredients(2), getSteps(2)));
            recipes.add(new Recipe("Martabak telur", R.drawable.images_martabaktelur,  getIngredients(3), getSteps(3)));
            recipes.add(new Recipe("Bolognese Mac and Cheese", R.drawable.img_bolognese_mac_and_cheese,  getIngredients(4), getSteps(4)));
        } else if (id == 1) {
            recipes.add(new Recipe("Manggo Jelly Milk Ice", R.drawable.img_manggo_jelly_milk_ice,  getIngredients(5), getSteps(5)));
            recipes.add(new Recipe("Thai Tea", R.drawable.img_thai_tea,  getIngredients(6), getSteps(6)));
            recipes.add(new Recipe("Kopi Susu Gula Aren", R.drawable.img_kopi_susu_gula_aren,  getIngredients(7), getSteps(7)));
            recipes.add(new Recipe("Iced Matcha Boba Latte", R.drawable.img_iced_matcha_boba_latte,  getIngredients(8), getSteps(8)));
            recipes.add(new Recipe("Taro Milk Tea", R.drawable.img_taro_milk_tea,  getIngredients(9), getSteps(9)));
        } else if (id == 2) {
            recipes.add(new Recipe("Pancake Mangga", R.drawable.img_pancake_mangga,  getIngredients(10), getSteps(10)));
            recipes.add(new Recipe("Puding Coklat", R.drawable.img_puding_coklat,  getIngredients(11), getSteps(11)));
            recipes.add(new Recipe("Puding Custard", R.drawable.img_puding_custard,  getIngredients(12), getSteps(12)));
            recipes.add(new Recipe("Oreo Dessert Cup", R.drawable.img_oreo_dessert_cup,  getIngredients(13), getSteps(13)));
            recipes.add(new Recipe("Coklat Karamel Puding Cake", R.drawable.img_coklat_karamel_puding_cake, getIngredients(14), getSteps(14)));
        } else if (id == 3) {
            recipes.add(new Recipe("Chawanmushi", R.drawable.img_chawanmushi, getIngredients(15), getSteps(15)));
            recipes.add(new Recipe("Agedashi Tofu", R.drawable.img_agedashi_tofu, getIngredients(16), getSteps(16)));
            recipes.add(new Recipe("Karai Edamame", R.drawable.img_karai_edamame,  getIngredients(17), getSteps(17)));
            recipes.add(new Recipe("Nasu No Miso Yaki", R.drawable.img_nasu_no_miso_yaki,  getIngredients(18), getSteps(18)));
            recipes.add(new Recipe("Tsukune", R.drawable.img_tsukune,  getIngredients(19), getSteps(19)));
        } else if (id == 4) {
            recipes.add(new Recipe("Lyonnaise Potatoes", R.drawable.img_lyonnaise_potatoes,  getIngredients(20), getSteps(20)));
            recipes.add(new Recipe("Bayam Stew with Anchovy Powder", R.drawable.img_bayam_stew_with_anchovy_powder, getIngredients(21), getSteps(21)));
            recipes.add(new Recipe("Tumis Wortel Buncis Jagung", R.drawable.img_tumis_wortel_buncis_jagung, getIngredients(22), getSteps(22)));
            recipes.add(new Recipe("Baked Potato Wedges", R.drawable.img_baked_potato_wedges,  getIngredients(23), getSteps(23)));
            recipes.add(new Recipe("Chicken Parmigiana", R.drawable.img_chicken_parmigiana, getIngredients(24), getSteps(24)));
        }

        return recipes;
    }

    private static ArrayList<String> getIngredients(int index) {
        ArrayList<String> ingredients = new ArrayList<>();
        if (index == 0) {
            ingredients.add("140 gr tepung terigu ");
            ingredients.add("60 gr tepung beras");
            ingredients.add("70 gr gula pasir");
            ingredients.add("200 ml air");
            ingredients.add("2 butir telur");
            ingredients.add("1/2 sdt baking powder");
            ingredients.add("1/4 sdt baking soda");
            ingredients.add("1/4 sdt garam");
            ingredients.add("Pasta pandan");
            ingredients.add("Pasta coklat");
            ingredients.add(" Toping(coklat dan keju");
        } else if (index == 1) {
            ingredients.add("300gr kentang rebus");
            ingredients.add("30gr susu bubuk");
            ingredients.add("1 kuning telur");
            ingredients.add("3/4 sdt garam");
            ingredients.add("1/8 sdt merica bubuk");
            ingredients.add("1/2 sdt pala bubuk");
            ingredients.add("1 sdt margarin");
            ingredients.add("100 gr tepung roti kasar");
            ingredients.add("5 buah hati ayam,rebus.");
            ingredients.add("1 lembar daun salam");
            ingredients.add("1cm potongan lengkuas,haluskan");
            ingredients.add("3/4 sdt garam");
            ingredients.add("1 sdt gula palem");
            ingredients.add("250 ml santan");
            ingredients.add("500ml minyak goreng");
            ingredients.add("2 buah kemiri 3 cabai");
            ingredients.add("4 bawang merah");
            ingredients.add("2 siung bawang putih");
            ingredients.add("1/2 sdt terasi");
        } else if (index == 2) {
            ingredients.add("4 lembar pasta lasagna");
            ingredients.add("Keju cheddar, oregano\n");
            ingredients.add("200 gram daging giling");
            ingredients.add("Setengah bawang bombai");
            ingredients.add("Oregano");
            ingredients.add("1 botol kecil saus tomat");
            ingredients.add("1/2 botol kecil saus sambal");
            ingredients.add("Garam dan gula secukupnya");
            ingredients.add("100 ml air");
            ingredients.add("3 butir bawang putih");
            ingredients.add("500 ml susu cair ");
            ingredients.add("Keju mozzarela ");
            ingredients.add("Mentega ");
            ingredients.add("Gula Secukupnya ");
        } else if (index == 3) {
            ingredients.add("250 gr dada ayam fillet");
            ingredients.add("5 butir telur");
            ingredients.add("1 bawang Bombay");
            ingredients.add("1/4 kg daun bawang");
            ingredients.add("1/2 sdt lada bubuk");
            ingredients.add("1 sdt bubuk kari");
            ingredients.add("garam dan kaldu jamur");
        } else if (index == 4) {
            ingredients.add("150-200 gr makaroni kering");
            ingredients.add("Sedikit minyak");
            ingredients.add("Air secukupnya");
            ingredients.add("Saus bolognese");
            ingredients.add("1 sdm mentega");
            ingredients.add("2 sdm tepung terigu ");
            ingredients.add("2 siung bawang putih");
            ingredients.add("Sedikit bawang bombai");
            ingredients.add("Garam,lada dan pala bubuk");
            ingredients.add("300 ml susu cair");
            ingredients.add("100 gram keju parut");
            ingredients.add("Oregano secukupnya");
            ingredients.add("Sosis atau daging asap");
        } else if (index == 5) {
            ingredients.add("nutrijel mangga");
            ingredients.add("800 ml air");
            ingredients.add("5-6 sdm gula pasir");
            ingredients.add("200ml  susu kental manis");
            ingredients.add("2 bungkus Nutrisari sweet mango");
            ingredients.add("1 bungkus Nutrisari sweet orange");
            ingredients.add("1 liter air");
            ingredients.add("6 sdm gula pasir");
            ingredients.add("1 buah mangga");
            ingredients.add("es batu (Pelengkap)");
        } else if (index == 6) {
            ingredients.add("1/2 gelas teh panas");
            ingredients.add("3 sdm bubuk creamer");
            ingredients.add("2 sdm gula pasir");
            ingredients.add("2 sdm susu kental manis putih");
            ingredients.add("Es batu");
        } else if (index == 7) {
            ingredients.add("1 sdm penuh kopi bubuk");
            ingredients.add("150 ml air mendidih");
            ingredients.add("50 gr gula aren");
            ingredients.add("50 ml air");
            ingredients.add("100 ml susu UHT");
            ingredients.add("es batu");
        } else if (index == 8) {
            ingredients.add("2 sachet matcha latte bubuk");
            ingredients.add("dan tambahkan 50ml air panas,");
            ingredients.add("aduk tercampur rata,");
            ingredients.add("tambahkan 40 ml air putih.");
            ingredients.add("1/8 sdt pasta greentea");
            ingredients.add("10 ml cooking cream");
            ingredients.add("120 ml susu UHT putih");
            ingredients.add("Es batu secukupnya");
        } else if (index == 9) {
            ingredients.add("70 gram bubuk taro");
            ingredients.add("180 ml air panas");
            ingredients.add("2-3 sendok creamer");
            ingredients.add("2-4 sendok gula cair");
            ingredients.add("60 gram es batu");
        } else if (index == 10) {
            ingredients.add("125 gr tepung terigu");
            ingredients.add("1 butir telur ayam");
            ingredients.add("1/4 sdt garam");
            ingredients.add("275 ml susu cair");
        } else if (index == 11) {
            ingredients.add("800 ml susu cair ");
            ingredients.add("1 bungkus agar-agar warna putih ");
            ingredients.add("150 gr gula pasir ");
            ingredients.add("25 gr bubuk cokelat warna hitam ");
            ingredients.add("100 gr dark chocolate compound ");
            ingredients.add("2 butir kuning telur ");
            ingredients.add("800 ml susu cair ");
            ingredients.add("1,5 bungkus agar-agar warna putih");
            ingredients.add("150 gr gula pasir ");
            ingredients.add("25 gr coklat bubuk ");
            ingredients.add("50 gr dark chocolate compound");
            ingredients.add("2 kuning telur ");
            ingredients.add("800 ml susu cair ");
            ingredients.add("1,5 bks agar-agar warna putih ");
            ingredients.add("150 gr gula pasir ");
            ingredients.add("100 gr white chocolate compound ");
            ingredients.add("2 kuning telur ");
            ingredients.add("500 ml susu cair (Vla)");
            ingredients.add("80 gr gula pasir (Vla)");
            ingredients.add("40 gr tepung maizena (Vla)");
            ingredients.add("10 sdm air (Vla)");
            ingredients.add("2 sdt rum (Vla)");
        } else if (index == 12) {
            ingredients.add("1 bungkus agar-agar (7 gr)");
            ingredients.add("800 cc air");
            ingredients.add("1 liter susu cair");
            ingredients.add("8 sdm tepung custard");
            ingredients.add("20 sdm gula pasir ");
            ingredients.add("4 butir kuning telur, kocok lepas");
            ingredients.add("1/2 sdt garam");
            ingredients.add("1 sdt essence vanila");
            ingredients.add("2 sdt rum ");
        } else if (index == 13) {
            ingredients.add("135 gr biskuit Oreo");
            ingredients.add("2 sdm mentega cair");
            ingredients.add("500 ml susu cair full cream ");
            ingredients.add("2 sdm maizena ");
            ingredients.add("100 gr keju cheddar parut ");
            ingredients.add("5 sdm gula pasir ");
            ingredients.add("1 sdt ekstrak vanila ");
            ingredients.add("160 ml susu cair full cream ");
            ingredients.add("120 gr dark cooking chocolate ");
        } else if (index == 14) {
            ingredients.add("4 telur utuh ");
            ingredients.add("65 gr gula ");
            ingredients.add("1 sdt SP ");
            ingredients.add("55 gr tepung protein rendah ");
            ingredients.add("10 gr susu bubuk");
            ingredients.add("10 gr maizena ");
            ingredients.add("85 gr butter / margarine ");
            ingredients.add("150 gr gula pasir ");
            ingredients.add("600 ml susu UHT ");
            ingredients.add("2 kuning telur");
            ingredients.add("Sejimpit garam ");
            ingredients.add("10 gr bubuk agar-agar ");
            ingredients.add("Vanila ekstrak ");
            ingredients.add("60 gr White cooking chocolate ");
            ingredients.add("150 gr gula pasir ");
            ingredients.add("600 ml susu UHT ");
            ingredients.add("15 gr bubuk coklat ");
            ingredients.add("2 kuning telur ");
            ingredients.add("Sejimpit garam ");
            ingredients.add("10 gr bubuk agar-agar ");
            ingredients.add("60 gr Dark cooking chocolate");
        } else if (index == 15) {
            ingredients.add("2 buah jamur shiitake kering");
            ingredients.add("3 sendok makan air");
            ingredients.add("½ cup kaldu dashi");
            ingredients.add("½ paha ayam, diambil dagingnya saja");
            ingredients.add("4 buah udang");
            ingredients.add("1 sendok makan sake ");
            ingredients.add("1 buah telur (pilih yang besar)");
            ingredients.add("Jamur shimeji secukupnya");
            ingredients.add("4 iris kamaboko");
            ingredients.add("Satu buah daun bawang");
        } else if (index == 16) {
            ingredients.add("1 buah tahu sutera");
            ingredients.add("4 sendok tepung kantang");
            ingredients.add("4 cup minyak sayur");
        } else if (index == 17) {
            ingredients.add("¼ kg Kedelai edamame");
            ingredients.add("1 sendok minyak sayur");
            ingredients.add("2 siung bawang putih");
            ingredients.add("2 sendok pasta cabai");
            ingredients.add("1 sendok makan miso");
        } else if (index == 18) {
            ingredients.add("2 sendok makan miso");
            ingredients.add("1 sendok makan gula");
            ingredients.add("1 sendok teh mirin");
            ingredients.add("¼ sendok teh cabai bubuk");
            ingredients.add("3 buah terong ungu");
            ingredients.add("1 sendok makan wijen");
            ingredients.add("1 batang daun bawang");
            ingredients.add("3 batang cilantro, daun saja");
            ingredients.add("Minyak goreng");
        } else if (index == 19) {
            ingredients.add("½ kg daging ayam cincang");
            ingredients.add("1 sendok makan minyak wijen");
            ingredients.add("1 sendok makan miso");
            ingredients.add("10 buah daun perilla");
            ingredients.add("4 batang daun bawang");
            ingredients.add("Garam");
            ingredients.add("½ cup kecap manis");
            ingredients.add("½ cup mirin ");
            ingredients.add("¼ cup sake ");
            ingredients.add("¼ cup air ");
            ingredients.add("2 sendok gula merah ");
        } else if (index == 20) {
            ingredients.add("1 buah kentang");
            ingredients.add("15 gr margarin");
            ingredients.add("15 gr chop bombay");
            ingredients.add("garam");
            ingredients.add("lada bubuk");
            ingredients.add("peterseli kering");
        } else if (index == 21) {
            ingredients.add("200 gr bayam");
            ingredients.add("300 ml air");
            ingredients.add("1 sdm anchovy powder");
            ingredients.add("1/2 sdt lada bubuk");
            ingredients.add("1 sdt garam");
        } else if (index == 22) {
            ingredients.add("1 bonggol jagung");
            ingredients.add("1 buah wortel import");
            ingredients.add("1 bungkus buncis");
            ingredients.add("1 kotak kecil mentega");
            ingredients.add("Sedikit gula,garam,merica");
        } else if (index == 23) {
            ingredients.add("2 buah kentang");
            ingredients.add("2 sdm olive oil");
            ingredients.add("Garam");
            ingredients.add("Merica");
            ingredients.add("Dry Oregano");
            ingredients.add("Dry Parsley");
            ingredients.add("Dry Basil");
            ingredients.add("Keju parmesan");
        } else if (index == 24) {
            ingredients.add("150 gr Paha ayam");
            ingredients.add("1 pcs Telur");
            ingredients.add("100 gr Tepung kentucky");
            ingredients.add("100 gr Kentang");
            ingredients.add("10 gr PALMIA MARGARIN SERBAGUNA");
            ingredients.add("55 ml Susu segar");
            ingredients.add("3 gr Garam");
            ingredients.add("3 gr Merica");
            ingredients.add("50 gr Tomato concase");
            ingredients.add("30 gr Keju mozarella");
            ingredients.add("10 gr Jagung serut");
            ingredients.add("10 gr Wortel");
            ingredients.add("10 gr Buncis");
        }
        return ingredients;
    }

    private static ArrayList<String> getSteps(int index) {
        ArrayList<String> steps = new ArrayList<>();
        if (index == 0) {
            steps.add("Campur jadi satu tepung terigu.");
            steps.add("tepung beras,gula,dan garam.");
            steps.add("Tuang air sedikit demi sedikit  ");
            steps.add("hingga rata ");
            steps.add("Saring jika perlu.");
            steps.add("Tambahkan telur, lalu aduk ");
            steps.add("Masuk baking powder dan soda kue");
            steps.add("aduk hingga rata");
            steps.add("Bagi adonan menjadi 3 bagian.");
            steps.add("1 bagian biarkan putih.");
            steps.add("2 bagian tambahkan pasta");
            steps.add("baik itu pandan maupun coklat");
            steps.add("Panaskan teflon. Tuang adonan. ");
            steps.add("Tunggu hingga muncul gelembung ");
            steps.add("baru tutup teflonnya.  ");
            steps.add("permukaan kue sudah tidak lengket. ");
            steps.add("berarti kue sudah matang. ");
            steps.add("Beri toping sesuai selera... ");
         } else if (index == 1) {
            steps.add("giling semua bahan hingga lembut");
            steps.add("Panaskan minyak dalam wajan.");
            steps.add("masukkan bumbu halus, daun salam");
            steps.add("Aduk rata hingga harum.");
            steps.add("Tambahkan hati ayam lalu aduk");
            steps.add("tambahkan gula pasir dan gula palem.");
            steps.add("Tuang santan sedikit ke dalam wajan.");
            steps.add("Masukkan kentang tumbuk, susu bubuk.");
            steps.add("kuning telur, garam, merica bubuk");
            steps.add("pala bubuk, dan margarin,");
            steps.add("Haluskan adonan dengan tangan");
            steps.add("Ambil 25 gram adonan kulit ");
            steps.add("ratakan dengan telapak tangan.");
            steps.add("Taruh 1 sendok makan isian");
            steps.add("gulung adonan maju mundur");
            steps.add("Sebarkan tepung roti ke nampan.");
            steps.add("Panaskan minyak dalam wajan.");
            steps.add("Tambahkan kroket ke dalam wajan. ");
            steps.add("Setelah warna menjadi cokelat keemasan");
            steps.add("Siap di hidangkan");
        } else if (index == 2) {
            steps.add("Tumis bawang putih, daging,");
            steps.add("bawang bombai, dan garam");
            steps.add("Tambahkan saus tomat.");
            steps.add("gula, oregano, dan air.");
            steps.add("Masak hingga mengental.");
            steps.add("panaskan mentega, susu,keju.");
            steps.add("sedikit gula. Aduk hingga kental.");
            steps.add("Rebus pasta lasagna, tiriskan.");
            steps.add("Susun pasta, saus merah.");
            steps.add("Ulangi hingga lapisan atas saus. ");
            steps.add("Taburkan keju parut dan oregano.");
            steps.add("Panggang dalam oven panas.");
            steps.add("hingga kecoklatan. Sajikan.");
        } else if (index == 3) {
            steps.add("Campur semua bahan jadi satu aduk");
            steps.add("taruh kulit martabak, taruh 1 sdk sayur.");
            steps.add("bahan isi, beri suwiran ayam");
            steps.add("lipat amplop, angkat dan sisihkan.");
            steps.add("Panaskan minyak, goreng martabak. ");
            steps.add("Angkat dan sajikan di piring saji.");
        } else if (index == 4) {
            steps.add("Rebus macaroni");
            steps.add("angkat dan tiriskan");
            steps.add("Buat saus, panaskan mentega");
            steps.add("tambah bawang putih, bombai");
            steps.add("Lalu tambahkan sosis.");
            steps.add("tambahkan tepung terigu, aduk.");
            steps.add("ditambahkan susu cair sedikit.");
            steps.add("tambah garam,lada,pala,oregano.");
            steps.add("pala,oregano.");
            steps.add("masukkan keju parut dan macaroni");
            steps.add("aduk rata.");
            steps.add("Masak hingga keju meleleh.");
            steps.add("Tuang makaroni ke mangkuk.");
            steps.add("Sajikan hangat.");
        } else if (index == 5) {
            steps.add("JELLY: campur semua bahan jelly.");
            steps.add("masak sampai mendidih.");
            steps.add("masukkan kulkas.");
            steps.add("potong-potong bentuk dadu.");
            steps.add("SUSU MANGGA: campur susu.");
            steps.add("gula dan air lalu masak.");
            steps.add("baru masukkan Nutrisari.");
            steps.add("aduk rata, biarkan dingin.");
            steps.add("masukkan jelly dan mangga.");
            steps.add("Lalu tuang susu mangga ke gelas.");
            steps.add("beri es batu secukupnya.");
            steps.add("Nikmati segarnya es susu mangga.");
        } else if (index == 6) {
            steps.add("Aduk bubuk creamer dan gula.");
            steps.add("didalam teh panas.");
            steps.add("lalu tambahkan susu.");
            steps.add("tambahkan es batu sesuai selera.");
            steps.add("sajikan dingin.");
        } else if (index == 7) {
            steps.add("Masak gula aren hingga mendidih.");
            steps.add("Seduh kopi dengan air mendidih.");
            steps.add("tunggu hingga hangat.");
            steps.add("tuang 4 sdm cairan gula.");
            steps.add(" masukkan es batu.");
            steps.add("tuang susu lanjut tuang kopi.");
            steps.add("Aduk, dan sajikan");
        } else if (index == 8) {
            steps.add("Siapkan gelas bening kaca.");
            steps.add("Ambil 2 sdm penuh boba.");
            steps.add("Tambah es batu 1/2 gelas.");
            steps.add("Tambahkan lagi es batu. ");
            steps.add("lalu tuang matcha latte perlahan.");
            steps.add("Tambahkan lagi es batu.");
            steps.add("dan hias dgn boba atasnya.");
            steps.add("Setelah boba lalu beri es batu.");
            steps.add("tuang matcha latte dahulu.");
            steps.add("baru bahan susunya.");
            steps.add("Siap disajikan.");
        } else if (index == 9) {
            steps.add("Larutkan bubuk taro ke air panas.");
            steps.add("Tuangkan ke dalam gelas shaker.");
            steps.add("Tambah creamer, es batu,dan gula.");
            steps.add("Kocok hingga semua tercampuran");
            steps.add("Taro milk tea siap disajikan di gelas.");
            steps.add("Kamu bisa menambahkan topping.");
            steps.add("Sajikan dalam gelas saji.");
        } else if (index == 10) {
            steps.add("Campur tepung terigu,garam,telur.");
            steps.add("Tambahkan susu cair perlahan.");
            steps.add("sambil diaduk disaring.");
            steps.add("Dadar di tempat penggoreng.");
            steps.add("Isi kulit pancake dengan whipping,");
            steps.add("cream dan mangga.");
            steps.add("lipat seperti amplop.");
            steps.add("Simpan pancake di kulkas.");
            steps.add("sajikan.");
        } else if (index == 11) {
            steps.add("Siapkan loyang kotak ukuran 22x7 cm.");
            steps.add("campur semua bahan ke panci.");
            steps.add("aduk dengan whisk hingga rata.");
            steps.add("masak hingga mendidih.");
            steps.add("Tuang ke dalam loyang. Sisihkan.");
            steps.add("Masukkan ke dalam kulkas.");
            steps.add("Masukkan susu cair dan gula pasir.");
            steps.add("masak hingga mendidih.");
            steps.add("Larutkan maizena sedikit air.");
            steps.add("kemudian tuang ke dalam panci.");
            steps.add("Aduk cepat hingga meletup-letup.");
            steps.add("saring supaya lembut.");
            steps.add("Sajikan.");
        } else if (index == 12) {
            steps.add("Campur semua bahan ke panci.");
            steps.add("Panaskan di atas kompor.");
            steps.add("sambil terus diaduk.");
            steps.add("Matikan api dan tambahkan rum.");
            steps.add("aduk terus sampai agak dingin.");
            steps.add("Tuang dalam cetakan biarkan.");
            steps.add("Siap dihidangkan.");
        } else if (index == 13) {
            steps.add("Hancurkan kasar biskuit oreo.");
            steps.add("campur dengan mentega cair.");
            steps.add("dan letakkan di bagian dasar cup");
            steps.add("Campur maizena dengan susu.");
            steps.add("aduk dengan whisk hingga rata.");
            steps.add("dan masukkan keju parut.");
            steps.add("diaduk hingga mengental");
            steps.add("aduk rata, tuang sisa susu");
            steps.add("Masak susu cair dan dcc.");
            steps.add("di api kecil hingga semua coklat");
            steps.add("meleleh, tuang di atas lapisan keju ");
            steps.add("masukkan dalam kulkas, sajikan");
        } else if (index == 14) {
            steps.add("Panaskan oven hingga 170°C. ");
            steps.add("Kocok A hingga mengembang");
            steps.add("masukkan B secara bertahap");
            steps.add("matikan mixer, masukkan C, aduk");
            steps.add("Tuang adonan ke loyang.");
            steps.add(" panggang selama 25 menit.");
            steps.add("Setelah matang, dinginkan");
            steps.add("dan potong sesuai loyang.");
            steps.add("Panaskan gula hingga karamel.");
            steps.add("sisihkan. Campur 300 ml susu,");
            steps.add("masak gula karamel hingga larut..");
            steps.add("Kocok kuning telur.");
            steps.add("agar-agar, garam, dan vanila.");
            steps.add("Masak hingga matang. Sisihkan.");
            steps.add("Alasi loyang dengan baking paper.");
            steps.add("masukkan cake, tuang agar-agar.");
            steps.add("tunggu hingga set. Tuang puding.");
            steps.add("Campur susu, gula, bubuk, garam.");
            steps.add("Kocok kuning telur, masukkan.");
            steps.add("Masak, tambahkan cokelat bubuk.");
            steps.add("Aduk hingga larut.");
            steps.add("Masak hingga berbuih kecil.");
            steps.add("Sajikan");
        } else if (index == 15) {
            steps.add("Rendam jamur shiitake kering.");
            steps.add("setelah mengembang pisah air.");
            steps.add("Campur air dengan kaldu dashi.");
            steps.add("Rendam ayam telah dipotong.");
            steps.add("udang ke sake salam 15 menit.");
            steps.add("agar bau amisnya hilang.");
            steps.add("Pecahkan telur ke mangkok.");
            steps.add("Masukkan kaldu dashi dan bumbu.");
            steps.add("Aduk sampai tercampur rata.");
            steps.add("Panaskan air dalam panci.");
            steps.add("sampai setinggi setengah cup ");
            steps.add("Masukkan bahan-bahan ke cup.");
            steps.add("lalu siram dengan kocokan telur.");
            steps.add("Lalu tutup.");
            steps.add("Letakkan cup berisi bahan.");
            steps.add("dalam panci berisi air panas.");
            steps.add("biarkan sampai 30menit api kecil.");
            steps.add("Jaga air agar tidak terlalu panas");
            steps.add("Jika telah matang angkat.");
            steps.add("sajikan dengan topping.");
        } else if (index == 16) {
            steps.add("Keringkan tahu 15 menit.");
            steps.add("Iris iris daun bawang dan daikon.");
            steps.add("Masukkan kaldu dashi,kecap, mirin.");
            steps.add("ke dalam panci kecil.");
            steps.add("Biarkan sampai mendidih");
            steps.add("Potong tahu menjadi 8 bagian.");
            steps.add("lalu selimuti dgn tepung kentang");
            steps.add("dan goreng dengan minyak panas");
            steps.add("sampai berwarna kecokelatan.");
            steps.add("Tata tahu ke dalam piring.");
            steps.add("lalu tuang saus diatasnya..");
            steps.add("Taburi dengan topping.");
        } else if (index == 17) {
            steps.add("Siapkan edamame frozen");
            steps.add("dipanaskan ke dalam wadah");
            steps.add("menumis bawang putih,pastacabai");
            steps.add("Lalu masukkan miso.");
            steps.add("Angkat bumbu dan campurkan.");
            steps.add("ke wadah edamame.");
            steps.add("Mix sampai merata dan sajikan");
        } else if (index == 18) {
            steps.add("Campur miso, mirin, gula, cabai.");
            steps.add("Cuci bersih terong lalu potong.");
            steps.add("buat guratan di setiap potong.");
            steps.add("agar bumbu meresap.");
            steps.add("Siapkan broiler.");
            steps.add("beri minyak sedikit.");
            steps.add("Panggang terong lumuri bumbu.");
            steps.add("secara merata, bolak balik.");
            steps.add("sampai sisi terong terlihat cokelat");
            steps.add("Angkat, sajikan");
            steps.add(" dengan taburan daun bawang.");
            steps.add("cilantro dan wijen.");
            steps.add("Sajikan");
        } else if (index == 19) {
            steps.add("Siapkan bahan dan tusuk sate.");
            steps.add("Iris daun bawang dan perilla tipis");
            steps.add("Panaskan wajan.");
            steps.add("tumis setengah bagian daging.");
            steps.add("Campurkan daging ayam");
            steps.add("matang dengan yang mentah.");
            steps.add("Tambah minyak wijen, miso.");
            steps.add("Uleni hingga merata.");
            steps.add("Tambahkan lagi dedaunan. ");
            steps.add("yang telah di iris tipis dan uleni.");
            steps.add("sampai banar-benar tercampur semua.");
            steps.add("Ambil satu sendok besar bahan.");
            steps.add("lalu bentuk memanjang.");
            steps.add("Tusuk bagian tengah.");
            steps.add("dengan tusuk sate.");
            steps.add("Siapkan pemanggang. ");
            steps.add("jejer tsuk ke pemanggang ");
            steps.add("taburi dengan garam.");
            steps.add("Panggang sampai kedua cokelat.");
            steps.add("Angkat dan sajikan.");
        } else if (index == 20) {
            steps.add("Rebus kentang beserta kulitnya.");
            steps.add("Potong bulat dengan teknik sliced.");
            steps.add("Panaskan margarine.");
            steps.add("masukan kentang dan chop onion.");
            steps.add("Bumbui dengan garam,dan lada.");
            steps.add("Masak sampai kentang kecoklatan.");
            steps.add("dan sajikan.");
        } else if (index == 21) {
            steps.add("Cuci bersih bayam.");
            steps.add("Panaskan Air dan jika mendidih.");
            steps.add("masukkan bumbunya. Aduk.");
            steps.add("Setelah bayam layu dan empuk.");
            steps.add("angkat lalu tiriskan.");
            steps.add("Setelah dingin potong2.");
            steps.add("Dan bisa dihidangkan.");
        } else if (index == 22) {
            steps.add("Pipil jagung, potong buncis.");
            steps.add(" dan wortel potong korek api.");
            steps.add("Siapkan air, masuk jagung, wortel.");
            steps.add("tunggu baru masukkan buncis.");
            steps.add("Dan aduk 10x, matikan api.");
            steps.add("Buang airnya lalu sisihkan.");
            steps.add("Beri mentega di wajan.");
            steps.add("masuk bahan yg sudah di rebus.");
            steps.add("beri gula, garam dan merica.");
            steps.add("Aduk sebentar sekitar 1 menit.");
            steps.add("Simpan di wadah tertutup.");
            steps.add("Sajikan");
        } else if (index == 23) {
            steps.add("Potong kentang, cuci bersih");
            steps.add("Tata kentang pada pinggan tahan.");
            steps.add("taburi olive oil, garam, merica.");
            steps.add("oregano, basil dan parsley.");
            steps.add("Panggang suhu 200 derajat.");
            steps.add("selama kurang lebih 45 menit.");
            steps.add("Setelah matang angkat.");
            steps.add("Sajikan.");
        } else if (index == 24) {
            steps.add("Bumbui paha ayam.");
            steps.add("lalu lumuri dengan telur");
            steps.add("masukkan dalam tepung.");
            steps.add("kemudian goreng hingga matang.");
            steps.add("Buat kentang tumbuk.");
            steps.add("PALMIA MARGARIN SERBAGUNA,");
            steps.add("masukkan susu segar, garam, merica,");
            steps.add("pala bubuk dan terakhir kentang.");
            steps.add("Tumis bawang dengan PALMIA.");
            steps.add("tumis hingga merata.");
            steps.add("lalu masukkan campuran sayuran.");
            steps.add("Kemudian siapkan tomat concase.");
            steps.add("Penyajian.");
        }
        return steps;
    }
}
