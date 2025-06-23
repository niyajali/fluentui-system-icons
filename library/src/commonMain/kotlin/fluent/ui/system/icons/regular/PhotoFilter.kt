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

public val FluentIcons.Regular.PhotoFilter: ImageVector
    get() {
        if (_PhotoFilter != null) {
            return _PhotoFilter!!
        }
        _PhotoFilter = ImageVector.Builder(
            name = "Regular.PhotoFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 2f)
                curveTo(12.884f, 2f, 15.745f, 4.242f, 16.679f, 7.321f)
                curveTo(19.758f, 8.255f, 22f, 11.116f, 22f, 14.5f)
                curveTo(22f, 18.642f, 18.642f, 22f, 14.5f, 22f)
                curveTo(11.116f, 22f, 8.255f, 19.758f, 7.321f, 16.679f)
                curveTo(4.242f, 15.745f, 2f, 12.884f, 2f, 9.5f)
                curveTo(2f, 5.358f, 5.358f, 2f, 9.5f, 2f)
                close()
                moveTo(16.986f, 9.038f)
                lineTo(16.996f, 9.257f)
                lineTo(17f, 9.5f)
                curveTo(17f, 13.642f, 13.642f, 17f, 9.5f, 17f)
                curveTo(9.345f, 17f, 9.191f, 16.995f, 9.038f, 16.986f)
                curveTo(9.982f, 19.059f, 12.073f, 20.5f, 14.5f, 20.5f)
                curveTo(17.814f, 20.5f, 20.5f, 17.814f, 20.5f, 14.5f)
                curveTo(20.5f, 12.073f, 19.059f, 9.982f, 16.986f, 9.038f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(6.186f, 3.5f, 3.5f, 6.186f, 3.5f, 9.5f)
                curveTo(3.5f, 11.927f, 4.941f, 14.017f, 7.014f, 14.962f)
                lineTo(7.004f, 14.743f)
                lineTo(7f, 14.5f)
                curveTo(7f, 10.358f, 10.358f, 7f, 14.5f, 7f)
                curveTo(14.655f, 7f, 14.809f, 7.005f, 14.962f, 7.014f)
                curveTo(14.017f, 4.941f, 11.927f, 3.5f, 9.5f, 3.5f)
                close()
            }
        }.build()

        return _PhotoFilter!!
    }

@Suppress("ObjectPropertyName")
private var _PhotoFilter: ImageVector? = null

@Preview
@Composable
private fun PhotoFilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhotoFilter, contentDescription = null)
    }
}
