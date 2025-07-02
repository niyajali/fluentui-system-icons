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
 * BoardGames icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: board, games
 * - Source: ic_fluent_board_games_20_filled.svg
 * 
 * @return The [ImageVector] for the BoardGames icon.
 */
public val FluentIcons.Filled.BoardGames: ImageVector
    get() {
        if (_boardGames != null) {
            return _boardGames!!
        }
        _boardGames = Builder(name = "BoardGames", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.948f, 5.5f)
                curveTo(15.965f, 5.5f, 15.982f, 5.5f, 15.999f, 5.5f)
                curveTo(16.329f, 5.5f, 16.644f, 5.564f, 16.932f, 5.68f)
                curveTo(17.851f, 6.05f, 18.499f, 6.949f, 18.499f, 8.0f)
                curveTo(18.499f, 9.381f, 17.379f, 10.5f, 15.999f, 10.5f)
                curveTo(15.921f, 10.5f, 15.843f, 10.496f, 15.767f, 10.489f)
                curveTo(15.356f, 10.452f, 14.974f, 10.314f, 14.644f, 10.102f)
                lineTo(15.094f, 11.956f)
                curveTo(15.284f, 12.742f, 14.688f, 13.5f, 13.879f, 13.5f)
                horizontalLineTo(13.116f)
                curveTo(12.306f, 13.5f, 11.71f, 12.742f, 11.902f, 11.955f)
                lineTo(12.352f, 10.102f)
                curveTo(12.023f, 10.315f, 11.64f, 10.452f, 11.229f, 10.49f)
                curveTo(11.153f, 10.497f, 11.076f, 10.5f, 10.999f, 10.5f)
                curveTo(10.977f, 10.5f, 10.956f, 10.5f, 10.935f, 10.499f)
                curveTo(10.825f, 10.069f, 10.574f, 9.695f, 10.236f, 9.429f)
                curveTo(10.406f, 8.985f, 10.499f, 8.503f, 10.499f, 8.0f)
                curveTo(10.499f, 7.182f, 10.253f, 6.422f, 9.832f, 5.788f)
                curveTo(9.907f, 5.748f, 9.985f, 5.712f, 10.065f, 5.68f)
                curveTo(10.353f, 5.564f, 10.668f, 5.5f, 10.999f, 5.5f)
                curveTo(11.015f, 5.5f, 11.032f, 5.5f, 11.049f, 5.5f)
                curveTo(11.016f, 5.339f, 10.999f, 5.171f, 10.999f, 5.0f)
                curveTo(10.999f, 4.829f, 11.016f, 4.662f, 11.049f, 4.5f)
                curveTo(11.28f, 3.359f, 12.289f, 2.5f, 13.499f, 2.5f)
                curveTo(14.708f, 2.5f, 15.717f, 3.359f, 15.949f, 4.5f)
                curveTo(15.981f, 4.662f, 15.999f, 4.829f, 15.999f, 5.0f)
                curveTo(15.999f, 5.171f, 15.981f, 5.339f, 15.948f, 5.5f)
                close()
                moveTo(6.5f, 5.0f)
                curveTo(4.843f, 5.0f, 3.5f, 6.343f, 3.5f, 8.0f)
                curveTo(3.5f, 8.768f, 3.789f, 9.469f, 4.264f, 10.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 10.0f, 3.0f, 10.448f, 3.0f, 11.0f)
                curveTo(3.0f, 11.552f, 3.448f, 12.0f, 4.0f, 12.0f)
                horizontalLineTo(4.519f)
                curveTo(4.148f, 13.798f, 3.167f, 14.836f, 2.621f, 15.293f)
                curveTo(2.274f, 15.583f, 2.0f, 16.029f, 2.0f, 16.549f)
                curveTo(2.0f, 17.35f, 2.65f, 18.0f, 3.451f, 18.0f)
                horizontalLineTo(9.549f)
                curveTo(10.35f, 18.0f, 11.0f, 17.35f, 11.0f, 16.549f)
                curveTo(11.0f, 16.029f, 10.726f, 15.583f, 10.379f, 15.293f)
                curveTo(9.833f, 14.836f, 8.852f, 13.798f, 8.481f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.552f, 12.0f, 10.0f, 11.552f, 10.0f, 11.0f)
                curveTo(10.0f, 10.448f, 9.552f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(8.736f)
                curveTo(9.211f, 9.469f, 9.5f, 8.768f, 9.5f, 8.0f)
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
        Image(imageVector = FluentIcons.Filled.BoardGames, contentDescription = null)
    }
}

