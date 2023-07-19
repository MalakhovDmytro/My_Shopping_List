package com.example.myshoppinglist.domain

class EditShopItemUseCase(private var shopListRepository: ShopListRepository) {

    suspend fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}