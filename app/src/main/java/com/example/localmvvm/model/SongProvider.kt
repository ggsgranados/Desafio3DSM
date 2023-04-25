package com.example.localmvvm.model

class SongProvider {

    companion object {

        //Funcion que retorna una cancion aleatoria
        fun random(): SongModel {
            val position = (0..9).random()
            return song[position]
        }


        //Lista simulando datos a obtener
        private val song = listOf<SongModel>(
            SongModel(
                song = "Mary On A Cross",
                artist = "Ghost"
            ),
            SongModel(
                song = "Twilight Of The Thunder God",
                artist = "Amon Amarth"
            ),
            SongModel(
                song = "sTraNgeRs",
                artist = "Bring Me The Horizon"
            ),
            SongModel(
                song = "MAYDAY",
                artist = "coldrain"
            ),
            SongModel(
                song = "Lost Chapter",
                artist = "Pentakill"
            ),
            SongModel(
                song = "Rx (Medicate)",
                artist = "Theory of a Deadman"
            ),
            SongModel(
                song = "One Good Reason",
                artist = "Celldweller"
            ),
            SongModel(
                song = "Blood and Thunder",
                artist = "Mastodon"
            ),
            SongModel(
                song = "Deutschland",
                artist = "Rammstein"
            ),
            SongModel(
                song = "Warrior",
                artist = "Atreyu"
            )
        )
    }
}