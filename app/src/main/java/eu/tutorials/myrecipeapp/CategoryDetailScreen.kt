package eu.tutorials.myrecipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = category.strCategory,
            textAlign = TextAlign.Center,
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 24.sp))
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = "",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )
        Box(modifier = Modifier.fillMaxWidth().
            background(Color.LightGray,
                shape = RoundedCornerShape(16.dp))
                .padding(16.dp)
        ){
            Text(text = category.strCategoryDescription,
                textAlign = TextAlign.Justify,
                modifier = Modifier.verticalScroll(rememberScrollState())
                    .fillMaxWidth()
                    .padding(start = 10.dp))
        }

    }
}