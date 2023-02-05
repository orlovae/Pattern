import factoryMethod.Database
import factoryMethod.File
import factoryMethod.Server
import factoryMethod.StorageFactory

//import builder.*

fun main(args: Array<String>) {
/* Testing singleton */
//    val singleton1 = Singleton.getInstance("ONE")
//    val singleton2 = Singleton.getInstance("TWO")
//    val singleton3 = Singleton.getInstance("TREE")

/* Testing adapter */
//    val generator = DatabaseGenerator()
//    val generatedData = generator.generateData()
//    val adapter = DataDisplayAdapter(DataDisplay())
//    val convertData = adapter.convertData(generatedData)
//
//    generatedData.forEach {
//        println(it)
//    }
//    convertData.forEach {
//        println(it)
//    }
//

    /* Testing builder*/
//    val foodOrder = FoodOrder.Builder()
//        .bread(Bread.Builder()
//            .name(BreadType.GREEN)
//            .weight(600)
//            .build()
//        )
//        .meat(Meat.Builder()
//            .type(MeatType.CAT)
//            .weight(657)
//            .build()
//        )
//        .build()
//
//    println("food order is \nbread (type is " +
//            "${foodOrder.bread?.name}, " +
//            "weight = ${foodOrder.bread?.weight})" +
//            "\nmeat (type is " +
//            "${foodOrder.meat?.type}, " +
//            "weight = ${foodOrder.meat?.weight})" )

    /*Testing factory metod*/

    val configDb = Database("MnogoDB", "47")
    val database = StorageFactory.getStorage(configDb)
    database.getItem(15)
    database.saveItem("Item from ${database.getNameStorage()} is Item(457)")

    val configFile = File("/root/etc", "log.txt")
    val file = StorageFactory.getStorage(configFile)
    file.getItem(15)
    file.saveItem("Line from ${file.getNameStorage()} is Line(3)")

    val configServer = Server("http://ya.ru", "80")
    val server = StorageFactory.getStorage(configServer)
    server.getItem(15)
    server.saveItem("Item from ${server.getNameStorage()} is 01.txt")

}