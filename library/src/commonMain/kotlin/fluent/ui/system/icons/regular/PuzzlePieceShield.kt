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
 * PuzzlePieceShield Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent apps and actions building together to a common goal.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_puzzle_piece_shield_20_regular.svg)
 * 
 * @return The [ImageVector] for the PuzzlePieceShield icon.
 */
public val FluentIcons.Regular.PuzzlePieceShield: ImageVector
    get() {
        if (_puzzlePieceShield != null) {
            return _puzzlePieceShield!!
        }
        _puzzlePieceShield = Builder(name = "PuzzlePieceShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 11.904f)
                curveTo(5.021f, 11.912f, 5.041f, 11.919f, 5.06f, 11.925f)
                curveTo(5.347f, 12.025f, 5.654f, 12.025f, 5.942f, 11.925f)
                curveTo(5.96f, 11.919f, 5.979f, 11.912f, 6.0f, 11.905f)
                verticalLineTo(14.5f)
                curveTo(6.0f, 14.776f, 6.224f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(15.75f)
                curveTo(9.75f, 16.44f, 10.31f, 17.0f, 11.0f, 17.0f)
                curveTo(11.691f, 17.0f, 12.25f, 16.44f, 12.25f, 15.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.5f)
                curveTo(15.777f, 15.0f, 16.0f, 14.776f, 16.0f, 14.5f)
                verticalLineTo(12.25f)
                horizontalLineTo(15.25f)
                curveTo(14.008f, 12.25f, 13.0f, 11.243f, 13.0f, 10.0f)
                curveTo(13.0f, 8.757f, 14.008f, 7.75f, 15.25f, 7.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 5.224f, 15.777f, 5.0f, 15.5f, 5.0f)
                horizontalLineTo(12.25f)
                verticalLineTo(4.25f)
                curveTo(12.25f, 3.56f, 11.691f, 3.0f, 11.0f, 3.0f)
                curveTo(10.525f, 3.0f, 10.111f, 3.266f, 9.9f, 3.657f)
                curveTo(9.766f, 3.317f, 9.512f, 3.052f, 9.208f, 2.889f)
                curveTo(9.619f, 2.349f, 10.269f, 2.0f, 11.0f, 2.0f)
                curveTo(12.159f, 2.0f, 13.112f, 2.875f, 13.237f, 4.0f)
                horizontalLineTo(15.5f)
                curveTo(16.329f, 4.0f, 17.0f, 4.672f, 17.0f, 5.5f)
                verticalLineTo(8.75f)
                horizontalLineTo(15.25f)
                curveTo(14.56f, 8.75f, 14.0f, 9.31f, 14.0f, 10.0f)
                curveTo(14.0f, 10.69f, 14.56f, 11.25f, 15.25f, 11.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 15.328f, 16.329f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(13.237f)
                curveTo(13.112f, 17.125f, 12.159f, 18.0f, 11.0f, 18.0f)
                curveTo(9.842f, 18.0f, 8.889f, 17.125f, 8.764f, 16.0f)
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
        Image(imageVector = FluentIcons.Regular.PuzzlePieceShield, contentDescription = "PuzzlePieceShield Icon")
    }
}

