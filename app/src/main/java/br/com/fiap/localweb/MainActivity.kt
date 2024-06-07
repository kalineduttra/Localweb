package br.com.fiap.localweb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.ui.theme.LocalwebTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocalwebTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Walkthrough()
                }
            }
        }
    }
}

@Composable
fun Walkthrough() {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        // header
        Column(
           horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        ){
            Image(
                painterResource(id=R.drawable.walkthrough),
                contentDescription = "image of a message icon ",
                modifier = Modifier
                    .size(width = 500.dp, height = 700.dp)
            )
            Text(
                text="Pular",
                textAlign = TextAlign.End
            )
        }

        //descrição
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Card(
                modifier = Modifier
                    .height(600.dp)
                    .width(600.dp)
                    .offset(y = (360).dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(topEnd =50.dp, topStart = 50.dp)
            ){
                Column(
                    modifier = Modifier.padding(
                        vertical = 16.dp,
                        horizontal = 32.dp
                    )
                ){
                    Text(
                        text="Bem vindo(a) ao Locamail",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.black),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text="Lorem ipsum dolor sit amet, consectetur adipiscing\n" +
                                "elit, sed do eiusmod tempor incididunt ut labore et\n" +
                                "dolore magna aliqua. Ut enim ad minim veniam, \n" +
                                "quis nostrud exercitation ullamco",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        color = colorResource(id = R.color.black),
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.height(150.dp))
                Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                ){

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.red)
                    )){
                    Text(
                        text = "➔")
                }
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun WalkthroughPreview() {
    LocalwebTheme {
        Walkthrough()
    }
}

// segunda tela walkthrough
@Composable
fun Walkthrough2() {
    Text(
        text = "Hello "

    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Walkthrough2Preview() {
    LocalwebTheme {
        Walkthrough2()
    }
}