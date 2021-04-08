package com.percobaan.tugasch7top2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.percobaan.tugasch7top2.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val json = "{\n" +
                "    \"biodata\" : {\n" +
                "        \"name\" : \"Odalric\",\n" +
                "        \"gender\" : \"laki laki\",\n" +
                "        \"umur\" : 28,\n" +
                "        \"alamat\" : {\n" +
                "            \"jalan\" : \"bougenville 1\",\n" +
                "            \"kota\"  : \"bekasi\"},\n" +
                "        \"no handphone\" : \"087894211839\",\n" +
                "        \"email\" : \"odalrich78@gmail.com\",\n" +
                "        \"tinggi badan\" : \"175\",\n" +
                "        \"berat badan\" : \"75.5\",\n" +
                "        \"hobi\" : \"tenis meja\",\n" +
                "        \"media social\" :\n" +
                "        [\n" +
                "            {\"instagram\" : \"odalrich\"\n" +
                "            },\n" +
                "            {\"telegram\" : \"odal ric\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"belajar bahasa pemrograman\" : \"true\"\n" +
                "    }\n" +
                "}"

        val data = JSONObject(json)
        val biodata = data.getJSONObject("biodata")
        val name = biodata.getString("name")
        val gender = biodata.getString("gender")
        val umur =  biodata.getInt("umur")
        val alamat = biodata.getJSONObject("alamat")
        val jalan = alamat.getString("jalan")
        val kota = alamat.getString("kota")
        val no_handphone = biodata.getInt("no handphone")
        val email = biodata.getString("email")
        val tinggi_badan = biodata.getInt("tinggi badan")
        val berat_badan = biodata.getDouble("berat badan")
        val hobi =  biodata.getString("hobi")
        val media_social = biodata.getJSONArray("media social")
        val instagram = media_social.getJSONObject(0)
        val telegram = media_social.getJSONObject(1)
        val belajar = biodata.getBoolean("belajar bahasa pemrograman")

        binding.tvBiodata.text = name+ "\n"
        binding.tvBiodata.append(gender+ "\n")
        binding.tvBiodata.append(umur.toString() + "\n")
        binding.tvBiodata.append(jalan + "\n")
        binding.tvBiodata.append(kota + "\n")
        binding.tvBiodata.append(no_handphone.toString() + "\n")
        binding.tvBiodata.append(email + "\n")
        binding.tvBiodata.append(tinggi_badan.toString() + "\n")
        binding.tvBiodata.append(berat_badan.toString() + "\n")
        binding.tvBiodata.append(hobi)
        binding.tvBiodata.append("\n" + instagram)
        binding.tvBiodata.append("\n" + telegram)
        binding.tvBiodata.append("\n" + belajar)

    }
}