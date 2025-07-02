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
 * PuzzleCubePiece icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: puzzle, cube, piece
 * - Source: ic_fluent_puzzle_cube_piece_20_filled.svg
 * 
 * @return The [ImageVector] for the PuzzleCubePiece icon.
 */
public val FluentIcons.Filled.PuzzleCubePiece: ImageVector
    get() {
        if (_puzzleCubePiece != null) {
            return _puzzleCubePiece!!
        }
        _puzzleCubePiece = Builder(name = "PuzzleCubePiece", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.794f, 1.29f)
                curveTo(16.184f, 0.899f, 16.817f, 0.899f, 17.208f, 1.29f)
                lineTo(18.711f, 2.793f)
                curveTo(19.101f, 3.183f, 19.101f, 3.817f, 18.711f, 4.207f)
                lineTo(17.208f, 5.71f)
                curveTo(16.817f, 6.1f, 16.184f, 6.1f, 15.794f, 5.71f)
                lineTo(14.291f, 4.207f)
                curveTo(13.9f, 3.817f, 13.9f, 3.183f, 14.291f, 2.793f)
                lineTo(15.794f, 1.29f)
                close()
                moveTo(5.5f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 15.881f, 4.119f, 17.0f, 5.5f, 17.0f)
                close()
                moveTo(7.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(13.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.881f, 15.881f, 17.0f, 14.5f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 3.0f, 3.0f, 4.119f, 3.0f, 5.5f)
                verticalLineTo(7.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _puzzleCubePiece!!
    }

@Suppress("ObjectPropertyName")
private var _puzzleCubePiece: ImageVector? = null

@Preview
@Composable
private fun PuzzleCubePiecePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PuzzleCubePiece, contentDescription = null)
    }
}

