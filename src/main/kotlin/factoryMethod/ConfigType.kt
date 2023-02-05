package factoryMethod

sealed class ConfigType

class Database(val nameDb: String, val port: String) : ConfigType()
class File(val uri: String, val fileName: String) : ConfigType()
class Server(val address: String, val port: String) : ConfigType()

object StorageFactory {
    fun getStorage(config: ConfigType) : Storage {
        return when (config) {
            is Database -> StorageExternal(config)
            is File -> StorageExternal(config)
            is Server -> StorageInternal(config)
        }
    }
}
