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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.localweb.R

@Composable
fun PersonalDataRegistrationScreen() {
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
                text="Informações",
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.blue),
                fontSize = 20.sp
            )
            Text(
                text="Preencha os campos abaixo para criar \n" +
                        "a sua conta no Locamail",
                color = colorResource(id = R.color.gray),
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Nome:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )

            OutlinedTextField(
                value = "Nome",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Data de nascimento:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 15.sp
            )
            OutlinedTextField(
                value = "DD/MM/AAAA",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth())

            Spacer(modifier = Modifier.height(400.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painterResource(id= R.drawable.first),
                    contentDescription = "página atual",
                    modifier = Modifier
                        .size(width = 20.dp, height = 20.dp)

                )
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