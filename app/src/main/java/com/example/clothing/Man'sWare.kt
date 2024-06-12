package com.example.clothing

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clothing.ui.theme.ClothingTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

private val favoriteCollectionsData = listOf(
    R.drawable.p1 to R.string.W1,
    R.drawable.p2 to R.string.W2,
    R.drawable.p3 to R.string.W3,
    R.drawable.p4 to R.string.W4,
    R.drawable.p5 to R.string.W5,
    R.drawable.p6 to R.string.W6,
    R.drawable.p9 to R.string.W9
).map { DrawableStringPair(it.first, it.second) }
private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)
@Composable
fun FavoriteCollectionCard(
    @DrawableRes draw :Int,
    @StringRes text :Int,
    modifier: Modifier = Modifier
) {
    val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 30.sp)
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.small
    ) {
        Column(modifier = Modifier.size(height = 500.dp, width = 1080.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painterResource(id = draw),
                contentDescription = null,
                modifier = Modifier.size(width = 500.dp, height = 450.dp),
                contentScale = ContentScale.Crop)
            Text(
                stringResource(id = text),
                modifier = Modifier.padding(horizontal = 16.dp),
                style = textStyle
            )
        }
    }
}
@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxWidth(1f),
    ) {
        items(favoriteCollectionsData) {
                item -> FavoriteCollectionCard(
                    item.drawable,
                    item.text,
                    modifier = Modifier.padding(5.dp)
                )
        }
    }
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionsGridPreview() {
    ClothingTheme { FavoriteCollectionsGrid() }
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionCardPreview() {
    ClothingTheme { FavoriteCollectionCard(draw = R.drawable.p1, text = R.string.W1) }
}