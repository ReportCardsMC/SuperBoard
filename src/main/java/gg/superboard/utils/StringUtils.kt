package gg.superboard.utils

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Bukkit

fun String.info() = Bukkit.getLogger().info(this)
fun String.warning() = Bukkit.getLogger().warning(this)
fun String.severe() = Bukkit.getLogger().severe(this)

fun String.format() = MiniMessage.miniMessage().deserialize(this)