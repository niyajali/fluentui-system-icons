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
 * PuzzlePieceShield icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: puzzle, piece, shield
 * - Source: ic_fluent_puzzle_piece_shield_20_filled.svg
 * 
 * @return The [ImageVector] for the PuzzlePieceShield icon.
 */
public val FluentIcons.Filled.PuzzlePieceShield: ImageVector
    get() {
        if (_puzzlePieceShield != null) {
            return _puzzlePieceShield!!
        }
        _puzzlePieceShield = Builder(name = "PuzzlePieceShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 11.904f)
                curveTo(5.021f, 11.912f, 5.041f, 11.919f, 5.059f, 11.925f)
                curveTo(5.347f, 12.025f, 5.654f, 12.025f, 5.942f, 11.925f)
                curveTo(6.305f, 11.799f, 7.293f, 11.409f, 8.205f, 10.582f)
                curveTo(9.139f, 9.735f, 10.0f, 8.417f, 10.0f, 6.517f)
                verticalLineTo(4.194f)
                curveTo(10.0f, 3.638f, 9.704f, 3.197f, 9.302f, 2.944f)
                curveTo(9.655f, 2.377f, 10.283f, 2.0f, 11.0f, 2.0f)
                curveTo(12.105f, 2.0f, 13.0f, 2.895f, 13.0f, 4.0f)
                horizontalLineTo(15.5f)
                curveTo(16.329f, 4.0f, 17.0f, 4.672f, 17.0f, 5.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                curveTo(14.896f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 14.896f, 12.0f, 16.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.328f, 16.329f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 17.105f, 12.105f, 18.0f, 11.0f, 18.0f)
                curveTo(9.896f, 18.0f, 9.0f, 17.105f, 9.0f, 16.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 16.0f, 5.0f, 15.328f, 5.0f, 14.5f)
                lineTo(5.0f, 11.904f)
                close()
                moveTo(5.881f, 2.159f)
                curveTo(6.388f, 2.692f, 7.364f, 3.539f, 8.564f, 3.712f)
                curveTo(8.803f, 3.747f, 9.0f, 3.946f, 9.0f, 4.194f)
                verticalLineTo(6.517f)
                curveTo(9.0f, 9.639f, 6.216f, 10.772f, 5.614f, 10.98f)
                curveTo(5.539f, 11.007f, 5.462f, 11.007f, 5.386f, 10.98f)
                curveTo(4.785f, 10.772f, 2.0f, 9.639f, 2.0f, 6.517f)
                lineTo(2.0f, 4.194f)
                curveTo(2.0f, 3.946f, 2.197f, 3.747f, 2.436f, 3.712f)
                curveTo(3.636f, 3.539f, 4.611f, 2.692f, 5.119f, 2.159f)
                curveTo(5.321f, 1.947f, 5.678f, 1.947f, 5.881f, 2.159f)
                close()
            }
        }
        .build()
        return _puzzlePieceShield!!
    }

@Suppress("ObjectPropertyName")
private var _puzzlePieceShield: ImageVector? = null

@Preview
@Composable
private fun PuzzlePieceShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PuzzlePieceShield, contentDescription = null)
    }
}

