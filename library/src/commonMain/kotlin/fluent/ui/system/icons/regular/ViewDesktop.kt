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
 * ViewDesktop Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in UI connecting mobile and desktop devices.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_view_desktop_24_regular.svg)
 * 
 * @return The [ImageVector] for the ViewDesktop icon.
 */
public val FluentIcons.Regular.ViewDesktop: ImageVector
    get() {
        if (_viewDesktop != null) {
            return _viewDesktop!!
        }
        _viewDesktop = Builder(name = "ViewDesktop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.75f, 3.0f)
                curveTo(20.941f, 3.0f, 21.916f, 3.925f, 21.995f, 5.096f)
                lineTo(22.0f, 5.25f)
                verticalLineTo(15.752f)
                curveTo(22.0f, 16.943f, 21.075f, 17.918f, 19.904f, 17.997f)
                lineTo(19.75f, 18.002f)
                lineTo(15.5f, 18.002f)
                verticalLineTo(20.5f)
                lineTo(17.251f, 20.5f)
                curveTo(17.665f, 20.5f, 18.001f, 20.836f, 18.001f, 21.25f)
                curveTo(18.001f, 21.63f, 17.719f, 21.944f, 17.353f, 21.994f)
                lineTo(17.251f, 22.0f)
                horizontalLineTo(6.751f)
                curveTo(6.337f, 22.0f, 6.001f, 21.665f, 6.001f, 21.25f)
                curveTo(6.001f, 20.871f, 6.283f, 20.557f, 6.649f, 20.507f)
                lineTo(6.751f, 20.5f)
                lineTo(8.5f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.251f, 18.002f)
                curveTo(3.06f, 18.002f, 2.085f, 17.077f, 2.006f, 15.906f)
                lineTo(2.001f, 15.752f)
                verticalLineTo(5.25f)
                curveTo(2.001f, 4.059f, 2.926f, 3.084f, 4.097f, 3.005f)
                lineTo(4.251f, 3.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(13.999f, 18.002f)
                horizontalLineTo(9.999f)
                lineTo(10.0f, 20.5f)
                horizontalLineTo(14.0f)
                lineTo(13.999f, 18.002f)
                close()
                moveTo(19.75f, 4.5f)
                horizontalLineTo(4.251f)
                curveTo(3.871f, 4.5f, 3.557f, 4.782f, 3.508f, 5.148f)
                lineTo(3.501f, 5.25f)
                verticalLineTo(15.752f)
                curveTo(3.501f, 16.132f, 3.783f, 16.446f, 4.149f, 16.495f)
                lineTo(4.251f, 16.502f)
                horizontalLineTo(19.75f)
                curveTo(20.129f, 16.502f, 20.443f, 16.22f, 20.493f, 15.854f)
                lineTo(20.5f, 15.752f)
                verticalLineTo(5.25f)
                curveTo(20.5f, 4.87f, 20.218f, 4.557f, 19.852f, 4.507f)
                lineTo(19.75f, 4.5f)
                close()
                moveTo(18.504f, 6.0f)
                curveTo(18.75f, 6.0f, 18.954f, 6.177f, 18.996f, 6.41f)
                lineTo(19.004f, 6.5f)
                verticalLineTo(14.502f)
                curveTo(19.004f, 14.748f, 18.827f, 14.952f, 18.594f, 14.994f)
                lineTo(18.504f, 15.002f)
                horizontalLineTo(9.5f)
                curveTo(9.254f, 15.002f, 9.05f, 14.826f, 9.008f, 14.592f)
                lineTo(9.0f, 14.502f)
                verticalLineTo(6.5f)
                curveTo(9.0f, 6.255f, 9.177f, 6.05f, 9.41f, 6.008f)
                lineTo(9.5f, 6.0f)
                horizontalLineTo(18.504f)
                close()
                moveTo(7.499f, 6.0f)
                curveTo(7.745f, 6.0f, 7.949f, 6.177f, 7.991f, 6.41f)
                lineTo(7.999f, 6.5f)
                verticalLineTo(14.502f)
                curveTo(7.999f, 14.748f, 7.822f, 14.952f, 7.589f, 14.994f)
                lineTo(7.499f, 15.002f)
                horizontalLineTo(5.499f)
                curveTo(5.254f, 15.002f, 5.05f, 14.826f, 5.007f, 14.592f)
                lineTo(4.999f, 14.502f)
                verticalLineTo(6.5f)
                curveTo(4.999f, 6.255f, 5.176f, 6.05f, 5.409f, 6.008f)
                lineTo(5.499f, 6.0f)
                horizontalLineTo(7.499f)
                close()
            }
        }
        .build()
        return _viewDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _viewDesktop: ImageVector? = null

@Preview
@Composable
private fun ViewDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ViewDesktop, contentDescription = "ViewDesktop Icon")
    }
}

