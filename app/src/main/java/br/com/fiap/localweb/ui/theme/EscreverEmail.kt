package br.com.fiap.localweb.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R

@Composable
fun EscreverEmail(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 60.dp)
                .background(color = Color.White))
        Text(
            text = "Nova mensagem",
            color = Color(0xff253744),
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 65.dp,
                    y = 21.dp))
        Text(
            text = "<-",
            color = Color(0xff253744),
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 18.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 580.dp)
                .requiredWidth(width = 298.dp)
                .requiredHeight(height = 29.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 218.dp,
                        y = 0.dp)
                    .requiredWidth(width = 80.dp)
                    .requiredHeight(height = 29.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 80.dp)
                        .requiredHeight(height = 29.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color(0xffec1844)))
                Text(
                    text = "Enviar ->",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 12.dp,
                            y = 5.dp))
            }
            Box(
                modifier = Modifier
                    .requiredWidth(width = 85.dp)
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
                    painter = painterResource(id = R.drawable.adicionaremoji),
                    contentDescription = "Adicionar Emoji",
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
            }
        }
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color(0xff898989),
                    fontSize = 15.sp)) {append("De:")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 15.sp)) {append(" ")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 15.sp)) {append("elialbano@email.com")}},
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 60.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 79.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 18.dp)
        ) {
            Text(
                text = "Para:",
                color = Color(0xff898989),
                style = TextStyle(
                    fontSize = 15.sp),
                modifier = Modifier
                    .requiredWidth(width = 211.dp))
        }
        Text(
            text = "Escrever email...",
            color = Color(0xff898989),
            style = TextStyle(
                fontSize = 10.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 152.dp))
        Text(
            text = "Assunto",
            color = Color(0xff898989),
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 21.dp,
                    y = 113.dp))
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun EscreverEmailPreview() {
    EscreverEmail(Modifier)
}