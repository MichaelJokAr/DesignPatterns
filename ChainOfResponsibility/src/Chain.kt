interface Chain {
    /**
     * 返回请求
     */
    fun request(): String?

    /**
     * 处理请求
     */
    fun process(request: String?): String?
}