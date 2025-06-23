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

public val FluentIcons.Filled.SquareDovetailJoint: ImageVector
    get() {
        if (_SquareDovetailJoint != null) {
            return _SquareDovetailJoint!!
        }
        _SquareDovetailJoint = ImageVector.Builder(
            name = "Filled.SquareDovetailJoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 14.25f)
                curveTo(9f, 14.009f, 9.116f, 13.782f, 9.312f, 13.642f)
                curveTo(9.508f, 13.502f, 9.761f, 13.464f, 9.988f, 13.538f)
                lineTo(13.501f, 14.709f)
                verticalLineTo(9.291f)
                lineTo(9.988f, 10.462f)
                curveTo(9.76f, 10.535f, 9.507f, 10.501f, 9.312f, 10.358f)
                curveTo(9.117f, 10.217f, 9f, 9.991f, 9f, 9.75f)
                verticalLineTo(3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(14.25f)
                close()
                moveTo(17.75f, 3f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.709f)
                lineTo(14.013f, 7.538f)
                curveTo(14.239f, 7.463f, 14.493f, 7.499f, 14.689f, 7.642f)
                curveTo(14.884f, 7.783f, 15.001f, 8.009f, 15.001f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(15.001f, 15.991f, 14.885f, 16.218f, 14.689f, 16.358f)
                curveTo(14.493f, 16.498f, 14.24f, 16.536f, 14.013f, 16.462f)
                lineTo(10.5f, 15.291f)
                verticalLineTo(21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                close()
            }
        }.build()

        return _SquareDovetailJoint!!
    }

@Suppress("ObjectPropertyName")
private var _SquareDovetailJoint: ImageVector? = null

@Preview
@Composable
private fun SquareDovetailJointPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareDovetailJoint, contentDescription = null)
    }
}
