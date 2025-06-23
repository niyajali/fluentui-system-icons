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

public val FluentIcons.Filled.DocumentHeaderArrowDown: ImageVector
    get() {
        if (_DocumentHeaderArrowDown != null) {
            return _DocumentHeaderArrowDown!!
        }
        _DocumentHeaderArrowDown = ImageVector.Builder(
            name = "Filled.DocumentHeaderArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 2f)
                curveTo(18.941f, 2f, 19.916f, 2.925f, 19.995f, 4.096f)
                lineTo(20f, 4.25f)
                verticalLineTo(11.498f)
                curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 19.247f, 11.689f, 20.832f, 12.81f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.059f, 22f, 4.084f, 21.075f, 4.005f, 19.904f)
                lineTo(4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
                lineTo(6.25f, 2f)
                horizontalLineTo(17.75f)
                close()
                moveTo(8.505f, 5.004f)
                curveTo(7.677f, 5.004f, 7.005f, 5.676f, 7.005f, 6.505f)
                curveTo(7.005f, 7.333f, 7.677f, 8.005f, 8.505f, 8.005f)
                horizontalLineTo(15.505f)
                curveTo(16.334f, 8.005f, 17.005f, 7.333f, 17.005f, 6.505f)
                curveTo(17.005f, 5.676f, 16.334f, 5.004f, 15.505f, 5.004f)
                horizontalLineTo(8.505f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(18f, 14.5f)
                curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
                curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
                verticalLineTo(19.293f)
                lineTo(15.354f, 17.646f)
                curveTo(15.158f, 17.451f, 14.842f, 17.451f, 14.646f, 17.646f)
                curveTo(14.451f, 17.842f, 14.451f, 18.158f, 14.646f, 18.354f)
                lineTo(17.146f, 20.854f)
                curveTo(17.342f, 21.049f, 17.658f, 21.049f, 17.854f, 20.854f)
                lineTo(20.354f, 18.354f)
                curveTo(20.549f, 18.158f, 20.549f, 17.842f, 20.354f, 17.646f)
                curveTo(20.158f, 17.451f, 19.842f, 17.451f, 19.646f, 17.646f)
                lineTo(18f, 19.293f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _DocumentHeaderArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentHeaderArrowDown: ImageVector? = null

@Preview
@Composable
private fun DocumentHeaderArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentHeaderArrowDown, contentDescription = null)
    }
}
