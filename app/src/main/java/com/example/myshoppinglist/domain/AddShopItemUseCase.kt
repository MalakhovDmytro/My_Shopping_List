package com.example.myshoppinglist.domain

class AddShopItemUseCase(private var shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}