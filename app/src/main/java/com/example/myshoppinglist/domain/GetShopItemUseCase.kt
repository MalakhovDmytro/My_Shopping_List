package com.example.myshoppinglist.domain

class GetShopItemUseCase(private var shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}