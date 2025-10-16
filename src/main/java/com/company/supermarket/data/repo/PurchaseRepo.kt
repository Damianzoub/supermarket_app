interface PurchaseRepo{
    fun history(): Flow<List<Purchase>>
    suspend fun checkout(cart: List<CartItem>,products:Map<Long,Product>)
    fun weeklySpend(): Flow<Map<String,Double>>
}