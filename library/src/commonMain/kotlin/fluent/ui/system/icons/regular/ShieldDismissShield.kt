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
 * ShieldDismissShield Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent security, safety & protection.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_shield_dismiss_shield_20_regular.svg)
 * 
 * @return The [ImageVector] for the ShieldDismissShield icon.
 */
public val FluentIcons.Regular.ShieldDismissShield: ImageVector
    get() {
        if (_shieldDismissShield != null) {
            return _shieldDismissShield!!
        }
        _shieldDismissShield = Builder(name = "ShieldDismissShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.277f, 2.084f)
                curveTo(10.109f, 1.972f, 9.891f, 1.972f, 9.723f, 2.084f)
                curveTo(7.784f, 3.376f, 5.688f, 4.182f, 3.429f, 4.505f)
                curveTo(3.183f, 4.54f, 3.0f, 4.751f, 3.0f, 5.0f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 13.391f, 5.307f, 16.231f, 9.821f, 17.967f)
                curveTo(9.936f, 18.011f, 10.064f, 18.011f, 10.179f, 17.967f)
                curveTo(10.524f, 17.834f, 10.855f, 17.695f, 11.174f, 17.55f)
                curveTo(10.977f, 17.278f, 10.805f, 16.99f, 10.658f, 16.686f)
                curveTo(10.445f, 16.781f, 10.226f, 16.874f, 10.0f, 16.963f)
                curveTo(5.968f, 15.363f, 4.0f, 12.892f, 4.0f, 9.5f)
                verticalLineTo(5.428f)
                curveTo(5.985f, 5.091f, 7.853f, 4.396f, 9.599f, 3.346f)
                lineTo(10.0f, 3.097f)
                lineTo(10.401f, 3.346f)
                curveTo(12.147f, 4.396f, 14.015f, 5.091f, 16.0f, 5.428f)
                verticalLineTo(8.424f)
                lineTo(16.006f, 8.43f)
                curveTo(16.205f, 8.639f, 16.405f, 8.817f, 16.603f, 8.967f)
                curveTo(16.736f, 9.067f, 16.868f, 9.155f, 17.0f, 9.232f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 4.751f, 16.817f, 4.54f, 16.571f, 4.505f)
                curveTo(14.312f, 4.182f, 12.215f, 3.376f, 10.277f, 2.084f)
                close()
                moveTo(10.04f, 10.748f)
                curveTo(10.154f, 10.28f, 10.501f, 9.883f, 10.975f, 9.732f)
                lineTo(12.854f, 7.854f)
                curveTo(13.049f, 7.658f, 13.049f, 7.342f, 12.854f, 7.146f)
                curveTo(12.658f, 6.951f, 12.342f, 6.951f, 12.146f, 7.146f)
                lineTo(10.0f, 9.293f)
                lineTo(7.854f, 7.146f)
                curveTo(7.658f, 6.951f, 7.342f, 6.951f, 7.146f, 7.146f)
                curveTo(6.951f, 7.342f, 6.951f, 7.658f, 7.146f, 7.854f)
                lineTo(9.293f, 10.0f)
                lineTo(7.146f, 12.146f)
                curveTo(6.951f, 12.342f, 6.951f, 12.658f, 7.146f, 12.854f)
                curveTo(7.342f, 13.049f, 7.658f, 13.049f, 7.854f, 12.854f)
                lineTo(10.0f, 10.707f)
                lineTo(10.04f, 10.748f)
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
        return _shieldDismissShield!!
    }

@Suppress("ObjectPropertyName")
private var _shieldDismissShield: ImageVector? = null

@Preview
@Composable
private fun ShieldDismissShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShieldDismissShield, contentDescription = "ShieldDismissShield Icon")
    }
}

