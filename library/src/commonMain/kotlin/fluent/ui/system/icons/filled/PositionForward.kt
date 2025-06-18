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

public val FluentUi.Filled.PositionForward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PositionForward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.25f, 16.5f)
            curveTo(15.045f, 16.5f, 16.5f, 15.045f, 16.5f, 13.25f)
            lineTo(16.5f, 5.25f)
            curveTo(16.5f, 3.455f, 15.045f, 2f, 13.25f, 2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(13.25f)
            curveTo(2f, 15.045f, 3.455f, 16.5f, 5.25f, 16.5f)
            lineTo(13.25f, 16.5f)
            close()
            moveTo(7.5f, 17.5f)
            horizontalLineTo(9f)
            lineTo(9f, 18.75f)
            curveTo(9f, 19.716f, 9.783f, 20.5f, 10.75f, 20.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
            verticalLineTo(10.75f)
            curveTo(20.5f, 9.783f, 19.716f, 9f, 18.75f, 9f)
            lineTo(17.5f, 9f)
            verticalLineTo(7.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 7.5f, 22f, 8.955f, 22f, 10.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(10.75f)
            curveTo(8.955f, 22f, 7.5f, 20.545f, 7.5f, 18.75f)
            verticalLineTo(17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PositionForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PositionForward, contentDescription = null)
    }
}
