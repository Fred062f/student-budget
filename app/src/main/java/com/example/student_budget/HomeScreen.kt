package com.example.student_budget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.student_budget.ui.theme.StudentbudgetTheme
import com.google.type.Money

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // First sector with some text
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.LightGray)
        ) {
            Text(
                text = "Hej Frederik",
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Second sector with a box and box shadow
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White)
                .padding(8.dp)
                .shadow(4.dp, RoundedCornerShape(8.dp))
        ) {
            Text("Indkomst")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Third sector with some text
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White)
                .padding(8.dp)
                .shadow(4.dp, RoundedCornerShape(8.dp))
        ) {
            Text("Udgifter")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Fourth sector with a box and box shadow
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White)
                .padding(8.dp)
                .shadow(4.dp, RoundedCornerShape(8.dp))
        ) {
            Text("Til rådighed")
        }

        // Spacer to push navigation bar to the bottom
        Spacer(modifier = Modifier.weight(1f))
        // Navigation Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(56.dp)
                .background(Color.Gray)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Buttons for navigation
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Rounded.Home,
                    contentDescription = "Localized description",
                )
            }
            IconButton(onClick = { navController.navigate("screen2") }) {
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "Localized description",
                )
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "Localized description",
                )
            }
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "Localized description",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    StudentbudgetTheme {
        HomeScreen(navController = rememberNavController())
    }
}