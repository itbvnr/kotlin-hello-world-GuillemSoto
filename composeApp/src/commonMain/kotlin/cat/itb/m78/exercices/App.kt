package cat.itb.m78.exercices


import HelloWorldApp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.itb.m78.exercices.theme.AppTheme
import io.ktor.client.request.forms.*
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.myImage
import org.jetbrains.compose.reload.DevelopmentEntryPoint
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
data class Contact(val fullName: String, val email: String, val phone: String)
val contact = Contact("Marta Casserres", "marta@example.com", "934578484")
@Composable
internal fun App() = AppTheme {
    Box(modifier = Modifier.fillMaxSize()){
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(Res.drawable.myImage),
                modifier = Modifier.size(100.dp).clip(shape = CircleShape),
                contentDescription = null
            )
            Text(contact.fullName, fontSize = 35.sp, fontWeight = FontWeight.Bold)
            Box(modifier = Modifier.background(color = Color.LightGray)){
                Column{
                    Text(contact.email)
                    Text(contact.phone)
                    //si
                }
            }
        }
    }

}
