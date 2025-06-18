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

public val FluentUi.Regular.Seat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Seat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(18.75f)
            curveTo(3f, 19.993f, 4.007f, 21f, 5.25f, 21f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 21f, 21f, 19.993f, 21f, 18.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(19.5f, 11.627f)
            curveTo(18.933f, 11.232f, 18.244f, 11f, 17.5f, 11f)
            curveTo(16.385f, 11f, 15.391f, 11.522f, 14.75f, 12.335f)
            curveTo(14.109f, 11.522f, 13.116f, 11f, 12f, 11f)
            curveTo(10.884f, 11f, 9.891f, 11.522f, 9.25f, 12.335f)
            curveTo(8.609f, 11.522f, 7.615f, 11f, 6.5f, 11f)
            curveTo(5.756f, 11f, 5.067f, 11.232f, 4.5f, 11.627f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(11.627f)
            close()
            moveTo(14f, 14.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(10f)
            verticalLineTo(14.5f)
            curveTo(10f, 13.395f, 10.895f, 12.5f, 12f, 12.5f)
            curveTo(13.105f, 12.5f, 14f, 13.395f, 14f, 14.5f)
            close()
            moveTo(15.5f, 19.5f)
            verticalLineTo(14.5f)
            curveTo(15.5f, 13.395f, 16.395f, 12.5f, 17.5f, 12.5f)
            curveTo(18.605f, 12.5f, 19.5f, 13.395f, 19.5f, 14.5f)
            verticalLineTo(18.75f)
            curveTo(19.5f, 19.164f, 19.164f, 19.5f, 18.75f, 19.5f)
            horizontalLineTo(15.5f)
            close()
            moveTo(5.25f, 19.5f)
            curveTo(4.836f, 19.5f, 4.5f, 19.164f, 4.5f, 18.75f)
            verticalLineTo(14.5f)
            curveTo(4.5f, 13.395f, 5.395f, 12.5f, 6.5f, 12.5f)
            curveTo(7.605f, 12.5f, 8.5f, 13.395f, 8.5f, 14.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SeatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Seat, contentDescription = null)
    }
}
