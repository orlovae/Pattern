package adapter

class DatabaseGenerator {
    fun generateData(): List<DatabaseData> {
        val list = arrayListOf<DatabaseData>()
        list.add(DatabaseData(2,2))
        list.add(DatabaseData(3,7))
        list.add(DatabaseData(4,-1))
        return list
    }
}