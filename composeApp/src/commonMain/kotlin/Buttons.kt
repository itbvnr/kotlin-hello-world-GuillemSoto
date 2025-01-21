import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun GmGn() {
    Column {
        val text = remember { mutableStateOf("Good ?!") }
        Text(text.value)
        Button(onClick = {
            text.value = "Good Morning"
        }) {
            Text("Morning")
        }
        Button(onClick = {
            text.value = "Good Night"
        }) {
            Text("Night")
        }
    }
}
