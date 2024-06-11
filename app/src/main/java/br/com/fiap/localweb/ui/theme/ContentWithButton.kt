package br.com.fiap.localweb.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.TInicial

@Composable
fun ContentWithButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            contentColor = LocalContentColor.current.copy(alpha = 0.87f)
        ),
        modifier = Modifier
            .padding(start = 9.dp, top = 16.dp)
            .requiredSize(size = 30.dp)
            .clickable(onClick = onClick)
    ) {
        Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = null,
            modifier = Modifier.size(16.dp)
        )
    }
}

@Composable
fun TextsAndButton() {
    Column {
        Text(
            text = "Thiago Silva",
            color = Color.Black,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        )
        Text(
            text = "Parabéns pelo seu novo cargo!",
            color = Color.Black,
            style = TextStyle(
                fontSize = 10.sp
            ),
            modifier = Modifier
                .padding(start = 0.dp, top = 15.dp)
                .requiredWidth(width = 153.dp)
        )
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light
                )) {
                    append("Bom dia Eli! ... ")
                }
                withStyle(style = SpanStyle(
                    color = Color(0xff253744),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light
                )) {
                    append("Ver mais")
                }
            },
            modifier = Modifier
                .padding(start = 0.dp, top = 28.dp)
        )
        Box(
            modifier = Modifier
                .padding(start = 9.dp, top = 16.dp)
                .requiredSize(size = 30.dp)
                .clickable(onClick = {
                    // Ação a ser executada ao clicar na caixa
                })
        ) {
            // Conteúdo da caixa aqui
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun TInicialPreview() {
   TextsAndButton()
}






