interface ProductsRepo {
    fun search(filters: ProductFilters): Flow <List<Product>>
    fun product(id: Long): Flow <Product?>
    suspend fun seedIfEmpty()
}