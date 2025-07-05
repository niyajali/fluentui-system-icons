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
 * WiFiLock Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in wifi connection scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_wifi_lock_24_regular.svg)
 * 
 * @return The [ImageVector] for the WiFiLock icon.
 */
public val FluentIcons.Regular.WiFiLock: ImageVector
    get() {
        if (_wiFiLock != null) {
            return _wiFiLock!!
        }
        _wiFiLock = Builder(name = "WiFiLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.744f, 10.751f)
                curveTo(18.335f, 11.341f, 18.847f, 12.058f, 19.236f, 12.82f)
                curveTo(19.425f, 13.189f, 19.279f, 13.641f, 18.91f, 13.829f)
                curveTo(18.541f, 14.018f, 18.09f, 13.872f, 17.901f, 13.503f)
                curveTo(17.581f, 12.877f, 17.16f, 12.288f, 16.684f, 11.811f)
                curveTo(14.619f, 9.747f, 11.521f, 9.345f, 9.055f, 10.608f)
                curveTo(8.671f, 10.197f, 8.189f, 9.88f, 7.647f, 9.692f)
                curveTo(10.772f, 7.654f, 15.001f, 8.007f, 17.744f, 10.751f)
                close()
                moveTo(15.643f, 13.819f)
                curveTo(16.09f, 14.267f, 16.458f, 14.817f, 16.715f, 15.402f)
                curveTo(16.881f, 15.781f, 16.708f, 16.223f, 16.329f, 16.389f)
                curveTo(15.949f, 16.556f, 15.507f, 16.383f, 15.341f, 16.004f)
                curveTo(15.158f, 15.586f, 14.894f, 15.192f, 14.582f, 14.88f)
                curveTo(13.719f, 14.017f, 12.525f, 13.685f, 11.408f, 13.884f)
                curveTo(11.052f, 13.464f, 10.56f, 13.163f, 10.0f, 13.05f)
                verticalLineTo(13.0f)
                curveTo(10.0f, 12.918f, 9.997f, 12.838f, 9.992f, 12.757f)
                curveTo(11.858f, 11.938f, 14.115f, 12.292f, 15.643f, 13.819f)
                close()
                moveTo(20.448f, 8.279f)
                curveTo(20.957f, 8.788f, 21.437f, 9.369f, 21.856f, 9.976f)
                curveTo(22.091f, 10.316f, 22.005f, 10.784f, 21.664f, 11.019f)
                curveTo(21.324f, 11.254f, 20.857f, 11.168f, 20.621f, 10.828f)
                curveTo(20.253f, 10.294f, 19.83f, 9.783f, 19.387f, 9.339f)
                curveTo(15.307f, 5.259f, 8.692f, 5.259f, 4.612f, 9.339f)
                curveTo(4.19f, 9.761f, 3.771f, 10.273f, 3.39f, 10.823f)
                curveTo(3.154f, 11.163f, 2.686f, 11.248f, 2.346f, 11.012f)
                curveTo(2.006f, 10.776f, 1.921f, 10.308f, 2.157f, 9.968f)
                curveTo(2.587f, 9.348f, 3.062f, 8.768f, 3.551f, 8.279f)
                curveTo(8.217f, 3.613f, 15.782f, 3.613f, 20.448f, 8.279f)
                close()
                moveTo(13.06f, 16.439f)
                curveTo(13.646f, 17.025f, 13.646f, 17.975f, 13.06f, 18.561f)
                curveTo(12.767f, 18.853f, 12.384f, 19.0f, 12.0f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(12.384f, 16.0f, 12.767f, 16.146f, 13.06f, 16.439f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineTo(13.0f)
                curveTo(4.0f, 11.619f, 5.119f, 10.5f, 6.5f, 10.5f)
                curveTo(7.881f, 10.5f, 9.0f, 11.619f, 9.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                curveTo(10.328f, 14.0f, 11.0f, 14.671f, 11.0f, 15.5f)
                verticalLineTo(20.5f)
                curveTo(11.0f, 21.328f, 10.328f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 22.0f, 2.0f, 21.328f, 2.0f, 20.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 14.671f, 2.672f, 14.0f, 3.5f, 14.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.5f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.0f)
                curveTo(7.5f, 12.448f, 7.052f, 12.0f, 6.5f, 12.0f)
                curveTo(5.948f, 12.0f, 5.5f, 12.448f, 5.5f, 13.0f)
                close()
                moveTo(7.5f, 18.0f)
                curveTo(7.5f, 17.448f, 7.052f, 17.0f, 6.5f, 17.0f)
                curveTo(5.948f, 17.0f, 5.5f, 17.448f, 5.5f, 18.0f)
                curveTo(5.5f, 18.552f, 5.948f, 19.0f, 6.5f, 19.0f)
                curveTo(7.052f, 19.0f, 7.5f, 18.552f, 7.5f, 18.0f)
                close()
            }
        }
        .build()
        return _wiFiLock!!
    }

@Suppress("ObjectPropertyName")
private var _wiFiLock: ImageVector? = null

@Preview
@Composable
private fun WiFiLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WiFiLock, contentDescription = "WiFiLock Icon")
    }
}

