import adapter.DataDisplay
import adapter.DataDisplayAdapter
import adapter.DatabaseGenerator
import singletone.Singleton

fun main(args: Array<String>) {
/* Testing singleton */
//    val singleton1 = Singleton.getInstance("ONE")
//    val singleton2 = Singleton.getInstance("TWO")
//    val singleton3 = Singleton.getInstance("TREE")

/* Testing adapter */
    val generator = DatabaseGenerator()
    val generatedData = generator.generateData()
    val adapter = DataDisplayAdapter(DataDisplay())
    val convertData = adapter.convertData(generatedData)

    generatedData.forEach {
        println(it)
    }
    convertData.forEach {
        println(it)
    }
}