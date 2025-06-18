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

public val FluentUi.Regular.PositionBackward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PositionBackward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 16.5f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 16.5f, 2f, 15.045f, 2f, 13.25f)
            verticalLineTo(5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            lineTo(13.25f, 2f)
            curveTo(15.045f, 2f, 16.5f, 3.455f, 16.5f, 5.25f)
            verticalLineTo(6.5f)
            lineTo(14.848f, 6.5f)
            lineTo(15f, 6.348f)
            verticalLineTo(5.25f)
            curveTo(15f, 5.019f, 14.955f, 4.798f, 14.873f, 4.595f)
            lineTo(12.969f, 6.5f)
            lineTo(10.848f, 6.5f)
            lineTo(13.769f, 3.578f)
            curveTo(13.605f, 3.527f, 13.431f, 3.5f, 13.25f, 3.5f)
            lineTo(11.969f, 3.5f)
            lineTo(3.5f, 11.969f)
            lineTo(3.5f, 13.25f)
            curveTo(3.5f, 13.431f, 3.527f, 13.605f, 3.578f, 13.769f)
            lineTo(6.5f, 10.848f)
            lineTo(6.5f, 12.969f)
            lineTo(4.595f, 14.873f)
            curveTo(4.798f, 14.955f, 5.019f, 15f, 5.25f, 15f)
            lineTo(6.348f, 15f)
            lineTo(6.5f, 14.848f)
            lineTo(6.5f, 16.5f)
            close()
            moveTo(9.848f, 3.5f)
            lineTo(7.969f, 3.5f)
            lineTo(3.5f, 7.969f)
            lineTo(3.5f, 9.848f)
            lineTo(9.848f, 3.5f)
            close()
            moveTo(5.848f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(5.848f)
            lineTo(5.848f, 3.5f)
            close()
            moveTo(22f, 18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            lineTo(10.75f, 22f)
            curveTo(8.955f, 22f, 7.5f, 20.545f, 7.5f, 18.75f)
            lineTo(7.5f, 10.75f)
            curveTo(7.5f, 8.955f, 8.955f, 7.5f, 10.75f, 7.5f)
            lineTo(18.75f, 7.5f)
            curveTo(20.545f, 7.5f, 22f, 8.955f, 22f, 10.75f)
            lineTo(22f, 18.75f)
            close()
            moveTo(18.75f, 20.5f)
            curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
            lineTo(20.5f, 10.75f)
            curveTo(20.5f, 9.783f, 19.716f, 9f, 18.75f, 9f)
            lineTo(10.75f, 9f)
            curveTo(9.784f, 9f, 9f, 9.783f, 9f, 10.75f)
            lineTo(9f, 18.75f)
            curveTo(9f, 19.716f, 9.783f, 20.5f, 10.75f, 20.5f)
            lineTo(18.75f, 20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PositionBackwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PositionBackward, contentDescription = null)
    }
}
