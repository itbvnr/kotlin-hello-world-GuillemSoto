import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun HelloWorldApp() {
    data class Message(val author: String, val body: String)

    val names = listOf(
        "Ellison Curry",
        "Briggs Willis",
        "Alexa Murphy",
        "Cameron Berry",
        "Annabelle Villarreal",
        "Nikolai Wiley",
        "Lauryn Morrow",
        "Kyree Hardy",
        "Jessica Lang",
        "Wells Wilson",
        "Luna Foster",
        "Kayden Taylor",
        "Sofia Mann",
        "Nehemiah Randall",
        "Christina Gordon",
        "Karter Kramer",
        "Hanna Morales",
        "Aaron Velez",
        "Megan Delarosa",
        "Osiris Johnson",
        "Emma Atkins",
        "Cason McKee",
        "Kori Walls",
        "Larry Shepherd",
    )
    val body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In ac vestibulum nunc."
    val messages = List(100){
        Message(names.random(), body)
    }
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    )
    {
        messages.forEach { message ->
            item {
                Column(modifier = Modifier.height(Dp(100f)).width(Dp(300f)).background(color = Color.Magenta, RoundedCornerShape(Dp(15f))).border(
                    BorderStroke(Dp(2f),Color.White)
                )) {
                    Text(message.author)
                    Text(message.body)
                }
            }
        }
    }
}
