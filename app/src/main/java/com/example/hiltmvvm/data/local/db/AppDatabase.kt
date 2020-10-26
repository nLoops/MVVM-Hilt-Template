package com.example.hiltmvvm.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.hiltmvvm.data.local.converters.MemberTypeConverter
import com.example.hiltmvvm.data.local.dao.MembersDao
import com.example.hiltmvvm.data.models.Member

@Database(
        version = 1, exportSchema = false,
        entities = [Member::class]
)
@TypeConverters(MemberTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun memberDao(): MembersDao

    companion object {
        private const val DB_NAME = "Members.db"

        @Volatile
        private var appDatabase: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = appDatabase
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        DB_NAME
                ).build()
                appDatabase = instance
                return instance
            }
        }
    }
}