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

public val FluentUi.Regular.CalendarWeekNumbers: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarWeekNumbers",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(7.75f, 7f)
            curveTo(8.13f, 7f, 8.443f, 7.282f, 8.493f, 7.648f)
            lineTo(8.5f, 7.75f)
            verticalLineTo(8.75f)
            curveTo(8.5f, 9.164f, 8.164f, 9.5f, 7.75f, 9.5f)
            curveTo(7.37f, 9.5f, 7.057f, 9.218f, 7.007f, 8.852f)
            lineTo(7f, 8.75f)
            verticalLineTo(7.75f)
            curveTo(7f, 7.336f, 7.336f, 7f, 7.75f, 7f)
            close()
            moveTo(8.493f, 15.148f)
            curveTo(8.443f, 14.782f, 8.13f, 14.5f, 7.75f, 14.5f)
            curveTo(7.336f, 14.5f, 7f, 14.836f, 7f, 15.25f)
            verticalLineTo(16.25f)
            lineTo(7.007f, 16.352f)
            curveTo(7.057f, 16.718f, 7.37f, 17f, 7.75f, 17f)
            curveTo(8.164f, 17f, 8.5f, 16.664f, 8.5f, 16.25f)
            verticalLineTo(15.25f)
            lineTo(8.493f, 15.148f)
            close()
            moveTo(8.5f, 11.321f)
            curveTo(8.45f, 10.955f, 8.137f, 10.673f, 7.757f, 10.673f)
            curveTo(7.343f, 10.673f, 7.007f, 11.009f, 7.007f, 11.423f)
            lineTo(7f, 12.571f)
            lineTo(7.007f, 12.673f)
            curveTo(7.057f, 13.039f, 7.37f, 13.321f, 7.75f, 13.321f)
            curveTo(8.164f, 13.321f, 8.5f, 12.985f, 8.5f, 12.571f)
            lineTo(8.507f, 11.423f)
            lineTo(8.5f, 11.321f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarWeekNumbersPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarWeekNumbers, contentDescription = null)
    }
}
