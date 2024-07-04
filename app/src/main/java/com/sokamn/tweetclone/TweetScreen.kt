package com.sokamn.tweetclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
Gris: 0xFF828286
Negro: 0xFF010001
Azul verificado: 0xFF1A99ED
 */

@Preview
@Composable
fun TweetScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF010001))
            .padding(8.dp),

        ) {
        Tweet()
    }


}

@Composable
fun Tweet() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(700.dp)
    ) {
        ProfileLogo(Modifier)
        Spacer(modifier = Modifier.size(8.dp))
        Main(Modifier)
    }
}

@Composable
fun Main(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Header()
        Body()
        Footer()
    }
}

@Composable
fun Footer() {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(modifier = Modifier.weight(3f).padding(horizontal = 8.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            CommentButton()
            RetweetButton()
            LikeButton()
            TrendStats()
        }
        Row(modifier = Modifier.weight(1f).padding(horizontal = 8.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            SaveButton(modifier = Modifier)
            ShareButton(modifier = Modifier)
        }

    }
}

@Composable
fun ShareButton(modifier: Modifier) {
    IconButton(modifier = modifier.size(24.dp),onClick = {}) {
        Icon(
            imageVector = Icons.Default.Share,
            contentDescription = "Share",
            tint = Color(0xFF828286)
        )
    }
}

@Composable
fun SaveButton(modifier: Modifier) {
    IconButton(modifier = modifier.size(24.dp),onClick = {}) {
        Icon(
            imageVector = Icons.Default.ShoppingCart,
            contentDescription = "Save",
            tint = Color(0xFF828286)
        )
    }
}

@Composable
fun LikeButton() {
    Row(Modifier.clickable {

    }, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.FavoriteBorder,
            contentDescription = "Like",
            tint = Color(0xFF828286)
        )
        Text(text = "1", color = Color(0xFF828286))
    }
}

@Composable
fun TrendStats() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Retweet",
            tint = Color(0xFF828286)
        )
        Text(text = "1", color = Color(0xFF828286))
    }
}

@Composable
fun RetweetButton() {
    Row(Modifier.clickable {

    }, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Refresh,
            contentDescription = "Retweet",
            tint = Color(0xFF828286)
        )
        Text(text = "1", color = Color(0xFF828286))
    }
}

@Composable
fun CommentButton() {
    Row(Modifier.clickable {

    }, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Comments",
            tint = Color(0xFF828286)
        )
        Text(text = "1", color = Color(0xFF828286))
    }
}

@Composable
fun Body() {
    Description()
    TweetImage()
}

@Composable
fun TweetImage() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clip(MaterialTheme.shapes.medium),
        contentScale = ContentScale.FillWidth,
        alignment = Alignment.TopCenter,
        painter = painterResource(id = R.drawable.image),
        contentDescription = "Tweet Image"
    )
}

@Composable
fun Description() {
    Text(
        text = "Dylan la verdad es que me gusta valen y no me importa que sea tu novia\nPUTO",
        fontSize = 13.sp,
        color = Color.White
    )
}

@Composable
fun Header() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Title()
        MoreOptions()
    }

}

@Composable
fun MoreOptions() {
    Icon(
        modifier = Modifier.size(16.dp),
        imageVector = Icons.Default.MoreVert,
        contentDescription = "More Options",
        tint = Color(0xFF828286)
    )
}

@Composable
fun Title() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        NickName()
        VerifiedIcon()
        UserName()
    }
}

@Composable
fun NickName() {
    Text(
        text = "Matías Alzú",
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = Color.White
    )
}

@Composable
fun VerifiedIcon() {
    Icon(
        modifier = Modifier
            .size(16.dp)
            .padding(horizontal = 2.dp),
        imageVector = Icons.Default.AddCircle,
        contentDescription = "Verified",
        tint = Color(0xFF1A99ED)
    )
}

@Composable
fun UserName() {
    Text(
        text = "@mati_alzu • 25min",
        fontSize = 12.sp,
        color = Color(0xFF828286)
    )
}

@Composable
fun ProfileLogo(modifier: Modifier) {
    Image(
        modifier = modifier
            .size(40.dp)
            .clip(CircleShape),
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Profile Logo"
    )
}
