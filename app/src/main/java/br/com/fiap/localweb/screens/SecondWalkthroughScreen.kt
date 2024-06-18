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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.localweb.R


// segunda tela walkthrough
@Composable
fun SecondWalkthroughScreen(navController: NavHostController) {
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
                painterResource(id= R.drawable.walkthrough2),
                contentDescription = "image of a message icon ",
                modifier = Modifier
                    .size(width = 500.dp, height = 700.dp)
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
                        text="Simplifique sua Rotina com \nnosso calendario",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.blue),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(

                        text="Nosso maior diferencial é nossa integração \n" +
                                "com seu calendário, conseguimos deixar ele bem \n" +
                                "organizado com base nas marcações dos seus e-mails\n",

                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        color = colorResource(id = R.color.black),
                        fontSize = 12.sp
                    )

                    Text(

                        text="Conheça o calendário do Locaweb, projetado para\n"+"" +
                                "organizar sua rotina de maneira eficiente. Gerencie seus\n" +
                                "compromissos de forma intuitiva e prática, tudo em um\n"+
                                "só lugar. Simplifique sua agenda com o Locaweb!",

                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        color = colorResource(id = R.color.black),
                        fontSize = 12.sp
                    )
                }

                //organizar componentes dentro  da row
                Spacer(modifier = Modifier.height(180.dp))
                Row(horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Image(
                        painterResource(id= R.drawable.second),
                        contentDescription = "back button ",
                        modifier = Modifier
                            .size(width = 20.dp, height = 20.dp)
                    )
                    Button(onClick = { navController.navigate("inicio") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.white)

                        )){
                        Image(
                            painterResource(id= R.drawable.botaovoltar),
                            contentDescription = "back button ",
                            modifier = Modifier
                                .size(width = 20.dp, height = 20.dp)
                        )
                    }

                    Button(
                        onClick = {    navController.navigate("login") },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.red)
                        )
                    ){
                        Text(
                            text = "Continuar")

                    }
                }
            }
        }
    }
}

//@Preview(widthDp = 360, heightDp = 640)
//@Composable
//private fun RegistrationAcessDataScreenPreview() {
//    RegistrationAcessDataScreen(navController)
//}