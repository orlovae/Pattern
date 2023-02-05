package factoryMethod

class StorageInternal(val configType: ConfigType) : Storage {
    init {
        //TODO() configure use configType
    }
    override fun saveItem(item: Any) : Boolean {
        var isSave = false

        //TODO save in Storage

        if (isSave) {
            println("Save item($item) in Storage passed successfully")
        } else {
            println("Save item($item) in Storage it was unsuccessful")
        }

        return isSave
    }

    override fun getItem(id: Int) : Any {
        val any: Any
        //TODO() create Any using id
        any = "Item created"
        println("Item ${configType.javaClass.name} Storage = $any")
        return any
    }
    override fun getNameStorage(): String {
        return configType.javaClass.name
    }
}