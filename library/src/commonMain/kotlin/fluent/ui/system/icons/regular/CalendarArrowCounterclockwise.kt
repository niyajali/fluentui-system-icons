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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CalendarArrowCounterclockwise: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarArrowCounterclockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
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
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(5.999f)
            curveTo(5.966f, 7f, 5.933f, 7.002f, 5.9f, 7.006f)
            curveTo(6.297f, 7.041f, 6.684f, 7.209f, 6.987f, 7.513f)
            curveTo(7.265f, 7.791f, 7.43f, 8.139f, 7.482f, 8.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(13.75f)
            curveTo(4.5f, 13.336f, 4.164f, 13f, 3.75f, 13f)
            curveTo(3.336f, 13f, 3f, 13.336f, 3f, 13.75f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(7.749f, 14.5f)
            curveTo(8.44f, 14.5f, 8.999f, 15.06f, 8.999f, 15.75f)
            curveTo(8.999f, 16.44f, 8.44f, 17f, 7.749f, 17f)
            curveTo(7.059f, 17f, 6.499f, 16.44f, 6.499f, 15.75f)
            curveTo(6.499f, 15.06f, 7.059f, 14.5f, 7.749f, 14.5f)
            close()
            moveTo(11.999f, 14.5f)
            curveTo(12.69f, 14.5f, 13.249f, 15.06f, 13.249f, 15.75f)
            curveTo(13.249f, 16.44f, 12.69f, 17f, 11.999f, 17f)
            curveTo(11.309f, 17f, 10.749f, 16.44f, 10.749f, 15.75f)
            curveTo(10.749f, 15.06f, 11.309f, 14.5f, 11.999f, 14.5f)
            close()
            moveTo(7.749f, 10.5f)
            curveTo(8.44f, 10.5f, 8.999f, 11.06f, 8.999f, 11.75f)
            curveTo(8.999f, 12.44f, 8.44f, 13f, 7.749f, 13f)
            curveTo(7.059f, 13f, 6.499f, 12.44f, 6.499f, 11.75f)
            curveTo(6.499f, 11.06f, 7.059f, 10.5f, 7.749f, 10.5f)
            close()
            moveTo(11.999f, 10.5f)
            curveTo(12.69f, 10.5f, 13.249f, 11.06f, 13.249f, 11.75f)
            curveTo(13.249f, 12.44f, 12.69f, 13f, 11.999f, 13f)
            curveTo(11.309f, 13f, 10.749f, 12.44f, 10.749f, 11.75f)
            curveTo(10.749f, 11.06f, 11.309f, 10.5f, 11.999f, 10.5f)
            close()
            moveTo(16.249f, 10.5f)
            curveTo(16.94f, 10.5f, 17.499f, 11.06f, 17.499f, 11.75f)
            curveTo(17.499f, 12.44f, 16.94f, 13f, 16.249f, 13f)
            curveTo(15.559f, 13f, 14.999f, 12.44f, 14.999f, 11.75f)
            curveTo(14.999f, 11.06f, 15.559f, 10.5f, 16.249f, 10.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarArrowCounterclockwise, contentDescription = null)
    }
}
