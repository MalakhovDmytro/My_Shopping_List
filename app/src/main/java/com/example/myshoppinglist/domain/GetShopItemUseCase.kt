package com.example.myshoppinglist.domain

class GetShopItemUseCase(private var shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}