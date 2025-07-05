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
 * InfoShield Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent generic information in content.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_info_shield_20_filled.svg)
 * 
 * @return The [ImageVector] for the InfoShield icon.
 */
public val FluentIcons.Filled.InfoShield: ImageVector
    get() {
        if (_infoShield != null) {
            return _infoShield!!
        }
        _infoShield = Builder(name = "InfoShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 4.582f, 13.418f, 1.0f, 9.0f, 1.0f)
                curveTo(4.582f, 1.0f, 1.0f, 4.582f, 1.0f, 9.0f)
                curveTo(1.0f, 13.418f, 4.582f, 17.0f, 9.0f, 17.0f)
                curveTo(9.591f, 17.0f, 10.167f, 16.936f, 10.722f, 16.814f)
                curveTo(10.65f, 16.675f, 10.583f, 16.532f, 10.522f, 16.386f)
                curveTo(10.203f, 15.623f, 10.035f, 14.783f, 10.005f, 13.883f)
                lineTo(10.005f, 13.875f)
                lineTo(10.0f, 13.593f)
                verticalLineTo(11.083f)
                curveTo(10.0f, 10.34f, 10.589f, 9.667f, 11.4f, 9.667f)
                curveTo(12.306f, 9.667f, 13.157f, 9.304f, 13.997f, 8.429f)
                curveTo(14.547f, 7.856f, 15.456f, 7.857f, 16.006f, 8.43f)
                curveTo(16.205f, 8.639f, 16.405f, 8.817f, 16.603f, 8.967f)
                curveTo(16.735f, 9.066f, 16.866f, 9.153f, 16.997f, 9.23f)
                curveTo(16.999f, 9.153f, 17.0f, 9.077f, 17.0f, 9.0f)
                close()
                moveTo(8.508f, 7.91f)
                curveTo(8.55f, 7.677f, 8.755f, 7.5f, 9.0f, 7.5f)
                curveTo(9.245f, 7.5f, 9.45f, 7.677f, 9.492f, 7.91f)
                lineTo(9.5f, 8.0f)
                verticalLineTo(12.502f)
                lineTo(9.492f, 12.592f)
                curveTo(9.45f, 12.825f, 9.245f, 13.002f, 9.0f, 13.002f)
                curveTo(8.755f, 13.002f, 8.55f, 12.825f, 8.508f, 12.592f)
                lineTo(8.5f, 12.502f)
                verticalLineTo(8.0f)
                lineTo(8.508f, 7.91f)
                close()
                moveTo(8.25f, 5.75f)
                curveTo(8.25f, 5.336f, 8.586f, 5.0f, 9.0f, 5.0f)
                curveTo(9.414f, 5.0f, 9.75f, 5.336f, 9.75f, 5.75f)
                curveTo(9.75f, 6.164f, 9.414f, 6.5f, 9.0f, 6.5f)
                curveTo(8.586f, 6.5f, 8.25f, 6.164f, 8.25f, 5.75f)
                close()
                moveTo(17.0f, 10.347f)
                curveTo(16.656f, 10.202f, 16.323f, 10.008f, 16.0f, 9.764f)
                curveTo(15.755f, 9.579f, 15.517f, 9.365f, 15.284f, 9.122f)
                curveTo(15.128f, 8.959f, 14.874f, 8.959f, 14.718f, 9.122f)
                curveTo(13.723f, 10.158f, 12.623f, 10.667f, 11.4f, 10.667f)
                curveTo(11.179f, 10.667f, 11.0f, 10.853f, 11.0f, 11.083f)
                verticalLineTo(13.584f)
                lineTo(11.004f, 13.85f)
                curveTo(11.031f, 14.647f, 11.178f, 15.364f, 11.445f, 16.0f)
                curveTo(11.595f, 16.36f, 11.784f, 16.693f, 12.01f, 17.0f)
                curveTo(12.285f, 17.372f, 12.615f, 17.706f, 13.0f, 18.0f)
                curveTo(13.523f, 18.4f, 14.148f, 18.727f, 14.873f, 18.979f)
                curveTo(14.956f, 19.007f, 15.044f, 19.007f, 15.127f, 18.979f)
                curveTo(17.687f, 18.09f, 19.0f, 16.266f, 19.0f, 13.584f)
                verticalLineTo(11.083f)
                lineTo(18.992f, 10.999f)
                curveTo(18.955f, 10.809f, 18.793f, 10.667f, 18.6f, 10.667f)
                curveTo(18.397f, 10.667f, 18.197f, 10.653f, 18.0f, 10.625f)
                curveTo(17.656f, 10.575f, 17.323f, 10.483f, 17.0f, 10.347f)
                close()
            }
        }
        .build()
        return _infoShield!!
    }

@Suppress("ObjectPropertyName")
private var _infoShield: ImageVector? = null

@Preview
@Composable
private fun InfoShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.InfoShield, contentDescription = "InfoShield Icon")
    }
}

