package builder

class Bread private constructor(
    val name: BreadType?,
    val weight: Int
){
    data class Builder(
        var name: BreadType? = null,
        var weight: Int = 0) {
        fun name(name: BreadType) = apply { this.name = name }
        fun weight(weight: Int) = apply { this.weight = weight }
        fun build() = Bread(name, weight)
    }
}