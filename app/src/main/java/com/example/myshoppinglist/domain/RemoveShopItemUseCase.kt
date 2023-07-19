package com.example.myshoppinglist.domain

class RemoveShopItemUseCase(private var shopListRepository: ShopListRepository) {

    suspend fun removeShopItem(shopItem: ShopItem) {
        shopListRepository.removeShopItem(shopItem)
    }
}