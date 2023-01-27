package com.example.identificationbird

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.bumptech.glide.Glide

import com.example.identificationbird.databinding.ActivityResultBinding
import com.example.identificationbird.databinding.ItemResultBinding


class ResultActivity : AppCompatActivity() {

    private lateinit var resultBinding: ActivityResultBinding
    private lateinit var  itemBinding: ItemResultBinding

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resultBinding = ActivityResultBinding.inflate(layoutInflater)
        itemBinding = resultBinding.itemResult
        setContentView(resultBinding.root)

        val namahabitat = intent.getStringExtra("habitat")
        val namalatin = intent.getStringExtra("latin")
        val namafamily = intent.getStringExtra("family")
        val namaordo = intent.getStringExtra("ordo")
        val namamakanan = intent.getStringExtra("makanan")
        val deskripsi = intent.getStringExtra("desc")


        //val dataIntent = Uri.parse(intent.getStringExtra(EXTRA_DETAIL))
        //val bitmapPhoto = MediaStore.Images.Media.getBitmap(this.contentResolver, dataIntent)

        itemBinding.nametext.text = intent.getStringExtra("nama")
        Glide.with(this)
            .load(intent.getIntExtra("gambar", 0))
            .into(itemBinding.imageView1)

        itemBinding.latinnametext.text = "$namalatin"
        itemBinding.familynametext.text = "Family = $namafamily"
        itemBinding.ordonametext.text = "Ordo = $namaordo"
        itemBinding.habitattext.text = "Habitat Asli = $namahabitat"
        itemBinding.makanantext.text = "Makanan = $namamakanan"
        itemBinding.deskripsitext.text = "Deskripsi = $deskripsi"


    }


}