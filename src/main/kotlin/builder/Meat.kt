package builder

class Meat private constructor(
    val type: MeatType?,
    val weight: Int
) {
    data class Builder(
        var type: MeatType? = null,
        var weight: Int = 0
    ) {
        fun type(type: MeatType) = apply { this.type = type }
        fun weight(weight: Int) = apply { this.weight = weight }
        fun build() = Meat(type, weight)
    }
}