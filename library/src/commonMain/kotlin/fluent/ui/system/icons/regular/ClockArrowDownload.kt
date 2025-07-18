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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ClockArrowDownload: ImageVector
    get() {
        if (_ClockArrowDownload != null) {
            return _ClockArrowDownload!!
        }
        _ClockArrowDownload = ImageVector.Builder(
            name = "Regular.ClockArrowDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 11f)
                curveTo(4.5f, 6.306f, 8.306f, 2.5f, 13f, 2.5f)
                curveTo(17.694f, 2.5f, 21.5f, 6.306f, 21.5f, 11f)
                curveTo(21.5f, 15.694f, 17.694f, 19.5f, 13f, 19.5f)
                curveTo(12.896f, 19.5f, 12.792f, 19.498f, 12.688f, 19.494f)
                curveTo(12.522f, 20.011f, 12.292f, 20.5f, 12.009f, 20.951f)
                curveTo(12.335f, 20.984f, 12.666f, 21f, 13f, 21f)
                curveTo(18.523f, 21f, 23f, 16.523f, 23f, 11f)
                curveTo(23f, 5.477f, 18.523f, 1f, 13f, 1f)
                curveTo(7.477f, 1f, 3f, 5.477f, 3f, 11f)
                curveTo(3f, 11.334f, 3.016f, 11.665f, 3.048f, 11.991f)
                curveTo(3.5f, 11.708f, 3.989f, 11.478f, 4.506f, 11.312f)
                curveTo(4.502f, 11.208f, 4.5f, 11.104f, 4.5f, 11f)
                close()
                moveTo(12.993f, 5.648f)
                curveTo(12.943f, 5.282f, 12.63f, 5f, 12.25f, 5f)
                curveTo(11.836f, 5f, 11.5f, 5.336f, 11.5f, 5.75f)
                verticalLineTo(11.75f)
                lineTo(11.507f, 11.852f)
                curveTo(11.557f, 12.218f, 11.87f, 12.5f, 12.25f, 12.5f)
                horizontalLineTo(16.25f)
                lineTo(16.352f, 12.493f)
                curveTo(16.718f, 12.443f, 17f, 12.13f, 17f, 11.75f)
                curveTo(17f, 11.336f, 16.664f, 11f, 16.25f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(5.75f)
                lineTo(12.993f, 5.648f)
                close()
                moveTo(1f, 17.5f)
                curveTo(1f, 14.631f, 3.197f, 12.275f, 6f, 12.023f)
                verticalLineTo(17.793f)
                lineTo(4.354f, 16.146f)
                curveTo(4.158f, 15.951f, 3.842f, 15.951f, 3.646f, 16.146f)
                curveTo(3.451f, 16.342f, 3.451f, 16.658f, 3.646f, 16.854f)
                lineTo(6.146f, 19.354f)
                curveTo(6.342f, 19.549f, 6.658f, 19.549f, 6.854f, 19.354f)
                lineTo(9.354f, 16.854f)
                curveTo(9.549f, 16.658f, 9.549f, 16.342f, 9.354f, 16.146f)
                curveTo(9.158f, 15.951f, 8.842f, 15.951f, 8.646f, 16.146f)
                lineTo(7f, 17.793f)
                verticalLineTo(12.023f)
                curveTo(9.803f, 12.275f, 12f, 14.631f, 12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                close()
                moveTo(9.5f, 20.5f)
                curveTo(9.5f, 20.224f, 9.276f, 20f, 9f, 20f)
                horizontalLineTo(4f)
                curveTo(3.724f, 20f, 3.5f, 20.224f, 3.5f, 20.5f)
                curveTo(3.5f, 20.776f, 3.724f, 21f, 4f, 21f)
                horizontalLineTo(9f)
                curveTo(9.276f, 21f, 9.5f, 20.776f, 9.5f, 20.5f)
                close()
            }
        }.build()

        return _ClockArrowDownload!!
    }

@Suppress("ObjectPropertyName")
private var _ClockArrowDownload: ImageVector? = null

@Preview
@Composable
private fun ClockArrowDownloadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClockArrowDownload, contentDescription = null)
    }
}
