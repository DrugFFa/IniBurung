package com.example.identificationbird

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.identificationbird.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var resultBinding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(resultBinding.root)

        val namahabitat = intent.getStringExtra("habitat")
        val namalatin = intent.getStringExtra("latin")
        val namafamily = intent.getStringExtra("family")
        val namaordo = intent.getStringExtra("ordo")
        val namamakanan = intent.getStringExtra("makanan")
        val deskripsi = intent.getStringExtra("deskripsi")

        resultBinding.nametext.text = intent.getStringExtra("nama")
        resultBinding.latinnametext.text = "$namalatin"
        resultBinding.familynametext.text = "Family = $namafamily"
        resultBinding.ordonametext.text = "Ordo = $namaordo"
        resultBinding.habitattext.text = "Habitat Asli = $namahabitat"
        resultBinding.makanantext.text = "Makanan = $namamakanan"
        resultBinding.deskripsitext.text = "Deskripsi = $deskripsi"


    }


}