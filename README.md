# 🎬 Android Video Converter for Filmmakers

Android Video Converter is a native Android application built with **Kotlin**, designed for filmmakers and content creators who need to convert, compress, and export videos directly from their mobile devices using professional presets.

The app leverages **FFmpeg** as its core engine, providing powerful video processing capabilities while maintaining a clean and modern user interface built with **Jetpack Compose**.

---

## ✨ Features

- 🎥 Video format conversion (`MOV`, `MP4`)
- 📦 Video compression with quality presets
- 🎞 Frame rate conversion (e.g. 60fps → 24fps)
- 📐 Resolution scaling (4K → 1080p / 720p)
- 🔊 Audio extraction (`MP3`, `AAC`)
- ⏳ Real-time conversion progress
- 🎬 Presets optimized for filmmakers and social media
- 📁 Secure file access using Android Storage Access Framework

---

## 🛠 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **FFmpegKit**
- **MVVM Architecture**
- **WorkManager** (background processing)
- **Storage Access Framework (SAF)**

---

## 🧱 Architecture

The project follows a clean and scalable architecture:

1. UI (Jetpack Compose) 
2. ViewModel 
3. Use Cases 
4. FFmpeg Executor 

This separation improves testability, maintainability, and scalability.

---

## 🎯 Project Purpose

This project was developed as:
- A **real-world tool** for professional video workflows
- A **learning project** to practice advanced Android development
- A **portfolio project** showcasing multimedia processing, clean architecture, and modern Android libraries

---

## 🚀 Planned Improvements

- Batch conversion queue
- Custom user-defined presets
- Video metadata viewer (codec, bitrate, FPS)
- Export profiles for YouTube, Instagram, TikTok
- Material 3 dynamic theming
- Conversion history

---

## 📸 Screenshots

> _Screenshots will be added soon_

---

## ⚠️ Notes

- Video processing is powered by **FFmpeg**, which may increase APK size.
- Long conversions are executed using background workers to avoid UI blocking.
- Some codecs may not be available on all devices depending on architecture.

---

## 🧑‍💻 Author

**Samuel**  
Android Developer & Filmmaker  

---

## 📄 License

This project is licensed under the **MIT License**.
