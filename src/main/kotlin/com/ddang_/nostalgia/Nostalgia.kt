package com.ddang_.nostalgia

import com.ddang_.nostalgia.listeners.inventory.ClickListener
import com.ddang_.nostalgia.listeners.inventory.CloseListener
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitScheduler
import org.bukkit.scoreboard.Scoreboard

class Nostalgia : JavaPlugin() {

    companion object {
        lateinit var scheduler: BukkitScheduler
            private set
        lateinit var instance: Plugin
        lateinit var players: Array<out Player>
            private set

        fun Long.rl(run: Runnable) = scheduler.runTaskLater(instance, run, this)
        fun Long.rt(delay: Long = 1, run: Runnable) = scheduler.runTaskTimer(instance, run, delay, this)
    }

    private val events = arrayOf(
        CloseListener(),
        ClickListener()
    )

    override fun onEnable() {
        players = server.onlinePlayers
        instance = this
        scheduler = server.scheduler
    }

    override fun onDisable() {
    }
}