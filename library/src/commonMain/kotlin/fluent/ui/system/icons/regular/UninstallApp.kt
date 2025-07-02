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
 * UninstallApp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: uninstall, app
 * - Source: ic_fluent_uninstall_app_24_regular.svg
 * 
 * @return The [ImageVector] for the UninstallApp icon.
 */
public val FluentIcons.Regular.UninstallApp: ImageVector
    get() {
        if (_uninstallApp != null) {
            return _uninstallApp!!
        }
        _uninstallApp = Builder(name = "UninstallApp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.695f, 8.854f)
                lineTo(21.779f, 8.781f)
                curveTo(22.045f, 8.515f, 22.069f, 8.098f, 21.851f, 7.804f)
                lineTo(21.779f, 7.72f)
                lineTo(19.559f, 5.502f)
                lineTo(21.779f, 3.282f)
                curveTo(22.045f, 3.016f, 22.069f, 2.599f, 21.851f, 2.306f)
                lineTo(21.779f, 2.222f)
                curveTo(21.513f, 1.955f, 21.096f, 1.931f, 20.802f, 2.149f)
                lineTo(20.718f, 2.222f)
                lineTo(18.499f, 4.442f)
                lineTo(16.28f, 2.222f)
                curveTo(16.014f, 1.955f, 15.597f, 1.931f, 15.304f, 2.149f)
                lineTo(15.219f, 2.222f)
                curveTo(14.953f, 2.488f, 14.929f, 2.905f, 15.147f, 3.198f)
                lineTo(15.219f, 3.282f)
                lineTo(17.438f, 5.502f)
                lineTo(15.219f, 7.72f)
                curveTo(14.953f, 7.987f, 14.929f, 8.403f, 15.147f, 8.697f)
                lineTo(15.219f, 8.781f)
                curveTo(15.486f, 9.047f, 15.902f, 9.071f, 16.196f, 8.854f)
                lineTo(16.28f, 8.781f)
                lineTo(18.499f, 6.563f)
                lineTo(20.718f, 8.781f)
                curveTo(20.984f, 9.047f, 21.401f, 9.071f, 21.695f, 8.854f)
                close()
                moveTo(18.75f, 21.0f)
                curveTo(19.993f, 21.0f, 21.0f, 19.993f, 21.0f, 18.75f)
                verticalLineTo(13.5f)
                curveTo(21.0f, 12.258f, 19.993f, 11.25f, 18.75f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.25f)
                curveTo(12.75f, 4.008f, 11.743f, 3.0f, 10.5f, 3.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 3.0f, 3.0f, 4.008f, 3.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 19.993f, 4.007f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(11.25f, 11.251f)
                horizontalLineTo(4.5f)
                verticalLineTo(5.25f)
                curveTo(4.5f, 4.836f, 4.836f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(10.5f)
                curveTo(10.914f, 4.5f, 11.25f, 4.836f, 11.25f, 5.25f)
                verticalLineTo(11.251f)
                close()
                moveTo(18.75f, 19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 12.75f, 19.5f, 13.086f, 19.5f, 13.5f)
                verticalLineTo(18.75f)
                curveTo(19.5f, 19.165f, 19.164f, 19.5f, 18.75f, 19.5f)
                close()
                moveTo(11.25f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 19.5f, 4.5f, 19.165f, 4.5f, 18.75f)
                verticalLineTo(12.751f)
                lineTo(11.25f, 12.75f)
                verticalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _uninstallApp!!
    }

@Suppress("ObjectPropertyName")
private var _uninstallApp: ImageVector? = null

@Preview
@Composable
private fun UninstallAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.UninstallApp, contentDescription = null)
    }
}

