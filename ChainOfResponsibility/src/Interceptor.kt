interface Interceptor {
    fun intercept(chain: Chain): String?
}