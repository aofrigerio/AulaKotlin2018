package br.com.aula02kotlin

import android.graphics.drawable.AdaptiveIconDrawable
import java.io.Serializable

data class Crossfit(var id: Long,
                    var nome: String,
                    var repeticao: Long,
                    var serie: Long,
                    var peso: Long,
                    var descricao: String,
                    var img: Int = R.drawable.brazil
                    ) : Serializable