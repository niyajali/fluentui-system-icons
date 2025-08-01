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

public val FluentIcons.Filled.SquareArrowForward: ImageVector
    get() {
        if (_SquareArrowForward != null) {
            return _SquareArrowForward!!
        }
        _SquareArrowForward = ImageVector.Builder(
            name = "Filled.SquareArrowForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(12.022f)
                curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
                curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
                curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(18.646f, 15.354f)
                curveTo(18.451f, 15.158f, 18.451f, 14.842f, 18.646f, 14.646f)
                curveTo(18.842f, 14.451f, 19.158f, 14.451f, 19.354f, 14.646f)
                lineTo(20.854f, 16.146f)
                curveTo(21.049f, 16.342f, 21.049f, 16.658f, 20.854f, 16.854f)
                lineTo(19.354f, 18.354f)
                curveTo(19.158f, 18.549f, 18.842f, 18.549f, 18.646f, 18.354f)
                curveTo(18.451f, 18.158f, 18.451f, 17.842f, 18.646f, 17.646f)
                lineTo(19.293f, 17f)
                horizontalLineTo(17.25f)
                curveTo(16.007f, 17f, 15f, 18.007f, 15f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(15f, 19.776f, 14.776f, 20f, 14.5f, 20f)
                curveTo(14.224f, 20f, 14f, 19.776f, 14f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(14f, 17.455f, 15.455f, 16f, 17.25f, 16f)
                horizontalLineTo(19.293f)
                lineTo(18.646f, 15.354f)
                close()
            }
        }.build()

        return _SquareArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _SquareArrowForward: ImageVector? = null

@Preview
@Composable
private fun SquareArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareArrowForward, contentDescription = null)
    }
}
