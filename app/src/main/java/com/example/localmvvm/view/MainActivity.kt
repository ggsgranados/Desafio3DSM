package com.example.localmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.localmvvm.databinding.ActivityMainBinding
import com.example.localmvvm.viewmodel.SongViewModel

class MainActivity : AppCompatActivity() {

    //Mapeo de la Activity
    private lateinit var binding: ActivityMainBinding

    //Conexion del ViewModel a la Activity
    private val songViewModel : SongViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Recibe una notificacion si hay algun cambio
        songViewModel.songModel.observe(this, Observer {
        currentSong ->
            //Cambiando el texto de los TextView
            binding.tvSong.text = currentSong.song
            binding.tvArtist.text = currentSong.artist
        })

        //Evento para detonar el cambio al presionar la pantalla
        binding.viewContainer.setOnClickListener{
            songViewModel.randomSong()
        }

    }
}