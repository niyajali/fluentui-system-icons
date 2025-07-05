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
 * Teaching Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent teaching and other general school usage.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_teaching_24_regular.svg)
 * 
 * @return The [ImageVector] for the Teaching icon.
 */
public val FluentIcons.Regular.Teaching: ImageVector
    get() {
        if (_teaching != null) {
            return _teaching!!
        }
        _teaching = Builder(name = "Teaching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.25f)
                curveTo(3.0f, 3.007f, 4.007f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(14.75f)
                curveTo(15.993f, 2.0f, 17.0f, 3.007f, 17.0f, 4.25f)
                verticalLineTo(6.748f)
                curveTo(16.732f, 6.94f, 16.483f, 7.152f, 16.252f, 7.383f)
                curveTo(16.019f, 7.171f, 15.768f, 6.98f, 15.5f, 6.812f)
                verticalLineTo(4.25f)
                curveTo(15.5f, 3.836f, 15.164f, 3.5f, 14.75f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 3.5f, 4.5f, 3.836f, 4.5f, 4.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(4.75f)
                curveTo(5.164f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                curveTo(5.5f, 6.664f, 5.164f, 7.0f, 4.75f, 7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(10.25f)
                horizontalLineTo(4.75f)
                curveTo(5.164f, 10.25f, 5.5f, 10.586f, 5.5f, 11.0f)
                curveTo(5.5f, 11.414f, 5.164f, 11.75f, 4.75f, 11.75f)
                horizontalLineTo(4.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.75f)
                curveTo(5.164f, 15.0f, 5.5f, 15.336f, 5.5f, 15.75f)
                curveTo(5.5f, 16.164f, 5.164f, 16.5f, 4.75f, 16.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.164f, 4.836f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(8.749f)
                curveTo(8.926f, 19.035f, 9.138f, 19.537f, 9.367f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 20.0f, 3.0f, 18.993f, 3.0f, 17.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 16.5f, 2.0f, 16.164f, 2.0f, 15.75f)
                curveTo(2.0f, 15.336f, 2.336f, 15.0f, 2.75f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.75f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 11.75f, 2.0f, 11.414f, 2.0f, 11.0f)
                curveTo(2.0f, 10.586f, 2.336f, 10.25f, 2.75f, 10.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 7.0f, 2.0f, 6.664f, 2.0f, 6.25f)
                curveTo(2.0f, 5.836f, 2.336f, 5.5f, 2.75f, 5.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.25f)
                close()
                moveTo(16.28f, 8.938f)
                curveTo(15.505f, 7.77f, 14.178f, 7.0f, 12.671f, 7.0f)
                horizontalLineTo(12.25f)
                curveTo(11.698f, 7.0f, 11.25f, 7.448f, 11.25f, 8.0f)
                verticalLineTo(8.421f)
                curveTo(11.25f, 9.457f, 11.614f, 10.407f, 12.22f, 11.152f)
                curveTo(10.7f, 11.6f, 9.25f, 13.037f, 9.25f, 15.5f)
                curveTo(9.25f, 18.575f, 11.071f, 21.084f, 11.984f, 22.157f)
                curveTo(12.475f, 22.735f, 13.185f, 23.0f, 13.877f, 23.0f)
                horizontalLineTo(13.923f)
                curveTo(14.664f, 23.0f, 15.371f, 22.685f, 15.868f, 22.135f)
                curveTo(15.913f, 22.084f, 15.962f, 22.039f, 16.015f, 21.998f)
                curveTo(16.077f, 21.95f, 16.173f, 21.95f, 16.235f, 21.998f)
                curveTo(16.288f, 22.039f, 16.337f, 22.084f, 16.382f, 22.135f)
                curveTo(16.879f, 22.685f, 17.586f, 23.0f, 18.327f, 23.0f)
                horizontalLineTo(18.372f)
                curveTo(19.065f, 23.0f, 19.775f, 22.735f, 20.266f, 22.157f)
                curveTo(21.179f, 21.084f, 23.0f, 18.575f, 23.0f, 15.5f)
                curveTo(23.0f, 12.478f, 20.818f, 11.0f, 19.0f, 11.0f)
                curveTo(18.156f, 11.0f, 17.476f, 11.156f, 17.014f, 11.308f)
                curveTo(17.124f, 10.059f, 17.9f, 8.955f, 19.058f, 8.434f)
                curveTo(19.435f, 8.264f, 19.604f, 7.82f, 19.434f, 7.442f)
                curveTo(19.264f, 7.064f, 18.82f, 6.896f, 18.442f, 7.066f)
                curveTo(17.535f, 7.474f, 16.792f, 8.132f, 16.28f, 8.938f)
                close()
                moveTo(10.75f, 15.5f)
                curveTo(10.75f, 13.351f, 12.215f, 12.5f, 13.25f, 12.5f)
                curveTo(13.95f, 12.5f, 14.494f, 12.637f, 14.829f, 12.753f)
                curveTo(15.179f, 12.874f, 15.613f, 13.0f, 16.086f, 13.0f)
                horizontalLineTo(16.164f)
                curveTo(16.636f, 13.0f, 17.071f, 12.874f, 17.421f, 12.753f)
                curveTo(17.756f, 12.637f, 18.3f, 12.5f, 19.0f, 12.5f)
                curveTo(20.035f, 12.5f, 21.5f, 13.351f, 21.5f, 15.5f)
                curveTo(21.5f, 18.021f, 19.978f, 20.181f, 19.124f, 21.185f)
                curveTo(18.958f, 21.379f, 18.693f, 21.5f, 18.372f, 21.5f)
                horizontalLineTo(18.327f)
                curveTo(18.01f, 21.5f, 17.708f, 21.366f, 17.496f, 21.13f)
                curveTo(17.39f, 21.013f, 17.275f, 20.906f, 17.152f, 20.811f)
                curveTo(16.55f, 20.346f, 15.7f, 20.346f, 15.098f, 20.811f)
                curveTo(14.975f, 20.906f, 14.86f, 21.013f, 14.754f, 21.13f)
                curveTo(14.542f, 21.366f, 14.24f, 21.5f, 13.923f, 21.5f)
                horizontalLineTo(13.877f)
                curveTo(13.557f, 21.5f, 13.292f, 21.379f, 13.126f, 21.185f)
                curveTo(12.272f, 20.181f, 10.75f, 18.021f, 10.75f, 15.5f)
                close()
                moveTo(15.499f, 11.249f)
                curveTo(14.0f, 11.207f, 12.793f, 10.0f, 12.751f, 8.501f)
                curveTo(14.25f, 8.543f, 15.457f, 9.75f, 15.499f, 11.249f)
                close()
                moveTo(14.171f, 14.165f)
                curveTo(13.986f, 13.794f, 13.535f, 13.644f, 13.165f, 13.829f)
                curveTo(12.276f, 14.274f, 11.781f, 15.246f, 11.944f, 16.226f)
                lineTo(12.01f, 16.623f)
                curveTo(12.078f, 17.032f, 12.465f, 17.308f, 12.873f, 17.24f)
                curveTo(13.282f, 17.172f, 13.558f, 16.785f, 13.49f, 16.377f)
                lineTo(13.424f, 15.979f)
                curveTo(13.368f, 15.649f, 13.535f, 15.321f, 13.835f, 15.171f)
                curveTo(14.206f, 14.986f, 14.356f, 14.535f, 14.171f, 14.165f)
                close()
            }
        }
        .build()
        return _teaching!!
    }

@Suppress("ObjectPropertyName")
private var _teaching: ImageVector? = null

@Preview
@Composable
private fun TeachingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Teaching, contentDescription = "Teaching Icon")
    }
}

