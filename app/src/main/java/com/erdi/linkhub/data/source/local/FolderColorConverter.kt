package com.erdi.linkhub.data.source.local

import androidx.room.TypeConverter
import com.erdi.linkhub.data.FolderColor

object FolderColorConverter {

    @JvmStatic
    @TypeConverter
    fun fromFolderColor(folderColor: FolderColor) : String = folderColor.name

    @JvmStatic
    @TypeConverter
    fun toFolderColor(name: String) : FolderColor = FolderColor.valueOf(name)
}