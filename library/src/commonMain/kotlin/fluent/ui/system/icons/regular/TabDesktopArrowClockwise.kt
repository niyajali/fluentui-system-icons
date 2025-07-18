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

public val FluentIcons.Regular.TabDesktopArrowClockwise: ImageVector
    get() {
        if (_TabDesktopArrowClockwise != null) {
            return _TabDesktopArrowClockwise!!
        }
        _TabDesktopArrowClockwise = ImageVector.Builder(
            name = "Regular.TabDesktopArrowClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 3f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(11.101f)
                curveTo(3.443f, 10.649f, 3.948f, 10.256f, 4.5f, 9.936f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(11f)
                verticalLineTo(5.75f)
                curveTo(11f, 6.993f, 12.007f, 8f, 13.25f, 8f)
                horizontalLineTo(19.5f)
                verticalLineTo(18.25f)
                curveTo(19.5f, 18.94f, 18.94f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(14.064f)
                curveTo(13.744f, 20.052f, 13.351f, 20.556f, 12.899f, 21f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                horizontalLineTo(5.75f)
                close()
                moveTo(19.5f, 6.5f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 6.5f, 12.5f, 6.164f, 12.5f, 5.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 4.5f, 19.5f, 5.06f, 19.5f, 5.75f)
                verticalLineTo(6.5f)
                close()
                moveTo(12.25f, 9.75f)
                curveTo(12.664f, 9.75f, 13f, 10.086f, 13f, 10.5f)
                verticalLineTo(13.25f)
                curveTo(13f, 13.664f, 12.664f, 14f, 12.25f, 14f)
                horizontalLineTo(9.5f)
                curveTo(9.086f, 14f, 8.75f, 13.664f, 8.75f, 13.25f)
                curveTo(8.75f, 12.836f, 9.086f, 12.5f, 9.5f, 12.5f)
                horizontalLineTo(10.829f)
                curveTo(10.823f, 12.496f, 10.818f, 12.491f, 10.812f, 12.487f)
                curveTo(10.042f, 11.869f, 9.065f, 11.5f, 8f, 11.5f)
                curveTo(5.515f, 11.5f, 3.5f, 13.515f, 3.5f, 16f)
                curveTo(3.5f, 18.485f, 5.515f, 20.5f, 8f, 20.5f)
                curveTo(10.485f, 20.5f, 12.5f, 18.485f, 12.5f, 16f)
                curveTo(12.5f, 15.586f, 12.836f, 15.25f, 13.25f, 15.25f)
                curveTo(13.664f, 15.25f, 14f, 15.586f, 14f, 16f)
                curveTo(14f, 19.314f, 11.314f, 22f, 8f, 22f)
                curveTo(4.686f, 22f, 2f, 19.314f, 2f, 16f)
                curveTo(2f, 12.686f, 4.686f, 10f, 8f, 10f)
                curveTo(9.305f, 10f, 10.515f, 10.418f, 11.5f, 11.126f)
                verticalLineTo(10.5f)
                curveTo(11.5f, 10.086f, 11.836f, 9.75f, 12.25f, 9.75f)
                close()
            }
        }.build()

        return _TabDesktopArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktopArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun TabDesktopArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabDesktopArrowClockwise, contentDescription = null)
    }
}
