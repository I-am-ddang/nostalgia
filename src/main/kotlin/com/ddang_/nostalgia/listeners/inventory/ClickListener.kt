package com.ddang_.nostalgia.listeners.inventory

import com.ddang_.nostalgia.guis.CustomGUIHolder
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class ClickListener: Listener {
    @EventHandler
    fun onInvClick(e: InventoryClickEvent) {
        val holder = e.inventory.holder ?: return
        if (holder !is CustomGUIHolder) {
            return
        }
        holder.process(e)
    }
}