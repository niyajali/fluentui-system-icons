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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ViewDesktopMobile Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in UI connecting mobile and desktop devices.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_view_desktop_mobile_24_regular.svg)
 * 
 * @return The [ImageVector] for the ViewDesktopMobile icon.
 */
public val FluentIcons.Regular.ViewDesktopMobile: ImageVector
    get() {
        if (_viewDesktopMobile != null) {
            return _viewDesktopMobile!!
        }
        _viewDesktopMobile = Builder(name = "ViewDesktopMobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.993f, 2.0f, 18.0f, 3.007f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.993f, 16.993f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 22.0f, 6.0f, 20.993f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.007f, 7.007f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 3.5f, 7.5f, 3.836f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.836f, 16.164f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(13.249f, 17.5f)
                curveTo(13.663f, 17.499f, 13.999f, 17.835f, 14.0f, 18.249f)
                curveTo(14.001f, 18.663f, 13.665f, 18.999f, 13.251f, 19.0f)
                lineTo(10.751f, 19.004f)
                curveTo(10.337f, 19.004f, 10.001f, 18.669f, 10.0f, 18.255f)
                curveTo(9.999f, 17.841f, 10.335f, 17.504f, 10.749f, 17.504f)
                lineTo(13.249f, 17.5f)
                close()
                moveTo(14.5f, 8.999f)
                curveTo(14.745f, 8.999f, 14.95f, 9.175f, 14.992f, 9.409f)
                lineTo(15.0f, 9.499f)
                verticalLineTo(15.501f)
                curveTo(15.0f, 15.747f, 14.823f, 15.951f, 14.59f, 15.993f)
                lineTo(14.5f, 16.001f)
                horizontalLineTo(9.5f)
                curveTo(9.255f, 16.001f, 9.05f, 15.824f, 9.008f, 15.591f)
                lineTo(9.0f, 15.501f)
                verticalLineTo(9.499f)
                curveTo(9.0f, 9.253f, 9.177f, 9.049f, 9.41f, 9.007f)
                lineTo(9.5f, 8.999f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(14.745f, 5.0f, 14.95f, 5.177f, 14.992f, 5.41f)
                lineTo(15.0f, 5.5f)
                verticalLineTo(7.505f)
                curveTo(15.0f, 7.75f, 14.823f, 7.954f, 14.59f, 7.997f)
                lineTo(14.5f, 8.005f)
                horizontalLineTo(9.5f)
                curveTo(9.255f, 8.005f, 9.05f, 7.828f, 9.008f, 7.594f)
                lineTo(9.0f, 7.505f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 5.255f, 9.177f, 5.05f, 9.41f, 5.008f)
                lineTo(9.5f, 5.0f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _viewDesktopMobile!!
    }

@Suppress("ObjectPropertyName")
private var _viewDesktopMobile: ImageVector? = null

@Preview
@Composable
private fun ViewDesktopMobilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ViewDesktopMobile, contentDescription = "ViewDesktopMobile Icon")
    }
}

