package adapter

class DataDisplayAdapter(val display: DataDisplay) : DatabaseDataConverter {
    override fun convertData(data: List<DatabaseData>): List<DisplayDataType> {
        val resultList = arrayListOf<DisplayDataType>()
        for (item in data) {
            val ddt = DisplayDataType(
                item.position.toFloat(),
                item.amount.toString())
            resultList.add(ddt)
        }
        return resultList
    }
}