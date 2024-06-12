package com.example.clothing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clothing.ui.theme.ClothingTheme

@Composable
fun HomeScreen(modifier: Modifier=Modifier)
{
    val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 24.sp)
    Column(modifier) {
        Text(style = textStyle,
            text = "Clothing",
            modifier = Modifier.padding(15.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview()
{
    ClothingTheme {
        HomeScreen(modifier = Modifier.fillMaxSize())
    }
}