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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.Phone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Phone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCB7DF8),
                    0.412f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB),
                ),
                center = Offset(6f, 1.375f),
                radius = 25.437f,
            ),
        ) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFDECBFF),
                    1f to Color(0xFFD1D1FF),
                ),
                center = Offset(9.375f, 18.1f),
                radius = 7.384f,
            ),
        ) {
            moveTo(13.25f, 18f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 18f, 10f, 18.336f, 10f, 18.75f)
            curveTo(10f, 19.164f, 10.336f, 19.5f, 10.75f, 19.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 19.5f, 14f, 19.164f, 14f, 18.75f)
            curveTo(14f, 18.336f, 13.664f, 18f, 13.25f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Phone, contentDescription = null)
    }
}
