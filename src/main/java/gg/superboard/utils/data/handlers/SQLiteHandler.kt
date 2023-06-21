package gg.superboard.utils.data.handlers

import gg.superboard.utils.data.models.LeaderboardTable
import gg.superboard.utils.severe
import java.io.File
import java.nio.file.Path

class SQLiteHandler(private val filePath: Path): DataHandler {

    private val file: File

    /*
     * SQLite Handler will use SQLite to handle data storage for leaderboards.
     * This will be the default handler for data storage.
     *
     * Data Format:
     * - Table Name: leaderboard_<name>
     * - Last Table Update: <timestamp>
     * - Table Columns:
     *   - uuid: String
     *   - value: Int
     *
     */

    init {
        try {
            file = File(filePath.toUri())
            if (!file.exists()) {
                file.createNewFile()
            }
        } catch (e: Exception) {
            "Failed to create SQLite file!".severe()
            throw e
        }
    }

    override fun getTable(name: String): LeaderboardTable {

    }

    override fun createTable(name: String): LeaderboardTable {
        TODO("Not yet implemented")
    }

    override fun deleteTable(name: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getTables(): List<LeaderboardTable> {
        TODO("Not yet implemented")
    }
}