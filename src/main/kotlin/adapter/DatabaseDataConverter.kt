package adapter

interface DatabaseDataConverter {
    fun convertData(data: List<DatabaseData>): List<DisplayDataType>
}