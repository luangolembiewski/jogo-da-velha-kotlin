import luan.jogodavelha.Jogo

fun main(args: Array<String>) {
    val jogo = Jogo()
    var parar: Boolean = false
    var marca: String = "X"
    var cont: Int = 0

    while (parar == false) {

        println(marca + ": Digite a posição deseja marcar:")
        println("Linha (a,b,c):")
        var linha = readln()
        println("Coluna (1,2,3):")
        var coluna = readln()

        println(jogo.imagem(linha, coluna, marca))

        var vitoria = jogo.verificacao(marca)
        if (vitoria == true) {
            parar = true
            println("Parabéns " + marca + ", você ganhou!!")
        }
        if (marca.equals("X")) {
            marca = "O"
        }else{marca = "X"}
        cont++
        if (cont == 9) {
            parar = true
            println("Deu velha!!")
        }
    }
}
