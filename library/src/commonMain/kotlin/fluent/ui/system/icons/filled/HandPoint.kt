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

public val FluentIcons.Filled.HandPoint: ImageVector
    get() {
        if (_HandPoint != null) {
            return _HandPoint!!
        }
        _HandPoint = ImageVector.Builder(
            name = "Filled.HandPoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.5f, 2f)
                curveTo(10.119f, 2f, 9f, 3.119f, 9f, 4.5f)
                verticalLineTo(10.91f)
                lineTo(7.505f, 10.336f)
                curveTo(5.464f, 9.551f, 3.158f, 10.406f, 2.123f, 12.332f)
                curveTo(1.822f, 12.89f, 2.088f, 13.558f, 2.635f, 13.795f)
                curveTo(8.297f, 16.251f, 10.089f, 18.468f, 10.824f, 20.085f)
                curveTo(11.351f, 21.242f, 12.554f, 22.189f, 13.997f, 21.967f)
                lineTo(17.452f, 21.434f)
                curveTo(18.548f, 21.265f, 19.434f, 20.456f, 19.702f, 19.38f)
                lineTo(20.855f, 14.747f)
                curveTo(21.528f, 12.042f, 19.737f, 9.341f, 16.983f, 8.908f)
                lineTo(14f, 8.439f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
                close()
            }
        }.build()

        return _HandPoint!!
    }

@Suppress("ObjectPropertyName")
private var _HandPoint: ImageVector? = null

@Preview
@Composable
private fun HandPointPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HandPoint, contentDescription = null)
    }
}
