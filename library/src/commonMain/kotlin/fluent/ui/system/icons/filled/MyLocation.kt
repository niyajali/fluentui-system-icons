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

public val FluentIcons.Filled.MyLocation: ImageVector
    get() {
        if (_MyLocation != null) {
            return _MyLocation!!
        }
        _MyLocation = ImageVector.Builder(
            name = "Filled.MyLocation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(12.513f, 2f, 12.936f, 2.386f, 12.993f, 2.883f)
                lineTo(13f, 3f)
                lineTo(13f, 4.314f)
                curveTo(16.481f, 4.762f, 19.238f, 7.52f, 19.686f, 11.001f)
                lineTo(21f, 11f)
                curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
                curveTo(22f, 12.513f, 21.614f, 12.936f, 21.117f, 12.993f)
                lineTo(21f, 13f)
                lineTo(19.686f, 13f)
                curveTo(19.237f, 16.48f, 16.48f, 19.237f, 13f, 19.686f)
                lineTo(13f, 21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(11.487f, 22f, 11.064f, 21.614f, 11.007f, 21.117f)
                lineTo(11f, 21f)
                lineTo(11.001f, 19.686f)
                curveTo(7.52f, 19.238f, 4.762f, 16.481f, 4.314f, 13f)
                lineTo(3f, 13f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                curveTo(2f, 11.487f, 2.386f, 11.064f, 2.883f, 11.007f)
                lineTo(3f, 11f)
                lineTo(4.314f, 11.001f)
                curveTo(4.762f, 7.52f, 7.52f, 4.762f, 11.001f, 4.314f)
                lineTo(11f, 3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                close()
                moveTo(12f, 6.25f)
                curveTo(8.824f, 6.25f, 6.25f, 8.824f, 6.25f, 12f)
                curveTo(6.25f, 15.176f, 8.824f, 17.75f, 12f, 17.75f)
                curveTo(15.176f, 17.75f, 17.75f, 15.176f, 17.75f, 12f)
                curveTo(17.75f, 8.824f, 15.176f, 6.25f, 12f, 6.25f)
                close()
                moveTo(12f, 8f)
                curveTo(14.209f, 8f, 16f, 9.791f, 16f, 12f)
                curveTo(16f, 14.209f, 14.209f, 16f, 12f, 16f)
                curveTo(9.791f, 16f, 8f, 14.209f, 8f, 12f)
                curveTo(8f, 9.791f, 9.791f, 8f, 12f, 8f)
                close()
            }
        }.build()

        return _MyLocation!!
    }

@Suppress("ObjectPropertyName")
private var _MyLocation: ImageVector? = null

@Preview
@Composable
private fun MyLocationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MyLocation, contentDescription = null)
    }
}
