package luan.jogodavelha

class Jogo{
    private var a1:String = " "
    private var a2:String = " "
    private var a3:String = " "
    private var b1:String = " "
    private var b2:String = " "
    private var b3:String = " "
    private var c1:String = " "
    private var c2:String = " "
    private var c3:String = " "

    fun imagem(linha: String, coluna: String, marca: String): String{

        if (linha.equals("a") ){
            if (coluna.equals("1")){
                a1 = marca
            }else if (coluna.equals("2")){
                a2 = marca
            }else if (coluna.equals("3")){
                a3 = marca
            }
        }else if(linha.equals("b")){
            if (coluna.equals("1")){
                b1 = marca
            }else if (coluna.equals("2")){
                b2 = marca
            }else if (coluna.equals("3")){
                b3 = marca
            }
        }else if(linha.equals("c")){
            if (coluna.equals("1")){
                c1 = marca
            }else if (coluna.equals("2")){
                c2 = marca
            }else if (coluna.equals("3")){
                c3 = marca
            }
        }

        return  "===============================\n"+
                "   1   2   3 \n" +
                "a  ${a1} | ${a2} | ${a3} \n" +
                "  ___________\n" +
                "b  ${b1} | ${b2} | ${b3} \n" +
                "  ___________\n" +
                "c  ${c1} | ${c2} | ${c3} \n" +
                "==============================="
    }
    fun verificacao(marca: String): Boolean{
        if (a1.equals(marca) && a2.equals(marca) && a3.equals(marca)) {return true}
        if (b1.equals(marca) && b2.equals(marca) && b3.equals(marca)) {return true}
        if (c1.equals(marca) && c2.equals(marca) && c3.equals(marca)) {return true}

        if (a1.equals(marca) && b1.equals(marca) && c1.equals(marca)) {return true}
        if (a2.equals(marca) && b2.equals(marca) && c2.equals(marca)) {return true}
        if (a3.equals(marca) && b3.equals(marca) && c3.equals(marca)) {return true}

        if (a1.equals(marca) && b2.equals(marca) && c3.equals(marca)) {return true}
        if (a3.equals(marca) && b2.equals(marca) && c1.equals(marca)) {return true}
        return false
    }
}