package gg.superboard

import gg.superboard.utils.Configuration
import org.bukkit.plugin.java.JavaPlugin

class SuperBoard : JavaPlugin() {

    companion object {
        fun getPlugin(): SuperBoard {
            return JavaPlugin.getPlugin(SuperBoard::class.java)
        }

        fun getConfig(): Configuration {
            return getPlugin().config
        }
    }

    private lateinit var config: Configuration


    override fun onEnable() {
        // Plugin startup logic
        config = Configuration(this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
