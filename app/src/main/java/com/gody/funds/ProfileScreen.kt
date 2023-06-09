package com.gody.funds

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gody.funds.ui.theme.CustomCyan
import com.gody.funds.ui.theme.CustomDarkGray
import com.gody.funds.ui.theme.CustomGreen
import com.gody.funds.ui.theme.CustomLightGreen
import com.gody.funds.ui.theme.CustomOrange

@Composable
fun ProfileScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(CustomDarkGray, CustomLightGreen)
                )
            )
            .padding(25.dp),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(R.drawable.more),
                    contentDescription = "More",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(
                        width = 1.dp,
                        color = CustomOrange,
                        shape = RoundedCornerShape(20f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(R.drawable.gody),
                    contentDescription ="Profile",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(5.dp))



                )

            }
        }
        Column {
            Text(
                text = "Hello Ngiti",
                fontSize = 40.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.ubuntu))
            )
            Text(
                text = "Welcome back",
                fontSize = 22.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.ubuntu))
            )
        }
        ProfileInfoCard(
            heading = "Contribution",
            subHeading = "Your Weekly Contribution",
            valueText = "KES 500",
            percentage = 100,
            color = CustomOrange,
            isIncreasing = true
        )
        ProfileInfoCard(
            heading = "Contribution",
            subHeading = "Total Contribution This Week",
            valueText = "KES 5,000",
            percentage = 55,
            color = CustomGreen,
            isIncreasing = true
        )
        ProfileInfoCard(
            heading = "Payout",
            subHeading = "Your Payout for This Rotation",
            valueText = "KES 5,000",
            percentage = 55,
            color = CustomCyan,
            isIncreasing = true
        )
        Row (

            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ){
            IconButton(onClick = { navController.navigate(route = Screen.Home.route)}) {
                Icon(painter = painterResource(R.drawable.home) ,
                    contentDescription ="Home",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)



                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(R.drawable.wallet) ,
                    contentDescription ="Wallet",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)



                )
            }
            IconButton(onClick = { navController.navigate(route = Screen.Savings.route) }) {
                Icon(painter = painterResource(R.drawable.finance) ,
                    contentDescription ="Finance",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)



                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(R.drawable.user) ,
                    contentDescription ="User",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)



                )
            }

        }



    }

}

@Composable
fun ProfileInfoCard(
    heading: String,
    subHeading: String,
    valueText: String,
    percentage: Int,
    color: Color,
    isIncreasing: Boolean
) {
    Box (
        modifier = Modifier
            .clip(RoundedCornerShape(38.dp))
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.White.copy(0.1f))
            .padding(
                start = 30.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 10.dp

            )


    ){
        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(modifier = Modifier
                .weight(7f)
                .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = heading,
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = Color.White

                )
                Text(
                    text = subHeading,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = Color.LightGray

                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = valueText,
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = color

                )


            }
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()

            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward ,
                    contentDescription = "Arrow",
                    tint = color,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .rotate(if (isIncreasing) -45f else 45f)

                )
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "$percentage%",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = color

                )
                Canvas(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(70.dp)

                ){
                    drawArc(
                        color = color,
                        startAngle = -120f,
                        sweepAngle = 360 * percentage / 100f,
                        useCenter = false,
                        style = Stroke(
                            width = 18f,
                            cap = StrokeCap.Round
                        )

                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfileScreenPrev() {
    ProfileScreen(
        navController = rememberNavController()
    )
}
