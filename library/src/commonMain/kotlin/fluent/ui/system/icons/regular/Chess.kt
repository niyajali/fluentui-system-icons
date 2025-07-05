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
 * Chess Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent chess.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chess_20_regular.svg)
 * 
 * @return The [ImageVector] for the Chess icon.
 */
public val FluentIcons.Regular.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveTo(10.0f, 2.448f, 10.448f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(11.5f)
                curveTo(11.885f, 2.0f, 12.237f, 2.145f, 12.502f, 2.384f)
                curveTo(12.768f, 2.145f, 13.12f, 2.0f, 13.505f, 2.0f)
                horizontalLineTo(14.495f)
                curveTo(14.88f, 2.0f, 15.232f, 2.145f, 15.498f, 2.384f)
                curveTo(15.763f, 2.145f, 16.115f, 2.0f, 16.5f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 2.0f, 18.0f, 2.448f, 18.0f, 3.0f)
                verticalLineTo(5.5f)
                curveTo(18.0f, 6.692f, 17.166f, 7.689f, 16.05f, 7.939f)
                curveTo(16.334f, 11.983f, 17.75f, 14.525f, 18.237f, 15.291f)
                curveTo(18.397f, 15.542f, 18.5f, 15.843f, 18.5f, 16.167f)
                verticalLineTo(16.5f)
                curveTo(18.5f, 17.328f, 17.828f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(11.524f)
                curveTo(11.738f, 17.709f, 11.89f, 17.369f, 11.959f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.276f, 17.0f, 17.5f, 16.776f, 17.5f, 16.5f)
                verticalLineTo(16.167f)
                curveTo(17.5f, 16.058f, 17.465f, 15.941f, 17.393f, 15.827f)
                curveTo(16.82f, 14.926f, 15.238f, 12.053f, 15.024f, 7.523f)
                curveTo(15.018f, 7.388f, 15.067f, 7.256f, 15.16f, 7.157f)
                curveTo(15.253f, 7.058f, 15.382f, 7.001f, 15.518f, 7.0f)
                curveTo(16.338f, 6.99f, 17.0f, 6.323f, 17.0f, 5.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.5f)
                curveTo(16.224f, 3.0f, 16.0f, 3.224f, 16.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 4.776f, 15.777f, 4.999f, 15.501f, 5.0f)
                curveTo(15.226f, 5.001f, 15.001f, 4.778f, 15.0f, 4.503f)
                lineTo(15.0f, 4.5f)
                lineTo(14.995f, 3.497f)
                curveTo(14.994f, 3.222f, 14.77f, 3.0f, 14.495f, 3.0f)
                horizontalLineTo(13.505f)
                curveTo(13.23f, 3.0f, 13.006f, 3.222f, 13.005f, 3.497f)
                lineTo(13.0f, 4.503f)
                curveTo(12.999f, 4.778f, 12.774f, 5.001f, 12.499f, 5.0f)
                curveTo(12.223f, 4.999f, 12.0f, 4.776f, 12.0f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(12.0f, 3.224f, 11.776f, 3.0f, 11.5f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 6.323f, 11.662f, 6.99f, 12.482f, 7.0f)
                curveTo(12.618f, 7.001f, 12.747f, 7.058f, 12.84f, 7.157f)
                curveTo(12.933f, 7.256f, 12.982f, 7.388f, 12.976f, 7.523f)
                curveTo(12.818f, 10.862f, 11.917f, 13.302f, 11.224f, 14.714f)
                curveTo(11.158f, 14.647f, 11.09f, 14.584f, 11.021f, 14.526f)
                curveTo(10.873f, 14.402f, 10.677f, 14.218f, 10.472f, 13.968f)
                curveTo(11.059f, 12.69f, 11.759f, 10.653f, 11.95f, 7.939f)
                curveTo(11.177f, 7.766f, 10.539f, 7.234f, 10.22f, 6.528f)
                curveTo(10.203f, 6.483f, 10.184f, 6.439f, 10.165f, 6.395f)
                curveTo(10.058f, 6.117f, 10.0f, 5.815f, 10.0f, 5.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(4.5f, 8.0f)
                curveTo(4.5f, 6.895f, 5.395f, 6.0f, 6.5f, 6.0f)
                curveTo(7.605f, 6.0f, 8.5f, 6.895f, 8.5f, 8.0f)
                curveTo(8.5f, 8.451f, 8.351f, 8.865f, 8.1f, 9.2f)
                curveTo(7.987f, 9.351f, 7.968f, 9.554f, 8.053f, 9.723f)
                curveTo(8.138f, 9.893f, 8.311f, 10.0f, 8.5f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.276f, 10.0f, 9.5f, 10.224f, 9.5f, 10.5f)
                curveTo(9.5f, 10.776f, 9.276f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(7.893f)
                curveTo(7.75f, 11.0f, 7.613f, 11.061f, 7.519f, 11.169f)
                curveTo(7.424f, 11.276f, 7.379f, 11.419f, 7.397f, 11.561f)
                curveTo(7.699f, 14.031f, 9.006f, 15.448f, 9.738f, 16.06f)
                curveTo(9.912f, 16.206f, 10.0f, 16.389f, 10.0f, 16.549f)
                curveTo(10.0f, 16.798f, 9.798f, 17.0f, 9.549f, 17.0f)
                horizontalLineTo(3.451f)
                curveTo(3.202f, 17.0f, 3.0f, 16.798f, 3.0f, 16.549f)
                curveTo(3.0f, 16.389f, 3.088f, 16.206f, 3.262f, 16.06f)
                curveTo(3.994f, 15.448f, 5.301f, 14.031f, 5.603f, 11.561f)
                curveTo(5.621f, 11.419f, 5.576f, 11.276f, 5.481f, 11.169f)
                curveTo(5.387f, 11.061f, 5.25f, 11.0f, 5.107f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.724f, 11.0f, 3.5f, 10.776f, 3.5f, 10.5f)
                curveTo(3.5f, 10.224f, 3.724f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(4.5f)
                curveTo(4.689f, 10.0f, 4.862f, 9.893f, 4.947f, 9.723f)
                curveTo(5.032f, 9.554f, 5.013f, 9.351f, 4.9f, 9.2f)
                curveTo(4.649f, 8.865f, 4.5f, 8.451f, 4.5f, 8.0f)
                close()
                moveTo(6.5f, 5.0f)
                curveTo(4.843f, 5.0f, 3.5f, 6.343f, 3.5f, 8.0f)
                curveTo(3.5f, 8.363f, 3.565f, 8.711f, 3.683f, 9.034f)
                curveTo(3.007f, 9.179f, 2.5f, 9.78f, 2.5f, 10.5f)
                curveTo(2.5f, 11.328f, 3.172f, 12.0f, 4.0f, 12.0f)
                horizontalLineTo(4.519f)
                curveTo(4.148f, 13.798f, 3.167f, 14.836f, 2.621f, 15.293f)
                curveTo(2.274f, 15.583f, 2.0f, 16.029f, 2.0f, 16.549f)
                curveTo(2.0f, 17.35f, 2.65f, 18.0f, 3.451f, 18.0f)
                horizontalLineTo(9.549f)
                curveTo(10.35f, 18.0f, 11.0f, 17.35f, 11.0f, 16.549f)
                curveTo(11.0f, 16.029f, 10.726f, 15.583f, 10.379f, 15.293f)
                curveTo(9.833f, 14.836f, 8.852f, 13.798f, 8.481f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.828f, 12.0f, 10.5f, 11.328f, 10.5f, 10.5f)
                curveTo(10.5f, 9.78f, 9.993f, 9.179f, 9.317f, 9.034f)
                curveTo(9.435f, 8.711f, 9.5f, 8.363f, 9.5f, 8.0f)
                curveTo(9.5f, 6.343f, 8.157f, 5.0f, 6.5f, 5.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

@Suppress("ObjectPropertyName")
private var _chess: ImageVector? = null

@Preview
@Composable
private fun ChessPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Chess, contentDescription = "Chess Icon")
    }
}

