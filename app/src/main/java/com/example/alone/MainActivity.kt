package com.example.alone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alone.ui.theme.AloneTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )   {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        QuadrantBackground();
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantBackground(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(0.dp)
            .fillMaxSize()

    ) {
        Box( // This is the first(top-left) box.
            modifier = Modifier
                .padding(0.dp)
                .fillMaxHeight(.5f)
                .fillMaxWidth(.5f)
                .background(color = Color(0xFFEADDFF))
                .align(Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth() // This makes sure the Column takes up all available width
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally, // This aligns children horizontally
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.text_composable_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                )
                Text(
                    text = stringResource(R.string.text_composable_body),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                )
            }
        }

        Box( // This is the second(top-right) box.
            modifier = Modifier
                .padding(0.dp)
                .fillMaxHeight(.5f)
                .fillMaxWidth(.5f)
                .background(color = Color(0xFFD0BCFF))
                .align(Alignment.TopEnd),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth() // This makes sure the Column takes up all available width
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally, // This aligns children horizontally
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.image_composable_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                )
                Text(
                    text = stringResource(R.string.image_composable_body),
                    modifier = Modifier,
                    textAlign = TextAlign.Justify,
                )
            }
        }

        Box( // This is the third(bottom-left) box.
            modifier = Modifier
                .padding(0.dp)
                .fillMaxHeight(.5f)
                .fillMaxWidth(.5f)
                .background(color = Color(0xFFB69DF8))
                .align(Alignment.BottomStart),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth() // This makes sure the Column takes up all available width
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally, // This aligns children horizontally
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.row_composable_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                )
                Text(
                    text = stringResource(R.string.row_composable_body),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                )
            }
        }

        Box( // This is the fourth(bottom-right) box.
            modifier = Modifier
                .padding(0.dp)
                .fillMaxHeight(.5f)
                .fillMaxWidth(.5f)
                .background(color = Color(0xFFF6EDFF))
                .align(Alignment.BottomEnd),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth() // This makes sure the Column takes up all available width
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally, // This aligns children horizontally
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.column_composable_heading),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                )
                Text(
                    text = stringResource(R.string.column_composable_body),
                    modifier = Modifier,
                    textAlign = TextAlign.Justify,
                )
            }
        }
    }
}

@Composable
fun TaskComplete(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(CenterHorizontally)
        )

        Text(
            text =  stringResource(R.string.first_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )

        Text(
            text =  stringResource(R.string.second_text),
            fontSize = 16.sp,
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun AndroidText(modifier: Modifier = Modifier) {
    Column() {
        Text(
            text = stringResource(id = R.string.jetpack_compose_tutorial_heading),
            style = TextStyle(
                fontSize = 24.sp,
            ),
            modifier = modifier
                .padding(16.dp)
        )

        Text(
            text = stringResource(id = R.string.first_text),
            style = TextStyle(
            ),
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = stringResource(id = R.string.second_text),
            style = TextStyle(
            ),
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(16.dp)
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun BackgroundImage() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = stringResource(id = R.string.bg_compose_background_description),
            modifier = Modifier
                .align(Alignment.TopCenter)
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AloneTheme {
        Greeting("Android")
    }
}