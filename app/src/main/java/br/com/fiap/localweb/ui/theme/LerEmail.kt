package br.com.fiap.localweb.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R

@Composable
fun LerEmail(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 576.dp)
                .requiredWidth(width = 329.dp)
                .requiredHeight(height = 53.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 329.dp)
                    .requiredHeight(height = 53.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .background(color = Color.White))
            Text(
                text = "Responder email...",
                color = Color(0xff898989),
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 17.dp,
                        y = 19.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 186.dp,
                        y = 15.dp)
                    .requiredWidth(width = 114.dp)
                    .requiredHeight(height = 25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.adicionarlink),
                    contentDescription = "Adicionar Link",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 30.dp,
                            y = 1.dp)
                        .requiredSize(size = 24.dp))
                Image(
                    painter = painterResource(id = R.drawable.adicionardocumento),
                    contentDescription = "Adicionar Documento",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 1.dp)
                        .requiredWidth(width = 23.dp)
                        .requiredHeight(height = 24.dp))
                Image(
                    painter = painterResource(id = R.drawable.adicionarimagem),
                    contentDescription = "Adicionar Imagem",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 60.dp,
                            y = 0.dp)
                        .requiredSize(size = 25.dp))
                Image(
                    painter = painterResource(id = R.drawable.enviaremail),
                    contentDescription = "Enviar email",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 92.dp,
                            y = 1.dp)
                        .requiredWidth(width = 22.dp)
                        .requiredHeight(height = 21.dp))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 511.dp)
                .requiredWidth(width = 275.dp)
                .requiredHeight(height = 36.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .requiredWidth(width = 275.dp)
                    .requiredHeight(height = 36.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 3.dp)
                    .requiredWidth(width = 248.dp)
                    .requiredHeight(height = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image41),
                    contentDescription = "image 41",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 4.dp)
                        .requiredWidth(width = 20.dp)
                        .requiredHeight(height = 19.dp))
                Text(
                    text = "Lorem.pdf",
                    color = Color(0xff898989),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 30.dp,
                            y = 0.dp))
                Text(
                    text = "156 KB",
                    color = Color(0xff898989),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 30.dp,
                            y = 15.dp))
                Text(
                    text = "X",
                    color = Color(0xff898989),
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 238.dp,
                            y = 7.dp))
            }
        }
        Image(
            painter = painterResource(id = R.drawable.image39),
            contentDescription = "image 39",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                    y = 362.dp)
                .requiredWidth(width = 307.dp)
                .requiredHeight(height = 138.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                    y = 176.dp)
                .requiredWidth(width = 311.dp)
                .requiredHeight(height = 168.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    append("Bom dia Eli!!\n\n")
                    append("Quero começar expressando minha mais sincera felicidade ao \nsaber da sua nova conquista! Não consigo nem começar a dizer\no quão orgulhoso estou de você e de tudo o que alcançou até \nagora.\n\n")
                    append("Saiba que estou aqui para apoiá-lo em tudo o que precisar \ndurante esta transição e além. Se houver algo em que eu possa \najudar ou se precisar de conselhos, não hesite em entrar em \ncontato. Estou sempre disponível para você.\n\n")
                    append("Com os melhores cumprimentos,\nThiago Santos")
                } ,
                color = Color.Black,
                lineHeight = 12.09.em,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 24.dp)
                .requiredWidth(width = 322.dp)
                .requiredHeight(height = 138.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 3.dp,
                        y = 90.dp)
                    .requiredWidth(width = 307.dp)
                    .requiredHeight(height = 48.dp)
            ) {
                Text(
                    text = "Parabéns pelo seu\nnovo cargo!",
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 20.sp),
                    modifier = Modifier
                        .requiredWidth(width = 307.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 279.dp,
                        y = 0.dp)
                    .requiredWidth(width = 43.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.adicionartag),
                    contentDescription = "Adicionar Tag",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 2.dp)
                        .requiredWidth(width = 20.dp)
                        .requiredHeight(height = 16.dp))
                Image(
                    painter = painterResource(id = R.drawable.iconedelixeira),
                    contentDescription = "icone de lixeira",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 23.dp,
                            y = 0.dp)
                        .requiredSize(size = 20.dp))
            }
            Text(
                text = "25/Out",
                color = Color(0xff898989),
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 248.dp,
                        y = 34.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 310.dp,
                        y = 32.dp)
                    .requiredWidth(width = 12.dp)
                    .requiredHeight(height = 20.dp)
            ) {
                Text(
                    text = "",
                    color = Color(0xff898989),
                    lineHeight = 15.11.em,
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Medium))
                Text(
                    text = "",
                    color = Color(0xff898989),
                    lineHeight = 15.11.em,
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 10.dp))
                Text(
                    text = "",
                    color = Color(0xff898989),
                    lineHeight = 15.11.em,
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 5.dp))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 34.dp)
                    .requiredSize(size = 40.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredSize(size = 40.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(0xff253744)))
                Text(
                    text = "T",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Black),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 15.333251953125.dp,
                            y = 11.333251953125.dp)
                        .requiredWidth(width = 15.dp)
                        .requiredHeight(height = 24.dp))
            }
            Text(
                text = "thiago.s@email.com",
                color = Color(0xff898989),
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 57.dp,
                        y = 54.dp))
            Text(
                text = "Thiago Silva",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 36.dp))
        }
        Text(
            text = "<-",
            color = Color(0xff253744),
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 18.dp))
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun LerEmailPreview() {
    LerEmail(Modifier)
}