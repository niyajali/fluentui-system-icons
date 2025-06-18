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

public val FluentUi.Filled.EditArrowBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditArrowBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.5f, 23f)
            curveTo(19.538f, 23f, 22f, 20.538f, 22f, 17.5f)
            curveTo(22f, 14.462f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 14.462f, 11f, 17.5f)
            curveTo(11f, 20.538f, 13.462f, 23f, 16.5f, 23f)
            close()
            moveTo(15.354f, 14.646f)
            curveTo(15.549f, 14.842f, 15.549f, 15.158f, 15.354f, 15.354f)
            lineTo(14.707f, 16f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 16f, 20f, 17.455f, 20f, 19.25f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.776f, 19.776f, 20f, 19.5f, 20f)
            curveTo(19.224f, 20f, 19f, 19.776f, 19f, 19.5f)
            verticalLineTo(19.25f)
            curveTo(19f, 18.007f, 17.993f, 17f, 16.75f, 17f)
            horizontalLineTo(14.707f)
            lineTo(15.354f, 17.646f)
            curveTo(15.549f, 17.842f, 15.549f, 18.158f, 15.354f, 18.354f)
            curveTo(15.158f, 18.549f, 14.842f, 18.549f, 14.646f, 18.354f)
            lineTo(13.146f, 16.854f)
            curveTo(12.951f, 16.658f, 12.951f, 16.342f, 13.146f, 16.146f)
            lineTo(14.646f, 14.646f)
            curveTo(14.842f, 14.451f, 15.158f, 14.451f, 15.354f, 14.646f)
            close()
            moveTo(15.891f, 3.048f)
            curveTo(17.288f, 1.65f, 19.554f, 1.65f, 20.952f, 3.047f)
            curveTo(22.349f, 4.445f, 22.349f, 6.71f, 20.952f, 8.108f)
            lineTo(20.06f, 9f)
            lineTo(15f, 3.939f)
            lineTo(15.891f, 3.048f)
            close()
            moveTo(13.939f, 5f)
            lineTo(3.941f, 14.999f)
            curveTo(3.535f, 15.405f, 3.249f, 15.917f, 3.116f, 16.476f)
            lineTo(2.02f, 21.077f)
            curveTo(1.96f, 21.33f, 2.036f, 21.597f, 2.22f, 21.781f)
            curveTo(2.404f, 21.965f, 2.67f, 22.041f, 2.924f, 21.98f)
            lineTo(7.525f, 20.885f)
            curveTo(8.084f, 20.752f, 8.595f, 20.466f, 9.002f, 20.059f)
            lineTo(10.153f, 18.908f)
            curveTo(10.053f, 18.455f, 10f, 17.984f, 10f, 17.5f)
            curveTo(10f, 13.91f, 12.91f, 11f, 16.5f, 11f)
            curveTo(16.983f, 11f, 17.454f, 11.053f, 17.907f, 11.153f)
            lineTo(19f, 10.061f)
            lineTo(13.939f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EditArrowBack, contentDescription = null)
    }
}
