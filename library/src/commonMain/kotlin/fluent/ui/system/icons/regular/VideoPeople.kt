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
 * VideoPeople Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 32dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent video appointments.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_video_people_32_regular.svg)
 * 
 * @return The [ImageVector] for the VideoPeople icon.
 */
public val FluentIcons.Regular.VideoPeople: ImageVector
    get() {
        if (_videoPeople != null) {
            return _videoPeople!!
        }
        _videoPeople = Builder(name = "VideoPeople", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.001f, 7.5f)
                curveTo(6.001f, 5.015f, 8.016f, 3.0f, 10.501f, 3.0f)
                horizontalLineTo(25.501f)
                curveTo(27.986f, 3.0f, 30.001f, 5.015f, 30.001f, 7.5f)
                verticalLineTo(17.5f)
                curveTo(30.001f, 19.985f, 27.986f, 22.0f, 25.501f, 22.0f)
                horizontalLineTo(19.192f)
                curveTo(18.592f, 20.684f, 17.316f, 19.831f, 16.0f, 19.578f)
                verticalLineTo(18.0f)
                curveTo(16.0f, 16.343f, 17.343f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(24.0f)
                curveTo(25.657f, 15.0f, 27.0f, 16.343f, 27.0f, 18.0f)
                verticalLineTo(19.501f)
                curveTo(27.608f, 19.045f, 28.001f, 18.318f, 28.001f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(28.001f, 6.119f, 26.882f, 5.0f, 25.501f, 5.0f)
                horizontalLineTo(10.501f)
                curveTo(9.12f, 5.0f, 8.001f, 6.119f, 8.001f, 7.5f)
                verticalLineTo(7.813f)
                curveTo(7.269f, 8.05f, 6.594f, 8.413f, 6.001f, 8.876f)
                verticalLineTo(7.5f)
                close()
                moveTo(24.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(18.448f, 17.0f, 18.0f, 17.448f, 18.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(25.0f)
                verticalLineTo(18.0f)
                curveTo(25.0f, 17.448f, 24.552f, 17.0f, 24.0f, 17.0f)
                close()
                moveTo(17.415f, 22.0f)
                curveTo(17.838f, 22.486f, 18.09f, 23.126f, 18.042f, 23.873f)
                curveTo(17.907f, 25.947f, 17.124f, 27.553f, 15.639f, 28.601f)
                curveTo(14.206f, 29.612f, 12.262f, 30.0f, 10.0f, 30.0f)
                curveTo(7.752f, 30.0f, 5.844f, 29.616f, 4.434f, 28.614f)
                curveTo(2.976f, 27.577f, 2.206f, 25.995f, 2.017f, 23.965f)
                curveTo(1.854f, 22.216f, 3.35f, 21.0f, 4.872f, 21.0f)
                horizontalLineTo(15.191f)
                curveTo(15.295f, 21.0f, 15.4f, 21.006f, 15.504f, 21.017f)
                curveTo(16.233f, 21.096f, 16.934f, 21.448f, 17.415f, 22.0f)
                close()
                moveTo(4.872f, 23.0f)
                curveTo(4.288f, 23.0f, 3.976f, 23.43f, 4.008f, 23.779f)
                curveTo(4.158f, 25.383f, 4.721f, 26.365f, 5.592f, 26.984f)
                curveTo(6.511f, 27.637f, 7.927f, 28.0f, 10.0f, 28.0f)
                curveTo(12.086f, 28.0f, 13.543f, 27.632f, 14.486f, 26.967f)
                curveTo(15.376f, 26.339f, 15.941f, 25.35f, 16.046f, 23.744f)
                curveTo(16.068f, 23.411f, 15.763f, 23.0f, 15.191f, 23.0f)
                horizontalLineTo(4.872f)
                close()
                moveTo(25.0f, 10.5f)
                curveTo(25.0f, 12.433f, 23.433f, 14.0f, 21.5f, 14.0f)
                curveTo(19.567f, 14.0f, 18.0f, 12.433f, 18.0f, 10.5f)
                curveTo(18.0f, 8.567f, 19.567f, 7.0f, 21.5f, 7.0f)
                curveTo(23.433f, 7.0f, 25.0f, 8.567f, 25.0f, 10.5f)
                close()
                moveTo(23.0f, 10.5f)
                curveTo(23.0f, 9.672f, 22.328f, 9.0f, 21.5f, 9.0f)
                curveTo(20.672f, 9.0f, 20.0f, 9.672f, 20.0f, 10.5f)
                curveTo(20.0f, 11.328f, 20.672f, 12.0f, 21.5f, 12.0f)
                curveTo(22.328f, 12.0f, 23.0f, 11.328f, 23.0f, 10.5f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(15.0f, 16.761f, 12.761f, 19.0f, 10.0f, 19.0f)
                curveTo(7.239f, 19.0f, 5.0f, 16.761f, 5.0f, 14.0f)
                curveTo(5.0f, 11.239f, 7.239f, 9.0f, 10.0f, 9.0f)
                curveTo(12.761f, 9.0f, 15.0f, 11.239f, 15.0f, 14.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 12.343f, 11.657f, 11.0f, 10.0f, 11.0f)
                curveTo(8.343f, 11.0f, 7.0f, 12.343f, 7.0f, 14.0f)
                curveTo(7.0f, 15.657f, 8.343f, 17.0f, 10.0f, 17.0f)
                curveTo(11.657f, 17.0f, 13.0f, 15.657f, 13.0f, 14.0f)
                close()
            }
        }
        .build()
        return _videoPeople!!
    }

@Suppress("ObjectPropertyName")
private var _videoPeople: ImageVector? = null

@Preview
@Composable
private fun VideoPeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VideoPeople, contentDescription = "VideoPeople Icon")
    }
}

