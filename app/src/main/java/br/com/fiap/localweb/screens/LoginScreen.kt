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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var emailError by remember {
        mutableStateOf(false)
    }
    var passwordSize = 8



    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Descrition
        Column(
            modifier = Modifier
                .padding(100.dp)
                .fillMaxWidth()
                .offset(y = (200).dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Login",
                color = colorResource(id = R.color.blue),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .width(600.dp)
                .offset(y = (360).dp)
                .padding(end = 32.dp, start = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // User Email
            Text(
                text = "Email",
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )

            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                    if (email.length > 0) emailError = false
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                label = {
                Text(text = stringResource(id = R.string.email))
                },
                isError = emailError,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
            )
                /*if(emailError){
                   Text(
                      text = "Email é obrigatório",
                      modififer = Modifier
                          .fillMaxWidth(),
                      color = Color.Red,
                      textAlign = TextAlign.End
                  )
              }*/

            // User Password
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Senha",
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )
            OutlinedTextField(
                value = password,
                onValueChange = {
                    if (it.length <= passwordSize)
                        password = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                visualTransformation = PasswordVisualTransformation()
            )

            // Button Login
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.red)
                    )
                ) {
                    Text(
                        text = "Fazer login",
                        textAlign = TextAlign.Center
                    )
                }
            }

                Column(
                    modifier = Modifier.padding(
                        vertical = 16.dp,
                        horizontal = 32.dp
                    )
                ) {
                    Spacer(modifier = Modifier.height(15.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.white)
                        )
                    ) {
                        Text(
                            text = "Quero fazer cadastro",
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth(),
                            color = colorResource(id = R.color.black),
                            fontSize = 12.sp
                        )
                    }
                }
        }
    }
}