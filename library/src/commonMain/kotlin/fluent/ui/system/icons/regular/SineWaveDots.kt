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
 * SineWaveDots Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent sine wave dots.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sine_wave_dots_24_regular.svg)
 * 
 * @return The [ImageVector] for the SineWaveDots icon.
 */
public val FluentIcons.Regular.SineWaveDots: ImageVector
    get() {
        if (_sineWaveDots != null) {
            return _sineWaveDots!!
        }
        _sineWaveDots = Builder(name = "SineWaveDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.608f, 1.979f)
                curveTo(9.455f, 1.98f, 10.079f, 2.483f, 10.516f, 3.1f)
                curveTo(10.946f, 3.709f, 11.272f, 4.528f, 11.535f, 5.423f)
                curveTo(12.064f, 7.219f, 12.419f, 9.592f, 12.763f, 11.886f)
                curveTo(13.112f, 14.217f, 13.452f, 16.469f, 13.944f, 18.142f)
                curveTo(14.191f, 18.98f, 14.459f, 19.607f, 14.743f, 20.01f)
                curveTo(15.022f, 20.404f, 15.236f, 20.479f, 15.392f, 20.479f)
                curveTo(15.531f, 20.479f, 15.705f, 20.422f, 15.932f, 20.151f)
                curveTo(16.17f, 19.867f, 16.409f, 19.41f, 16.638f, 18.767f)
                curveTo(17.094f, 17.484f, 17.428f, 15.7f, 17.739f, 13.729f)
                curveTo(17.74f, 13.726f, 17.74f, 13.723f, 17.74f, 13.72f)
                curveTo(16.713f, 13.243f, 16.0f, 12.206f, 16.0f, 11.0f)
                curveTo(16.0f, 9.343f, 17.343f, 8.0f, 19.0f, 8.0f)
                curveTo(20.657f, 8.0f, 22.0f, 9.343f, 22.0f, 11.0f)
                curveTo(22.0f, 12.569f, 20.795f, 13.856f, 19.26f, 13.987f)
                curveTo(18.951f, 15.943f, 18.599f, 17.853f, 18.091f, 19.283f)
                curveTo(17.837f, 19.998f, 17.522f, 20.654f, 17.112f, 21.143f)
                curveTo(16.691f, 21.645f, 16.12f, 22.021f, 15.392f, 22.021f)
                curveTo(14.545f, 22.021f, 13.921f, 21.517f, 13.484f, 20.9f)
                curveTo(13.054f, 20.291f, 12.729f, 19.472f, 12.465f, 18.577f)
                curveTo(11.936f, 16.781f, 11.581f, 14.408f, 11.237f, 12.114f)
                curveTo(10.888f, 9.783f, 10.548f, 7.531f, 10.056f, 5.858f)
                curveTo(9.809f, 5.019f, 9.541f, 4.393f, 9.257f, 3.99f)
                curveTo(8.978f, 3.596f, 8.763f, 3.521f, 8.608f, 3.521f)
                curveTo(8.469f, 3.521f, 8.295f, 3.578f, 8.068f, 3.849f)
                curveTo(7.83f, 4.133f, 7.591f, 4.59f, 7.362f, 5.233f)
                curveTo(6.907f, 6.516f, 6.572f, 8.3f, 6.261f, 10.271f)
                curveTo(6.26f, 10.274f, 6.259f, 10.276f, 6.259f, 10.279f)
                curveTo(7.286f, 10.755f, 8.0f, 11.793f, 8.0f, 13.0f)
                curveTo(8.0f, 14.657f, 6.657f, 16.0f, 5.0f, 16.0f)
                curveTo(3.343f, 16.0f, 2.0f, 14.657f, 2.0f, 13.0f)
                curveTo(2.0f, 11.431f, 3.205f, 10.144f, 4.739f, 10.012f)
                curveTo(5.048f, 8.056f, 5.401f, 6.147f, 5.909f, 4.717f)
                curveTo(6.163f, 4.002f, 6.478f, 3.346f, 6.888f, 2.857f)
                curveTo(7.309f, 2.355f, 7.88f, 1.979f, 8.608f, 1.979f)
                close()
                moveTo(5.0f, 11.5f)
                curveTo(4.172f, 11.5f, 3.5f, 12.172f, 3.5f, 13.0f)
                curveTo(3.5f, 13.828f, 4.172f, 14.5f, 5.0f, 14.5f)
                curveTo(5.828f, 14.5f, 6.5f, 13.828f, 6.5f, 13.0f)
                curveTo(6.5f, 12.172f, 5.828f, 11.5f, 5.0f, 11.5f)
                close()
                moveTo(19.0f, 9.5f)
                curveTo(18.172f, 9.5f, 17.5f, 10.172f, 17.5f, 11.0f)
                curveTo(17.5f, 11.828f, 18.172f, 12.5f, 19.0f, 12.5f)
                curveTo(19.828f, 12.5f, 20.5f, 11.828f, 20.5f, 11.0f)
                curveTo(20.5f, 10.172f, 19.828f, 9.5f, 19.0f, 9.5f)
                close()
            }
        }
        .build()
        return _sineWaveDots!!
    }

@Suppress("ObjectPropertyName")
private var _sineWaveDots: ImageVector? = null

@Preview
@Composable
private fun SineWaveDotsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SineWaveDots, contentDescription = "SineWaveDots Icon")
    }
}

