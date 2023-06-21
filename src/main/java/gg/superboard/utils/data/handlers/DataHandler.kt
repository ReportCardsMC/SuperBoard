package gg.superboard.utils.data.handlers

import gg.superboard.utils.data.models.LeaderboardTable

interface DataHandler {

    fun getTable(name: String): LeaderboardTable

    fun createTable(name: String): LeaderboardTable

    fun deleteTable(name: String): Boolean

    fun getTables(): List<LeaderboardTable>

}