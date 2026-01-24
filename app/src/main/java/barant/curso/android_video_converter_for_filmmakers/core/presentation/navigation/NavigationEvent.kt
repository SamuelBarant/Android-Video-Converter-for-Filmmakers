package barant.curso.android_video_converter_for_filmmakers.core.presentation.navigation

sealed interface NavigationEvent {
    data class To(val route: String): NavigationEvent
    object Back: NavigationEvent
}