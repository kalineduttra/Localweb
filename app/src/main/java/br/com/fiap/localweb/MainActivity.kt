package br.com.fiap.localweb

import PersonalDataRegistrationScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import br.com.fiap.localweb.screens.EscreverEmail
import br.com.fiap.localweb.screens.LerEmail
import br.com.fiap.localweb.screens.LoginScreen
import br.com.fiap.localweb.screens.RegistrationAcessDataScreen
import br.com.fiap.localweb.screens.SecondWalkthroughScreen
import br.com.fiap.localweb.screens.TInicial2
import br.com.fiap.localweb.screens.WalkthroughScreen
import br.com.fiap.localweb.screens.WelcomeScreen
import br.com.fiap.localweb.ui.theme.LocalwebTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocalwebTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }

                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "inicio"
                ) {
                    composable(route = "inicio") {
                        WalkthroughScreen(navController)
                    }

                    composable(route = "segunda") {
                        SecondWalkthroughScreen(navController)
                    }

                    composable(route = "login") {
                        LoginScreen(navController)
                    }

                    composable(route = "cadastro1") {
                        PersonalDataRegistrationScreen(navController)
                    }

                    composable(route = "cadastro2") {
                        RegistrationAcessDataScreen(navController)
                    }

                    composable(route = "welcome") {
                        WelcomeScreen(navController)
                    }

                    composable(route = "home") {
                        TInicial2(navController)
                    }

                    composable(route = "ler") {
                        LerEmail(navController)
                    }

                    composable(route = "escrever") {
                        EscreverEmail(navController)
                    }


                }
            }
        }
    }}

