package com.learn.neoneffect

import android.graphics.Paint
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun GlowingCard(
    glowingColor: Color,
    modifier: Modifier,
    containerColor: Color = Color.White,
    contentColor: Color = Color.Black,
    cornerRadius: Dp = 0.dp,
    glowingRadius: Dp = 16.dp,
    xShift:Dp =0.dp,
    yShift:Dp =0.dp,
    content: @Composable () -> Unit
    ){
    Box(modifier= modifier
        .drawBehind {
            val size = this.size
            drawContext.canvas.nativeCanvas.apply {
                drawRoundRect(
                     0f,
                     0f,
                      size.width,
                      size.height,
                      cornerRadius.toPx(),
                      cornerRadius.toPx(),
                      Paint().apply {
                        color = containerColor.toArgb()
                        setShadowLayer(glowingRadius.toPx(), xShift.toPx(), yShift.toPx(), glowingColor.toArgb())
                        style = Paint.Style.FILL
                    }
                )
            }
        }){
     content()
    }

}
