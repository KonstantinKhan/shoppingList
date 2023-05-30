package com.shopping_list_bot.common.models.`shopping-list`

data class PurchaseModel(
    val name: String,
    val checked: Boolean = false
) {
    fun isNamesMatch(name: String) = this.name == name
}