fun main() {
    val herbivores1 = Herbivores("Заяц", "луг","травой")
    val herbivores2 = Herbivores("Косуля", "лес","ветками")
    val predator1 = Predators("Волк", "лес", "стаей")
    val predator2 = Predators("Кот", "рядом с человеком", "в одиночку")


    val list = mutableListOf<Animals>()
    list.add(herbivores1)
    list.add(herbivores2)
    list.add(predator1)
    list.add(predator2)
    val separator = "\n"

    val str = list.joinToString(separator)

    println(str)


}





