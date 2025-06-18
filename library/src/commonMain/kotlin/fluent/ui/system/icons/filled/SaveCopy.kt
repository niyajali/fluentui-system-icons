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

public val FluentUi.Filled.SaveCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SaveCopy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.496f, 5.627f)
            curveTo(21.372f, 5.934f, 22f, 6.769f, 22f, 7.75f)
            verticalLineTo(17.75f)
            curveTo(22f, 20.097f, 20.097f, 22f, 17.75f, 22f)
            horizontalLineTo(7.75f)
            curveTo(6.769f, 22f, 5.934f, 21.372f, 5.627f, 20.496f)
            lineTo(7.724f, 20.5f)
            lineTo(17.75f, 20.5f)
            curveTo(19.269f, 20.5f, 20.5f, 19.269f, 20.5f, 17.75f)
            verticalLineTo(7.75f)
            lineTo(20.496f, 7.699f)
            lineTo(20.496f, 5.627f)
            close()
            moveTo(17.247f, 2f)
            curveTo(18.49f, 2f, 19.497f, 3.007f, 19.497f, 4.25f)
            verticalLineTo(17.247f)
            curveTo(19.497f, 18.49f, 18.49f, 19.497f, 17.247f, 19.497f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19.497f, 2f, 18.49f, 2f, 17.247f)
            verticalLineTo(4.25f)
            curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
            horizontalLineTo(17.247f)
            close()
            moveTo(10.75f, 6.75f)
            curveTo(10.37f, 6.75f, 10.057f, 7.032f, 10.007f, 7.398f)
            lineTo(10f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(7.5f)
            curveTo(7.086f, 10f, 6.75f, 10.336f, 6.75f, 10.75f)
            curveTo(6.75f, 11.13f, 7.032f, 11.443f, 7.398f, 11.493f)
            lineTo(7.5f, 11.5f)
            horizontalLineTo(10f)
            verticalLineTo(14f)
            curveTo(10f, 14.414f, 10.336f, 14.75f, 10.75f, 14.75f)
            curveTo(11.13f, 14.75f, 11.443f, 14.468f, 11.493f, 14.102f)
            lineTo(11.5f, 14f)
            verticalLineTo(11.5f)
            horizontalLineTo(14f)
            curveTo(14.414f, 11.5f, 14.75f, 11.164f, 14.75f, 10.75f)
            curveTo(14.75f, 10.37f, 14.468f, 10.057f, 14.102f, 10.007f)
            lineTo(14f, 10f)
            horizontalLineTo(11.5f)
            verticalLineTo(7.5f)
            curveTo(11.5f, 7.086f, 11.164f, 6.75f, 10.75f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SaveCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SaveCopy, contentDescription = null)
    }
}
