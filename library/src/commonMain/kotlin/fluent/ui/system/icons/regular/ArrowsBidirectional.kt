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
package fluent.ui.system.icons.regular

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

public val FluentUi.Regular.ArrowsBidirectional: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowsBidirectional",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.002f, 8.999f)
            horizontalLineTo(9.005f)
            lineTo(9.006f, 6.75f)
            curveTo(9.006f, 6.09f, 8.215f, 5.752f, 7.738f, 6.207f)
            lineTo(2.234f, 11.457f)
            curveTo(1.925f, 11.753f, 1.925f, 12.247f, 2.234f, 12.543f)
            lineTo(7.738f, 17.793f)
            lineTo(7.82f, 17.861f)
            curveTo(8.301f, 18.209f, 9.006f, 17.873f, 9.006f, 17.25f)
            lineTo(9.005f, 15f)
            horizontalLineTo(15.002f)
            lineTo(15.002f, 17.25f)
            curveTo(15.002f, 17.91f, 15.793f, 18.248f, 16.27f, 17.792f)
            lineTo(21.767f, 12.542f)
            curveTo(22.077f, 12.247f, 22.077f, 11.753f, 21.767f, 11.458f)
            lineTo(16.27f, 6.207f)
            curveTo(15.793f, 5.751f, 15.002f, 6.09f, 15.002f, 6.75f)
            lineTo(15.002f, 8.999f)
            close()
            moveTo(3.838f, 12f)
            lineTo(7.505f, 8.501f)
            lineTo(7.506f, 9.749f)
            curveTo(7.506f, 10.163f, 7.841f, 10.499f, 8.256f, 10.499f)
            horizontalLineTo(15.752f)
            lineTo(15.854f, 10.493f)
            curveTo(16.22f, 10.443f, 16.502f, 10.129f, 16.502f, 9.749f)
            lineTo(16.502f, 8.503f)
            lineTo(20.163f, 12f)
            lineTo(16.502f, 15.496f)
            lineTo(16.502f, 14.25f)
            curveTo(16.502f, 13.836f, 16.167f, 13.5f, 15.752f, 13.5f)
            horizontalLineTo(8.256f)
            lineTo(8.154f, 13.507f)
            curveTo(7.788f, 13.557f, 7.506f, 13.871f, 7.506f, 14.25f)
            lineTo(7.505f, 15.498f)
            lineTo(3.838f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowsBidirectionalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowsBidirectional, contentDescription = null)
    }
}
