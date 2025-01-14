package cat.itb.m78.exercices


import HelloWorldApp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import cat.itb.m78.exercices.theme.AppTheme
import io.ktor.client.request.forms.*
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.myImage
import org.jetbrains.compose.reload.DevelopmentEntryPoint
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable

internal fun App() = AppTheme {
    Box(modifier = Modifier.fillMaxSize()){
        Column(){
            Text("This is a resource string")
            Image(
                painter = painterResource(Res.drawable.myImage),
                modifier = Modifier.size(100.dp),
                contentDescription = null
            )
        }
    }

}
