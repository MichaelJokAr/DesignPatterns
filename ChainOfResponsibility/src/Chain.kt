interface Chain {
    fun request(): String?

    fun process(request: String?): String?
}