package com.example.kt04_fragment_2415053122236

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import kotlin.time.Instant

class NhapVeFragment: Fragment() {
    private lateinit var edtHoTen: EditText
    private lateinit var edtSoLuong: EditText
    private lateinit var btnXemVe: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstant: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nhap_ve, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edtHoTen = view.findViewById(R.id.edtHoTen)
        edtSoLuong = view.findViewById(R.id.edtSoLuong)
        btnXemVe = view.findViewById(R.id.btnXemVe)
    }
}