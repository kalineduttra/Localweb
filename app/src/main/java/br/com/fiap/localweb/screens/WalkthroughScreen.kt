package br.com.fiap.localweb.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R


@Composable
fun WalkthroughScreen() {
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
                painterResource(id= R.drawable.walkthrough),
                contentDescription = "image of a message icon",
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
                        color = colorResource(id = R.color.blue),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text="O app de e-mail que revoluciona sua caixa de entrada!\n" +
                                "Simplifique a gestão dos seus e-mails com nossa\n" +
                                "interface intuitiva e funcionalidades avançadas.",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        color = colorResource(id = R.color.black),
                        fontSize = 12.sp
                    )
                }

                Spacer(modifier = Modifier.height(200.dp))
                Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Image(
                        painterResource(id= R.drawable.first),
                        contentDescription = "página atual",
                        modifier = Modifier
                            .size(width = 20.dp, height = 20.dp)

                    )
                    Spacer(modifier = Modifier)
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
