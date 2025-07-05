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
 * WindowFingerprint Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_fingerprint_24_regular.svg)
 * 
 * @return The [ImageVector] for the WindowFingerprint icon.
 */
public val FluentIcons.Regular.WindowFingerprint: ImageVector
    get() {
        if (_windowFingerprint != null) {
            return _windowFingerprint!!
        }
        _windowFingerprint = Builder(name = "WindowFingerprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(10.025f)
                curveTo(9.701f, 20.682f, 9.5f, 20.24f, 9.5f, 19.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.833f)
                curveTo(20.052f, 12.136f, 20.556f, 12.514f, 21.0f, 12.954f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(7.0f)
                close()
                moveTo(16.25f, 13.5f)
                curveTo(15.806f, 13.5f, 15.379f, 13.568f, 14.979f, 13.693f)
                curveTo(14.583f, 13.817f, 14.162f, 13.597f, 14.039f, 13.202f)
                curveTo(13.915f, 12.806f, 14.135f, 12.385f, 14.53f, 12.262f)
                curveTo(15.074f, 12.092f, 15.652f, 12.0f, 16.25f, 12.0f)
                curveTo(18.377f, 12.0f, 20.234f, 13.156f, 21.228f, 14.87f)
                curveTo(21.435f, 15.228f, 21.313f, 15.687f, 20.955f, 15.895f)
                curveTo(20.597f, 16.103f, 20.138f, 15.98f, 19.93f, 15.622f)
                curveTo(19.193f, 14.352f, 17.821f, 13.5f, 16.25f, 13.5f)
                close()
                moveTo(12.697f, 14.153f)
                curveTo(13.028f, 14.402f, 13.095f, 14.872f, 12.847f, 15.203f)
                curveTo(12.315f, 15.913f, 12.0f, 16.794f, 12.0f, 17.75f)
                verticalLineTo(19.75f)
                curveTo(12.0f, 20.164f, 11.664f, 20.5f, 11.25f, 20.5f)
                curveTo(10.836f, 20.5f, 10.5f, 20.164f, 10.5f, 19.75f)
                verticalLineTo(17.75f)
                curveTo(10.5f, 16.458f, 10.927f, 15.264f, 11.647f, 14.304f)
                curveTo(11.895f, 13.972f, 12.366f, 13.905f, 12.697f, 14.153f)
                close()
                moveTo(21.25f, 17.0f)
                curveTo(21.664f, 17.0f, 22.0f, 17.336f, 22.0f, 17.75f)
                verticalLineTo(19.75f)
                curveTo(22.0f, 20.164f, 21.664f, 20.5f, 21.25f, 20.5f)
                curveTo(20.836f, 20.5f, 20.5f, 20.164f, 20.5f, 19.75f)
                verticalLineTo(17.75f)
                curveTo(20.5f, 17.336f, 20.836f, 17.0f, 21.25f, 17.0f)
                close()
                moveTo(14.535f, 17.4f)
                curveTo(14.697f, 16.601f, 15.404f, 16.0f, 16.25f, 16.0f)
                curveTo(17.216f, 16.0f, 18.0f, 16.784f, 18.0f, 17.75f)
                verticalLineTo(21.75f)
                curveTo(18.0f, 22.164f, 18.336f, 22.5f, 18.75f, 22.5f)
                curveTo(19.164f, 22.5f, 19.5f, 22.164f, 19.5f, 21.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 15.955f, 18.045f, 14.5f, 16.25f, 14.5f)
                curveTo(14.676f, 14.5f, 13.366f, 15.618f, 13.065f, 17.102f)
                curveTo(12.983f, 17.508f, 13.245f, 17.904f, 13.651f, 17.986f)
                curveTo(14.057f, 18.068f, 14.453f, 17.806f, 14.535f, 17.4f)
                close()
                moveTo(14.5f, 19.75f)
                curveTo(14.5f, 19.336f, 14.164f, 19.0f, 13.75f, 19.0f)
                curveTo(13.336f, 19.0f, 13.0f, 19.336f, 13.0f, 19.75f)
                verticalLineTo(21.75f)
                curveTo(13.0f, 22.164f, 13.336f, 22.5f, 13.75f, 22.5f)
                curveTo(14.164f, 22.5f, 14.5f, 22.164f, 14.5f, 21.75f)
                verticalLineTo(19.75f)
                close()
                moveTo(17.0f, 17.75f)
                curveTo(17.0f, 17.336f, 16.664f, 17.0f, 16.25f, 17.0f)
                curveTo(15.836f, 17.0f, 15.5f, 17.336f, 15.5f, 17.75f)
                verticalLineTo(22.25f)
                curveTo(15.5f, 22.664f, 15.836f, 23.0f, 16.25f, 23.0f)
                curveTo(16.664f, 23.0f, 17.0f, 22.664f, 17.0f, 22.25f)
                verticalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _windowFingerprint!!
    }

@Suppress("ObjectPropertyName")
private var _windowFingerprint: ImageVector? = null

@Preview
@Composable
private fun WindowFingerprintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WindowFingerprint, contentDescription = "WindowFingerprint Icon")
    }
}

