package br.com.fiap.localweb

import PersonalDataRegistrationScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.localweb.screens.LoginScreen
import br.com.fiap.localweb.screens.RegistrationAcessDataScreen
import br.com.fiap.localweb.screens.SecondWalkthroughScreen
import br.com.fiap.localweb.screens.WalkthroughScreen
import br.com.fiap.localweb.ui.theme.LocalwebTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocalwebTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    WalkthroughScreen()
                }
            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun WalkthroughScreenPreview() {
    LocalwebTheme {
        WalkthroughScreen()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SecondWalkthroughScreenPreview() {
    LocalwebTheme {
        SecondWalkthroughScreen()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    LocalwebTheme {
        LoginScreen()
    }
}

@Preview(showSystemUi=true, showBackground = true)
@Composable
fun PersonalDataRegistrationPreview(){
    LocalwebTheme {
        PersonalDataRegistrationScreen()
    }
}

@Preview(showSystemUi=true, showBackground=true)
@Composable
fun RegistrationAcessDataPreview(){
    LocalwebTheme {
        RegistrationAcessDataScreen()
    }
}