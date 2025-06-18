/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.PersonArrowBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonArrowBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 17.5f)
            curveTo(11f, 16.211f, 11.375f, 15.01f, 12.022f, 13.999f)
            horizontalLineTo(4.253f)
            curveTo(3.011f, 13.999f, 2.004f, 15.006f, 2.004f, 16.248f)
            verticalLineTo(17.168f)
            curveTo(2.004f, 17.74f, 2.182f, 18.298f, 2.514f, 18.764f)
            curveTo(4.056f, 20.928f, 6.579f, 22f, 10f, 22f)
            curveTo(10.931f, 22f, 11.796f, 21.921f, 12.592f, 21.762f)
            curveTo(11.6f, 20.621f, 11f, 19.131f, 11f, 17.5f)
            close()
            moveTo(10f, 2.004f)
            curveTo(12.762f, 2.004f, 15f, 4.242f, 15f, 7.004f)
            curveTo(15f, 9.765f, 12.762f, 12.004f, 10f, 12.004f)
            curveTo(7.239f, 12.004f, 5f, 9.765f, 5f, 7.004f)
            curveTo(5f, 4.242f, 7.239f, 2.004f, 10f, 2.004f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(16.354f, 15.354f)
            curveTo(16.549f, 15.158f, 16.549f, 14.842f, 16.354f, 14.646f)
            curveTo(16.158f, 14.451f, 15.842f, 14.451f, 15.646f, 14.646f)
            lineTo(14.146f, 16.146f)
            curveTo(13.951f, 16.342f, 13.951f, 16.658f, 14.146f, 16.854f)
            lineTo(15.646f, 18.354f)
            curveTo(15.842f, 18.549f, 16.158f, 18.549f, 16.354f, 18.354f)
            curveTo(16.549f, 18.158f, 16.549f, 17.842f, 16.354f, 17.646f)
            lineTo(15.707f, 17f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 17f, 20f, 18.007f, 20f, 19.25f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.776f, 20.224f, 20f, 20.5f, 20f)
            curveTo(20.776f, 20f, 21f, 19.776f, 21f, 19.5f)
            verticalLineTo(19.25f)
            curveTo(21f, 17.455f, 19.545f, 16f, 17.75f, 16f)
            horizontalLineTo(15.707f)
            lineTo(16.354f, 15.354f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonArrowBack, contentDescription = null)
    }
}
