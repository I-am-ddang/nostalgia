package com.ddang_.nostalgia.listeners.inventory

import com.ddang_.nostalgia.guis.CustomGUIHolder
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryCloseEvent

class CloseListener: Listener {
    @EventHandler
    fun onInvClose(e: InventoryCloseEvent) {
        val holder = e.inventory.holder ?: return
        if (holder !is CustomGUIHolder) {
            return
        }
        holder.process(e)
    }
}