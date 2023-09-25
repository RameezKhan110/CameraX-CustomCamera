package com.example.customcamera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import androidx.core.net.toUri
import com.example.customcamera.databinding.ActivityMain2Binding
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val directory = File(externalMediaDirs[0].absolutePath)
        val files = directory.listFiles()
        Log.d("TAG", "file size: " + files.size)

        var index = 0
        while(index < files.size - 1) {
            index = files.size - 1
            binding.imageView.setImageURI(files[index].toUri())
            index++
            break
        }

//        val filePath = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "my_image")
//
//        val outputStream = FileOutputStream(filePath)
//        outputStream.write(files?.get(0)?.toByteArray())
    }
//    private fun File.toByteArray(): ByteArray {
//        val inputStream = FileInputStream(this)
//        val byteBuffer = ByteArray(length().toInt())
//
//        try {
//            inputStream.read(byteBuffer)
//        } catch (e: IOException) {
//            e.printStackTrace()
//        } finally {
//            inputStream.close()
//        }
//
//        return byteBuffer
//    }
}