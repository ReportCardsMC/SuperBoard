package gg.superboard.utils

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.plugin.java.JavaPlugin

class Configuration(private val plugin: JavaPlugin) {
    private val fileConfiguration: FileConfiguration

    init {
        plugin.saveDefaultConfig()
        fileConfiguration = plugin.config
    }

    fun get(key: String): Any? {
        return fileConfiguration.get(key)
    }

    fun string(key: String, def: String = ""): String {
        return fileConfiguration.getString(key, def)!!
    }

    fun int(key: String, def: Int = 0): Int {
        return fileConfiguration.getInt(key, def)
    }

    fun double(key: String, def: Double = 0.0): Double {
        return fileConfiguration.getDouble(key, def)
    }

    fun boolean(key: String, def: Boolean = false): Boolean {
        return fileConfiguration.getBoolean(key, def)
    }

    fun list(key: String, def: List<String> = listOf()): List<String> {
        return fileConfiguration.getStringList(key) ?: def
    }

    fun map(key: String, def: Map<String, Any> = mapOf()): Map<String, Any> {
        return fileConfiguration.getConfigurationSection(key)?.getValues(false) ?: def
    }
}
