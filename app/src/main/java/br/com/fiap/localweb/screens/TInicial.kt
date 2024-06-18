package br.com.fiap.localweb.screens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.localweb.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TInicial2(navController: NavHostController) {
    Box(
        modifier = Modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    )  {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 640.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 84.dp)
                    .requiredWidth(width = 335.dp)
                    .requiredHeight(height = 381.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 335.dp)
                        .requiredHeight(height = 61.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 61.dp)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 48.dp,
                                y = 9.dp)
                            .requiredWidth(width = 153.dp)
                            .requiredHeight(height = 40.dp)
                    ) {
                        Text(
                            text = "Thiago Silva",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium))
                        Text(
                            text = "Parabéns pelo seu novo cargo!",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 10.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 15.dp)
                                .requiredWidth(width = 153.dp))
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Bom dia Eli! ... ")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff253744),
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Ver mais")}},
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 28.dp))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 16.dp)
                            .requiredSize(size = 30.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
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
                                .offset(x = 10.dp,
                                    y = 7.dp))
                    }
                    Text(
                        text = "07:13",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Light),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 300.dp,
                                y = 9.dp))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 128.dp)
                        .requiredWidth(width = 335.dp)
                        .requiredHeight(height = 61.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 61.dp)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 16.dp)
                            .requiredSize(size = 30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fotodeperfil),
                            contentDescription = "Foto de perfil",
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffd9d9d9)),
                                    shape = CircleShape))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 48.dp,
                                y = 11.dp)
                            .requiredWidth(width = 240.dp)
                            .requiredHeight(height = 40.dp)
                    ) {
                        Text(
                            text = "Alexandre",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium))
                        Text(
                            text = "Lorem ipsum dolor sit amet",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 10.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 15.dp)
                                .requiredWidth(width = 153.dp))
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Lorem ipsum dolor sit amet, consectetur ...")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff253744),
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Ver mais")}},
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 28.dp))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 64.dp)
                        .requiredWidth(width = 335.dp)
                        .requiredHeight(height = 61.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 61.dp)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 16.dp)
                            .requiredSize(size = 30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fotodeperfil),
                            contentDescription = "Foto de perfil",
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
                                .clip(shape = CircleShape))
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 48.dp,
                                y = 10.dp)
                            .requiredWidth(width = 240.dp)
                            .requiredHeight(height = 40.dp)
                    ) {
                        Text(
                            text = "Júlia",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium))
                        Text(
                            text = "Lorem ipsum dolor sit amet",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 10.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 15.dp)
                                .requiredWidth(width = 153.dp))
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Lorem ipsum dolor sit amet, consectetur ...")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff253744),
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Ver mais")}},
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 28.dp))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 192.dp)
                        .requiredWidth(width = 335.dp)
                        .requiredHeight(height = 61.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 61.dp)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 10.dp,
                                y = 15.dp)
                            .requiredSize(size = 30.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredSize(size = 30.dp)
                                    .clip(shape = CircleShape)
                                    .background(color = Color(0xffe3acdd)))
                            Text(
                                text = "R",
                                color = Color.White,
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Black),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 10.dp,
                                        y = 7.dp))
                        }
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 48.dp,
                                y = 11.dp)
                            .requiredWidth(width = 240.dp)
                            .requiredHeight(height = 40.dp)
                    ) {
                        Text(
                            text = "Rodrigues",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium))
                        Text(
                            text = "Lorem ipsum dolor sit amet",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 10.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 15.dp)
                                .requiredWidth(width = 153.dp))
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Lorem ipsum dolor sit amet, consectetur ...")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff253744),
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Light)) {append("Ver mais")}},
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 28.dp))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 256.dp)
                        .requiredWidth(width = 335.dp)
                        .requiredHeight(height = 61.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 61.dp)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp,
                                y = 15.dp)
                            .requiredSize(size = 30.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fotodeperfil),
                                contentDescription = "Foto de perfil",
                                modifier = Modifier
                                    .requiredSize(size = 30.dp)
                                    .clip(shape = CircleShape)
                                    .border(border = BorderStroke(1.dp, Color(0xffd9d9d9)),
                                        shape = CircleShape))
                        }
                    }
                    TextButton(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 48.dp,
                                y = 11.dp)
                            .requiredWidth(width = 240.dp)
                            .requiredHeight(height = 40.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 240.dp)
                                .requiredHeight(height = 40.dp)
                        ) {
                            Text(
                                text = "Cecília",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium))
                            Text(
                                text = "Lorem ipsum dolor sit amet",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 10.sp),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 15.dp)
                                    .requiredWidth(width = 153.dp))
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(style = SpanStyle(
                                        color = Color.Black,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Light)) {append("Lorem ipsum dolor sit amet, consectetur ...")}
                                    withStyle(style = SpanStyle(
                                        color = Color(0xff253744),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Light)) {append("Ver mais")}},
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 28.dp))
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 320.dp)
                        .requiredWidth(width = 335.dp)
                        .requiredHeight(height = 61.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 61.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 335.dp)
                                .requiredHeight(height = 61.dp)
                                .background(color = Color.White))
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 48.dp,
                                    y = 11.dp)
                                .requiredWidth(width = 274.dp)
                                .requiredHeight(height = 44.dp)
                        ) {
                            Text(
                                text = "Grupo Seres",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium))
                            Text(
                                text = "Lorem ipsum dolor sit amet",
                                color = Color.Black,
                                style = TextStyle(
                                    fontSize = 10.sp),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 15.dp)
                                    .requiredWidth(width = 153.dp))
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(style = SpanStyle(
                                        color = Color.Black,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Light)) {append("Lorem ipsum dolor sit amet, consectetur ...")}
                                    withStyle(style = SpanStyle(
                                        color = Color(0xff253744),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Light)) {append("Ver mais")}},
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 28.dp))
                            Image(
                                painter = painterResource(id = R.drawable.image47),
                                contentDescription = "image 47",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 254.dp,
                                        y = 24.dp)
                                    .requiredSize(size = 20.dp))
                        }
                        Text(
                            text = "29/01",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Light),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 299.dp,
                                    y = 11.dp))
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 10.dp,
                                    y = 15.dp)
                                .requiredSize(size = 30.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredSize(size = 30.dp)
                                    .clip(shape = CircleShape)
                                    .background(color = Color(0xff408d56)))
                            Text(
                                text = "GS",
                                color = Color.White,
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Black),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 4.dp,
                                        y = 7.dp))
                        }
                    }
                }
            }
            TextButton(
                onClick = {     navController.navigate("escrever")},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 235.dp,
                        y = 579.dp)
                    .requiredWidth(width = 99.dp)
                    .requiredHeight(height = 29.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 99.dp)
                        .requiredHeight(height = 29.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 99.dp)
                            .requiredHeight(height = 29.dp)
                            .clip(shape = RoundedCornerShape(7.dp))
                            .background(color = Color(0xffec1844)))
                    Text(
                        text = "Novo email",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 15.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 12.dp,
                                y = 5.dp))
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 58.dp)
                    .requiredWidth(width = 333.dp)
                    .requiredHeight(height = 16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 2.dp)
                        .requiredWidth(width = 142.dp)
                        .requiredHeight(height = 12.dp)
                ) {
                    Text(
                        text = "Recentes",
                        color = Color(0xff898989),
                        style = TextStyle(
                            fontSize = 10.sp))
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0x0CD9D9D9)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 54.99998480081558.dp,
                                y = 1.0000612614676356.dp)
                            .requiredWidth(width = 11.dp)
                            .requiredHeight(height = 10.dp)
                            .rotate(degrees = 179.75f)){ }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 89.dp,
                                y = 0.dp)
                            .requiredWidth(width = 53.dp)
                            .requiredHeight(height = 12.dp)
                    ) {
                        Text(
                            text = "1-50 de 52",
                            color = Color(0xff898989),
                            style = TextStyle(
                                fontSize = 10.sp))
                    }
                }
                TextButton(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 298.dp,
                            y = 0.dp)
                        .requiredWidth(width = 35.dp)
                        .requiredHeight(height = 16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 35.dp)
                            .requiredHeight(height = 16.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 35.dp)
                                .requiredHeight(height = 16.dp)
                                .clip(shape = RoundedCornerShape(3.dp))
                                .background(color = Color.White)
                                .border(border = BorderStroke(1.dp, Color.Black),
                                    shape = RoundedCornerShape(3.dp)))
                        Text(
                            text = "Tags",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 8.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 7.dp,
                                    y = 3.dp))
                    }
                }
            }
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "Perfil",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 315.dp,
                        y = 14.dp)
                    .requiredWidth(width = 30.dp)
                    .requiredHeight(height = 32.dp)
                    .clip(shape = RoundedCornerShape(73.dp)))
            val containerColor = Color(0xffd9d9d9)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "Pesquisar email",
                        color = Color(0xff253744),
                        style = TextStyle(
                            fontSize = 10.sp))
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = containerColor,
                    unfocusedContainerColor = containerColor,
                    disabledContainerColor = containerColor,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 54.dp,
                        y = 14.dp)
                    .requiredWidth(width = 252.dp)
                    .requiredHeight(height = 31.dp))
            TextButton(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 25.dp)
                    .requiredWidth(width = 20.dp)
                    .requiredHeight(height = 10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 20.dp)
                        .requiredHeight(height = 10.dp)
                ) {
                    Divider(
                        color = Color(0xff212e3a),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 5.dp)
                            .requiredWidth(width = 20.dp))
                    Divider(
                        color = Color(0xff212e3a),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 10.dp)
                            .requiredWidth(width = 20.dp))
                    Divider(
                        color = Color(0xff212e3a),
                        modifier = Modifier
                            .requiredWidth(width = 20.dp))
                }
            }
        }
    }
}
