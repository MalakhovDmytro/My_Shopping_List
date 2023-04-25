package com.example.myshoppinglist.domain

class GetShopListUseCase(private var shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}