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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R

@Composable
fun RegistrationAcessDataScreen() {
    var mandatory = "*"

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
        ){

            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.white),
                )) {
                Image(
                    painterResource(id = R.drawable.botaovoltar),
                    contentDescription = "back button ",
                    modifier = Modifier
                        .size(width = 20.dp, height = 20.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(700.dp)
                .width(300.dp)
                .offset(y = (50).dp)
                .padding(end = 32.dp, start = 32.dp),

            ){
            Text(
                text="Dados de acesso",
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.blue),
                fontSize = 20.sp
            )
            Text(
                text="Estamos quase lá. Agora só falta seus " +
                        "dados de acesso.",
                color = colorResource(id = R.color.gray),
                fontSize = 12.sp
            )

            // User Email
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Email:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )
            OutlinedTextField(
                value = "Email",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
            )

            // User Phone
            Text(
                text = "Celular:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )
            OutlinedTextField(
                value = "(DDD) XXXXXXXXX",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            // User Password
            Text(
                text = "Senha:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )
            OutlinedTextField(
                value = "Senha",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth())

            // Password requirements
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Sua senha deve incluir:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )
            Text(
                buildAnnotatedString {
                    append("No mínimo 8 caracteres                               ")
                    withStyle(style = SpanStyle(color = Color.Yellow)) {
                        append("*")
                    }
                    append("\nUma letra maiúscula                                    ")
                    withStyle(style = SpanStyle(color = Color.Yellow)) {
                        append("*")
                    }
                    append("\nUm número                                                   ")
                    withStyle(style = SpanStyle(color = Color.Yellow)) {
                        append("*")
                    }
                    append("\nUm caractere especial                                 ")
                    withStyle(style = SpanStyle(color = Color.Yellow)) {
                        append("*")
                    }
                }
            )

            // Terms and conditions
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Ao clicar em \"Cadastrar\", você concorda com os " +
                        "Termos e Condições, Política de Privacidade e " +
                        "Política de Cookies do Locamail",
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.gray),
                fontSize = 13.sp
            )


            // Navigation
            Spacer(modifier = Modifier.height(70.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painterResource(id= R.drawable.second),
                    contentDescription = "página atual",
                    modifier = Modifier
                        .size(width = 20.dp, height = 20.dp)
                )
                // Register
                Spacer(modifier = Modifier)
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.red)
                    )){
                    Text(
                        text = "Cadastrar")
                }
            }
        }
    }
}