package br.senai.sp.jandira.ppdm_lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_lionschool.R


@Composable
fun HomeSchool(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp)
                .padding(top = 0.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
           Row (
               modifier = Modifier
                   .fillMaxSize(),
           ) {
               Column (
                   modifier = Modifier
               ) {
                   Image(
                   painter = painterResource(
                       R.drawable.lionschool1
                   ),
                   contentDescription = stringResource(
                       R.string.app_name
                   ),
                   modifier = Modifier
                       .height(250.dp)
                       .padding(top = 10.dp)
               )
                   Text(
                       text = stringResource(
                           R.string.favorite
                       ),
                       modifier = Modifier
                           .padding(start = 10.dp),
                       color = Color.Blue,
                       fontSize = 25.sp,
                       fontWeight = FontWeight.Bold,

                   )
                   Box(
                       modifier = Modifier
                           .clip(RoundedCornerShape(5.dp))
                           .background(color = colorResource(
                               R.color.yellowlindo))
                           .height(8.dp)
                           .width(200.dp)
                           .padding(start = 200.dp, end = 20.dp, top = 20.dp)
                   )
                   Text(
                       text = stringResource(R.string.destination),
                       color = Color.Gray,
                       fontSize = 17.sp,
                       textAlign = TextAlign.Center,
                       modifier = Modifier.padding(top = 25.dp)

                   )
               }
               Button(
                   modifier = Modifier
                       .height(50.dp)
                       .width(500.dp),
                   onClick = {},
                   shape = RoundedCornerShape(15.dp)
               ) {
                   Text(
                       text = stringResource(
                           R.string.get_started
                       ),
                       fontSize = 20.sp,
                       modifier = Modifier
                           .padding(3.dp)
                   )
               }

               /*Row(
                   modifier = Modifier.padding(top = 110.dp),
                   horizontalArrangement = Arrangement.spacedBy(30.dp)
               ){
                   Image(
                       painter = painterResource(R.drawable.youtube),
                       contentDescription = "Youtube",
                       modifier = Modifier.size(40.dp)
                   )
                   Image(
                       painter = painterResource(R.drawable.twitter),
                       contentDescription = "Twitter",
                       modifier = Modifier.size(40.dp)
                   )
                   Image(
                       painter = painterResource(R.drawable.instagram),
                       contentDescription = "Instagram",
                       modifier = Modifier.size(40.dp)
                   )
                   Image(
                       painter = painterResource(R.drawable.facebook),
                       contentDescription = "Facebook",
                       modifier = Modifier.size(40.dp)
                   )

               }*/
           }

        }
    }

}




@Preview(showSystemUi = true)
@Composable
private fun HomeSchoolPreview(){
    HomeSchool()
}



