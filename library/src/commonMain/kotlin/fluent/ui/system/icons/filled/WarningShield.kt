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

package fluent.ui.system.icons.filled

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
 * WarningShield icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: warning, shield
 * - Source: ic_fluent_warning_shield_20_filled.svg
 * 
 * @return The [ImageVector] for the WarningShield icon.
 */
public val FluentIcons.Filled.WarningShield: ImageVector
    get() {
        if (_warningShield != null) {
            return _warningShield!!
        }
        _warningShield = Builder(name = "WarningShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.686f, 1.852f)
                lineTo(1.127f, 13.777f)
                curveTo(0.577f, 14.777f, 1.301f, 16.0f, 2.442f, 16.0f)
                horizontalLineTo(10.376f)
                curveTo(10.151f, 15.343f, 10.03f, 14.634f, 10.005f, 13.883f)
                lineTo(10.005f, 13.875f)
                lineTo(10.0f, 13.593f)
                verticalLineTo(11.084f)
                curveTo(10.0f, 10.34f, 10.589f, 9.667f, 11.4f, 9.667f)
                curveTo(12.291f, 9.667f, 13.129f, 9.316f, 13.955f, 8.472f)
                lineTo(10.315f, 1.852f)
                curveTo(9.745f, 0.816f, 8.256f, 0.816f, 7.686f, 1.852f)
                close()
                moveTo(9.0f, 5.75f)
                curveTo(9.415f, 5.75f, 9.75f, 6.086f, 9.75f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(9.75f, 10.914f, 9.415f, 11.25f, 9.0f, 11.25f)
                curveTo(8.586f, 11.25f, 8.25f, 10.914f, 8.25f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(8.25f, 6.086f, 8.586f, 5.75f, 9.0f, 5.75f)
                close()
                moveTo(9.75f, 12.75f)
                curveTo(9.75f, 13.164f, 9.415f, 13.5f, 9.0f, 13.5f)
                curveTo(8.586f, 13.5f, 8.25f, 13.164f, 8.25f, 12.75f)
                curveTo(8.25f, 12.336f, 8.586f, 12.0f, 9.0f, 12.0f)
                curveTo(9.415f, 12.0f, 9.75f, 12.336f, 9.75f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.347f)
                curveTo(16.656f, 10.203f, 16.323f, 10.009f, 16.0f, 9.765f)
                curveTo(15.755f, 9.579f, 15.517f, 9.365f, 15.284f, 9.123f)
                curveTo(15.128f, 8.96f, 14.874f, 8.959f, 14.718f, 9.122f)
                curveTo(13.723f, 10.158f, 12.623f, 10.667f, 11.4f, 10.667f)
                curveTo(11.179f, 10.667f, 11.0f, 10.854f, 11.0f, 11.084f)
                verticalLineTo(13.585f)
                lineTo(11.004f, 13.85f)
                curveTo(11.031f, 14.647f, 11.178f, 15.364f, 11.445f, 16.0f)
                curveTo(11.595f, 16.36f, 11.784f, 16.693f, 12.01f, 17.0f)
                curveTo(12.285f, 17.373f, 12.615f, 17.706f, 13.0f, 18.0f)
                curveTo(13.523f, 18.4f, 14.148f, 18.727f, 14.873f, 18.979f)
                curveTo(14.956f, 19.007f, 15.044f, 19.007f, 15.127f, 18.979f)
                curveTo(17.687f, 18.09f, 19.0f, 16.267f, 19.0f, 13.585f)
                verticalLineTo(11.084f)
                lineTo(18.992f, 11.0f)
                curveTo(18.955f, 10.81f, 18.793f, 10.667f, 18.6f, 10.667f)
                curveTo(18.397f, 10.667f, 18.197f, 10.653f, 18.0f, 10.625f)
                curveTo(17.656f, 10.575f, 17.323f, 10.483f, 17.0f, 10.347f)
                close()
            }
        }
        .build()
        return _warningShield!!
    }

@Suppress("ObjectPropertyName")
private var _warningShield: ImageVector? = null

@Preview
@Composable
private fun WarningShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WarningShield, contentDescription = null)
    }
}

