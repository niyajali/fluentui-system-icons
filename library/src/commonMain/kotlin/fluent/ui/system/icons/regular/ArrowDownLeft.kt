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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) {
            return _ArrowDownLeft!!
        }
        _ArrowDownLeft = ImageVector.Builder(
            name = "Regular.ArrowDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.246f, 21.005f)
                curveTo(13.66f, 21.005f, 13.996f, 20.669f, 13.996f, 20.255f)
                curveTo(13.996f, 19.841f, 13.66f, 19.505f, 13.246f, 19.505f)
                horizontalLineTo(5.577f)
                lineTo(20.777f, 4.305f)
                curveTo(21.075f, 4.007f, 21.075f, 3.523f, 20.777f, 3.224f)
                curveTo(20.478f, 2.925f, 19.994f, 2.925f, 19.695f, 3.224f)
                lineTo(4.496f, 18.423f)
                verticalLineTo(10.755f)
                curveTo(4.496f, 10.341f, 4.16f, 10.005f, 3.746f, 10.005f)
                curveTo(3.332f, 10.005f, 2.996f, 10.341f, 2.996f, 10.755f)
                verticalLineTo(20.255f)
                curveTo(2.996f, 20.669f, 3.332f, 21.005f, 3.746f, 21.005f)
                horizontalLineTo(13.246f)
                close()
            }
        }.build()

        return _ArrowDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowDownLeft, contentDescription = null)
    }
}
