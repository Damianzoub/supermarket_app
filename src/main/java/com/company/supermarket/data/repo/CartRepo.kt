interface CartRepo{
    fun cartItems(): Flow <List<CartItem>>
    suspend fun add(productId: Long, delta: Int=1)
    suspend fun remove(productId: Long)
    suspend fun clear()
    fun total(products: List<Product>, items: List<CartItem>): Double
}