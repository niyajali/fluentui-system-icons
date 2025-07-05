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
 * Chess Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent chess.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_chess_20_filled.svg)
 * 
 * @return The [ImageVector] for the Chess icon.
 */
public val FluentIcons.Filled.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 2.0f)
                curveTo(10.224f, 2.0f, 10.0f, 2.224f, 10.0f, 2.5f)
                verticalLineTo(5.1f)
                curveTo(10.0f, 6.477f, 10.927f, 7.636f, 12.191f, 7.989f)
                curveTo(11.971f, 10.73f, 11.178f, 12.775f, 10.529f, 14.036f)
                curveTo(10.713f, 14.252f, 10.886f, 14.413f, 11.021f, 14.526f)
                curveTo(11.54f, 14.96f, 12.0f, 15.667f, 12.0f, 16.549f)
                curveTo(12.0f, 17.092f, 11.823f, 17.594f, 11.524f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(17.828f, 18.0f, 18.5f, 17.328f, 18.5f, 16.5f)
                verticalLineTo(16.193f)
                curveTo(18.5f, 15.845f, 18.381f, 15.524f, 18.198f, 15.261f)
                curveTo(17.657f, 14.484f, 16.129f, 11.972f, 15.809f, 7.989f)
                curveTo(17.073f, 7.636f, 18.0f, 6.477f, 18.0f, 5.1f)
                verticalLineTo(2.5f)
                curveTo(18.0f, 2.224f, 17.776f, 2.0f, 17.5f, 2.0f)
                horizontalLineTo(16.75f)
                curveTo(16.336f, 2.0f, 16.0f, 2.336f, 16.0f, 2.75f)
                verticalLineTo(3.5f)
                curveTo(16.0f, 3.776f, 15.777f, 3.999f, 15.501f, 4.0f)
                curveTo(15.226f, 4.001f, 15.001f, 3.778f, 15.0f, 3.503f)
                lineTo(15.0f, 3.5f)
                lineTo(14.996f, 2.746f)
                curveTo(14.994f, 2.333f, 14.659f, 2.0f, 14.246f, 2.0f)
                horizontalLineTo(13.754f)
                curveTo(13.341f, 2.0f, 13.006f, 2.333f, 13.004f, 2.746f)
                lineTo(13.0f, 3.503f)
                curveTo(12.999f, 3.778f, 12.774f, 4.001f, 12.499f, 4.0f)
                curveTo(12.223f, 3.999f, 12.0f, 3.776f, 12.0f, 3.5f)
                verticalLineTo(2.75f)
                curveTo(12.0f, 2.336f, 11.664f, 2.0f, 11.25f, 2.0f)
                horizontalLineTo(10.5f)
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
        return _chess!!
    }

@Suppress("ObjectPropertyName")
private var _chess: ImageVector? = null

@Preview
@Composable
private fun ChessPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Chess, contentDescription = "Chess Icon")
    }
}

