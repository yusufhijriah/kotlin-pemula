package com.dicoding.lombokspecialfoods.`object`

import com.dicoding.lombokspecialfoods.R
import com.dicoding.lombokspecialfoods.data.Food

object FoodData {

    private val foodNames = arrayOf(
        "Ares",
        "Ayam Rarang",
        "Ayam Taliwang",
        "Bantal",
        "Bebalung",
        "Beberuk Terong",
        "Nasi Balap Puyung",
        "Plecing Kangkung",
        "Poteng Jaje Tujak",
        "Sate Bulayak",
        "Sate Rembiga",
        "Tuak Manis")

    private val foodImages = intArrayOf(R.drawable.ares,
        R.drawable.ayam_rarang,
        R.drawable.ayam_taliwang,
        R.drawable.bantal,
        R.drawable.bebalung,
        R.drawable.beberuk_terong,
        R.drawable.nasi_balap_puyung,
        R.drawable.plecing_kangkung,
        R.drawable.poteng_jaje_tujak,
        R.drawable.sate_bulayak,
        R.drawable.sate_rembiga,
        R.drawable.tuak_manis)

    private val foodDetails = arrayOf("Sayur Ares adalah sayuran khas Lombok yang menggunakan bahan dasar bernama ares(pelepah pisang). Sayur ares mempunyai cita rasa yang gurih dari hasil penggunaan santan yang berpadu dengan bumbu rempah menyerupai kari seperti ketumbar, bawang merah, bawang putih, jahe, kemiri, kunyit, lengkuas, dan jintan. Untuk memperkaya sajian, biasanya masyarakat Lombok menambahkan daging ke dalamnya. Sayur ares dahulu menjadi makanan tradisional Suku Sasak yang dijadikan hidangan saat acara makan-makan setelah berlangsungnya pernikahan.",
        "Ayam Rarang merupakan makanan khas Lombok yang berasal dari Rarang, sebuah desa yang berada di kabupaten Lombok Timur, Nusa Tenggara Barat (NTB). Ayam rarang juga menggambarkan ciri khas masakan Lombok yang pedas. Baluran bumbu sambal yang berpadu dengan cabai rawit membuat makanan ini sekilas sangat pedas. Padahal, ketika dicoba, rasa ayam rarang tidak sepedas penampilannya. Ayam rarang menggunakan ayam kampung yang dimasak dan digoreng terlebih dahulu sebelum disajikan.",
        "Ayam Taliwang merupakan salah satu dari sekian banyak makanan khas Lombok yang paling terkenal di Indonesia. Ayam kampung yang dipilih merupakan ayam yang masih muda sehingga dagingnya sangat empuk dan mudah sekali di lepaskan dari tulang-tulangnya. Ayam taliwang mempunyai banyak jenis, ada ayam taliwang pedas manis, sambal lima, pelecingan, bakar kecap, bakar madu, goreng asam, dan goreng biasa. Penyajian ayam taliwang biasa dilakukan ditemani nasi dan sahabat terbaiknya yakni pelecing kangkung yang dikombinasikan dengan tauge, kacang tanah, parutan kelapa, dan sambal.",
        "Bantal adalah makanan khas Lombok Timur berupa kue yang dibuat dari ketan. Jajanan tradisional ini dinamai bantal karena mempunyai bentuk yang mirip dengan bantal tidur. Warga Lombok biasa membuat kue bantal sebagai menu berbuka puasa atau dijadikan camilan untuk menemani diri saat tadarus Al-Qur’an. Kue bantal dibuat dari ketan yang ditambahi pisang dan kemudian dibungkus untuk dimasak ke dalam panci berisikan air panas. Sebelum dimasak, adonan kue bantal dibentuk menggunakan cetakan dari daun aren yang berbentuk kubus.",
        "Makanan khas Lombok ini secara tampilan mirip dengan gulai atau soto daging. Bebalung biasanya terbuat dari tulang iga sapi sehingga dinamakan bebalung sapi. Selain pakai iga sapi, bebalung juga bisa menggunakan iga kerbau yang kemudian diracik bersama bumbu halus berupa cabai rawit, lengkuas, kunyit, jahe, bawang merah, dan bawang putih, Bumbu semacam itu disebut sebagai ragi rajang. Setelah bumbu menyatu dalam tulang iga, bebalung sapi sudah bisa disantap. Bebalung oleh masyarakat Lombok dianggap sebagai makanan penambah tenaga dan penumbuh vitalitas.",
        "Buat pecinta olahan sayur terong, Beberuq Terong bisa jadi makanan khas NTB favoritmu yang baru. Masakan terong dari Lombok ini dibuat dengan bahan utamanya menggunakan terong ungu yang sudah dipotong-potong dan dicampur dengan tomat serta beberapa bumbu rempah lainnya. Nah, setelah ditambah dan dicampur kemudian terong dan taburan bumbu rempah ini ditambahkan kesegaran air jeruk limau. Rasa yang dihasilkannya pun beragam seperti pedas, manis, asam dan sangat segar untuk makan siang sekalipun.",
        "Nasi balap puyung begitu familiar di Nusa Tenggara Barat, hampir setiap penduduknya mengenal makanan khas Lombok ini. Puyung pada nama makanan ini merujuk pada daerah asalnya, yakni kampung Puyung yang berada di bagian Lombok Tengah. Makanan ini biasa disajikan dengan menggunakan alas daun pisang. Keistimewaannya terletak pada lauk pauknya yang beragam, seperti sambal, kedelai goreng, dan suwiran daging ayam yang ditambah taburan kelapa parut. Nasi puyung mempunyai cita rasa yang sangat pedas. Saking pedasnya bahkan ada yang sampai tak jarang yang menyerah untuk melanjutkan makannya hingga habis.",
        "Plecing kangkung adalah makanan khas Lombok berjenis sayuran yang biasa dihidangkan bersama lauk utama dan nasi atau kehadirannya antara lain sebagai menu pendamping dan pelengkap. Sesuai namanya, makanan ini terdiri dari kangkung sebagai bahan utamanya yang direbus dan disajikan saat sudah dingin bersama sambal tomat. Biasanya plecing kangkung dijadikan menu pendamping makan ayam taliwang. Selain kangkung, ada juga bahan lain yang turut meramaikan isian plecing seperti tauge, kacang panjang, dan kacang tanah goreng. Kemudian untuk kangkungnya sendiri adalah kangkung air yang ditanam di sungai dengan metode pengaliran tertentu sehingga menghasilkan kangkung dengan batangan yang besar dan renyah.",
        "Poteng jaje tujak jika diubah ke dalam bahasa Indonesia berarti tape jajan tumbuk. Makanan khas Lombok ini merupakan hidangan berbahan utama tape yang biasa dijadikan santapan lebaran. Poteng jaje tujak adalah makanan ringan yang terbuat dari campuran dua bahan utama. Selain tape, ada juga bahan lain berupa ketan putih yang setelah jadi akan tampak lebih mencolok daripada tapenya. Di tengah masyarakat Lombok ada kepercayaan setempat yang mengharuskan seseorang harus dalam keadaan suci atau tidak sedang haid untuk bisa membuat makanan ini. Jika dalam keadaan haid memaksa membuatnya maka poteng jaje tujak dianggap rusak. Bahkan pada proses pembuatan poteng, tepatnya ketika menaburkan bubuk tape ketan, lebih afdol jika dilakukan setelah selesai sholat sehingga masih dalam keadaan bersih dari hadas (berwudhu).",
        "Sate bulayak adalah hidangan sate yang menggunakan daging ayam, jeroan, dan daging sapi sebagai bahan utama yang ditusuk hingga berbentuk sate. Dari tampilan satenya memang tak jauh berbeda dengan sate-date di daerah lain. Yang berbeda dari makanan ini adalah bulayaknya. Bulayak sendiri merujuk pada lontong yang dililit dengan daun aren atau enau. Ukuran bulayak lebih kecil dari lontong pada umumnya. Bulayak mempunyai tekstur yang lembut dengan cita rasa yang gurih. Biasanya bulayak dimakan langsung bersama sate yang sudah dibumbu dengan bumbu kacang yang berasal dari kacang tanah yang disangrai, ditumbuk, kemudian direbus bersama santan serta bumbu rempah lain sehingga menciptakan rasa yang pedas.",
        "Sate rembiga sendiri menjadi kuliner yang mengenalkan kepada semua orang kalau Mataram adalah salah satu daerah yang terkenal akan ternak sapinya yang banyak. Daging yang dipilih untuk sate rembiga adalah daging sapi yang sebelum ditusuk dan dipanggang harus ditumbuk terlebih dahulu agar empuk. Setelah empuk, daging harus direndam ke dalam bumbu-bumbu khusus selama dua jam beru kemudian dibakar. Sate rembiga yang siap santap biasanya disajikan bersama bulayak.",
        "Tuak manis adalah minuman khas Lombok yang ramai dibeli saat musim kemarau dan bulan puasa. Selain menyegarkan dan manis, tuak manis juga dipecaya mampu menyembuhkan berbagai penyakit. Minuman berkhasiat ini dihasilkan dari pohon enau yang tumbuh liar di hutan. Salah satu hutan di Lombok yang menjadi penghasil utama tuak manis adalah hutan Pusuk Lestari yang berada di kabupaten Lombok Barat. Beberapa masyarakat Lombok biasa meminum tuak manis secara rutin untuk menyembuhkan penyakit kencing batu, kencing manis, sakit pinggang, dan membantu memperlancar buang air kecil.")

        val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                list.add(food)
            }
            return list
        }
}