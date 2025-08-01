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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.LineFlowDiagonalUpRight: ImageVector
    get() {
        if (_LineFlowDiagonalUpRight != null) {
            return _LineFlowDiagonalUpRight!!
        }
        _LineFlowDiagonalUpRight = ImageVector.Builder(
            name = "Filled.LineFlowDiagonalUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.78f, 5.28f)
                curveTo(20.073f, 4.987f, 20.073f, 4.513f, 19.78f, 4.22f)
                curveTo(19.487f, 3.927f, 19.013f, 3.927f, 18.72f, 4.22f)
                lineTo(9.248f, 13.691f)
                curveTo(8.608f, 13.255f, 7.834f, 13f, 7f, 13f)
                curveTo(4.791f, 13f, 3f, 14.791f, 3f, 17f)
                curveTo(3f, 19.209f, 4.791f, 21f, 7f, 21f)
                curveTo(9.209f, 21f, 11f, 19.209f, 11f, 17f)
                curveTo(11f, 16.167f, 10.745f, 15.392f, 10.309f, 14.752f)
                lineTo(19.78f, 5.28f)
                close()
            }
        }.build()

        return _LineFlowDiagonalUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _LineFlowDiagonalUpRight: ImageVector? = null

@Preview
@Composable
private fun LineFlowDiagonalUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineFlowDiagonalUpRight, contentDescription = null)
    }
}
