package com.example.localmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.localmvvm.model.SongModel
import com.example.localmvvm.model.SongProvider

class SongViewModel : ViewModel()  {

    //Encapsulando modelo en un MutableLiveData
    val songModel = MutableLiveData<SongModel>()

    fun randomSong(){
        //Obteniendo una nueva cancion aleaotoria
        val currentSong = SongProvider.random()
        //Seteando el cambio con la nueva cancion
        songModel.postValue(currentSong)
    }

}