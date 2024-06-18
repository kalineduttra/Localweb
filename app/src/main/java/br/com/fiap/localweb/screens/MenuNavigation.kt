package br.com.fiap.localweb.screens

import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R

@Composable
fun Menu(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 220.dp)
            .fillMaxHeight()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 379.dp)
                .requiredWidth(width = 111.dp)
                .requiredHeight(height = 95.dp)
        ) {

            //TAG VAGAS
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 75.dp)
                    .requiredWidth(width = 72.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .requiredWidth(width = 72.dp)
                        .requiredHeight(height = 19.dp)){ }
                Image(
                    painter = painterResource(id = R.drawable.image47),
                    contentDescription = "image 4",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 4.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
                Text(
                    text = "Vagas",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 32.dp,
                            y = 3.dp))
            }

            //TAG ESPECIAL
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 50.dp)
                    .requiredWidth(width = 86.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .requiredWidth(width = 86.dp)
                        .requiredHeight(height = 19.dp)){ }
                Text(
                    text = "Especial",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 33.dp,
                            y = 1.dp))
                Image(
                    painter = painterResource(id = R.drawable.image46),
                    contentDescription = "image 46",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 3.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
            }

            //TAG REDES SOCIAIS
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 25.dp)
                    .requiredWidth(width = 111.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .requiredWidth(width = 111.dp)
                        .requiredHeight(height = 19.dp)){ }
                Text(
                    text = "Redes Sociais",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 32.dp,
                            y = 2.dp))
                Image(
                    painter = painterResource(id = R.drawable.iconeredesocial),
                    contentDescription = "icone rede social",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 4.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
            }

            //CRIAR NOVA TAG
            Box(
                modifier = Modifier
                    .requiredWidth(width = 111.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .requiredWidth(width = 111.dp)
                        .requiredHeight(height = 19.dp)){ }
                Image(
                    painter = painterResource(id = R.drawable.image48),
                    contentDescription = "image 48",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 3.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
                Text(
                    text = "Criar nova tag",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 31.dp,
                            y = 3.dp))
            }

        }
        //TAGS
        Text(
            text = "Tags",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 18.dp,
                    y = 351.dp))


        //NAVEGAR POR
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 292.dp)
                .requiredWidth(width = 104.dp)
                .requiredHeight(height = 44.dp)
        ) {

            //Reunião
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 24.dp)
                    .requiredWidth(width = 90.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 1.dp)
                        .requiredWidth(width = 90.dp)
                        .requiredHeight(height = 19.dp)){ }
                Image(
                    painter = painterResource(id = R.drawable.iconereuniao),
                    contentDescription = "Icone reunião",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 2.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
                Text(
                    text = "Reuniões",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 31.dp,
                            y = 2.dp))
            }

            //Calendário
            Box(
                modifier = Modifier
                    .requiredWidth(width = 104.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 1.dp)
                        .requiredWidth(width = 104.dp)
                        .requiredHeight(height = 19.dp)){ }
                Image(
                    painter = painterResource(id = R.drawable.iconecalendario),
                    contentDescription = "icone calendrio",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 2.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
                Text(
                    text = "Calendário",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 12.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 31.dp,
                            y = 2.dp))
            }
        }
        Text(
            text = "Navegar por",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 17.999969482421875.dp,
                    y = 269.dp))

        //Meu Conteudo
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 89.dp)
                .requiredWidth(width = 156.dp)
                .requiredHeight(height = 170.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 170.dp)
            ) {

                //Email Agendado
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 150.dp)
                        .requiredWidth(width = 104.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .requiredWidth(width = 104.dp)
                            .requiredHeight(height = 19.dp)){ }
                    Text(
                        text = "Agendados",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.iconedeemailagendado),
                        contentDescription = "icone de email agendado",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }

                //Lixeira
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 125.dp)
                        .requiredWidth(width = 90.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .requiredWidth(width = 90.dp)
                            .requiredHeight(height = 19.dp)){ }
                    Text(
                        text = "Lixeira",
                        color = Color.Black,
                        lineHeight = 10.08.em,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.iconedelixeira),
                        contentDescription = "icone de lixeira",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }

                //Rascunho
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 100.dp)
                        .requiredWidth(width = 90.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 1.dp)
                            .requiredWidth(width = 90.dp)
                            .requiredHeight(height = 19.dp)){ }
                    Text(
                        text = "Rascunho",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.iconederascunho),
                        contentDescription = "icone de rascunho",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }

                //Icone de enviados
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 75.dp)
                        .requiredWidth(width = 86.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .requiredWidth(width = 86.dp)
                            .requiredHeight(height = 19.dp)){ }
                    Text(
                        text = "Enviados",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.iconeenviaremail),
                        contentDescription = "icone enviar email",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }

                //Favorito
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 50.dp)
                        .requiredWidth(width = 86.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .requiredWidth(width = 86.dp)
                            .requiredHeight(height = 19.dp)){ }
                    Text(
                        text = "Favoritos",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.image45),
                        contentDescription = "image 45",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }

                //Aberto recentemente
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 25.dp)
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .requiredWidth(width = 156.dp)
                            .requiredHeight(height = 20.dp)){ }
                    Text(
                        text = "Aberto recentemente",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.image43),
                        contentDescription = "image 43",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }

                //Inbox
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 72.dp)
                        .requiredHeight(height = 20.dp)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 1.dp)
                            .requiredWidth(width = 72.dp)
                            .requiredHeight(height = 19.dp)){ }
                    Text(
                        text = "Inbox",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 34.dp,
                                y = 1.dp))
                    Image(
                        painter = painterResource(id = R.drawable.image44),
                        contentDescription = "image 44",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 0.dp)
                            .requiredSize(size = 20.dp))
                }
            }
        }

        //Inicio, Logo, Menu
        Text(
            text = "Meu conteúdo",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 61.dp))
        Text(
            text = "LocaMail",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 90.dp,
                    y = 13.dp))
        Image(
            painter = painterResource(id = R.drawable.image24),
            contentDescription = "image 24",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 58.dp,
                    y = 10.dp)
                .requiredWidth(width = 33.dp)
                .requiredHeight(height = 30.dp))
        IconButton(
            onClick = { },
            content = {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    modifier = Modifier.size(25.dp) )},
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 5.dp,
                    y = 2.dp)

        )
    }
}

//@Preview(widthDp = 360, heightDp = 640)
//@Composable
//private fun MenuPreview() {
//    Menu(Modifier)
//}