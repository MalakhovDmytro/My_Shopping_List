package com.example.myshoppinglist.domain

class AddShopItemUseCase(private var shopListRepository: ShopListRepository) {

    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}