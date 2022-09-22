package com.ddang_.nostalgia.guis

import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryHolder

abstract class CustomGUIHolder: InventoryHolder {
    override fun getInventory(): Inventory? {
        return null
    }

    abstract fun process(e: InventoryClickEvent)

    abstract fun process(e: InventoryCloseEvent)
}