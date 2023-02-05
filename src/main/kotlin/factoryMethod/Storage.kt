package factoryMethod

interface Storage {
    fun saveItem (item: Any) : Boolean
    fun getItem (id: Int) : Any

    fun getNameStorage() : String
}