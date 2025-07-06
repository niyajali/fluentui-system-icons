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
 * BoardGames Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in board game collections.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_board_games_20_regular.svg)
 * 
 * @return The [ImageVector] for the BoardGames icon.
 */
public val FluentIcons.Regular.BoardGames: ImageVector
    get() {
        if (_boardGames != null) {
            return _boardGames!!
        }
        _boardGames = Builder(name = "BoardGames", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 3.0f)
                curveTo(12.396f, 3.0f, 11.5f, 3.895f, 11.5f, 5.0f)
                curveTo(11.5f, 5.138f, 11.514f, 5.272f, 11.54f, 5.401f)
                curveTo(11.571f, 5.55f, 11.532f, 5.704f, 11.434f, 5.821f)
                curveTo(11.337f, 5.937f, 11.192f, 6.003f, 11.041f, 6.0f)
                curveTo(11.027f, 6.0f, 11.014f, 6.0f, 11.0f, 6.0f)
                curveTo(10.67f, 6.0f, 10.358f, 6.08f, 10.084f, 6.222f)
                curveTo(9.933f, 5.92f, 9.746f, 5.639f, 9.527f, 5.386f)
                curveTo(9.824f, 5.218f, 10.152f, 5.1f, 10.501f, 5.041f)
                lineTo(10.5f, 5.0f)
                curveTo(10.5f, 3.343f, 11.843f, 2.0f, 13.5f, 2.0f)
                curveTo(15.157f, 2.0f, 16.5f, 3.343f, 16.5f, 5.0f)
                lineTo(16.5f, 5.041f)
                curveTo(17.919f, 5.279f, 19.0f, 6.513f, 19.0f, 8.0f)
                curveTo(19.0f, 9.657f, 17.657f, 11.0f, 16.0f, 11.0f)
                curveTo(15.781f, 11.0f, 15.568f, 10.976f, 15.362f, 10.932f)
                lineTo(15.581f, 11.838f)
                curveTo(15.848f, 12.939f, 15.014f, 14.0f, 13.88f, 14.0f)
                horizontalLineTo(13.118f)
                curveTo(11.984f, 14.0f, 11.15f, 12.938f, 11.417f, 11.836f)
                lineTo(11.868f, 9.984f)
                curveTo(11.933f, 9.716f, 12.204f, 9.551f, 12.472f, 9.616f)
                curveTo(12.74f, 9.682f, 12.905f, 9.952f, 12.84f, 10.22f)
                lineTo(12.389f, 12.073f)
                curveTo(12.274f, 12.545f, 12.632f, 13.0f, 13.118f, 13.0f)
                horizontalLineTo(13.88f)
                curveTo(14.366f, 13.0f, 14.724f, 12.545f, 14.609f, 12.073f)
                lineTo(14.16f, 10.219f)
                curveTo(14.112f, 10.021f, 14.19f, 9.813f, 14.356f, 9.694f)
                curveTo(14.523f, 9.576f, 14.745f, 9.571f, 14.917f, 9.682f)
                curveTo(15.229f, 9.883f, 15.6f, 10.0f, 16.0f, 10.0f)
                curveTo(17.105f, 10.0f, 18.0f, 9.105f, 18.0f, 8.0f)
                curveTo(18.0f, 6.895f, 17.105f, 6.0f, 16.0f, 6.0f)
                curveTo(15.987f, 6.0f, 15.973f, 6.0f, 15.96f, 6.0f)
                curveTo(15.808f, 6.003f, 15.663f, 5.937f, 15.566f, 5.821f)
                curveTo(15.469f, 5.704f, 15.43f, 5.55f, 15.46f, 5.401f)
                curveTo(15.486f, 5.272f, 15.5f, 5.138f, 15.5f, 5.0f)
                curveTo(15.5f, 3.895f, 14.605f, 3.0f, 13.5f, 3.0f)
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
        return _boardGames!!
    }

@Suppress("ObjectPropertyName")
private var _boardGames: ImageVector? = null

@Preview
@Composable
private fun BoardGamesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BoardGames, contentDescription = "BoardGames Icon")
    }
}

