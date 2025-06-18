/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.FoodPizza: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodPizza",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.003f, 4.661f)
            curveTo(5.004f, 3.164f, 6.234f, 1.856f, 7.824f, 2.013f)
            curveTo(13.15f, 2.539f, 17.886f, 5.071f, 21.266f, 8.84f)
            curveTo(22.335f, 10.033f, 22.003f, 11.804f, 20.787f, 12.685f)
            lineTo(20.364f, 12.992f)
            lineTo(20.001f, 12.451f)
            lineTo(19.993f, 12.441f)
            curveTo(16.802f, 8.034f, 11.613f, 5.166f, 5.753f, 5.166f)
            horizontalLineTo(5.003f)
            lineTo(5.003f, 4.661f)
            close()
            moveTo(18.771f, 13.31f)
            lineTo(19.149f, 13.873f)
            curveTo(17.692f, 14.93f, 16.104f, 16.082f, 15.202f, 16.738f)
            lineTo(15f, 16.889f)
            verticalLineTo(18.99f)
            curveTo(15f, 19.542f, 14.552f, 19.99f, 14f, 19.99f)
            curveTo(13.448f, 19.99f, 13f, 19.542f, 13f, 18.99f)
            verticalLineTo(18.929f)
            curveTo(12.969f, 18.681f, 12.757f, 18.488f, 12.504f, 18.488f)
            curveTo(12.228f, 18.488f, 12.004f, 18.712f, 12.004f, 18.988f)
            verticalLineTo(20.491f)
            curveTo(12.004f, 21.043f, 11.556f, 21.491f, 11.004f, 21.491f)
            curveTo(10.486f, 21.491f, 10.059f, 21.097f, 10.009f, 20.592f)
            curveTo(9.544f, 20.927f, 9.046f, 21.286f, 8.569f, 21.631f)
            curveTo(7.08f, 22.705f, 5f, 21.642f, 5f, 19.805f)
            lineTo(5.003f, 6.666f)
            horizontalLineTo(5.753f)
            curveTo(11.107f, 6.666f, 15.849f, 9.282f, 18.771f, 13.31f)
            close()
            moveTo(9.004f, 10.99f)
            curveTo(9.556f, 10.99f, 10.004f, 10.543f, 10.004f, 9.99f)
            curveTo(10.004f, 9.438f, 9.556f, 8.99f, 9.004f, 8.99f)
            curveTo(8.452f, 8.99f, 8.004f, 9.438f, 8.004f, 9.99f)
            curveTo(8.004f, 10.543f, 8.452f, 10.99f, 9.004f, 10.99f)
            close()
            moveTo(13.004f, 13.988f)
            curveTo(13.556f, 13.988f, 14.004f, 13.541f, 14.004f, 12.988f)
            curveTo(14.004f, 12.436f, 13.556f, 11.988f, 13.004f, 11.988f)
            curveTo(12.452f, 11.988f, 12.004f, 12.436f, 12.004f, 12.988f)
            curveTo(12.004f, 13.541f, 12.452f, 13.988f, 13.004f, 13.988f)
            close()
            moveTo(9.004f, 16.986f)
            curveTo(9.556f, 16.986f, 10.004f, 16.538f, 10.004f, 15.986f)
            curveTo(10.004f, 15.433f, 9.556f, 14.986f, 9.004f, 14.986f)
            curveTo(8.452f, 14.986f, 8.004f, 15.433f, 8.004f, 15.986f)
            curveTo(8.004f, 16.538f, 8.452f, 16.986f, 9.004f, 16.986f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodPizzaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FoodPizza, contentDescription = null)
    }
}
