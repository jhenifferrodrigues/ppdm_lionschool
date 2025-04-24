package br.senai.sp.jandira.ppdm_lionschool.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_lionschool.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseLionSchool(){
    Box(
        modifier = Modifier
            .fillMaxSize()

    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 25.dp)
                .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,

            ){
            Row (
                modifier = Modifier
                    .fillMaxSize(),
            ){
                Column (
                    modifier = Modifier

                ){
                    Image(
                        painter = painterResource(
                            R.drawable.lionschool1
                        ),
                        contentDescription = stringResource(
                            R.string.app_name
                        ),
                        modifier = Modifier
                            .height(80.dp)
                            .size(110.dp)
                    )

                    HorizontalDivider(
                        color = colorResource(
                            R.color.yellowlindo
                        ),
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .padding(top = 10.dp)


                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = stringResource(
                                    R.string.find),
                                modifier = Modifier
                                    .padding(horizontal = 20.dp))
                        },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Pesquisar",
                                tint = Color(0xFF8F8F8F))
                        },
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                    )

                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                        ){
                            Image(
                                painter = painterResource(
                                    R.drawable.d71998e806f0cf82dc6c6512eb5bd2a16713e824),
                                contentDescription = "Listaaaa"
                            )
                            Text(
                                text = stringResource(
                                    R.string.courses),
                                color = colorResource(
                                    R.color.bluelindo),
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(horizontal = 5.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(),
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            /*Card (Color(0xff3347B0), Color(0xffCFD4EA),
                                painterResource(R.drawable.programming), stringResource(R.string.DS),
                                stringResource(R.string.DS2), stringResource(R.string.DS3)
                            ){}
                            Card (Color(0xff3347B0), Color(0xff9FA9E1),
                                painterResource(R.drawable.internet), stringResource(R.string.RDS),
                                stringResource(R.string.RDS2), stringResource(R.string.RDS3)
                            ){}
                            Card (Color(0xff5A659F), Color(0xff9FA9E1),
                                painterResource(R.drawable.chip), stringResource(R.string.ELE),
                                stringResource(R.string.ELE2), stringResource(R.string.ELE3)
                            ){}
                        }*/
                        }
                    }
                }
                }
            }
        }
    }





@Preview(showSystemUi = true)
@Composable
private fun CourseLionSchoolPreview () {
    CourseLionSchool()
}