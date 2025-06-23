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

public val FluentIcons.Filled.StackArrowForward: ImageVector
    get() {
        if (_StackArrowForward != null) {
            return _StackArrowForward!!
        }
        _StackArrowForward = ImageVector.Builder(
            name = "Filled.StackArrowForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
                curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
                curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
                curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
                close()
                moveTo(19.354f, 3.646f)
                curveTo(19.158f, 3.451f, 18.842f, 3.451f, 18.646f, 3.646f)
                curveTo(18.451f, 3.842f, 18.451f, 4.158f, 18.646f, 4.354f)
                lineTo(19.293f, 5f)
                horizontalLineTo(17.25f)
                curveTo(15.455f, 5f, 14f, 6.455f, 14f, 8.25f)
                verticalLineTo(8.5f)
                curveTo(14f, 8.776f, 14.224f, 9f, 14.5f, 9f)
                curveTo(14.776f, 9f, 15f, 8.776f, 15f, 8.5f)
                verticalLineTo(8.25f)
                curveTo(15f, 7.007f, 16.007f, 6f, 17.25f, 6f)
                horizontalLineTo(19.293f)
                lineTo(18.646f, 6.646f)
                curveTo(18.451f, 6.842f, 18.451f, 7.158f, 18.646f, 7.354f)
                curveTo(18.842f, 7.549f, 19.158f, 7.549f, 19.354f, 7.354f)
                lineTo(20.854f, 5.854f)
                curveTo(21.049f, 5.658f, 21.049f, 5.342f, 20.854f, 5.146f)
                lineTo(19.354f, 3.646f)
                close()
                moveTo(4f, 4f)
                horizontalLineTo(11.498f)
                curveTo(11.177f, 4.77f, 11f, 5.614f, 11f, 6.5f)
                curveTo(11f, 9.922f, 13.644f, 12.726f, 17f, 12.981f)
                verticalLineTo(13f)
                curveTo(17f, 14.105f, 16.105f, 15f, 15f, 15f)
                horizontalLineTo(4f)
                curveTo(2.895f, 15f, 2f, 14.105f, 2f, 13f)
                verticalLineTo(6f)
                curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
                close()
                moveTo(18f, 12.981f)
                curveTo(18.52f, 12.941f, 19.022f, 12.841f, 19.5f, 12.686f)
                verticalLineTo(13.5f)
                curveTo(19.5f, 15.709f, 17.709f, 17.5f, 15.5f, 17.5f)
                horizontalLineTo(6.5f)
                curveTo(5.568f, 17.5f, 4.785f, 16.863f, 4.563f, 16f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 16f, 18f, 14.881f, 18f, 13.5f)
                verticalLineTo(12.981f)
                close()
                moveTo(22f, 11.19f)
                curveTo(21.556f, 11.617f, 21.051f, 11.981f, 20.5f, 12.268f)
                verticalLineTo(14.25f)
                curveTo(20.5f, 16.597f, 18.597f, 18.5f, 16.25f, 18.5f)
                horizontalLineTo(7.063f)
                curveTo(7.285f, 19.363f, 8.068f, 20f, 9f, 20f)
                horizontalLineTo(16.25f)
                curveTo(19.426f, 20f, 22f, 17.426f, 22f, 14.25f)
                verticalLineTo(11.19f)
                close()
            }
        }.build()

        return _StackArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _StackArrowForward: ImageVector? = null

@Preview
@Composable
private fun StackArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StackArrowForward, contentDescription = null)
    }
}
