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
 * PasswordReset Icon (48dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 48dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general password scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_password_reset_48_filled.svg)
 * 
 * @return The [ImageVector] for the PasswordReset icon.
 */
public val FluentIcons.Filled.PasswordReset: ImageVector
    get() {
        if (_passwordReset != null) {
            return _passwordReset!!
        }
        _passwordReset = Builder(name = "PasswordReset", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.25f, 7.0f)
                curveTo(6.798f, 7.0f, 4.0f, 9.798f, 4.0f, 13.25f)
                verticalLineTo(28.75f)
                curveTo(4.0f, 32.202f, 6.798f, 35.0f, 10.25f, 35.0f)
                horizontalLineTo(26.404f)
                lineTo(22.952f, 31.548f)
                curveTo(21.683f, 30.279f, 21.683f, 28.221f, 22.952f, 26.952f)
                lineTo(26.068f, 23.836f)
                lineTo(25.0f, 22.768f)
                lineTo(23.134f, 24.634f)
                curveTo(22.646f, 25.122f, 21.854f, 25.122f, 21.366f, 24.634f)
                curveTo(20.878f, 24.146f, 20.878f, 23.354f, 21.366f, 22.866f)
                lineTo(23.232f, 21.0f)
                lineTo(21.366f, 19.134f)
                curveTo(20.878f, 18.646f, 20.878f, 17.854f, 21.366f, 17.366f)
                curveTo(21.854f, 16.878f, 22.646f, 16.878f, 23.134f, 17.366f)
                lineTo(25.0f, 19.232f)
                lineTo(26.866f, 17.366f)
                curveTo(27.354f, 16.878f, 28.146f, 16.878f, 28.634f, 17.366f)
                curveTo(29.122f, 17.854f, 29.122f, 18.646f, 28.634f, 19.134f)
                lineTo(26.768f, 21.0f)
                lineTo(28.012f, 22.244f)
                curveTo(29.189f, 21.76f, 30.592f, 21.996f, 31.548f, 22.952f)
                curveTo(31.731f, 23.134f, 31.887f, 23.333f, 32.017f, 23.544f)
                curveTo(32.115f, 22.951f, 32.63f, 22.5f, 33.25f, 22.5f)
                horizontalLineTo(37.75f)
                curveTo(38.44f, 22.5f, 39.0f, 23.06f, 39.0f, 23.75f)
                curveTo(39.0f, 24.44f, 38.44f, 25.0f, 37.75f, 25.0f)
                horizontalLineTo(33.25f)
                curveTo(32.949f, 25.0f, 32.672f, 24.893f, 32.456f, 24.715f)
                curveTo(32.527f, 25.141f, 32.512f, 25.579f, 32.413f, 26.0f)
                horizontalLineTo(37.0f)
                curveTo(39.659f, 26.0f, 42.098f, 26.944f, 44.0f, 28.514f)
                verticalLineTo(13.25f)
                curveTo(44.0f, 9.798f, 41.202f, 7.0f, 37.75f, 7.0f)
                horizontalLineTo(10.25f)
                close()
                moveTo(10.366f, 17.366f)
                curveTo(10.854f, 16.878f, 11.646f, 16.878f, 12.134f, 17.366f)
                lineTo(14.0f, 19.232f)
                lineTo(15.866f, 17.366f)
                curveTo(16.354f, 16.878f, 17.146f, 16.878f, 17.634f, 17.366f)
                curveTo(18.122f, 17.854f, 18.122f, 18.646f, 17.634f, 19.134f)
                lineTo(15.768f, 21.0f)
                lineTo(17.634f, 22.866f)
                curveTo(18.122f, 23.354f, 18.122f, 24.146f, 17.634f, 24.634f)
                curveTo(17.146f, 25.122f, 16.354f, 25.122f, 15.866f, 24.634f)
                lineTo(14.0f, 22.768f)
                lineTo(12.134f, 24.634f)
                curveTo(11.646f, 25.122f, 10.854f, 25.122f, 10.366f, 24.634f)
                curveTo(9.878f, 24.146f, 9.878f, 23.354f, 10.366f, 22.866f)
                lineTo(12.232f, 21.0f)
                lineTo(10.366f, 19.134f)
                curveTo(9.878f, 18.646f, 9.878f, 17.854f, 10.366f, 17.366f)
                close()
                moveTo(30.134f, 26.134f)
                curveTo(30.622f, 25.646f, 30.622f, 24.854f, 30.134f, 24.366f)
                curveTo(29.646f, 23.878f, 28.854f, 23.878f, 28.366f, 24.366f)
                lineTo(24.366f, 28.366f)
                curveTo(23.878f, 28.854f, 23.878f, 29.646f, 24.366f, 30.134f)
                lineTo(28.366f, 34.134f)
                curveTo(28.854f, 34.622f, 29.646f, 34.622f, 30.134f, 34.134f)
                curveTo(30.622f, 33.646f, 30.622f, 32.854f, 30.134f, 32.366f)
                lineTo(28.268f, 30.5f)
                horizontalLineTo(37.0f)
                curveTo(40.59f, 30.5f, 43.5f, 33.41f, 43.5f, 37.0f)
                curveTo(43.5f, 40.59f, 40.59f, 43.5f, 37.0f, 43.5f)
                curveTo(33.769f, 43.5f, 31.087f, 41.142f, 30.585f, 38.053f)
                curveTo(30.474f, 37.372f, 29.832f, 36.909f, 29.15f, 37.02f)
                curveTo(28.469f, 37.131f, 28.006f, 37.773f, 28.117f, 38.454f)
                curveTo(28.813f, 42.734f, 32.524f, 46.0f, 37.0f, 46.0f)
                curveTo(41.971f, 46.0f, 46.0f, 41.971f, 46.0f, 37.0f)
                curveTo(46.0f, 32.029f, 41.971f, 28.0f, 37.0f, 28.0f)
                horizontalLineTo(28.268f)
                lineTo(30.134f, 26.134f)
                close()
            }
        }
        .build()
        return _passwordReset!!
    }

@Suppress("ObjectPropertyName")
private var _passwordReset: ImageVector? = null

@Preview
@Composable
private fun PasswordResetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PasswordReset, contentDescription = "PasswordReset Icon")
    }
}

