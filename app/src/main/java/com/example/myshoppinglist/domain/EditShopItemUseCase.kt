package com.example.myshoppinglist.domain

class EditShopItemUseCase(private var shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}