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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ShoppingBagCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBagCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 7f, 4f, 7.672f, 4f, 8.5f)
            verticalLineTo(18f)
            curveTo(4f, 20.209f, 5.791f, 22f, 8f, 22f)
            horizontalLineTo(12.81f)
            curveTo(11.689f, 20.832f, 11f, 19.247f, 11f, 17.5f)
            curveTo(11f, 15.657f, 11.767f, 13.993f, 13f, 12.81f)
            verticalLineTo(5f)
            curveTo(13f, 4.666f, 12.945f, 4.344f, 12.844f, 4.044f)
            curveTo(13.12f, 3.712f, 13.535f, 3.5f, 14f, 3.5f)
            curveTo(14.828f, 3.5f, 15.5f, 4.172f, 15.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            verticalLineTo(11.732f)
            curveTo(15.398f, 11.264f, 16.418f, 11f, 17.5f, 11f)
            curveTo(18.386f, 11f, 19.23f, 11.177f, 20f, 11.498f)
            verticalLineTo(8.5f)
            curveTo(20f, 7.672f, 19.328f, 7f, 18.5f, 7f)
            horizontalLineTo(17f)
            verticalLineTo(5f)
            curveTo(17f, 3.343f, 15.657f, 2f, 14f, 2f)
            curveTo(13.232f, 2f, 12.531f, 2.289f, 12f, 2.764f)
            curveTo(11.469f, 2.289f, 10.768f, 2f, 10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            close()
            moveTo(8.5f, 5f)
            curveTo(8.5f, 4.172f, 9.172f, 3.5f, 10f, 3.5f)
            curveTo(10.828f, 3.5f, 11.5f, 4.172f, 11.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(8.5f)
            verticalLineTo(5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShoppingBagCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShoppingBagCheckmark, contentDescription = null)
    }
}
