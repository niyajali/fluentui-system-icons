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

public val FluentUi.Filled.CalendarArrowCounterclockwise: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarArrowCounterclockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(7.483f)
            curveTo(7.559f, 9.027f, 7.394f, 9.582f, 6.988f, 9.987f)
            lineTo(4.988f, 11.987f)
            curveTo(4.451f, 12.525f, 3.65f, 12.64f, 3f, 12.331f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            close()
            moveTo(6f, 16.25f)
            curveTo(6f, 15.56f, 6.56f, 15f, 7.25f, 15f)
            curveTo(7.94f, 15f, 8.5f, 15.56f, 8.5f, 16.25f)
            curveTo(8.5f, 16.94f, 7.94f, 17.5f, 7.25f, 17.5f)
            curveTo(6.56f, 17.5f, 6f, 16.94f, 6f, 16.25f)
            close()
            moveTo(10.75f, 16.25f)
            curveTo(10.75f, 15.56f, 11.31f, 15f, 12f, 15f)
            curveTo(12.69f, 15f, 13.25f, 15.56f, 13.25f, 16.25f)
            curveTo(13.25f, 16.94f, 12.69f, 17.5f, 12f, 17.5f)
            curveTo(11.31f, 17.5f, 10.75f, 16.94f, 10.75f, 16.25f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 11.06f, 6.56f, 10.5f, 7.25f, 10.5f)
            curveTo(7.94f, 10.5f, 8.5f, 11.06f, 8.5f, 11.75f)
            curveTo(8.5f, 12.44f, 7.94f, 13f, 7.25f, 13f)
            curveTo(6.56f, 13f, 6f, 12.44f, 6f, 11.75f)
            close()
            moveTo(10.75f, 11.75f)
            curveTo(10.75f, 11.06f, 11.31f, 10.5f, 12f, 10.5f)
            curveTo(12.69f, 10.5f, 13.25f, 11.06f, 13.25f, 11.75f)
            curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
            curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
            close()
            moveTo(15.5f, 11.75f)
            curveTo(15.5f, 11.06f, 16.06f, 10.5f, 16.75f, 10.5f)
            curveTo(17.44f, 10.5f, 18f, 11.06f, 18f, 11.75f)
            curveTo(18f, 12.44f, 17.44f, 13f, 16.75f, 13f)
            curveTo(16.06f, 13f, 15.5f, 12.44f, 15.5f, 11.75f)
            close()
            moveTo(21f, 7f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8.939f)
            lineTo(2.28f, 8.22f)
            curveTo(1.987f, 7.927f, 1.513f, 7.927f, 1.22f, 8.22f)
            curveTo(0.927f, 8.513f, 0.927f, 8.987f, 1.22f, 9.28f)
            lineTo(3.22f, 11.28f)
            curveTo(3.513f, 11.573f, 3.987f, 11.573f, 4.28f, 11.28f)
            lineTo(6.28f, 9.28f)
            curveTo(6.573f, 8.987f, 6.573f, 8.513f, 6.28f, 8.22f)
            curveTo(5.987f, 7.927f, 5.513f, 7.927f, 5.22f, 8.22f)
            lineTo(4.5f, 8.939f)
            verticalLineTo(7f)
            horizontalLineTo(21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarArrowCounterclockwise, contentDescription = null)
    }
}
