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

public val FluentUi.Regular.CalendarAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            lineTo(21.001f, 12.023f)
            curveTo(20.538f, 11.726f, 20.034f, 11.486f, 19.5f, 11.314f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            lineTo(11.314f, 19.5f)
            curveTo(11.486f, 20.034f, 11.726f, 20.538f, 12.023f, 21.001f)
            lineTo(6.25f, 21f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.5f, 14f)
            lineTo(17.41f, 14.008f)
            curveTo(17.206f, 14.045f, 17.045f, 14.206f, 17.008f, 14.41f)
            lineTo(17f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(14.5f)
            lineTo(14.41f, 17.008f)
            curveTo(14.206f, 17.045f, 14.045f, 17.206f, 14.008f, 17.41f)
            lineTo(14f, 17.5f)
            lineTo(14.008f, 17.59f)
            curveTo(14.045f, 17.794f, 14.206f, 17.955f, 14.41f, 17.992f)
            lineTo(14.5f, 18f)
            horizontalLineTo(17f)
            verticalLineTo(20.5f)
            lineTo(17.008f, 20.59f)
            curveTo(17.045f, 20.794f, 17.206f, 20.955f, 17.41f, 20.992f)
            lineTo(17.5f, 21f)
            lineTo(17.59f, 20.992f)
            curveTo(17.794f, 20.955f, 17.955f, 20.794f, 17.992f, 20.59f)
            lineTo(18f, 20.5f)
            verticalLineTo(18f)
            horizontalLineTo(20.5f)
            lineTo(20.59f, 17.992f)
            curveTo(20.794f, 17.955f, 20.955f, 17.794f, 20.992f, 17.59f)
            lineTo(21f, 17.5f)
            lineTo(20.992f, 17.41f)
            curveTo(20.955f, 17.206f, 20.794f, 17.045f, 20.59f, 17.008f)
            lineTo(20.5f, 17f)
            horizontalLineTo(18f)
            verticalLineTo(14.5f)
            lineTo(17.992f, 14.41f)
            curveTo(17.955f, 14.206f, 17.794f, 14.045f, 17.59f, 14.008f)
            lineTo(17.5f, 14f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarAdd, contentDescription = null)
    }
}
