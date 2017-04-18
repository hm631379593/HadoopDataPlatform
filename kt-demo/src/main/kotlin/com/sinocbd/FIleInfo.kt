package com.sinocbd

/**
 * Created by kuzoncby on 12/12/16.
 */
class FIleInfo(var id: Long = 0,
               var filePath: String = "",
               var fileName: String = "") {

    override fun toString(): String {
        return "FIleInfo(id=$id, filePath='$filePath', fileName='$fileName')"
    }

}