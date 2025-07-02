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
 * GlobeStar icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: globe, star
 * - Source: ic_fluent_globe_star_20_regular.svg
 * 
 * @return The [ImageVector] for the GlobeStar icon.
 */
public val FluentIcons.Regular.GlobeStar: ImageVector
    get() {
        if (_globeStar != null) {
            return _globeStar!!
        }
        _globeStar = Builder(name = "GlobeStar", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.254f, 17.996f)
                curveTo(10.17f, 17.999f, 10.085f, 18.0f, 10.0f, 18.0f)
                curveTo(5.582f, 18.0f, 2.0f, 14.418f, 2.0f, 10.0f)
                curveTo(2.0f, 5.582f, 5.582f, 2.0f, 10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.582f, 18.0f, 10.0f)
                curveTo(18.0f, 10.085f, 17.999f, 10.17f, 17.996f, 10.254f)
                curveTo(17.687f, 9.999f, 17.349f, 9.777f, 16.988f, 9.594f)
                curveTo(16.946f, 8.86f, 16.791f, 8.156f, 16.54f, 7.5f)
                horizontalLineTo(13.807f)
                curveTo(13.885f, 7.99f, 13.941f, 8.5f, 13.972f, 9.025f)
                curveTo(13.631f, 9.058f, 13.3f, 9.121f, 12.98f, 9.213f)
                curveTo(12.95f, 8.615f, 12.887f, 8.041f, 12.794f, 7.5f)
                horizontalLineTo(7.206f)
                curveTo(7.073f, 8.275f, 7.0f, 9.117f, 7.0f, 10.0f)
                curveTo(7.0f, 10.883f, 7.073f, 11.725f, 7.206f, 12.5f)
                horizontalLineTo(9.375f)
                curveTo(9.25f, 12.82f, 9.154f, 13.154f, 9.091f, 13.5f)
                horizontalLineTo(7.419f)
                curveTo(7.572f, 14.09f, 7.761f, 14.626f, 7.978f, 15.092f)
                curveTo(8.458f, 16.12f, 9.02f, 16.706f, 9.556f, 16.913f)
                curveTo(9.747f, 17.302f, 9.981f, 17.665f, 10.254f, 17.996f)
                close()
                moveTo(12.022f, 4.908f)
                curveTo(11.407f, 3.59f, 10.657f, 3.0f, 10.0f, 3.0f)
                curveTo(9.343f, 3.0f, 8.593f, 3.59f, 7.978f, 4.908f)
                curveTo(7.761f, 5.374f, 7.572f, 5.91f, 7.419f, 6.5f)
                horizontalLineTo(12.581f)
                curveTo(12.428f, 5.91f, 12.239f, 5.374f, 12.022f, 4.908f)
                close()
                moveTo(6.389f, 6.5f)
                curveTo(6.565f, 5.757f, 6.796f, 5.078f, 7.072f, 4.485f)
                curveTo(7.258f, 4.086f, 7.473f, 3.712f, 7.714f, 3.382f)
                curveTo(6.112f, 3.935f, 4.773f, 5.054f, 3.936f, 6.5f)
                horizontalLineTo(6.389f)
                close()
                moveTo(6.0f, 10.0f)
                curveTo(6.0f, 9.129f, 6.067f, 8.288f, 6.193f, 7.5f)
                horizontalLineTo(3.46f)
                curveTo(3.163f, 8.276f, 3.0f, 9.119f, 3.0f, 10.0f)
                curveTo(3.0f, 10.881f, 3.163f, 11.724f, 3.46f, 12.5f)
                horizontalLineTo(6.193f)
                curveTo(6.067f, 11.712f, 6.0f, 10.871f, 6.0f, 10.0f)
                close()
                moveTo(7.072f, 15.515f)
                curveTo(6.796f, 14.922f, 6.565f, 14.243f, 6.389f, 13.5f)
                horizontalLineTo(3.936f)
                curveTo(4.773f, 14.946f, 6.112f, 16.065f, 7.714f, 16.618f)
                curveTo(7.473f, 16.288f, 7.258f, 15.914f, 7.072f, 15.515f)
                close()
                moveTo(16.063f, 6.5f)
                curveTo(15.227f, 5.054f, 13.888f, 3.935f, 12.286f, 3.382f)
                curveTo(12.527f, 3.712f, 12.742f, 4.086f, 12.928f, 4.485f)
                curveTo(13.204f, 5.078f, 13.435f, 5.757f, 13.611f, 6.5f)
                horizontalLineTo(16.063f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(15.453f, 13.392f)
                horizontalLineTo(16.999f)
                curveTo(17.483f, 13.392f, 17.685f, 14.039f, 17.293f, 14.336f)
                lineTo(16.043f, 15.283f)
                lineTo(16.52f, 16.815f)
                curveTo(16.67f, 17.295f, 16.142f, 17.695f, 15.75f, 17.398f)
                lineTo(14.5f, 16.451f)
                lineTo(13.25f, 17.398f)
                curveTo(12.858f, 17.695f, 12.33f, 17.295f, 12.48f, 16.815f)
                lineTo(12.957f, 15.283f)
                lineTo(11.707f, 14.336f)
                curveTo(11.315f, 14.039f, 11.517f, 13.392f, 12.002f, 13.392f)
                horizontalLineTo(13.547f)
                lineTo(14.024f, 11.861f)
                curveTo(14.174f, 11.38f, 14.826f, 11.38f, 14.976f, 11.861f)
                lineTo(15.453f, 13.392f)
                close()
            }
        }
        .build()
        return _globeStar!!
    }

@Suppress("ObjectPropertyName")
private var _globeStar: ImageVector? = null

@Preview
@Composable
private fun GlobeStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GlobeStar, contentDescription = null)
    }
}

