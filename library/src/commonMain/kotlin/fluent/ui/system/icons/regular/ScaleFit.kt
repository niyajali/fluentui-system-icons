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

public val FluentUi.Regular.ScaleFit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScaleFit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.994f, 9.436f)
            curveTo(8.306f, 9.708f, 8.337f, 10.182f, 8.064f, 10.494f)
            lineTo(7.403f, 11.25f)
            horizontalLineTo(10.265f)
            curveTo(10.679f, 11.25f, 11.015f, 11.586f, 11.015f, 12f)
            curveTo(11.015f, 12.414f, 10.679f, 12.75f, 10.265f, 12.75f)
            horizontalLineTo(7.403f)
            lineTo(8.064f, 13.506f)
            curveTo(8.337f, 13.818f, 8.306f, 14.292f, 7.994f, 14.564f)
            curveTo(7.682f, 14.837f, 7.208f, 14.806f, 6.936f, 14.494f)
            lineTo(5.186f, 12.494f)
            curveTo(4.938f, 12.211f, 4.938f, 11.789f, 5.186f, 11.506f)
            lineTo(6.936f, 9.506f)
            curveTo(7.208f, 9.194f, 7.682f, 9.163f, 7.994f, 9.436f)
            close()
            moveTo(15.95f, 10.494f)
            curveTo(15.677f, 10.182f, 15.709f, 9.708f, 16.021f, 9.436f)
            curveTo(16.333f, 9.163f, 16.806f, 9.194f, 17.079f, 9.506f)
            lineTo(18.829f, 11.506f)
            curveTo(19.076f, 11.789f, 19.076f, 12.211f, 18.829f, 12.494f)
            lineTo(17.079f, 14.494f)
            curveTo(16.806f, 14.806f, 16.333f, 14.837f, 16.021f, 14.564f)
            curveTo(15.709f, 14.292f, 15.677f, 13.818f, 15.95f, 13.506f)
            lineTo(16.612f, 12.75f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 12.75f, 13f, 12.414f, 13f, 12f)
            curveTo(13f, 11.586f, 13.336f, 11.25f, 13.75f, 11.25f)
            horizontalLineTo(16.612f)
            lineTo(15.95f, 10.494f)
            close()
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 18.993f, 20.993f, 20f, 19.75f, 20f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(4.25f, 5.5f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.164f, 3.836f, 18.5f, 4.25f, 18.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 18.5f, 20.5f, 18.164f, 20.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(20.5f, 5.836f, 20.164f, 5.5f, 19.75f, 5.5f)
            horizontalLineTo(4.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScaleFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ScaleFit, contentDescription = null)
    }
}
