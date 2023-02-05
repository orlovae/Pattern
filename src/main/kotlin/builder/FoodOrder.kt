package builder

class FoodOrder private constructor(
    val bread: Bread?,
    val meat: Meat?,
){
    data class Builder(
        var bread: Bread? = null,
        var meat: Meat? = null
    ) {
        fun bread(bread: Bread) = apply { this.bread = bread }
        fun meat(meat: Meat) = apply { this.meat = meat }
        fun build() = FoodOrder(bread, meat)
    }
}