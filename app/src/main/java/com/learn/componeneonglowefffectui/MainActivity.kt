package com.learn.componeneonglowefffectui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.learn.neoneffect.GlowingCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Box(modifier = Modifier.fillMaxSize(),
               contentAlignment = Alignment.Center) {
               GlowingCard(
                     glowingColor = androidx.compose.ui.graphics.Color(0xFF00FF00), // Neon green
                     modifier = Modifier.size(200.dp),
                     containerColor = Color.White, // Black background
                     contentColor = androidx.compose.ui.graphics.Color.White, // White text
                     cornerRadius = 16.dp,
                     glowingRadius = 24.dp,
                     xShift = 0.dp,
                     yShift = 0.dp
               ) {
                   Text(text = "Test Neaon Effect", modifier = Modifier.align(Alignment.Center))
               }

           }
        }
    }
}