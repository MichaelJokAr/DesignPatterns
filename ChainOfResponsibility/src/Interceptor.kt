interface Interceptor {
    /**
     * 拦截请求
     */
    fun intercept(chain: Chain): String?
}