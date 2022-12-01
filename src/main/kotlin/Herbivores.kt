class Herbivores(name: String, place: String, var eat: String) : Animals(name, place) {
    override  fun toString(): String {
        return "${nameUpper()} - травоядное животное, место обитания - $place, питается $eat"
    }
}