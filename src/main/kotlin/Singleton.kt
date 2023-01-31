class Singleton private constructor(private val value: String){
    companion object {
        private var instance: Singleton? = null

        fun getInstance(value: String) : Singleton {
            if (instance == null)
                instance = Singleton(value)
            println(instance!!.value)
            return instance!!
        }
    }

}