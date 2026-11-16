package com.example.kt04_fragment_2415053122236

data class PhieuVe (
    val maVe_2236: String,
    val hoTen_2236: String,
    val soLuong_2236: Int
) {
    fun tinhTienGoc_2236(): Long {
        return soLuong_2236 * 50000L
    }
}

fun String.chuanHoaTen_2236(): String {
    return this.trim()
}

object QuyTacPhieu_2236 {
    fun taoMaPhieu_2236(soThuTu: Int): String {
        return "VE$soThuTu"
    }
}