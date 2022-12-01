class Predators(name: String, place: String, var hunt: String) : Animals(name, place) {
    override  fun toString(): String {
        return "${nameUpper()} - хищное животное, место обитания - $place, охотится $hunt"
    }
}


