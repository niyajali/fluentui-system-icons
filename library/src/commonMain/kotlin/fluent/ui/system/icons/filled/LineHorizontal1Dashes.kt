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

public val FluentIcons.Filled.LineHorizontal1Dashes: ImageVector
    get() {
        if (_LineHorizontal1Dashes != null) {
            return _LineHorizontal1Dashes!!
        }
        _LineHorizontal1Dashes = ImageVector.Builder(
            name = "Filled.LineHorizontal1Dashes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 12f)
                curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(6f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                curveTo(7f, 12.552f, 6.552f, 13f, 6f, 13f)
                horizontalLineTo(3f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                close()
                moveTo(9.5f, 12f)
                curveTo(9.5f, 11.448f, 9.948f, 11f, 10.5f, 11f)
                horizontalLineTo(13.5f)
                curveTo(14.052f, 11f, 14.5f, 11.448f, 14.5f, 12f)
                curveTo(14.5f, 12.552f, 14.052f, 13f, 13.5f, 13f)
                horizontalLineTo(10.5f)
                curveTo(9.948f, 13f, 9.5f, 12.552f, 9.5f, 12f)
                close()
                moveTo(17f, 12f)
                curveTo(17f, 11.448f, 17.448f, 11f, 18f, 11f)
                horizontalLineTo(21f)
                curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
                curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
                horizontalLineTo(18f)
                curveTo(17.448f, 13f, 17f, 12.552f, 17f, 12f)
                close()
            }
        }.build()

        return _LineHorizontal1Dashes!!
    }

@Suppress("ObjectPropertyName")
private var _LineHorizontal1Dashes: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal1DashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineHorizontal1Dashes, contentDescription = null)
    }
}
