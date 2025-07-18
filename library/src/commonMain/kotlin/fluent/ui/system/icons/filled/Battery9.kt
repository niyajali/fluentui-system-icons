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

public val FluentIcons.Filled.Battery9: ImageVector
    get() {
        if (_Battery9 != null) {
            return _Battery9!!
        }
        _Battery9 = ImageVector.Builder(
            name = "Filled.Battery9",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 9f)
                curveTo(5.447f, 9f, 5f, 9.448f, 5f, 10f)
                verticalLineTo(14f)
                curveTo(5f, 14.552f, 5.447f, 15f, 6f, 15f)
                horizontalLineTo(15f)
                curveTo(15.552f, 15f, 16f, 14.552f, 16f, 14f)
                verticalLineTo(10f)
                curveTo(16f, 9.448f, 15.552f, 9f, 15f, 9f)
                horizontalLineTo(6f)
                close()
                moveTo(2f, 9f)
                curveTo(2f, 7.343f, 3.343f, 6f, 5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(19.157f, 6f, 20.5f, 7.343f, 20.5f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                curveTo(21.183f, 10f, 21.353f, 10.049f, 21.5f, 10.134f)
                curveTo(21.799f, 10.307f, 22f, 10.63f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 13.37f, 21.799f, 13.693f, 21.5f, 13.866f)
                curveTo(21.353f, 13.951f, 21.183f, 14f, 21f, 14f)
                horizontalLineTo(20.5f)
                verticalLineTo(15f)
                curveTo(20.5f, 16.657f, 19.157f, 18f, 17.5f, 18f)
                horizontalLineTo(5f)
                curveTo(3.343f, 18f, 2f, 16.657f, 2f, 15f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Battery9!!
    }

@Suppress("ObjectPropertyName")
private var _Battery9: ImageVector? = null

@Preview
@Composable
private fun Battery9Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Battery9, contentDescription = null)
    }
}
