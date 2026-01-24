package barant.curso.android_video_converter_for_filmmakers.core.presentation.navigation

sealed class AppRoute(val route: String){
    object Home: AppRoute("home")
    object History: AppRoute("history")
    object Files: AppRoute("files")
    object Settings: AppRoute("settings")
}